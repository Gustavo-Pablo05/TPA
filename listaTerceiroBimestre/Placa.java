package Lista1;

import java.util.Scanner;
public class Placa {
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int p;
	System.out.println("Qual o ultimo digto da sua placa?");
	p = in.nextInt();
	switch(p) {
	case 1:
	case 2:
		System.out.println("Rod�zio de Segunda");
			break;
		
	case 3:
	case 4:
		
		System.out.println("Rod�zio de Ter�a");
		break;
		
		
	case 5:
	case 6:
		System.out.println("Rod�zio de Quarta");
		break;
	case 7:	
	case 8:
		System.out.println("Rod�zio de Quinta");
		break;
	case 9:
	case 0:
		System.out.println("Rod�zio de Sexta");
		break;
	    default:
			System.out.println("N�mero Invalido");
		
	}
	}

}
