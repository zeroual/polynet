package com.polytech.rest;

import com.polytech.data.Story;
import com.polytech.business.PublicationService;

public class StoryController {

    PublicationService publicationService;

    public StoryController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    public void  share(String content) {
        publicationService.share(new Story(content));
    }
}
