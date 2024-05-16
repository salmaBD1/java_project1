package springMVCApp.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import springMVCApp.dao.entities.Utilisateur;
import springMVCApp.dao.repositories.IUtilisateurRepo;
import springMVCApp.services.Iservices.IServiceUtilisateur;
@Service
@AllArgsConstructor// create the constructor
@Transactional
public class ServiceUtilisateurImpl implements IServiceUtilisateur {
    private final IUtilisateurRepo ur;
	@Override
	public void ajouterUser(Utilisateur u) {
		ur.save(u);
		
	}

	@Override
	public void suppUser(Integer id) {
		Optional<Utilisateur> u= ur.findById(id);
		if(u.isEmpty())
			throw new RuntimeException("user not found");
		else
			ur.deleteById(id);
		
	}

	@Override
	public void modifierUser(Utilisateur u) {
		ur.save(u);
		
	}

	@Override
	public Utilisateur chercherUser(Integer id) {
		Optional<Utilisateur> u=ur.findById(id);
		if(u.isEmpty())
			throw new RuntimeException("client not found");
		else
			return u.get();
	}

	@Override
	public List<Utilisateur> listerUser() {
		
		return ur.findAll();
	}

}
