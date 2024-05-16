package springMVCApp.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springMVCApp.dao.entities.Livraison;
import springMVCApp.dao.repositories.ILivraisonRepo;
import springMVCApp.services.Iservices.IServiceLivraison;
//to make it a service 
@Service
@Transactional
public class ServiceLivraison implements IServiceLivraison {

    private final ILivraisonRepo livraisonRepo;

    @Autowired
    public ServiceLivraison(ILivraisonRepo livraisonRepo) {
        this.livraisonRepo = livraisonRepo;
    }

    @Override
    public void ajouterLivraison(Livraison livraison) {
        livraisonRepo.save(livraison);
    }

    @Override
    public void annulerLivraison(Integer id) {
        Optional<Livraison> livraison = livraisonRepo.findById(id);
        if (livraison.isEmpty()) {
            throw new RuntimeException("Livraison not found");
        }
        livraisonRepo.deleteById(id);
    }

    @Override
    public Livraison chercherLivraison(Integer id) {
        return livraisonRepo.findById(id).orElse(null);
    }

    @Override
    public List<Livraison> getAllLivraisons() {
        return livraisonRepo.findAll();
    }

    @Override
    public void modifierLivraison(Livraison livraison) {
        livraisonRepo.save(livraison);
    }

}
