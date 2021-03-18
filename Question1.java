package doer;

public class Question1 {  
	 public static void main(String[] args) {  
		 int i, j, row = 5;       
		
		for (i=0; i<row; i++)   
		{  
		
		//print spaces 
		for (j=(row-1-i); j>0; j--) {     
		System.out.print(" ");   
		}
		
		//print asterisks
		for (j=0; j<=i; j++) {   
		System.out.print("* ");
		}
		
		System.out.println();   
		}
}
}

