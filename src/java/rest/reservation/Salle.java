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
@XmlRootElement(name = "Salle")
public class Salle {
    private String nom ;
    private String type ; 

    public Salle() {
    }

    public Salle(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    /**
     *
     */
    public String getNom() {
        return this.nom;
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
