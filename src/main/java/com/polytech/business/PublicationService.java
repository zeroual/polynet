package com.polytech.business;

import com.polytech.data.Story;
import com.polytech.data.StoryRepository;

import java.util.List;

public class PublicationService {

    private StoryRepository storyRepository;

    public PublicationService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void share(Story story) {
        //  business logic
        storyRepository.save(story);
    }
    public List<Story> fetchAll(){
        return storyRepository.findAll();
    }
}
