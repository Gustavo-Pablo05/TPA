package Lista1;

import java.util.Scanner;
public class Signo {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           
        System.out.print("Digite o dia em que voc� nasceu: ");
        int d = in.nextInt();

        System.out.print("Digite o m�s em que voc� nasceu (n�mero): ");
        int m = in.nextInt();
        switch (m) {
        case 1:
            if (d >= 20) {
                System.out.println("Aquario");
                break;
            } else {
            	System.out.println("Capric�rnio");}
            break;
            case 2:
                if (d >= 19) {
                    System.out.println("Peixes");
                    break;
                } else {
                	System.out.println("Aqu�rio");
                	break;
            } case 3: 
                if (d >= 21) {
                    System.out.println("Aries");
                    break;
                } else {
                	System.out.println("Peixes");
                	break;
        }case 4: 
            if (d >= 20) {
                System.out.println("Touro");
                break;
            } else {
            	System.out.println("Aries");
            	break;
    }case 5: 
        if (d >= 21) {
            System.out.println("G�meos");
            break;
        } else {
        	System.out.println("Touro");
        	break;
}case 6: 
    if (d >= 21) {
        System.out.println("C�ncer");
        break;
    } else {
    	System.out.println("G�meos");
    	break;
}case 7: 
    if (d >= 23) {
        System.out.println("Le�o");
        break;
    } else {
    	System.out.println("C�ncer");
    	break;
}case 8: 
    if (d >= 23) {
        System.out.println("Virgem");
        break;
    } else {
    	System.out.println("Le�o");
    	break;
}case 9: 
    if (d >= 23) {
        System.out.println("Libra");
        break;
    } else {
    	System.out.println("Virgem");
    	break;
}case 10: 
    if (d >= 23) {
        System.out.println("Escorpi�o");
        break;
    } else {
    	System.out.println("Libra");
    	break;
}case 11: 
    if (d >= 22) {
        System.out.println("Sargitario");
        break;
    } else {
    	System.out.println("Escorpi�o");
    	break;
}case 12: 
    if (d >= 22) {
        System.out.println("Capricornio");
        break;
    } else {
    	System.out.println("Sargitario");
    	break;
}default:
	System.out.println("Invalido");
      }
    
        }
}