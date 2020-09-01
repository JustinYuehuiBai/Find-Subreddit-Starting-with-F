import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class SubredditText 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Justin Bai\\Documents\\College Stuff\\CSCI170\\message.txt");
		
		
		Scanner s = new Scanner(file);
		
		String newList = "";
		
		while(s.hasNextLine())
		{
			String subreddit = s.nextLine();
			
			int length = subreddit.length();
			
			if (length > 0)
			{
				if (subreddit.charAt(length-1) == 'z' || subreddit.charAt(length-1) == 'Z')
				{
					if (hasNumber(subreddit))
					{
						newList = newList.concat(subreddit + "\n");
					}
				}
			}
		}
		
		FileWriter writer = new FileWriter("C:\\Users\\Justin Bai\\Documents\\College Stuff\\CSCI170\\narratorMessage.txt");
		writer.write(newList);
		writer.close(); 
		
	}
	
	public static boolean hasNumber(String input)
	{
		for(int i = 0; i < input.length(); i++)
		{
			if (Character.isDigit(input.charAt(i)))
				return true;
		}
		
		return false;
	}
}
