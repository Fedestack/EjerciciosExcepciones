package org.fedestack.ejercicio2;

import java.util.Random;

public class Array {


   public static void array(){
      Random random = new Random();
      try{
         int[] numeros = new int[3];

         for(int i = 0; i < 6; i++) {
            int numero = random.nextInt(20)+1;
            numeros[i] = numero;
            System.out.println(numeros[i]);
         }
      }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("error en el limite del array / "+e.getMessage());
      }
   }
}
