package atividade;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double salarioMedio = sc.nextDouble();
      double credito =0;
      double creditoDisponiel =0;
      
      creditoDisponiel = credito*salarioMedio;
      if (salarioMedio>601) {
        credito = 0.4;
        creditoDisponiel = credito*salarioMedio;
      }else if(salarioMedio>401){
        credito = 0.3;
         creditoDisponiel = credito*salarioMedio;
      }else if(salarioMedio>201){
        credito = 0.2;
         creditoDisponiel = credito*salarioMedio;
      }
     System.out.print("Crédito Disponiel: "+ creditoDisponiel);
  }
}