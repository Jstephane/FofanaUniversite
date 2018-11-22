package fr.fofana.universite.notes.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotesPK implements Serializable {

	@Column(name = "id_etudiant")
	private Integer idetudiant;

	@Column(name = "id_matiere")
	private Integer idmatiere;

	public NotesPK() {
		super();

	}

	public NotesPK(Integer idetudiant, Integer idmatiere) {
		super();
		this.idetudiant = idetudiant;
		this.idmatiere = idmatiere;
	}

	public Integer getIdetudiant() {
		return idetudiant;
	}

	public void setIdetudiant(Integer idetudiant) {
		this.idetudiant = idetudiant;
	}

	public Integer getIdmatiere() {
		return idmatiere;
	}

	public void setIdmatiere(Integer idmatiere) {
		this.idmatiere = idmatiere;
	}

}
