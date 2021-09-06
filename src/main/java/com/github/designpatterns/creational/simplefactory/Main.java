package com.github.designpatterns.creational.simplefactory;

public class Main {

    public static void main(String[] args) {

        Post news = PostFactory.createPost("news");

        if (news instanceof NewsPost newsPost) {
            System.out.println("This is a news post " + newsPost);
        }
    }
}
