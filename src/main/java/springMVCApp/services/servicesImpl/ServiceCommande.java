package springMVCApp.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import springMVCApp.dao.entities.Commande;
import springMVCApp.dao.entities.Livraison;
import springMVCApp.dao.entities.Produit;
import springMVCApp.dao.repositories.ICommandeRepo;
import springMVCApp.services.Iservices.IServiceCommande;
@Service
@AllArgsConstructor
@Transactional
public class ServiceCommande implements IServiceCommande{
	private final ICommandeRepo cr;
	@Override
	public void ajouterCommande(Commande c) {
		cr.save(c);

	}

	@Override
	public void annulerCommande(Integer id) {
		Optional<Commande> c= cr.findById(id);
		if(c.isEmpty())
			throw new RuntimeException("commande not found");
		else
			cr.deleteById(id);

	}

	@Override
	public Commande cherchergetCommande(Integer id) {
		Optional<Commande> c= cr.findById(id);
		if(c.isEmpty())
			throw new RuntimeException("product  not found");
		else
			return c.get();
	}

	@Override
	public List<Commande> getAllCommandes() {
		return cr.findAll();
	}

	@Override
	public void modifierCommande(Commande c) {
		cr.save(c);

	}

	

}
