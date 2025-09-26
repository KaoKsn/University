import java.lang.Math;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;


class players
{
	final int T_QUESTIONS = 10;
	Scanner input = new Scanner(System.in);

	int level, score;

	// Initialize a player with level 0 and score 0.
	players()
	{
		level = 0;
		score = 0;
	}

	// A function that implements taking input from the user.
	void get_level()
	{	
		while (true)
		{
			System.out.print("Level: ");
			try
			{
				level = input.nextInt();
			}
			catch (InputMismatchException e)
			{
				// Read the next line buffer to avoid infinite loop.
				input.nextLine();
				continue;
			}
			catch (NoSuchElementException e)
			{
				System.out.println("\nExiting....");
				System.exit(-1);
			}
			
			// break the loop if you get a valid input.
			if (level <= 0 || level/4 != 0) 
				continue;

			break;
		}
	}
	
	void play()
	{
		int q_index = 0, r_answer;
		boolean right = false;

		// Generate 10 random questions.
		while (q_index < T_QUESTIONS)
		{
			int x = random_number_generator(level), y = random_number_generator(level);
			r_answer = x+y;
			int answer = -1;

			System.out.println();

			// Provide 3 attempts to get the right answer. 
			for (int attempt = 0; attempt < 3; attempt++)
			{
				while (true)
				{
					System.out.printf("%d + %d = ", x, y);
					try
					{
						answer = input.nextInt();
					}
					catch (InputMismatchException e)
					{
						// Read the next line buffer to avoid infinite loop.
						input.nextLine();
						continue;
					}
					catch (NoSuchElementException e)
					{
						System.out.println("\nExiting....");
						System.exit(-1);
					}
					break;
				}

				// Evaluate the answer.
				if (r_answer == answer)
				{
					// Increase the score on answering right.
					right = true;
					score++;
					break;
				}
				else
					System.out.println("EEE");
			}

			// If the user was unable to answer within three attempts. Print the right answer.
			if (!right)
				System.out.printf("%d + %d = %d\n", x, y, r_answer);

			q_index++;
		}
	}
	
	// A function that generates a random number with respect according to the level.
	int random_number_generator(int level)
	{
		Random r_generator = new Random();
		if (level == 1)
			return r_generator.nextInt(0, 9);
		else
		{
			int lower_bound= (int) Math.pow(10, level-1);
			int upper_bound = (int) (Math.pow(10, level) - 1);

			return r_generator.nextInt(lower_bound, upper_bound);
		}
	}

	void print_scores()
	{
		System.out.println("\n\n==========================================");
		System.out.println("		Results			  ");
		System.out.println("Score : " + score + "\n");
	}
}

class professor
{
	public static void main(String args[])
	{
		players player = new players();

		// Get the level from the user.
		player.get_level();

		// Let the user play at the entered level.
		player.play();

		// Print the results for the game play.
		player.print_scores();
	}
}
