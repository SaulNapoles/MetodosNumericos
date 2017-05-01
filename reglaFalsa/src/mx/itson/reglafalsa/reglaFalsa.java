/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reglafalsa;

/**
 *
 * @author Usuario
 */
public class reglaFalsa {

    //Metodo para determinar la raíz
    public double raiz(funcion f, double a, double b, int n, double error) {
        double r = Double.NaN;
        double xr = a;
        int k = 0;

        while (Math.abs(f.evaluar(xr)) > error && k < n) {
            xr = (a * f.evaluar(b) - b * f.evaluar(a)) / (f.evaluar(b) - f.evaluar(a));
            if (f.evaluar(a) * f.evaluar(xr) < 0) {
                b = xr;
            } else {
                a = xr;
            }
            k++;

        }

        if (k < n) {
            r = xr;
        }
        return r;

    }

}
