/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biseccion;

/**
 *
 * @author Usuario
 */
public class Biseccion {

    //Definimos pruebas en el progroma principal
    public static double f (double x){
        return -(x*x)-(2*x)+1;
    }
    
    public static void main(String[] args) {
        double a= 0, b=1, c=0;
        //Nota: [a,b] es un intervalo real tal que f(a)* f*(b)<0
        if (f(a)*f(b)>0) {
            System.out.println("No se cumple que f(a)*f(b)>0");
            return;
        }
        
        while (true){
            c = (a+b)/2;
            if (Math.abs(f(c))<=1e-10) {
                System.out.println("La raiz estimada es r = " + c);
                System.out.println("El valor de f en r = " + c);
                return;
            }
            if (f(a)*f(c)<0) {
                b = c;
            } else {
                a = c;
            }
        }
    }
    
}
