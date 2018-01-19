package com.example.rbsbjava;

import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "resumes")
@EntityListeners(AuditingEntityListener.class)
public class Resume {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotBlank
    private String title;
    
    @NotBlank
    private String summary;

    public Resume(){
    }


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

    public void setTitle(String ti) {
        title = ti;
    }

    public String getSummary() {
        return title;
    }

    public void setSummary(String s) {
        summary = s;
    }

    @Override
    public String toString() {
        return String.format(
                "Resume[id=%d, title='%s', summary='%s']",
                id, title, summary);
    }
}