package com.example.rbsbjava;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/resumes")
    public Resume resume(@RequestParam(value="name", defaultValue="World") String name) {
        return new Resume(String.format(template, name));
    }
}