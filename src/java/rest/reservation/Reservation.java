/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.reservation;

/**
 *
 * @author zakari
 */
public class Reservation {
    
    private String date ;
    private String description ; 
    private Double duree ; 
    private String heure ; 
    private String numReservation ; 
    private Salle salle ;
    private String typeCours ; 
    private Utilisateur utilisateur ;
    
    public String getNumReservation(){
        return numReservation ;
    }
}
