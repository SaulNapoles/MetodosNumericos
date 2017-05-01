
package mx.itson.reglafalsa;

/**
 *
 * @author Saul
 */
public class reglaFalsaTest {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        funcion f = new funcion() {
               
            //Cambiar el valor de la ecuacion a la que se quiere sacar raíz.
            @Override
            public double evaluar(double x) {
            double e = 2.7182818285;
            double resultado = Math.pow(e, -1*x)-2*x;
            return resultado;
// return (39*(x*x))+(4*(x))-20;
//                 return ((2.7182818284*(x*-x))-(2*x));
            }
        };
        reglaFalsa RF = new reglaFalsa();
        double raiz = RF.raiz(f, 0, 1, 100, 1e-10);
        
        System.out.println("la raiz es igual a: "+raiz);
    }
    
    
}
