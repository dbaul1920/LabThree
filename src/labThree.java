import java.util.Scanner;

public class labThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learn your squares and cubes!");
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
//		if(x>=0){
//			System.out.println(x + "\t\t" + facMe2(x) + "\t\t" +facMe(x));
//		} else { 
//		System.out.println("Nah bruh, that's not gonna cut it.");
//				}


//Do out want to continue prompt
//System.out.println("Continue?");


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
	private static int t(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
