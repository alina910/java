import java.util.Scanner;
public class WordGame{
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		//My practice run codes
		/*System.out.println(isLetterInPlace("both",'t',2)); //true
		System.out.println(isLetterInPlace("flute",'s',3)); //false
		System.out.println(isLetterInPlace("yelp",'p',3)); //true
		System.out.println(isLetterInWord("both",'t')); //true
		System.out.println(isLetterInWord("both",'a')); //false
		System.out.println(isLetterInWord("both",'z')); //false
		System.out.println(countLettersInPlace("both","bath")); //3
		System.out.println(countLettersInPlace("both","pods")); //1
		System.out.println(countLettersInPlace("both","thus")); //0
		System.out.println(countLettersInWord("chip","path")); //2
		System.out.println(countLettersInWord("chip","clot")); //1
		System.out.println(countLettersInWord("chip","stun")); //0
		System.out.println(assesWord("chip","chip")); //4
		System.out.println(assesWord("chip","clot")); //1
		System.out.println(assesWord("chip","chap")); //3*/
		System.out.println("Please give me a word");
		runGame(reader.nextLine());
	}
	// Method to check if  a char letter is in the right position in a word
	public static boolean isLetterInPlace(String word,char character, int position){
		char letter = word.charAt(position);
		if(character==letter){
		// Returns true or false if the character is equal to the letter in that position
		return true;
		}
		return false;
	}
	//Method to check if char is in the word (position doesn't matter)
	public static boolean isLetterInWord(String word, char character) {
		int position = 0;
		int wordLength = word.length();
		//Loop that checks each position for the specific char
		while (position<wordLength){
			if(character == word.charAt(position))
		//Return true or false if character is found anywhere in word
			{
			return true;
			}
		position = position + 1;
			}
			return false;
	}
	//Method to count how many letters in the guess are in the right place comparing with the answer
	public static int countLettersInPlace(String answer,String guess){
		//How many times a character from guess matched the character in the same position in the answer
		int timesGuessMatchAnswer = 0;
		int position = 0;
		//Loop that goes through each letter in the guess and comparing it to each letter in the answer
		while(position< answer.length()){
			if(position<guess.length()){
				//If letter is in the right place in guess add 1 to timesGuessMatchAnswer to keep track
				if(isLetterInPlace (answer,guess.charAt(position),position)){
					timesGuessMatchAnswer++;
				}
			}
			position++;
		}
		//return the number of the total amount of times a character from guess matched a character from answer with the same position 
		return timesGuessMatchAnswer;
	}
	//How many times a character from guess matched the character the answer (without importance of the position)
	public static int countLettersInWord(String answer,String guess){
		int timesGuessMatchAnswer = 0;
		int position = 0;
		//Loop that goes through each letter in the guess and comparing it to anywhere in the answer
		while(position< answer.length()){
			if(position<guess.length()){
				//If letter is in the word in guess add 1 to timesGuessMatchAnswer to keep track
				if(isLetterInWord (answer,guess.charAt(position))){
					timesGuessMatchAnswer++;
				}
			}
			position++;
		}
		//return the number of the total amount of times a character from guess matched a characters from answer
		return timesGuessMatchAnswer;	 
	}
	//Method to evaluate the guess and provide feedback by implementing/calling LettersInPlace and LettersInWord
	public static boolean assessWord(String answer, String guess){
		//Getting count of letters in the correct position in guess
		int LettersInPlace = countLettersInPlace(answer,guess);
		//Getting count of letters that are both in answer and guess
		int LettersInWord = countLettersInWord(answer,guess);
		System.out.println("Characters are in the correct position:" + LettersInPlace);
		System.out.println("Characters are in the word:" + LettersInWord);
		//If the length of guess is not the same as the length of answer return false automatically
		int position = 0;
		if(!(answer.length()==guess.length())){
			return false;
		}
		//Loop to check if each character in a position is the same for guess and answer 
		while(position<answer.length()){
			if(!(answer.charAt(position) == guess.charAt(position))){
				//Return false if it isn't the same
				return false;	
		}
		position++;
	}
	//Return true if it is the same
	return true;
	}
//Method that will run the game	
	public static void runGame(String answer){
		Scanner reader = new Scanner(System.in);
		int attempts = 0;
		//Loop that will make sure that user only has 12 attempts
		while(attempts<12){
		System.out.println("Input your guess:");
		String guess = reader.nextLine() ;
		boolean feedback = assessWord(answer, guess);
		if(feedback){
			System.out.println("Congrats! You won the game");
			//return right after so that the game will end when user inputed the right answer
			return;
		}
		else{
		
		if(attempts<11)
		{
			System.out.println("Please try again");
		}
		attempts++;	   
		}
		
		}
		//If user hit the maximum number of attempts and lost
		{	System.out.println ("You lost! HAHAHA LOSER");
		}
		
		}
}
	