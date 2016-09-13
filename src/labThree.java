import java.util.Scanner;

public class labThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learn your squares and cubes!");
		System.out.println("Please enter an integer to begin.");
		// read user input
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int intNext = 0;
		
		// Read page 185 for examples
		//formula for calculating squares
		//formula for calculating cubes
		for(i = 1; i <= intNext; i++){
			System.out.println(Math.pow(i,2));
			System.out.println(Math.pow(i,3));
		}
		//Print headers
		boolean x = false;
		if(x=true){
		System.out.println("Number		Squared		Cubed");
		System.out.println("======		======		======");
		} else { x = false;
			
		}
		
		// Print all numbers between input and 1
		
		//Print square of all numbers between input and 1
		
		//Print cube of all numbers between input and 1



//Do out want to continue prompt
//System.out.println("Continue?");


	}

}
