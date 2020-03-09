package com.birahim.portfolio.experience;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExperienceController {

	
	@Autowired
	private ExperienceDAO experienceDao;
	

	@RequestMapping(value = "/experience", method = RequestMethod.GET)
	public List<Experience> listeExperience() {
		List<Experience> experience = experienceDao.findAll();
		return experience;	
	}
	
	
	@PutMapping(value="/experience")
	public void updateExperience(@RequestBody Experience experience) {
		experienceDao.save(experience);
	}
	
	@PostMapping(value="/experience")
	public void createExperience(@RequestBody Experience experience) {
		experienceDao.save(experience);
	}
	
	
	@DeleteMapping(value = "/experience/{id}")
	public void deleteExperience(@PathVariable int id) {
		experienceDao.deleteById(id);
	}
	
}
