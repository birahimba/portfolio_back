package com.birahim.portfolio.experience;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Experience {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Enumerated(EnumType.STRING)
	private ContratType contratType;
	private String poste;
	private String entreprise; 
	private String entrepriseLink;
	private String lieu;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private String media;
	/**
	 * 
	 */
	public Experience() {
		super();
	}
	/**
	 * @param id
	 * @param contratType
	 * @param poste
	 * @param entreprise
	 * @param entrepriseLink
	 * @param lieu
	 * @param dateDebut
	 * @param dateFin
	 * @param media
	 */
	public Experience(int id, ContratType contratType, String poste, String entreprise, String entrepriseLink,
			String lieu, Date dateDebut, Date dateFin, String media) {
		super();
		this.id = id;
		this.contratType = contratType;
		this.poste = poste;
		this.entreprise = entreprise;
		this.entrepriseLink = entrepriseLink;
		this.lieu = lieu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.media = media;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the contratType
	 */
	public ContratType getContratType() {
		return contratType;
	}
	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}
	/**
	 * @return the entreprise
	 */
	public String getEntreprise() {
		return entreprise;
	}
	/**
	 * @return the entrepriseLink
	 */
	public String getEntrepriseLink() {
		return entrepriseLink;
	}
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @return the media
	 */
	public String getMedia() {
		return media;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param contratType the contratType to set
	 */
	public void setContratType(ContratType contratType) {
		this.contratType = contratType;
	}
	/**
	 * @param poste the poste to set
	 */
	public void setPoste(String poste) {
		this.poste = poste;
	}
	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	/**
	 * @param entrepriseLink the entrepriseLink to set
	 */
	public void setEntrepriseLink(String entrepriseLink) {
		this.entrepriseLink = entrepriseLink;
	}
	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(String media) {
		this.media = media;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Experience [id=" + id + ", contratType=" + contratType + ", poste=" + poste + ", entreprise="
				+ entreprise + ", entrepriseLink=" + entrepriseLink + ", lieu=" + lieu + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", media=" + media + "]";
	} 
	
	
	
	
	

}
