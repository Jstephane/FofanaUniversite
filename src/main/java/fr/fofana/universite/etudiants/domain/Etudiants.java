package fr.fofana.universite.etudiants.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.fofana.universite.notes.domain.Notes;

@Entity
@Table(name = "t_etudiant")
public class Etudiants {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Column(name = "NUMERO_ETUDIANT")
	private Integer NumeroEtudiants;

	@Column(name = "NOM")
	private String Nom;

	@Column(name = "PRENOM")
	private String Prenom;

	@Column(name = "DATE_NAISSANCE")
	private String DateDeNaissance;

	@Column(name = "SEXE")
	private String Sexe;

	@OneToMany(mappedBy = "etudiant")
	private List<Notes> Notes;

	public List<Notes> getNotes() {
		return Notes;
	}

	public void setNotes(List<Notes> notes) {
		Notes = notes;
	}

	public Etudiants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiants(Integer id, Integer numeroEtudiants, String nom, String prenom, String dateDeNaissance,
			String sexe) {
		super();
		Id = id;
		NumeroEtudiants = numeroEtudiants;
		Nom = nom;
		Prenom = prenom;
		DateDeNaissance = dateDeNaissance;
		Sexe = sexe;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getNumeroEtudiants() {
		return NumeroEtudiants;
	}

	public void setNumeroEtudiants(Integer numeroEtudiants) {
		NumeroEtudiants = numeroEtudiants;
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

}
