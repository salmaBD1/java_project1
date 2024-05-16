package springMVCApp.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springMVCApp.dao.entities.Livraison;

public interface ILivraisonRepo extends JpaRepository<Livraison, Integer> {

}
