/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author hp
 */
public class Evaluation {
   
    private Enseignant enseignant_id;
    private Etudiant etudiant_id;
    private double note;
    private String commentaire;
     
   public Evaluation( Enseignant enseignant_id, Etudiant etudiant_id, double note, String commentaire) {
       
        this.enseignant_id = enseignant_id;
        this.etudiant_id = etudiant_id;
        this.note = note;
        this.commentaire = commentaire;
    } 

    /**
     * @return the enseignant_id
     */
    public Enseignant getEnseignant_id() {
        return enseignant_id;
    }

    /**
     * @param enseignant_id the enseignant_id to set
     */
    public void setEnseignant_id(Enseignant enseignant_id) {
        this.enseignant_id = enseignant_id;
    }

    /**
     * @return the etudiant_id
     */
    public Etudiant getEtudiant_id() {
        return etudiant_id;
    }

    /**
     * @param etudiant_id the etudiant_id to set
     */
    public void setEtudiant_id(Etudiant etudiant_id) {
        this.etudiant_id = etudiant_id;
    }

    /**
     * @return the note
     */
    public double getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(double note) {
        this.note = note;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
 
    
   
}
