package doer;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {  
	 public static void main(String[] args) {  
		    
		    double budget;
		    int i;
		    //create a list 
		    ArrayList<String> productName= new ArrayList <String>();
		    ArrayList<Double> quantity =new ArrayList<>();
		    ArrayList<Double> price =new ArrayList<>();
		    Scanner sc = new Scanner(System.in);
		    
		   
		    
		    while(true) {
		    //check budget is above zero or not
	        System.out.print("Enter your budget:");
	        budget = sc.nextDouble(); 
	        if(budget > 0)break;
	        System.out.println("Budget Should be above zero \n");
		    }
	        
	        while(true) {
	            System.out.println("1.Add an item");
	            System.out.println("2.Exit");
	            System.out.println("Enter your choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch (choice) {
             case 1:
                 System.out.println("Enter product: ");
                 String name = sc.nextLine();
                 System.out.println("Enter quantity: ");
                 double Quantity = sc.nextDouble();
                 System.out.println("Enter Price :");
                 int Price = sc.nextInt();
                 System.out.println();
                 
                 
                 //update
                 if(productName.contains(name)) {
                 	int index = productName.indexOf(name);
                 	budget += price.get(index);
                 	if(Price > budget) {
                     	System.out.println("Cannot update this product it's overprice\n");
                     	continue;
                     	
                     }
                 	quantity.set(index,Quantity);
                 	price.set(index,(double)Price);
  
                 	budget -= Price;
                 }
                 //add new item
                 else {
                 	
                 	if(budget == 0) {
                 		System.out.println("Existing budget is zero so cannot add new item only update the existing one\n");
                     	continue;
                 	}
                 	
                 	if(Price > budget) {
                     	System.out.println("Cannot buy this product it's overprice\n");
                     	continue;
                     }
                 	productName.add(name);
                 	quantity.add(Quantity);
                 	price.add((double)Price);
                 	budget -= Price;
                 	
                 }
                 System.out.println("Amount Left: "+budget);
                 break;
             case 2:
                 
             	System.out.print("Amount left can buy you ");
             	
             	//items that can be brought by having same budget
             	if(price.contains(budget)) {
             		for(i = 0; i<price.size(); i++) {
             			if(price.get(i) == budget)
                 		System.out.print(productName.get(i)+" ");
                 	}
             	}
             	
             	//items that can be brought by existing budget
             	else {
             		for(i = 0; i<price.size(); i++) {
             			if(price.get(i) < budget)
                 		System.out.print(productName.get(i)+" ");
                 	}
             		
             	}
             		
             		
             	System.out.println("\n");	
           
             	System.out.println("GROCERY LIST is:");
                 System.out.println("ProductName"+" "+"Quantity"+" "+"Price");
             	for(i = 0; i<price.size(); i++) {
             		System.out.println(productName.get(i)+"  \t"+quantity.get(i)+"kg\t "+price.get(i));
             	}
             	sc.close();
                 return;
             default:
             	System.out.println("Please select the correct option\n");
                 
         }
	        
	          	
	 }
	        
}
}
