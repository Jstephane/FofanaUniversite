package fr.fofana.universite.enseignants.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.fofana.universite.matieres.domain.Matieres;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_enseignant")
public class Enseignants {
	

	@OneToMany
	private List<Matieres> matieres ;

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
	private String Nom ;    

	@Column(name = "PRENOM")
	private String Prenom ;   

	@Column(name = "date_naissance")
	private String DateDeNaissance ; 

	@Column(name= "SEXE")
	private String Sexe  ;   

	@Column(name = "GRADE")
	private String Grade ;    

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

//	private Integer Id;
//	private String NumeroEnseignant;
//	private String Nom;
//	private String Prenom;
//	private String DateDeNaissance;
//	private String Sexe;
//	private String Grade;
//	private String DateDEmbauche;
//	
	
	
	
//	public Enseignants() {
//		super();
		// TODO Auto-generated constructor stub
	


//	public Enseignants(Integer Id, String numeroEnseignant, String nom, String prenom, String dateDeNaissance,
//			String sexe, String grade, String dateDEmbauche) {
//		super();
//		this.setId(Id);
//		this.NumeroEnseignant = numeroEnseignant;
//		this.Nom = nom;
//		this.Prenom = prenom;
//		this.DateDeNaissance = dateDeNaissance;
//		this.Sexe = sexe;
//		this.Grade = grade;
//		this.DateDEmbauche = dateDEmbauche;
//	}





//	public String getNumeroEnseignant() {
//		return NumeroEnseignant;
//	}
//
//
//	public void setNumeroEnseignant(String numeroEnseignant) {
//		this.NumeroEnseignant = numeroEnseignant;
//	}
//
//
//	public String getNom() {
//		return Nom;
//	}
//
//
//	public void setNom(String nom) {
//		this.Nom = nom;
//	}
//
//
//	public String getPrenom() {
//		return Prenom;
//	}
//
//
//	public void setPrenom(String prenom) {
//		this.Prenom = prenom;
//	}
//
//
//	public String getDateDeNaissance() {
//		return DateDeNaissance;
//	}
//
//
//	public void setDateDeNaissance(String dateDeNaissance) {
//		this.DateDeNaissance = dateDeNaissance;
//	}
//
//
//	public String getSexe() {
//		return Sexe;
//	}
//
//
//	public void setSexe(String sexe) {
//		this.Sexe = sexe;
//	}
//
//
//	public String getGrade() {
//		return Grade;
//	}
//
//
//	public void setGrade(String grade) {
//		this.Grade = grade;
//	}
//
//
//	public String getDateDEmbauche() {
//		return DateDEmbauche;
//	}
//
//
//	public void setDateDEmbauche(String dateDEmbauche) {
//		this.DateDEmbauche = dateDEmbauche;
//	}
//
//
//	public Integer getId() {
//		return Id;
//	}
//
//
//	public void setId(Integer id) {
//		Id = id;
//	}
//
//}
