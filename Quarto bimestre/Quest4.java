package quest;

import java.util.Scanner;

public class Quest4  {
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int []a= new int[10];
    int b =0;
    for (int i = 0; i < a.length; i++) {
        System.out.println("Digite o valor de numero "+i+"°");
        a[i]= in.nextInt();
        b+=a[i];
    }
    System.out.println("A media da vetor é de: "+(b/10));
    in.close();
}
}