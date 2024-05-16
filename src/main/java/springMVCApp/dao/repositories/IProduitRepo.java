package springMVCApp.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springMVCApp.dao.entities.Produit;

public interface IProduitRepo extends JpaRepository<Produit, Integer>{

}
