import java.util.Random;
public class Poker{
	public static void main (String[]args){
		
		
		
												//METHOD 1 TEST 1
	/*int[]deck = buildDeck();
	for(int i=0;i<deck.length;i++){
		System.out.println (deck[i]);*/	 				
												//METHOD 2 TESTING
														
	/*int[]cardArray=new int[40];
	for(int i = 0; i<cardArray.length;i++){
		cardArray[i]=i+1;
		System.out.print(cardArray[i]);
	}
	System.out.println();

	shuffleDeck(cardArray);
	for(int i = 0; i<cardArray.length;i++){
		System.out.print(cardArray[i]);
	}*/
	
												//METHOD 3 TESTING 1
	
	/*int[]cardArray=new int [20];
												//INITIALIZE ARRAY
	for(int i = 0; i<cardArray.length; i++){
		cardArray[i]=i+1;
	}
												//ARRAY BEFORE DEALT CARD
	System.out.println("");
	for(int b = 0; b<cardArray.length; b++){
		System.out.print(cardArray[b] + " ,");
		cardArray[b]=b+1;
												//DEALING CARD
	}
	int card = dealCard(cardArray);
		System.out.println("");
		System.out.println(card);
												//AFTER DEALING CARD	
	for(int a = 0; a<cardArray.length; a++){
		System.out.print(cardArray[a] + " ,");
		cardArray[a]=a+1;	
	}												
												//METHOD 3 TESTING 2
	int[]cardArray2=new int [5];
												//INITIALIZE ARRAY
	for(int i = 0; i<cardArray2.length; i++){
		cardArray2[i]=i+1;
	}
	System.out.println("");
												//ARRAY BEFORE DEALT CARD
	for(int b = 0; b<cardArray2.length; b++){
		System.out.print(cardArray2[b] + " ,");
		cardArray2[b]=b+1;
												//DEALING CARD
	}
	int card2 = dealCard(cardArray2);
		System.out.println("");
		System.out.println(card2);
												//AFTER DEALING CARD	
	for(int a = 0; a<cardArray2.length; a++){
		System.out.print(cardArray2[a] + " ,");
		cardArray2[a]=a+1;	
	}											//METHOD 3 TESTING 3

	int[]cardArray3=new int [200];
												//INITIALIZE ARRAY
	for(int i = 0; i<cardArray3.length; i++){
		cardArray3[i]=i+1;
	}
	System.out.println("");
												//ARRAY BEFORE DEALT CARD
	for(int b = 0; b<cardArray3.length; b++){
		System.out.print(cardArray3[b] + " ,");
		cardArray3[b]=b+1;
												//DEALING CARD
	}
	int card3 = dealCard(cardArray3);
		System.out.println("");
		System.out.println(card3);
												//AFTER DEALING CARD	
	for(int a = 0; a<cardArray3.length; a++){
		System.out.print(cardArray3[a] + " ,");
		cardArray3[a]=a+1;	
	}*/
	
												//METHOD 4 TESTING 1
													
	/*int[]cardArray=new int[40];
												//INITIALIZE ARRAY
	for(int i = 0; i<cardArray.length;i++){
		cardArray[i]=i+1;
	}
	int hand[]=dealHand(cardArray);				// CALL DEALHAND AND LOOP 5 TIMES
	for(int i = 0; i<hand.length;i++){
		System.out.println(hand[i]);
		cardArray[i]=i+1;
	}											
	System.out.println("");
	
												//METHOD 4 TESTING 2
	int[]cardArray2={2,4,5,6,7,8,4};
	
												//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	int hand2[]=dealHand(cardArray2);
	for(int i = 0; i<hand2.length;i++){			// CALL DEALHAND AND LOOP 5 TIMES
		System.out.println(hand2[i]);
		cardArray2[i]=i+1;
	}											
	System.out.println("");
												//METHOD 4 TESTING 3
	int[]cardArray3={9,9,9,0,1,1,3};
	
												//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	int hand3[]=dealHand(cardArray3);
	for(int i = 0; i<hand3.length;i++){			//CALL DEALHAND AND LOOP 5 TIMES
		System.out.println(hand3[i]);
		cardArray3[i]=i+1;
	}											
	System.out.println("");*/
	
												//METHOD 5 TEST 1
	
	/*int[]deck=new int[40];
	for(int i=0;i<deck.length;i++){				//INITIALIZE, CALL, LOOP AND PRINT ORIGINAL ARR
		deck[i]=i+1;
		System.out.println(deck[i]);
	}
	System.out.println("");
	int[]hand=dealHand(deck);					//INITIALIZE, CALL, LOOP AND PRINT DEALHAND
	for(int i=0;i<hand.length;i++){	
		System.out.println(hand[i]);		
	}
	System.out.println("");
	 redraw(hand,deck,2);
												// REDRAW CARD
	
	for(int i=0;i<hand.length;i++){					// NEW DEALHAND	
		System.out.println(hand[i]);	
	}
	System.out.println("");
												//METHOD 5 TEST 2
	
	int[]deck2={2,4,5,6,7,8,4};
	
	for(int i=0;i<deck2.length;i++){			//INITIALIZE, CALL, LOOP AND PRINT ORIGINAL ARR
		System.out.println(deck2[i]);
	}
	System.out.println("");
	int[]hand2=dealHand(deck2);					//INITIALIZE, CALL, LOOP AND PRINT DEALHAND
	for(int i=0;i<hand2.length;i++){	
		System.out.println(hand2[i]);		
	}
	System.out.println("");
	 redraw(hand2,deck2,2);
												// REDRAW CARD
	
	for(int i=0;i<hand2.length;i++){					// NEW DEALHAND	
		System.out.println(hand2[i]);	
	}
	System.out.println("");
												//METHOD 5 TEST 3
	
	int[]deck3=new int[40];
	for(int i=0;i<deck3.length;i++){				//INITIALIZE, CALL, LOOP AND PRINT ORIGINAL ARR
		deck3[i]=i+1;
		System.out.println(deck3[i]);
	}
	System.out.println("");
	int[]hand3=dealHand(deck3);					//INITIALIZE, CALL, LOOP AND PRINT DEALHAND
	for(int i=0;i<hand3.length;i++){	
		System.out.println(hand3[i]);		
	}
	System.out.println("");
	 redraw(hand3,deck3,4);
												// REDRAW CARD
	
	for(int i=0;i<hand3.length;i++){					// NEW DEALHAND	
		System.out.println(hand3[i]);	
	}
	System.out.println("");*/
	
												//METHOD 6 TEST 1
												
	/*int[]deck=new int[40];						//INITIALIZE LOOP ARR
	for(int i=0;i<deck.length;i++){
		deck[i]= i+1;
	}
	int val = 3;								// VALUE YOU WANT TO CHECK
	int answer = countOccurences(deck,val);		// CALL COUNTOCCURENCES TO GET TRACKER INT
	System.out.println("");	
	System.out.println("Value: "+ val);
	System.out.println("Reps: "+ answer);
	
	
												//METHOD 6 TEST 2
												
	int[]deck2={5,5,5,1,2,4,5};					
	
	
	int val2 = 5;								// VALUE YOU WANT TO CHECK
	int answer2 = countOccurences(deck2,val2);		// CALL COUNTOCCURENCES TO GET TRACKER INT
	System.out.println("");	
	System.out.println("Value: "+ val2);
	System.out.println("Reps: "+ answer2);
	
												//METHOD 6 TEST 3											
	int[]deck3={1,1,1,1,5};					
	
	int val3 = 2;								// VALUE YOU WANT TO CHECK
	int answer3 = countOccurences(deck3,val3);	// CALL COUNTOCCURENCES TO GET TRACKER INT
	System.out.println("");	
	System.out.println("Value: "+ val3);
	System.out.println("Reps: "+ answer3);*/
												//METHOD 7 TEST 1
												
	/*int[]hand={4,4,4,5,4};					//INITIALIZE AND LOOP ARR
	System.out.println(FourOfAKind(hand));		//CALL FOUROFAKIND  WILL RETURN TRUE 
	
	
												//METHOD 7 TEST 2
	
	int[]hand2={1,2,1,1};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(FourOfAKind(hand2));		//CALL FOUROFAKIND  WILL RETURN FALSE
	
												//METHOD 7 TEST 3
	
	int[]hand3={1,2,2,1,5,7,9,0,2,1,2};			//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(FourOfAKind(hand3));		//CALL FOUROFAKIND  WILL RETURN TRUE
	*/
												//METHOD 8 TEST 1
	
	/*int[]hand1={4,4,4,5,4};					//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(ThreeOfAKind(hand1));	//CALL THREEOFAKIND  WILL RETURN FALSE
	
												//METHOD 8 TEST 2
	
	int[]hand2={1,2,1,1};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(ThreeOfAKind(hand2));	//CALL THREEOFAKIND  WILL RETURN TRUE
	
												//METHOD 8 TEST 3
	
	int[]hand3={1,2,2,1,5,7,9,0,2,1,2,0};			//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(ThreeOfAKind(hand3));	//CALL THREEOFAKIND  WILL RETURN TRUE
	*/
	
												//METHOD 9 TEST 1
	
	/*int[]hand1={4,4,4,5,4};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isPair(hand1));			//CALL ISPAIR  WILL RETURN FALSE
	
												//METHOD 9 TEST 2
	
	int[]hand2={1,2,3,1};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isPair(hand2));			//CALL ISPAIR  WILL RETURN TRUE
	
												//METHOD 9 TEST 3
	
	int[]hand3={1,2,2,1,5,7,9,0,2,1,2,0};		//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isPair(hand3));			//CALL ISPAIR  WILL RETURN TRUE
	*/
	
												//METHOD 10 TEST 1
	/*
	int[]hand1={4,4,5,4,1};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isFullHouse(hand1));		//CALL ISFULLHOUSE  WILL RETURN FALSE
	
												//METHOD 10 TEST 2
	
	int[]hand2={1,3,3,1,3};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isFullHouse(hand2));		//CALL IS  FULLHOUSELL RETURN TRUE
	
												//METHOD 10 TEST 3
	
	int[]hand3={1,1,1,0,0};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isFullHouse(hand3));		//CALL ISFULLHOUSE WILL RETURN TRUE
	*/
												//METHOD 11 TEST 1
	/*
	int[]hand1={4,4,5};							//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isTwoPair(hand1));		//CALL ISTWOPAIR  WILL RETURN FALSE
	
												//METHOD 11 TEST 2
	
	int[]hand2={1,1,3,4,5};						//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isTwoPair(hand2));		//CALL IS  ISTWOPAIR RETURN FALSE
	
												//METHOD 11 TEST 3
	
	int[]hand3={2,2,1,5,7,0,0};					//DO NOT NEED TO INITIALIZE ARR CUZ ALL ARR CONTENT ALREADY DECLARED
	System.out.println(isTwoPair(hand3));		//CALL ISTWOPAIR WILL RETURN TRUE
	*/
	
	
						//2,1,3,4,5
						//1,2,3,4,5				//METHOD 12 TEST 1
						
	/*int[]hand1=new int[]{3,2,1,5,4};			//INITIALIZE AND LOOP ARR
	for(int i=0;i<hand1.length;i++){
		System.out.println(hand1[i]);			//PRINT ORIGINAL ARR
	}
	System.out.println("");
	isStraight(hand1);							//CALL ISSTRAIGHT  AND SORT ARR UNTIL ASCENDING ORDER ONLY PRINT THE TIME LAST CALL FOR TRUE OR FALSE ANSWER
	System.out.println(isStraight(hand1));		//RETURN TRUE
	for(int i=0;i<hand1.length;i++){			//INITIALIZE AND LOOP ARR AGAIN
		System.out.println(hand1[i]);			//PRINT SORTED ARRAY
	}
	System.out.println("");
	*/
						//3,1,9
						//1,3,9					//METHOD 12 TEST 2
						
	/*int[]hand2=new int[]{3,9,1};				//INITIALIZE AND LOOP ARR
	for(int i=0;i<hand2.length;i++){
		System.out.println(hand2[i]);			//PRINT ORIGINAL ARR
	}
	System.out.println("");
	isStraight(hand2);							//CALL ISSTRAIGHT  AND SORT ARR UNTIL ASCENDING ORDER ONLY PRINT THE TIME LAST CALL FOR TRUE OR FALSE ANSWER
	System.out.println(isStraight(hand2));		//RETURN FALSE
	for(int i=0;i<hand2.length;i++){			//INITIALIZE AND LOOP ARR AGAIN
		System.out.println(hand2[i]);			//PRINT SORTED ARRAY
	}
	System.out.println("");
	*/
						//4,5,2,6,3,7
						//4,2,5,3,6,7
						//2,4,3,5,6,7
						//2,3,4,5,6,7			//METHOD 12 TEST 3
						
	/*int[]hand3=new int[]{6,4,5,2,7,3};			//INITIALIZE AND LOOP ARR
	for(int i=0;i<hand3.length;i++){
		System.out.println(hand3[i]);			//PRINT ORIGINAL ARR
	}
	System.out.println("");
	isStraight(hand3);							//CALL ISSTRAIGHT  AND SORT ARR UNTIL ASCENDING ORDER ONLY PRINT THE TIME LAST CALL FOR TRUE OR FALSE ANSWER
	isStraight(hand3);							
	isStraight(hand3);
	System.out.println(isStraight(hand3));		//RETURN TRUE
	
	for(int i=0;i<hand3.length;i++){			//INITIALIZE AND LOOP ARR AGAIN
		System.out.println(hand3[i]);			//PRINT SORTED ARRAY
	}
	System.out.println("");
	*/
												//METHOD 13 TEST 1
	
	/*int[]hand1=new int[]{4,4,3,4,4};			//INITIALIZE ARR
	int points1 =assessHand(hand1);	
	System.out.println("");            			//CALL AND PRINT ASSESSHAND TO GET NUMBER OF POINTS FOUROFAKIND = 4500 
	System.out.println("Points: "+ assessHand(hand1));*/
	
												//METHOD 13 TEST 2
	
	/*int[]hand2=new int[]{2,3,4,5,6};			//INITIALIZE ARR
	int points2 =assessHand(hand2);	
	System.out.println("");            			//CALL AND PRINT ASSESSHAND TO GET NUMBER OF POINTS STRAIGHT = 300 
	System.out.println("Points: "+ assessHand(hand2));*/
	
												//METHOD 13 TEST 3
	
	/*int[]hand3=new int[]{1,4,6,3,1};			//INITIALIZE ARR
	int points3 =assessHand(hand3);	
	System.out.println("");            			//CALL AND PRINT ASSESSHAND TO GET NUMBER OF POINTS PAIR = 1 
	System.out.println("Points: "+ assessHand(hand3));*/
	
	runGame();
												
	}
	public static int[] buildDeck(){
	// CREATE ARR DECK OF 40 CARDS
		int[] deck=new int[40];
		//POSITION IN ARRAY
		int index = 0;
	// LOOPS THROUGHT 1 TO 10 
		for( int nums=1;nums<=10;nums++){
	// LOOPS THROUGH 1 TO 4
			for(int reps=1;reps<=4;reps++){
	//NUM IN THE POSISION GOES THROUGHT 4 TIMES BEFORE CHANGING
				deck[index++]=nums;
			}
		}
		return deck;
	}
	
