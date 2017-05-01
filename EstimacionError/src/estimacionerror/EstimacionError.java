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
public class EstimacionError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodos metodos = new Metodos();
        
        double e = 2.7182818281;
        double x = 0.5, n = 3;
        
        double valVerdadero = metodos.exponente(e, x);
        
        double es = metodos.es(x, n);
        int vuelta = 1;
        
        
        double resultado = metodos.resultado(vuelta, x);
        
        double aproximacionActual = resultado;
        double aproximacionAnterior = 0;
        
        double ea = metodos.ea(aproximacionActual, aproximacionAnterior);
        
        double et = metodos.et(valVerdadero, resultado);
        double etp = metodos.etp(et);
        
        
        vuelta++;
        
        System.out.println("ea = "+ea);
        System.out.println("etp = " + etp);
        System.out.println("et = "+et);
        System.out.println("es = "+es);
        System.out.println("resultado = "+resultado);
        System.out.println("------------");
        
        while(ea > es) {
            aproximacionAnterior = resultado;
            
            resultado = aproximacionAnterior + metodos.resultado(vuelta, x);
            aproximacionActual = resultado;
            
            
            
            ea = metodos.ea(aproximacionActual, aproximacionAnterior);
            et = metodos.et(valVerdadero, resultado);
            etp = metodos.etp(et);
            
            System.out.println("resultado = "+resultado);
            System.out.println(vuelta+" ea = "+ ea);
            System.out.println("etp = "+ etp);
            System.out.println("-----------");
            
            vuelta++;
            
      
        }
        
        
        
        
        
    }
    
}
