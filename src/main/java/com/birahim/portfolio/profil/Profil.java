package com.birahim.portfolio.profil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Profil {
	
	@Id
	@GeneratedValue
	private int id ;
	private String nom;
	private String prenom;
	private String email;
	private String avatar;
	private String telephone;
	private String location;
	
	
	
	/**
	 * 
	 */
	public Profil() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param avatar
	 * @param telephone
	 * @param location
	 */
	public Profil(int id, String nom, String prenom, String email, String avatar, String telephone, String location) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.avatar = avatar;
		this.telephone = telephone;
		this.location = location;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profil [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", avatar=" + avatar
				+ ", telephone=" + telephone + ", location=" + location + "]";
	}
	
	
	

}
