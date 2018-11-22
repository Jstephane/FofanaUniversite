package fr.fofana.universite.notes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.fofana.universite.etudiants.domain.Etudiants;
import fr.fofana.universite.matieres.domain.Matieres;

@Entity
@Table(name = "t_note")
public class Notes {

	@EmbeddedId
	private NotesPK notesPK;

	@Column(name = "Note")
	private Double Note;

	@ManyToOne
	@JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
	private Etudiants etudiant;

	@ManyToOne
	@JoinColumn(name = "id_matiere", insertable = false, updatable = false)
	private Matieres matiere;

	public Etudiants getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiants etudiant) {
		this.etudiant = etudiant;
	}

	public Matieres getMatiere() {
		return matiere;
	}

	public void setMatiere(Matieres matiere) {
		this.matiere = matiere;
	}

	public Notes() {
		super();

	}

	public Notes(NotesPK notesPK, Double note) {
		super();
		this.notesPK = notesPK;
		Note = note;
	}

	public NotesPK getNotesPK() {
		return notesPK;
	}

	public void setNotesPK(NotesPK notesPK) {
		this.notesPK = notesPK;
	}

	public Double getNote() {
		return Note;
	}

	public void setNote(Double note) {
		Note = note;
	}

}
