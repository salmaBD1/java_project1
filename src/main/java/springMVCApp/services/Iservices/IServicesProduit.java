package springMVCApp.services.Iservices;

import java.util.List;

import springMVCApp.dao.entities.Produit;


public interface IServicesProduit {
	public void ajouterProduit(Produit p);
	public void suppProduit(Integer id);
	public void modifierProduit(Produit p);
	public Produit chercherProduit(Integer id);
	public List<Produit> listerProduit();
}
