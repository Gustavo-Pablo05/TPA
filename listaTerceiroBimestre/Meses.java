package Lista1;

import java.util.Scanner;
public class Meses {

	public static void main(String[] args) {
		
int m;
Scanner in = new Scanner (System.in);
 System.out.println("escreva um mes de 1 a 12;");
 
 m = in.nextInt();
 
 switch(m) {
 
 case 1: System.out.println("janeiro, tem 31 dias  "); 
 break;
 case 2: System.out.println("feveiro, tem 28 dias  "); 
 break;
 case 3: System.out.println("março, tem 31 dias  "); 
 break;
 case 4: System.out.println("abril, tem 30 dias  "); 
 break;
 case 5: System.out.println("maio, tem 31 dias  "); 
 break;
 case 6: System.out.println("junho, tem 30 dias  "); 
 break;
 case 7: System.out.println("julho, tem 31 dias  "); 
 break;
 case 8: System.out.println("agosto, tem 31 dias  "); 
 break;
 case 9: System.out.println("setembro, tem 30 dias  "); 
 break;
 case 10: System.out.println("outubro, tem 31 dias  "); 
 break;
 case 11: System.out.println("novembro, tem 30 dias  "); 
 break;
 case 12: System.out.println("dezembro, tem 31 dias  "); 
 break;
 default:
 System.out.println("Mes Invalido");
 
 }
	}

}
