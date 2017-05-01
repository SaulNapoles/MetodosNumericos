/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpolacionnewton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static javax.management.Query.lt;

/**
 *
 * @author Usuario
 */
public class InterpolacionNewton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
 public double lee(){
double num;
try{
InputStreamReader isr = new InputStreamReader (System.in);
BufferedReader br = new BufferedReader(isr);
String sdato;
sdato = br.readLine();
num = Double.parseDouble(sdato);
}
catch(IOException ioe){
num=0.0;
}
return num;
}
    public void MetodoInterNewton(){
double a[][] = new double [5][2];
double x,y,fx1x0,fx2x1,fx3x2,fx4x3,fx2x1x0,fx3x2x1,fx4x3x2,fx3x2x1x0,fx4x3x2x1,fx4x3x2x1x0;
int i;
System.out.println("\t\t\t\"INTERPOLACION DE DIFERENCIAS DE NEWTON P/ 5 PTOS.\"");
System.out.println("Valor a interpolar: ");
x=lee();
System.out.println("Dame los 5 pares de puntos");

for(i=0;i&lt=5;i++){
System.out.println("Dame x "+i);
a[i][0]=lee();
System.out.println("Dame f(x) "+i);
a[i][1]=lee();
}

fx1x0=(a[1][1]-a[0][1])/(a[1][0]-a[0][0]);
fx2x1=(a[2][1]-a[1][1])/(a[2][0]-a[1][0]);
fx3x2=(a[3][1]-a[2][1])/(a[3][0]-a[2][0]);
fx4x3=(a[4][1]-a[3][1])/(a[4][0]-a[3][0]);
fx2x1x0=(fx2x1-fx1x0)/(a[2][0]-a[0][0]);
fx3x2x1=(fx3x2-fx2x1)/(a[3][0]-a[1][0]);
fx4x3x2=(fx4x3-fx3x2)/(a[4][0]-a[2][0]);
fx3x2x1x0=(fx3x2x1-fx2x1x0)/(a[3][0]-a[0][0]);
fx4x3x2x1=(fx4x3x2-fx3x2x1)/(a[3][0]-a[0][0]);
fx4x3x2x1x0=(fx4x3x2x1-fx3x2x1x0)/(a[4][0]-a[0][0]);
y=a[0][1]+fx1x0*(x-a[0][0])+fx2x1x0*(x-a[0][0])*(x-a[1][0])+fx3x2x1x0*(x-a[0][0])*(x-a[1][0])*(x-a[2][0])+fx4x3x2x1x0*(x-a[0][0])*(x-a[1][0])*(x-a[2][0])*(x-a[3][0]);
System.out.println("f(x) en ese punto es: "+y);
}
}
