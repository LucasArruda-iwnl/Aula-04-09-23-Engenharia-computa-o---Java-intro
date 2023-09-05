import java.security.PublicKey;
import java.util.Scanner;

public class Exercicios0409 {
    public static void main(String[] args) {
       float num1; 
       Scanner sc = new Scanner(System.in); 
        
       System.out.println("Digite Seu Número");

       num1 = sc.nextFloat(); 

       if (num1 <= 0) {
        System.out.println("Número é negativo ");
       }
      else if (num1 == 0) { 
        System.out.println("Seu número é neutro igual a zero");
       }
      else  if (num1 >= 0) { 
        System.out.println("Seu número é positivo");

       }
       
       
       
       

       
       
       
       
       
       
       
       
       
       
        sc.close(); 
    }
}
