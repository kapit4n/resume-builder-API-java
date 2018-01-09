package com.example.rbsbjava;

public class Resume {

    private final long id;
    private final String content;

    public Resume(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}