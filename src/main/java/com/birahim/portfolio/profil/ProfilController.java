package com.birahim.portfolio.profil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfilController {
	
	@Autowired
	private ProfilDAO profilDao;
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value = "/Profil", method = RequestMethod.GET)
	public List<Profil> listeProfil() {
		List<Profil> profil = profilDao.findAll();
		return profil;	
	}
	
	@PutMapping(value="/Profil")
	public void updateProfil(@RequestBody Profil profil) {
		profilDao.save(profil);
	}
	
	
	

}
