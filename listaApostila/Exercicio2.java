import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double distaPer, capaciTanq, gasto;
		System.out.println("Escreve a distância percorrida pelo teu automóvel.");
		distaPer = in.nextDouble();
		System.out.println("Escreve também a capacidade do tanque desse.");
		capaciTanq = in.nextDouble();
		
		gasto = distaPer - capaciTanq;
		
		if (gasto >=10) {System.out.println(+gasto+ " Carro econômico.");}
	}

}
