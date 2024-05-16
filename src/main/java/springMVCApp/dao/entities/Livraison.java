package springMVCApp.dao.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Livraison {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idL;
private LocalDate dateLivraison;
@OneToOne(mappedBy = "livraison", fetch = FetchType.LAZY)
private Commande commande;
private String status;
}
