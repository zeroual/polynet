package com.polytech.data;

public class Story {
    String content;

    public Story(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "data.Story{" +
                "content=" + content +
                '}';
    }
}