	public static void shuffleDeck(int[] cardArray){
		//RANDOM GENERATOR 
		Random randShuffle = new Random();
		//LOOP THROUGHT EACH ELEM OF ARR
		for(int i = 0; i<cardArray.length;i++){
			// NEW RAND INDEX WITH RAND GENERATOR
			int randIndex = randShuffle.nextInt(cardArray.length); 
			// NEW INT TO DO SWAP
			int swapper = cardArray[i];
			cardArray[i]= cardArray[randIndex];
			cardArray[randIndex]=swapper;

		}
	}
	
	public static int dealCard(int[]cardArray){
		int val = 0;
		// LOOP THROUGH ARR	
		for(int i=0;i<cardArray.length;i++){
			// IF ARR NOT 0  PUT VALUE OF CARD IN NEW INT AND REPLACE VALUE WITH 0
			if (cardArray[i]!=0){
				val = cardArray[i];
				cardArray[i]=0;
				i = cardArray.length;
			
			}
		}
		
		return val;
	}
	
	public static int[] dealHand(int[]cardArray){
		//ARR OF 5 CARDS OF DEAL CARD METHOD
		int[]hand=new int[5];
		// LOOP THROUGH ARR
		for(int i=0;i<hand.length;i++){
			//PUT EVERY CARD FROM DEAL CARD METHOD IN NEW ARR(CARD THAT IS NOT 0)
			hand[i]=dealCard(cardArray);
		}
		return hand;
	}
		
