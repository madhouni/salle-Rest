/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.reservation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zakari
 */
public class ReservationBDD {
    private static List<Salle>   salles = new ArrayList<Salle>();
    private static List<Utilisateur> utilisateurs = new ArrayList<>();
    private static List<Reservation> reservations = new ArrayList<>();
    
    static{
        salles.add(new Salle("Micro 1.4","TP"));
        salles.add(new Salle("F","TP"));
    }
    
    static {
        utilisateurs.add(new Utilisateur("zakari@gmail.com", "kk","madhouni", "zakaria"));
    }
    
   public static List<Salle> getSalles(){
       return salles ; 
   }
   
   public static List<Utilisateur> getUtilisateurs(){
       return utilisateurs ;
   }
   
   public static List<Reservation> getReservation(){
       return reservations ;
   }
   
}
