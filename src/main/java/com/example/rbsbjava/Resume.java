package com.example.rbsbjava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String content;

    public Resume(){}


    public Resume(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.format(
                "Resume[id=%d, content='%s'']",
                id, content);
    }
}