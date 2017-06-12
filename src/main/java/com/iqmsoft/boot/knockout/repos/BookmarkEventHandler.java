package com.iqmsoft.boot.knockout.repos;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.iqmsoft.boot.knockout.domain.Bookmark;

import java.util.Date;

@RepositoryEventHandler(Bookmark.class)
public class BookmarkEventHandler
{
    @HandleBeforeCreate
    public void handleBookmarkCreate(Bookmark bookmark)
    {
        bookmark.setCreated(new Date());
    }
}
