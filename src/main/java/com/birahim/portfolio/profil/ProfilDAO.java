package com.birahim.portfolio.profil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfilDAO extends JpaRepository<Profil, Integer> {

}
