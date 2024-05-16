package springMVCApp.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springMVCApp.dao.entities.Commande;

public interface ICommandeRepo extends JpaRepository<Commande, Integer>{

}
