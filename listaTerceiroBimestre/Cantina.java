package Lista1;

import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int p;
	   System.out.println("Qual o código do produto?");
	   p= in.nextInt();
	   switch(p) {
	   case 1:
           System.out.println("Cachorro Quente, R$8");
           break;
       case 2:
           System.out.println("Cheeseburger, R$12");
           break;
       case 3:
           System.out.println("X-Salada, R$15");
           break;
       case 4:
           System.out.println("Misto quente, R$11");
           break;
       case 5:
           System.out.println("Pão na chapa, R$6");
           break;
           default:
               System.out.println("Invalido");
	}
	}
	
  

}