	public static void redraw(int[] hand, int[] deck, int position){
		//NEW INT FOR REDRAW CARD
		int newCard = dealCard(deck);
		//PUT REDRAW CARD IN SPECIFIC POS OF HAND
		hand[position] = newCard;
		
	}
	
	public static int countOccurences(int[]cardArray, int val){
	//COUNTER TO FIND HOW MANY OCCURENCES(WILL BE RETURNED)
	int tracker =0;
	// LOOP THROUGH ARR
	for(int i=0;  i<cardArray.length; i++){
		// ASSIGN VAL
		if(cardArray[i]==val){
			tracker++;
		}
	}
	return tracker;
	}
	
	public static boolean isFourOfAKind(int[]cardArray){
		//INITIALIZE ARR
		for(int i=0; i<10;i++){
			// CALL COUNTOCCURENCES IF SAME VALUE OCCUR MULTIPLE TIMES
			if( countOccurences(cardArray,i)== 4){
					return true;
				}
			}
		return false;
	}
	
	public static boolean isThreeOfAKind(int[]cardArray){
		//INITIALIZE ARR
		for(int i=0; i<10;i++){
			// CALL COUNTOCCURENCES IF SAME VALUE OCCUR MULTIPLE TIMES
			if( countOccurences(cardArray,i)== 3){
					return true;
				}
			}
		return false;
	}
	
