package com.example.rbsbjava;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class ResumeController {

	@Autowired
    ResumeRepository resumeRepository;

    // Get all resumes
    @GetMapping("/resumes")
	public List<Resume> getAllResumes() {
	    return resumeRepository.findAll();
	}

	// Create a new Resume
	@PostMapping("/resumes")
	public Resume createResume(@Valid @RequestBody Resume resume) {
	    return resumeRepository.save(resume);
	}

	// Get a Single Resume
	@GetMapping("/resumes/{id}")
	public ResponseEntity<Resume> getResumeById(@PathVariable(value = "id") Long resumeId) {
	    Resume resume = resumeRepository.findOne(resumeId);
	    if(resume == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(resume);
	}

	// Update a Resume
	@PutMapping("/resumes/{id}")
	public ResponseEntity<Resume> updateResume(@PathVariable(value = "id") Long resumeId, 
	                                       @Valid @RequestBody Resume resumeDetails) {
	    Resume resume = resumeRepository.findOne(resumeId);
	    if(resume == null) {
	        return ResponseEntity.notFound().build();
	    }
	    resume.setTitle(resumeDetails.getTitle());
	    resume.setSummary(resumeDetails.getSummary());

	    Resume updatedResume = resumeRepository.save(resume);
	    return ResponseEntity.ok(updatedResume);
	}

	// Delete a Resume
	@DeleteMapping("/resumes/{id}")
	public ResponseEntity<Resume> deleteResume(@PathVariable(value = "id") Long resumeId) {
	    Resume resume = resumeRepository.findOne(resumeId);
	    if(resume == null) {
	        return ResponseEntity.notFound().build();
	    }

	    resumeRepository.delete(resume);
	    return ResponseEntity.ok().build();
	}
}