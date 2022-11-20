package com.skinny.io;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.skinny.io.Repos.ProduitRepository;
import com.skinny.io.entities.Categorie;
import com.skinny.io.entities.Produit;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("PC HP",2800.00,new Date());
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit() {
	Produit p = produitRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
	Produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(1800.0);
	produitRepository.save(p);
	System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit() {
	produitRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousProduits() {
	List<Produit> prods = produitRepository.findAll();
	for (Produit p : prods) {
	System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNom() {
	List<Produit> prods = produitRepository.findByNomProduit("Pc Dell");
	
	for (Produit p:prods)
		System.out.println(p);
	}
	
	@Test
	public void testFindProduitByNomContain() {
		List<Produit> prods = produitRepository.findByNomProduit("Pc");
		
		for (Produit p:prods)
			System.out.println(p);
		}
	
	@Test
	public void testfindByNomPrix() {
	List<Produit> prods = produitRepository.findByNomPrix("iphone X", 1000.0);
	for (Produit p : prods) {
	System.out.println(p);
		}
	}
	
	@Test
	public void testfindByCategorie() {
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List<Produit> prods = produitRepository.findByCategorie(cat);
	
	for (Produit p : prods) {
	System.out.println(p);
		}
	}
	
	@Test
	public void testfindByOrderByNomProduitAsc() {
	List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
	
	for (Produit p : prods) {
	System.out.println(p);
		}
	}
	
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	for (Produit p : prods) {
	System.out.println(p);
		}
	}


}
