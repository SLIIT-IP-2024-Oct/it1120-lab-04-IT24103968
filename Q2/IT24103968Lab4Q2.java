import java.util.Scanner;

public class IT24103968Lab4Q2{

public static void main(String[]args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Please enter exam marks (out of hundred): ");
	int examMarks= scanner.nextInt();
	System.out.print("Please enter lab submission marks (out of hundred): ");
	int labMarks = scanner.nextInt();

	if (examMarks>100 || labMarks >100 || examMarks<0 || labMarks <0){
		System.out.print("The marks must be in the range of 0 to 100.");
	}else{
		System.out.print("Input the percentage taken from the exam mark: ");
		int examPercentage = scanner.nextInt();
		System.out.print("Input the percentage taken from the lab submission mark: ");
		int labPercentage = scanner.nextInt();
		
		double finalMarks = (labMarks*labPercentage*0.01) + (examMarks*examPercentage*0.01);
		System.out.println("The Final Mark is: "+finalMarks );
	}
	
}

}