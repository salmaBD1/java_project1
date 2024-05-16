package springMVCApp.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idS;
private int quantite;
@OneToOne(fetch = FetchType.LAZY)
private Produit produit;

}
