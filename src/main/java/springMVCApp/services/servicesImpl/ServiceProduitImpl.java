package springMVCApp.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import springMVCApp.dao.entities.Produit;
import springMVCApp.dao.entities.Utilisateur;
import springMVCApp.dao.repositories.IProduitRepo;
import springMVCApp.dao.repositories.IUtilisateurRepo;
import springMVCApp.services.Iservices.IServicesProduit;
@Service
@AllArgsConstructor// create the constructor
@Transactional
public class ServiceProduitImpl implements IServicesProduit {
     private final IProduitRepo pr;
	@Override
	public void ajouterProduit(Produit p) {
		pr.save(p);
		
	}

	@Override
	public void suppProduit(Integer id) {
		Optional<Produit> p= pr.findById(id);
		if(p.isEmpty())
			throw new RuntimeException("user not found");
		else
			pr.deleteById(id);
		
	}

	@Override
	public void modifierProduit(Produit p) {
		pr.save(p);
		
	}

	@Override
	public Produit chercherProduit(Integer id) {
		Optional<Produit> p= pr.findById(id);
		if(p.isEmpty())
			throw new RuntimeException("product  not found");
		else
			return p.get();
		
	}

	@Override
	public List<Produit> listerProduit() {
		
		 return pr.findAll();
	}

}
