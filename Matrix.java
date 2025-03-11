import java.util.Scanner;

public class Matrix{
	public static void main(String[] args) {

	 int n,m;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter no of rows");
	 n=sc.nextInt();
	 System.out.println("enter no of coloumns");
	 m=sc.nextInt();
	  int a[][]=new int[n][m];
	  int b[][]=new int[n][m];
	  int c[][]=new int[n][m];
	 System.out.println("enter elements of first matrix");
	for(int i=0;i<n;i++){
	for(int j=0;j<m;j++){
	a[i][j]=sc.nextInt();
	}
       }
	System.out.println("enter elements of second matrix");
	for(int i=0;i<n;i++){
	for(int j=0;j<m;j++){
	b[i][j]=sc.nextInt();
	}
       }
	System.out.println("Addition of two matrix");
	for(int i=0;i<n;i++){
	for(int j=0;j<m;j++){
	c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+" ");  
	}
	System.out.println();
	}
	
  }
 }


