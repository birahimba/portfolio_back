package com.birahim.portfolio.formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationDAO extends JpaRepository<Formation, Integer> {

}
