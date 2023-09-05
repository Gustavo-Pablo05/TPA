package tabuada;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int t, r;
		int i = 1;
		System.out.println("Digite o numero desejado");
		t = in.nextInt();
	while(i<11) {
		r = t*i;
		i++;
		System.out.println(r);
	}

}
}
