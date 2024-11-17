import java.util.Scanner;
public class IT24103968Lab4Q3{

public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	
	System.out.println((number<0)?"The number is negative.":"The number is positive.");
		
		
	if(number == 0){
		System.out.println("The number is: Zero");
	}
}

}