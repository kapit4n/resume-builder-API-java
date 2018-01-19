package com.example.rbsbjava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.*;
import org.springframework.stereotype.Repository;


@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {

}