package springMVCApp.services.Iservices;

import java.util.List;

import springMVCApp.dao.entities.Livraison;

public interface IServiceLivraison {
	void ajouterLivraison(Livraison livraison);
    void annulerLivraison(Integer id);
    Livraison chercherLivraison(Integer id);
    List<Livraison> getAllLivraisons();
    void modifierLivraison(Livraison livraison);
}
