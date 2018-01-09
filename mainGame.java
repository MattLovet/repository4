
import java.util.*;
public class mainGame {
public static void main(String args[]) {
	//enter the gas station what will you do
	// acceptable interactions look around, yell....., say...., hit....., run....., go...., push....., grab ....
	int GameCounter= 0;
	int snacks=0;
	int player= 1;
	int PunchCounter=0;
	int storyChange=0;
	Scanner kbreader= new Scanner(System.in);
	
	
	System.out.println("In this game you will play as John Woods, a man making his way home from a ski trip in vermont.\nOn the way back you stop at a gas station where strange things begin to happen.\nTo beat the game you must use commands to interact with your surroundings, and make your way home.\n\nPress enter to begin.");
	kbreader.nextLine();
	System.out.println("acceptable commands include but are not limited to: get...., say..., run....., go...., search....., look around, punch.... etc.\nYou are encouraged to try whatever commands you feel may be right in the moment, but not every command will work.\nWhen typing commands do not include commas, apostrophes, or periods.\n\nPress enter to begin.");
	kbreader.nextLine();
	System.out.println("After being on the highway for four hours you stop off at a roadside gas station to get something to eat.\nThe gas station seems to be in the middle of no where surrounded by dense woods.\nYou go inside, and find the store that appears to be empty of any people.");
	
	while(player==1) {
	//TURN NUMBER 1
	while(GameCounter==0) {
		String g=kbreader.nextLine();
		g.toLowerCase();
		switch(g) {
		case "go outside":
		case "go to car":
		case "go back":
			if (snacks==1) {
			Playerinteractions.stealing();
			}else {
			Playerinteractions.leaving1();
			}
			break;
		case "look around":
		Playerinteractions.lookingAround1();
			break;
		case "yell":
		case "speak":
		case "say":
		case "say hello":
		case "yell hello":
		case "yell is anybody there":
		case "say is anybody there":
		case "Yell, is anybody there":
		case "say, is anybody there":
		Playerinteractions.speaking1();
			break;
		case "get chips":
		case "get chocolate":
		case "get chocolate bars":
		case "get chocolate bar":
		case "get jerky":
		case "get beef jerky":
		case "get food":
		case "get snacks":
		case "get snack":
			Playerinteractions.gettingFood();
			snacks=1;
			break;
		case "go to register":
			Playerinteractions.register();
			GameCounter+=1;
			break;
		case "steal food":
		case "steal snacks":
		case "steal":
		case "steal stuff":
			Playerinteractions.stealing1();
		default:
			System.out.println("invalid phrase.");
		}
		}
	if(PunchCounter==0) {
	System.out.println("\nAfter closer examination you see that the man looks very ill.\nHis eyes are swolen and blood shot, his skin as pale as a ghost, and he seems to have trouble walking\nThe man hobbles his way towards you, saying nothing, only groaning");
	}
	
	//TURN NUMBER 2
	if (GameCounter==1) {
	while (GameCounter==1) {
		String h=kbreader.nextLine();
		h.toLowerCase();
		
		switch(h) {
		case "run outside":
		case "run away":
		case "run":
		Playerinteractions.runAway();
		GameCounter=2;
			break;
		case "say are you okay":
		case "say hello":
		case "say are you alright":
		case "say how are you":
		case "say whats wrong with you":
		case "say you dont look so good":
		case "say do you need some help":
		case "say hi":
		case "say whats up":
		case "say id like to check out":
		case "say id like to buy this":
		case "say id like to buy these":
			Playerinteractions.speaking2();
			break;
		case "back away":
		case "move away":
		case "walk away":
		Playerinteractions.backingUp();
			break;
		case "hit him":
		case "punch him":
		case "attack him":
		case "hit the man":
		case "punch the man":
		case "attack the man":
		case "hit":
		case "punch":
		case "attack":
			if (PunchCounter==1) {
				Playerinteractions2.ReallyAgain();
				GameCounter=99;
				PunchCounter=2;
			}else {
			Playerinteractions.hittingHim();
			GameCounter=3;
			}
			break;
		case "push":
		case "shove":
		case "push him":
		case "Shove him":
		case "push the man":
		case "shove the man":
		Playerinteractions.pushingHim();	
			break;
		case "go outside":
		case "go to car":
		case "leave gas station":
		case "leave station":
		case "leave store":
		case "leave shop":
			Playerinteractions.leaving2();
			GameCounter=2;
			break;
		case "run into back room":
		case "run to back room":
		case "run to room":
		case "run into room":
		case "run inside room":
		case "run inside back room":
		case "go to room":
		case "go into room":
		case "go inside room":
		case "go inside back room":
		case "go to back room":
		case "go into back room":
			Playerinteractions.backRoom();
			GameCounter=3;
			break;
			default:
			System.out.println("Invllid phrase");
		}
	}
	}
	
	//FIGHTING IN THE GAS STATION
	if(GameCounter==3) {
		while (GameCounter==3){
		String x=kbreader.nextLine();
		x.toLowerCase();
		switch(x) {
		case "free arm":
		case "pull arm free":
		case "pull arm":
		case "free myself":
		case "pull away":
		case "pull arm away":
		case "rip arm free":
		case "rip arm away":
			Playerinteractions2.freeArm();
			GameCounter=1;
			storyChange=1;
			break;
		case "punch him":
		case "punch again":
		case "punch":
		case "punch the man":
		case "punch with free arm":
		case "punch myself free":
			if(PunchCounter==0) {
			Playerinteractions2.PunchingHim();
			PunchCounter=1;
			}else {
				Playerinteractions2.HitEmAgain();
				GameCounter=1;
			}
			break;
		case "push him":
		case "shove him":
		case "push him off":
		case "shove him off":
		case "push him away":
		case "shove him away":
		case "push the man":
		case "shove the man":
		case "push the man off":
		case "shove the man off":
		case "push the man away":
		case "shove the man away":
		case "push":
		case "shove":
			Playerinteractions2.PushingHim();
			GameCounter=1;
			storyChange=1;
			break;
		case "run away":
		case "run":
		case "run outside":
		Playerinteractions2.running();
		break;
		case "head butt":
		case "head butt him":
		case "head butt the man":
		case "hit him with my head":
		case "hit with head":
			Playerinteractions2.headButt();
			break;
			default:
				System.out.println("invalid command");
		}
		}
}
	
	//GOING OUTSIDE
	if(GameCounter==2) {
	System.out.println("Yeet yeet and a bag of chips");
	GameCounter=99;
	}
	}
	
	//DYING
	if(GameCounter==99) {
		System.out.println("GAME OVER!");
	}
}
}