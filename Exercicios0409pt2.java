import java.util.Scanner;
public class Exercicios0409pt2 {
    /* b*2 / 4xCxA */
 public static void main(String[] args) {
int a, b, c; 
Scanner sc = new Scanner(System.in); 
System.out.println("Digite seu valor de A");
 a = sc.nextInt(); 

 System.out.println("Digite seu valor de B");
 b = sc.nextInt(); 

 System.out.println("Digite seu valor de C");
 c = sc.nextInt(); 

int stepone = (4*a*c); 
int steptwo = (b*b); 

int delta = (steptwo/stepone); 


System.out.println ("resultado é" + delta);

 }   
}
