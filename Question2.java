package doer;

public class Question2 {  
	 public static void main(String[] args) {  
		 int i, j,k=0,row = 5;       
		
		for (i=0; i<row; i++){  
		
		//print spaces 
		for (j=2*(row-1-i); j>0; j--) {  
			     
		System.out.print(" ");   
		} 
		
		//print in alphabets 
		for (j=0; j<=i; j++ ) {   
		System.out.print((char)(65 + k)+" ");
		k++;
		} 
		
		System.out.println();   
		}
	 }
}

