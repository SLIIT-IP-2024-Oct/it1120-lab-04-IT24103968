import java.util.Scanner;
public class IT24103968Lab4Q1{

public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	
	if(number < 0){
		System.out.println("The number is: Negative");
	}else{
		System.out.println("The number is: Positive");
	}
		
	if(number == 0){
		System.out.println("The number is: Zero");
	}
}

}