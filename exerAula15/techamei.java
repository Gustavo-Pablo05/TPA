package matriz1;

public class techamei {
	
	public static void main(String[] args) {
		
		int a[][],i,j,ult=2;
		a = new int [4][4];
		
		for (i=0;i<4;i++) {
			for(j=0;j<4;j++) {
			a[i][j]=ult*2;
			ult = a[i][j];
			
			
			
			
}
		}for (i=0;i<4;i++) {
			System.out.println();
		
			for(j=0;j<4;j++) {
			System.out.print(a[i][j]+ " ");
	}
		}
	
}
	}