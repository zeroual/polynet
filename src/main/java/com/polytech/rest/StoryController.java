package com.polytech.rest;

import com.polytech.business.PublicationService;
import com.polytech.data.InMemoryStoryRepository;
import com.polytech.data.Story;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class StoryController {
    private PublicationService publicationService;


    public StoryController() {
        InMemoryStoryRepository storyRepository = new InMemoryStoryRepository();
        this.publicationService = new PublicationService(storyRepository);

    }

    @PostMapping("/stories")
    @ResponseStatus(HttpStatus.CREATED)
    public void share(@RequestBody Story story) {
        publicationService.share(story);
    }

    @GetMapping("/stories")
    @ResponseStatus(HttpStatus.OK)
    public List<Story> fetchAll() {
        return publicationService.fetchAll();
    }
    @GetMapping("/hello/{name}")
    public String toto(@PathVariable("name") String name){
        return "hello " + name;
    }
}
