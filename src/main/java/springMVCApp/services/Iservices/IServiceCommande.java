package springMVCApp.services.Iservices;

import java.util.List;

import springMVCApp.dao.entities.Commande;

public interface IServiceCommande {
public void ajouterCommande(Commande c);
public void annulerCommande(Integer id);
public Commande cherchergetCommande(Integer id);
public List<Commande> getAllCommandes();
public void modifierCommande(Commande c);

}
