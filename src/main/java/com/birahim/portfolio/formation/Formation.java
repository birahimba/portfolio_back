package com.birahim.portfolio.formation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue
	private int id;
	private String ecole;
	private String diplome; 
	private String anneeDebut;
	private String anneeFin;
	
	@Column(nullable = true)
	private String description;

	/**
	 * 
	 */
	public Formation() {
		super();
	}

	/**
	 * @param id
	 * @param ecole
	 * @param diplome
	 * @param anneeDebut
	 * @param anneeFin
	 * @param description
	 */
	public Formation(int id, String ecole, String diplome, String anneeDebut, String anneeFin, String description) {
		super();
		this.id = id;
		this.ecole = ecole;
		this.diplome = diplome;
		this.anneeDebut = anneeDebut;
		this.anneeFin = anneeFin;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the ecole
	 */
	public String getEcole() {
		return ecole;
	}

	/**
	 * @return the diplome
	 */
	public String getDiplome() {
		return diplome;
	}

	/**
	 * @return the anneeDebut
	 */
	public String getAnneeDebut() {
		return anneeDebut;
	}

	/**
	 * @return the anneeFin
	 */
	public String getAnneeFin() {
		return anneeFin;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param ecole the ecole to set
	 */
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}

	/**
	 * @param diplome the diplome to set
	 */
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	/**
	 * @param anneeDebut the anneeDebut to set
	 */
	public void setAnneeDebut(String anneeDebut) {
		this.anneeDebut = anneeDebut;
	}

	/**
	 * @param anneeFin the anneeFin to set
	 */
	public void setAnneeFin(String anneeFin) {
		this.anneeFin = anneeFin;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Formation [id=" + id + ", ecole=" + ecole + ", diplome=" + diplome + ", anneeDebut=" + anneeDebut
				+ ", anneeFin=" + anneeFin + ", description=" + description + "]";
	}
	
	
	

}
