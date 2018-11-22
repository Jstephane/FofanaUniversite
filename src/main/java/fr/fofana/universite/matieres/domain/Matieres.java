package fr.fofana.universite.matieres.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.fofana.universite.enseignants.domain.Enseignants;
import fr.fofana.universite.notes.domain.Notes;

@Entity
@Table(name = "t_matiere")
public class Matieres {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Column(name = "NUMERO_MATIERE")
	private Integer NumeroMatiere;

	@Column(name = "NOM")
	private String Nom;

	@Column(name = "COEF")
	private Integer Coefficient;

	@Column(name = "DATE_DEBUT")
	private String DateDeDebut;

	@Column(name = "DATE_FIN")
	private String DateDeFin;

	@ManyToOne
	@JoinColumn(name = "id_enseignant")
	private Enseignants enseignant;

	@OneToMany(mappedBy = "matiere")
	private List<Notes> Notes;

	public Enseignants getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignants enseignant) {
		this.enseignant = enseignant;
	}

	public Matieres() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matieres(Integer id, Integer numeroMatiere, String nom, Integer coefficient, String dateDeDebut,
			String dateDeFin) {
		super();
		Id = id;

		NumeroMatiere = numeroMatiere;
		Nom = nom;
		Coefficient = coefficient;
		DateDeDebut = dateDeDebut;
		DateDeFin = dateDeFin;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNumeroMatiere() {
		return NumeroMatiere;
	}

	public void setNumeroMatiere(Integer numeroMatiere) {
		NumeroMatiere = numeroMatiere;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public Integer getCoefficient() {
		return Coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		Coefficient = coefficient;
	}

	public String getDateDeDebut() {
		return DateDeDebut;
	}

	public void setDateDeDebut(String dateDeDebut) {
		DateDeDebut = dateDeDebut;
	}

	public String getDateDeFin() {
		return DateDeFin;
	}

	public void setDateDeFin(String dateDeFin) {
		DateDeFin = dateDeFin;
	}

}
