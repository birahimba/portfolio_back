package com.birahim.portfolio.formation;

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
public class FormationController {
   
	
	
	@Autowired
	private FormationDAO formationDao;
	
	
	@RequestMapping(value = "/formation", method = RequestMethod.GET)
	public List<Formation> listeFormation() {
		List<Formation> formation = formationDao.findAll();
		return formation;	
	}
	
	
	@PutMapping(value="/formation")
	public void updateFormation(@RequestBody Formation formation) {
		formationDao.save(formation);
	}
	
	@PostMapping(value="/formation")
	public void createFormation(@RequestBody Formation formation) {
		formationDao.save(formation);
	}
	
	
	@DeleteMapping(value = "/formation/{id}")
	public void deleteFormation(@PathVariable int id) {
		formationDao.deleteById(id);
	}
	
}
