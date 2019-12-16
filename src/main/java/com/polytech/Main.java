package com.polytech;

import com.polytech.business.PublicationService;
import com.polytech.data.InMemoryStoryRepository;
import com.polytech.data.Story;
import com.polytech.data.StoryRepository;
import com.polytech.rest.StoryController;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // instantiate and  inject dependencies ...
        StoryRepository storyRepository = new InMemoryStoryRepository();
        PublicationService publicationService = new PublicationService(storyRepository);
        StoryController storyController = new StoryController(publicationService);


        // simulate http cal
        storyController.share("Hello Marseille");
        storyController.share("Hello Paris");
        storyController.share("Hello London");

        List<Story> feed = publicationService.fetchAll();

        for (Story s : feed) {
            System.out.println(s.toString());
        }
    }
}


