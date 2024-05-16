package springMVCApp.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idP ;
private String name ;
private int quantite;
private double prix ;
@OneToOne(mappedBy = "produit", fetch = FetchType.LAZY)
private Stock stock;
@ManyToOne
private Commande commande;
}
