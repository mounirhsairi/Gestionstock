package com.example.gestiondestock.model;



import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true )
@Entity
@Table(name="LigneCommandeFournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {
	@Column(name = "idEntreprise")
	private Integer idEntreprise ;
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article ;
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur ;
	@Column(name = "quantite")
	private BigDecimal quantite ;
	@Column(name = "prixUnitaire")
	private BigDecimal prixUnitaire ;

	@Override
	public String toString() {
	    return "LigneCommandeFournisseur{" +
	            ", quantite=" + quantite +
	            ", prixUnitaire=" + prixUnitaire +
	            '}';
	}
}
