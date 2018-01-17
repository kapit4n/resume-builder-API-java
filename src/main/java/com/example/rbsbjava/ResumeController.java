package com.example.rbsbjava;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @RequestMapping("/resumes")
    public Resume resume() {
        return new Resume("Software Title", "Software Summary");
    }
}