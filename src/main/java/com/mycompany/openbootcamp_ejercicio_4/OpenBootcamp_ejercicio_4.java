/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.openbootcamp_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Fabshadow0404
 */
public class OpenBootcamp_ejercicio_4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int salir=1;
    
    do {
        System.out.println("Ingresa un numero: ");
      int numeroIf = sc.nextInt();
      
      if(numeroIf>0)
      {
          System.out.println("Es mayor que cero");
      }else if(numeroIf<0)
      {
          System.out.println("Es menor que cero ");
      } else {System.out.println("Es igual con cero");}
      
      
        System.out.println("Ciclo while");
            int numeroWhile=0;
        while(numeroWhile<3)
        {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("Ciclo do while");
       int numeroDoWhile = 0;
do {
    System.out.println(numeroDoWhile);
    numeroDoWhile++;
} while (numeroDoWhile < 3);

        
        System.out.println("Ciclo for ");
for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
    System.out.println(numeroFor);
}

        System.out.println("Switch");
          System.out.println("Seleccione una estacion del año:");
        System.out.println("1 Primavera");
        System.out.println("2 Invierno");
        System.out.println("3 Otoño");
        System.out.println("4 Verano");
        int estaciones=sc.nextInt();
      
        
        switch(estaciones)
        {
            case 1: System.out.println("Primavera"); break;
            case 2: System.out.println("Invierno"); break;
            case 3: System.out.println("Otoño"); break;
            case 4: System.out.println("Verano"); break;
            default: System.out.println("Solo puede teclear 1,2,3 o 4 ");
        } 
        System.out.println("Para repetir el proceso presione 1");
        System.out.println("Para salir presione cualquier otro numero");
         salir=sc.nextInt();
    }while(salir==1);
    }
}
