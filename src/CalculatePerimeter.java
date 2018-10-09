import java.util.Scanner;

public class CalculatePerimeter {
	
	public static void main(String[] args) {
		
		
		double Length, Width, Area, Perimeter;
		Scanner sc = new Scanner (System.in);
		String Question;
		
	do {
		System.out.println("Enter Length: ");
		Length = sc.nextDouble();
		
		System.out.println("Enter Width");
		Width = sc.nextDouble();
		
		Area = Width * Length;
		Perimeter = 2 * (Width + Length);
		
		System.out.println("The Area of the classroom is "+Area);
		System.out.println("The Perimeter of the classroom is "+Perimeter);
		
		//Garbage line clearing scanner
		sc.nextLine();
		
		
		System.out.println("Do you want to continue to measure?");
		Question = sc.nextLine();
    
		
		}
		
	while (Question.equalsIgnoreCase("Y")); //equalsIgnoreCase - allows user to use lower or upper case letters
		
	}	

}
