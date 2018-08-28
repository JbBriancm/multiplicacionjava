/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

import java.util.Scanner;
public class Multiplicacion {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
         int n1,n2;
         System.out.println("Bienvenido al sistema que nada mas hace una multiplicacion!!!");
         System.out.println("Ingresa el primer valor:");
         n1=teclado.nextInt();
         System.out.println("Ingresa el segundo valor:");
         n2=teclado.nextInt();
         
         System.out.println("El resultado de la multiplicación es:"+n1*n2);
    }
    
}

