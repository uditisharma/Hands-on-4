import java.io.IOException;
import java.util.Scanner;


public class Jack_Jill 
{
	public static void main(String[] args) throws IOException
	{
		int input=0;
		System.out.println("Choose a card from 1 to 10");
		try{
		Scanner sr=new Scanner(System.in);
		input=sr.nextInt();
		}catch(Exception e)
		{
			System.out.println("Type mismatch integer expected");
		}
		if(input>=1 && input<=10)
		switch(input)
		{
		case 1: 
			System.out.println("Jill you choose 1");
			break;
		case 2: 
			System.out.println("Jill you choose 2");
			break;
		case 3: 
			System.out.println("Jill you choose 3");
			break;
		case 4: 
			System.out.println("Jill you choose 4");
			break;
		case 5: 
			System.out.println("Jill you choose 5");
			break;
		case 6: 
			System.out.println("Jill you choose 6");
			break;
		case 7: 
			System.out.println("Jill you choose 7");
			break;
		case 8: 
			System.out.println("Jill you choose 8");
			break;
		case 9: 
			System.out.println("Jill you choose 9");
			break;
		case 10: 
			System.out.println("Jill you choose 10");
			break;
		
		}
		else
		{
			System.out.println("Choose correct card");
			
		}
		
		}


}
