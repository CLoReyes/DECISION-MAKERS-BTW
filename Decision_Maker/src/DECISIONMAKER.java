import java.util.Scanner;

public class DECISIONMAKER
	{
		
		public static void main(String[] args)
			{
	//			name();
	//			question();
				iThinkTheNextHeirarchyShouldBeInputs();
			}

		

		private static void name()
			{
				Scanner nombre = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = nombre.nextLine();
				System.out.println("Well hello " + name + ". I have been built to make decisions for you!");
				
			}

		private static void question()
			{
				Scanner questions = new Scanner (System.in);
				System.out.println("You will never have to make another hard decision on your own ever again!");
				System.out.println("Now, what question do you want answered?");
				String question = questions.nextLine();
				
				System.out.println("What an interesting dilema you got there. But don't worry, I will help you out.");
			}

		private static void iThinkTheNextHeirarchyShouldBeInputs()
			{
				
			}
	}
