package springMVCApp.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springMVCApp.dao.entities.Utilisateur;

public interface IUtilisateurRepo extends JpaRepository<Utilisateur, Integer>{

}
