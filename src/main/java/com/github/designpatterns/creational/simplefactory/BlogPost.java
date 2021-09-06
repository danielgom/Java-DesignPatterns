package com.github.designpatterns.creational.simplefactory;

import java.util.List;

// Represents a blog post
public class BlogPost extends Post{

    private String author;
    private List<String> tags;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
