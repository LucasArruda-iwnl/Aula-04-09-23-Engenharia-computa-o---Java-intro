 import java.util.Scanner;

public class Calculadora0409 {
    

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    int num1, num2, result, opera; 

    System.out.print("Digite um número:"); 
    num1 = sc.nextInt();

    System.out.println("Digite outro número:");
    num2 = sc.nextInt();

    System.out.println("Digite: 1-soma 2-sub 3-div 4-mult");
    opera = sc.nextInt();

    if(opera == 1){
        result = num1 + num2; 
        System.out.println("resultado:" + result);

    }
    else if (opera == 2){
        result = num1 - num2; 
        System.out.println("resultado" + result);
    }

       else if (opera == 3){
        result = num1 / num2; 
        System.out.println("resultado" + result);
    }
       else if (opera == 4){
        result = num1 * num2; 
        System.out.println("resultado" + result);
    }

   }
   
  sc.close();  
}


