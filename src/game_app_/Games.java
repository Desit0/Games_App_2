/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game_app_;

import game_app_.Validation;

/**
 *
 * @author Desi
 */
public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validation b = new Validation();
        String a="Desi";
        String c = "15";
        
        System.out.println(b.Username(a));
        System.out.println(b.Age(c));
    }
    
}
