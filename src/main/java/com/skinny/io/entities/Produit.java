package com.skinny.io.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateCreation;
	
	@ManyToOne
	private Categorie cat;
	
	public Categorie getCategorie() {
		return cat;
	}
	public void setCategorie(Categorie categorie) {
		this.cat = categorie;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
				+ ", dateCreation=" + dateCreation + "]";
	}
	public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
		super();
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.dateCreation = dateCreation;
	}
	
	public Produit() {
		super();
	}
	
	public long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
}
