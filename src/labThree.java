import java.util.Scanner;

public class labThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learn your squares and cubes!");
		String cont = null;
		boolean userContinue = true;
		while(userContinue){
		System.out.println("Please enter an integer to begin.");
			
		// read user input
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		
		
		//Print headers
		System.out.println("Number		Squared		Cubed");
		System.out.println("======		======		======");

		//formula for calculating squares
		//formula for calculating cubes
		for(int i = 1; i <= x; i++){System.out.println(i+ "\t\t" + facMe2(i) + "\t\t" +facMe(i));}
	

		//Do out want to continue prompt
		
		//Ask if you want to continue	
		System.out.println("Continue?");
		Scanner input1 = new Scanner(System.in);
		String inputContinue = input1.nextLine();
		if(inputContinue.equalsIgnoreCase("y")){
			userContinue = true;
		} else {
			userContinue = false;
			System.out.println("Ok bye!");
		}
	}//close while loop
	
		
	}
	
	
	public static int facMe(int x){
		 
		if(x==0){
			return 0;	
		}else{
			
			return (x*x*x);
		}
	}
	public static int facMe2(int x){
		 
		if(x==0){
			return 0;	
		}else{
			
			return (x*x);
		}
	}
}
