package org.fedestack.ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Adivinar {

  public static void adivinar() {
    Random random = new Random();
    int numRandom = random.nextInt(500) + 1;
    int numero = 0;
    int contador = 0;
    System.out.println("Adivina el numero:\n");
    do {
      try {
        System.out.println("Ingrese un numero del 1 al 500");
        numero = new Scanner(System.in).nextInt();
        contador++;
      } catch (InputMismatchException e) {
        System.out.println("Error, ingrese un numero entero");
         contador++;
        continue;
      } catch (Exception e) {
        System.out.println("Error, ingrese un numero");
         contador++;
        continue;
      }

      if (numero == numRandom) {
        System.out.println("FELICIDADES!! le pegaste");
      } else if (numero < numRandom) {
        System.out.println("Proba con un numero mas alto");
      } else if(numero > 500){
        System.out.println("Te pasaste del limite");
      }else{
        System.out.println("Proba con un numero mas bajo");
      }

    } while (numRandom != numero);

    System.out.println("Intentaste "+contador+" veces antes de adivinar el numero");
  }
}
