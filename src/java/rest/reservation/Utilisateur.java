/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.reservation;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zakari
 */
@XmlRootElement(name="Utilisateur")
public class Utilisateur {
    private String email;
    private String grade ; 
    private String nom ; 
    private String prenom ; 

    public Utilisateur() {
    }

    public Utilisateur(String email, String grade, String nom, String prenom) {
        this.email = email;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    
}
