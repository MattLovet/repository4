
import java.util.*;
public class mainGame {
public static void main(String args[]) {
	//enter the gas station what will you do
	// acceptable interactions look around, yell....., say...., hit....., run....., go...., push....., grab ....
	int GameCounter= 0;
	Scanner kbreader= new Scanner(System.in);
	player Player= new player(20);
	
	System.out.println("In this game you will play as John Woods, a man making his way home from a ski trip in vermont.\nOn the way back you stop at a gas station where strange things begin to happen.\nTo beat the game you must use commands to interact with your surroundings, and make your way home.\n\nPress enter to begin.");
	kbreader.nextLine();
	System.out.println("After being on the highway for four hours you stop off at a roadside gas station to get something to eat.\n The gas station seems to be in the middle of no where surrounded by dense woods.\n You go inside, and find the store empty of any people.");
	//TURN NUMBER 1
	while(GameCounter==0) {
		String g=kbreader.nextLine();
		g.toLowerCase();
		switch(g) {
		case "go outside":
		case "go to car":
		case "go back":
			Playerinteractions.leaving1();
			break;
		case "look around":
		Playerinteractions.lookingAround1();
			break;
		case "yell":
		case "speak":
		case "say":
		case "say hello":
		case "yell hello":
		Playerinteractions.speaking1();
			break;
		case "get chips":
		case "get chocolate":
		case "get chocolate bars":
		case "get chocolate bar":
		case "get jerky":
		case "get food":
		case "get snacks":
		case "get snack":
			Playerinteractions.gettingFood();
			break;
		case "go to register":
			Playerinteractions.register();
			GameCounter+=1;
			break;
		default:
			System.out.println("invalid phrase.");
		}
		}
	
	//TURN NUMBER 2
	while (GameCounter==0) {
		String h=kbreader.nextLine();
		h.toLowerCase();
		switch(h) {
		
		}
	}
}
}