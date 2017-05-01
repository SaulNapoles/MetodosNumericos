/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Epsilon;

/**
 *
 * @author Usuario
 */
public class Tarea2Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 1.0;
        int n = 0; 
        while (1.0 + (x * 0.5)> 1.0) {
            ++n; x *= 0.5;
            
        }
        
        System.out.println("Epsilon de la máquina binaria = "+ n);
        System.out.println("Epsilon de la máquina decimal = "+ x);
    }
    
}
