package fr.fofana.universite.enseignants.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.fofana.universite.matieres.domain.Matieres;

@Entity
@Table(name = "t_enseignant")
public class Enseignants {

	@OneToMany
	private List<Matieres> matieres;

	public List<Matieres> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matieres> matieres) {
		this.matieres = matieres;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Column(name = "numero_enseignant")
	private Integer NumeroEnseignant;

	@Column(name = "Nom")
	private String Nom;

	@Column(name = "PRENOM")
	private String Prenom;

	@Column(name = "date_naissance")
	private String DateDeNaissance;

	@Column(name = "SEXE")
	private String Sexe;

	@Column(name = "GRADE")
	private String Grade;

	@Column(name = "date_embauche")
	private String DatedEmbauche;

	public Enseignants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignants(Integer id, Integer numeroEnseignant, String nom, String prenom, String dateDeNaissance,
			String sexe, String grade, String datedEmbauche) {
		super();
		Id = id;
		NumeroEnseignant = numeroEnseignant;
		Nom = nom;
		Prenom = prenom;
		DateDeNaissance = dateDeNaissance;
		Sexe = sexe;
		Grade = grade;
		DatedEmbauche = datedEmbauche;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNumeroEnseignant() {
		return NumeroEnseignant;
	}

	public void setNumeroEnseignant(Integer numeroEnseignant) {
		NumeroEnseignant = numeroEnseignant;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getDateDeNaissance() {
		return DateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		DateDeNaissance = dateDeNaissance;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getDatedEmbauche() {
		return DatedEmbauche;
	}

	public void setDatedEmbauche(String datedEmbauche) {
		DatedEmbauche = datedEmbauche;
	}

}