	public static boolean isPair(int[]cardArray){
		//INITIALIZE ARR
		for(int i=1; i<10;i++){
			// CALL COUNTOCCURENCES IF SAME VALUE OCCUR MULTIPLE TIMES
			if( countOccurences(cardArray,i)== 2){
					return true;
				}
			}
		return false;
	}
	
	public static boolean isFullHouse (int[]cardArray){
		//INITIALIZE ARR
		for(int i=0; i<10;i++){
			for(int j=0; j<10;j++){
				// CALL COUNTOCCURENCES IF SAME VALUE OCCUR MULTIPLE TIMES
				if( countOccurences(cardArray,i)== 2){
					if(countOccurences(cardArray,j)== 3){
						if(i!=j){
						return true;
						}
					}
				}
			}
		}	
		return false;
	}
	
	public static boolean isTwoPair (int[]cardArray){
		//INITIALIZE ARR
		for(int i=0; i<10;i++){
			for(int j=0; j<10;j++){
				// CALL COUNTOCCURENCES IF SAME VALUE OCCUR MULTIPLE TIMES
				if( countOccurences(cardArray,i)== 2){
					if(countOccurences(cardArray,j)== 2){
						if(i!=j){
						return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isStraight(int[]cardArray){
		//INITIALIZE ARR
		for(int i=0;i<cardArray.length-1;i++){
			// IF NUM AT MOST LEFT IS BIGGER THAT THE ONE THAT NEXT THEN SWAP THEIR SPOTS
			if(cardArray[i]>cardArray[i+1]){
				//CREATE A TEMP AS AN EMPTY GLASS
				int temp=cardArray[i];
				cardArray[i]=cardArray[i+1];
				cardArray[i+1]=temp;
			}
		}
			
			//ANOTHER INITIALIZE ARR
				for(int i=0;i<cardArray.length-1;i++){
			//IF NUMS ARE NOT CONSECUTIVE AFTER SORT RETURN FALSE
			if(cardArray[i+1]-cardArray[i]!=1){
				return false;
			}
		}
		return true;
	}
	
	public static int assessHand(int[]cardArray){
		//INITIALIZE LOOP AND PRINT ARR
		for(int i=0;i<cardArray.length;i++){
			System.out.print(cardArray[i]+", ");
		}
		System.out.println("");
		//IF FOUROFAKIND 4500 POINTS
			if(isFourOfAKind(cardArray)){
				return 4500;
				
		//IF FULLHOUSE 700 POINTS		
			}else if(isFullHouse(cardArray)){
				return 700;
		//IF STRAIGHT 300 POINTS
			}else if(isStraight(cardArray)){
				return 300;
		//IF THREEOFAKIND 50 POINTS
			}else if(isThreeOfAKind(cardArray)){
				return 50;		
		//IF TWOPAIR 20 POINTS
			}else if(isTwoPair(cardArray)){
				return 20;		
		//IF PAIR 1 POINTS
			}if(isPair(cardArray)){
				return 1;
			}
		// 0 POINTS IF NOTHING ELSE
			return 0;
	}
	
	public static int runRound(){
		java.util.Scanner reader = new java.util.Scanner(System.in);
		//INITIALIZE LOOP AND SHUFFLE ARR
		int[]deck= buildDeck();
		shuffleDeck(deck);
		//INITIALIZE HAND ARR FROM DECK ARR AND DEAL
		int[]hand= dealHand(deck);
		System.out.println("Your hand is: ");
		for(int i=0;i<hand.length;i++){
			System.out.print(hand[i] + ", ");
		}
		//CALL REDRAW IF PLAYER WANTS TO REDRAW
		//boolean Redrawing = true;
		int redraws = 1;
		
		while(redraws < 4){
			
			System.out.println("You have drawn " + redraws + " times");
			
			System.out.println("Type the position in your hand in which you would like to discard or type -1 if you would like to skip");
			
			int discardCard = reader.nextInt();
			
			if(discardCard == -1) {
				//Redrawing = false; 
				redraws++;
			}else if(discardCard >= 1 && discardCard <= 5){
				redraw(hand,deck,discardCard-1);
				
				System.out.println("Your new hand is: ");
				
				for(int i = 0; i < hand.length; i++){
					System.out.print(hand[i] + ", ");
				}
				
				System.out.println("");
				redraws++;
			}else{
				System.out.println("Please pick an existing position in your hand");
			}
	}
	int points = assessHand(hand);
	System.out.println("Your total points is: " + points);
	return points;
	}
	public static void runGame(){
		int totalPoints = 0;
		for (int i = 0; i < 10; i++) {
        System.out.println("Round " + (i + 1));
        totalPoints += runRound();
        System.out.println();
    }

    System.out.println("Total point from all 10 rounds: " + totalPoints);
}
	}
	
	