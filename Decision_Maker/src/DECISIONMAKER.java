import java.util.Scanner;

public class DECISIONMAKER
	{
		
		public static void main(String[] args)
			{
	//			name();
	//			question();
				userInputs();
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

		private static void userInputs()
			{
//				boolean restart = true;
//				while (restart)
//					
//					{
						Scanner options = new Scanner (System.in);
						System.out.println("To make it a little bit easier on me, give me the number of options you currently have.");
						int optionNum = options.nextInt();
						
							if (optionNum == 1)
								{
									System.out.println("I think you already know your answer.");
								}
							else
								{
									System.out.println("Alright so " + optionNum + " options? I can work with that.");
									
									String[] content = new String [optionNum];
									for (int i = 0; i < optionNum; i++)
										{
											System.out.println("Give me option " + (i+1));
											Scanner choices = new Scanner (System.in);
											
											String answer = choices.nextLine();
											content [i] = answer;
										}
									System.out.println("My final verdict is this!");
									System.out.println("You should choose " + content [(int) (Math.random()*optionNum)] + ".");
								}
						
						
						
								
								
//						System.out.println("Now, please input choice #" + );
//					}
				
				
			}
	}
