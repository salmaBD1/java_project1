package springMVCApp.services.Iservices;

import java.util.List;

import springMVCApp.dao.entities.Utilisateur;



public interface IServiceUtilisateur {
	public void ajouterUser(Utilisateur u);
	public void suppUser(Integer id);
	public void modifierUser(Utilisateur u);
	public Utilisateur  chercherUser(Integer id);
	public List<Utilisateur > listerUser();
}
