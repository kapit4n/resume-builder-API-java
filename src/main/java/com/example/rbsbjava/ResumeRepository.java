package com.example.rbsbjava;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends CrudRepository<Resume, Long> {

    List<Resume> findByTitle(String title);
}