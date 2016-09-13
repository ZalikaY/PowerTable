import java.awt.Choice;
import java.util.Scanner;

public class GcSqCu {

	public static void main(String[] args) {
		
		
		//Welcome the user
		System.out.println("Learn your squares and cubes!");
		
		//Space
		System.out.println();
		
		//Create Scanner
		Scanner s = new Scanner(System.in);
		//boolean choice = true;
		String cont = "y" ;
		
		//While loop
		while (cont.equalsIgnoreCase("Y")){ 
		
		//User prompt
		System.out.println("Enter an integer: ");
		int u = s.nextInt();
			
		//Space
		System.out.println();
		
		//Chart Headers
		System.out.println("Number\t" + "Squared\t" + "Cubed\t");
		System.out.println("======\t" + "=======\t" + "======\t");	
		
		//Formulas for Number, Square and cubed
		for (int i = 0; i <= u; i++ ) {
		System.out.println(i +"\t" + (i * i) + "\t" + (i * i * i) + "\t");
		}
		//Continue
		System.out.println("Would you like to continue?");
		s.nextLine();
		cont = s.nextLine();
		/*if (cont.equalsIgnoreCase("Y")){
		choice = true ;
		}
		else { choice = false ; 
		}*/
		}
		
		}
		
		
		}


