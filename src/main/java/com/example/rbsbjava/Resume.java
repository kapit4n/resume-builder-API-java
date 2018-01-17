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
    private String title;
    private String summary;

    public Resume(){}


    public Resume(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return title;
    }

    @Override
    public String toString() {
        return String.format(
                "Resume[id=%d, title='%s', summary='%s']",
                id, title, summary);
    }
}