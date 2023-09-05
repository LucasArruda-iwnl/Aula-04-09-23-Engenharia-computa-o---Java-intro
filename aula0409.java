import java.util.Scanner;

import javax.xml.transform.SourceLocator;

/* && = e 
 * || = ou
 */

public class aula0409 {
    /**
     * @param args
     */
    public static void main(String[] args) {    
        float nota; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite a nota: ");
        nota = sc.nextFloat();
        if (nota >= 70 && nota <= 100){
             System.out.println("Aprovado"); 
            }
       else if (nota >= 40 && nota <= 100) {
            System.out.println("Fazer A1");
        }  
       else  if (nota < 40) {
            System.out.println("reprovado"); 
        }    

        else   {
            System.out.println("Nota Inválida!!");
        }

        

        sc.close();
    }
}
