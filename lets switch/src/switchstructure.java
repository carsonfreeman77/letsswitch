import java.util.Scanner;

public class switchstructure {

	public static void main(String[] args) {

		
		Scanner c = new Scanner(System.in);
		System.out.println("Im thinking of a number...");
		
		
		int answer = (int)Math.ceil(Math.random()*20);
		
		
		switch (answer)
		{
		
		case 2:	
		case 4:	
		case 6:
		case 10:		
		case 12:
		case 14:
		case 16:
		case 20:
		{
		System.out.println("You win! Winner winner chicken dinner! My number was " + answer);
		break;
		}
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 9:
		case 11:
		case 13:
		case 15:
		case 17:
		case 18:
		case 19:
		{
		System.out.println("You lose:( My number was " + answer);
		break;
		}
		default:
		{
		}
		}
		
		//maggigiciicicc 8 ball
		
		System.out.println("Hello I am the magic 8 ball! \nAsk me something...");
			
		Scanner userInp = new Scanner(System.in);
		int ball = (int)Math.ceil(Math.random()*6);
		String a = userInp.nextLine();
		
		
		
		switch (ball) 
		{
		
		case 2:
		{
			System.out.println("I didnt quite get that... ask again");
			break;
		}
		case 3:
		{
			System.out.println("I believe so... ");
			break;
		}
		case 4:
		{
			System.out.println("Hmmmmmmm");
			break;
		}
		case 5:
		{
			System.out.println("Your wish is my command");
			break;
		}
		case 6:
		{
			System.out.println("Yes!!!!");
			break;
		}
		default:
		
		
		
		
	}
		
		
		
		
	}

}
