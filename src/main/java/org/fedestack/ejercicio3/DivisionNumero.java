package org.fedestack.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumero {

   public static void numeros(){
      Scanner sc = new Scanner(System.in).useDelimiter("\n");

      try{
         System.out.println("Ingrese 2 numero para dividir");
         String num1 = sc.next();
         String num2 = sc.next();

         int numero1 = Integer.parseInt(num1);
         int numero2 = Integer.parseInt(num2);

         int resultado = numero1 / numero2;

         System.out.println(resultado);

      }catch (ArithmeticException e){
      System.out.println("Error, no se puede dividir por 0 "+e.getMessage());
      }catch(NumberFormatException e){
      System.out.println("Error, valor ingresado no se puede convertir a entero "+e.getMessage());
      }catch(InputMismatchException  e){
      System.out.println("Error, tipo de dato ingresado incorrecto "+e.getMessage());
      }
   }
}
