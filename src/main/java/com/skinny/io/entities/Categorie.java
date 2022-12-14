package com.skinny.io.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCat;
	private String nomCat;
	private String descCat;
	
	
	@OneToMany (mappedBy = "cat")
	private List<Produit> produits;
	
}
