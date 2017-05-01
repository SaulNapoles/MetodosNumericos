/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimacionerror;

/**
 *
 * @author Saul
 */
public class Metodos {
    double terminos;
    double resultado;
    double et;
    double ea;

    
    //Constructor
    public Metodos() {}
    
    public Metodos(double terminos, double resultado, double et, double ea) {
        this.terminos = terminos;
        this.resultado = resultado;
        this.et = et;
        this.ea = ea;
    }
    
    
    //Obtener exponenciar
    public double exponente(double e, double x) {
        double n = Math.pow(e, x);
        return n;
    }
    
    //Obtener el factorial de un número
    public int factorial(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        else {
            return i*factorial(i-1);
        }
    }
    
    //Calcular resultado segun las vueltas
    public double resultado(int vuelta, double x) {
        if (vuelta == 1) {
            return 1;
        }
        else if (vuelta == 2) {
            return x;
        }
        else {
            double v1 = exponente(x, vuelta-1);
            double v2 = factorial(vuelta-1);
            
            double total = v1/v2;
            
            return total;
        }
    }
    
    //Calcular Maximo Error Permitido
    public double es(double x, double n) {
        double numero = exponente(10, 2-n);
        double total = x * numero;
        
        return total;
    }
    
    //Calcular Error Relativo Porcentual Verdadero
    public double et(double valVerdadero, double valAproximado) {
        double total = ( (valVerdadero - valAproximado) / valVerdadero );
        return total;
    }
    
    //Calcular Estimación Aproximada del Error
    public double ea(double aproxActual, double aproxAnterior) {
        double total = ( (aproxActual - aproxAnterior) / aproxActual ) * 100;
        return total;
    }
    
    public double etp (double et){
        return et*100;
    }
    
}
