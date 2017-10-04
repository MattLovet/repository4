import java.util.Scanner;

public class BattleWorld {
public static void main(String args[]) {
	Scanner kbreader= new Scanner(System.in);
	
	System.out.println("Welcome to battle world, home to the universes greatest fighting tournament!\n");
	System.out.println("What is your name?\n");
	String q= kbreader.nextLine();
	System.out.println("Well "+q+", are you ready to fight?");
	String w= kbreader.nextLine();
	int health=15;
	int ehealth=10;
	int Pcounter= 0;
	int Kcounter= 0;
	int Hcounter= 0;
	
	switch(w){
		case "yes":
		case "yeah":
		case "yup":
		case "sure":
		case "definately":
			System.out.println("prepare for battle number one!");
			break;
		case "no":
		case "nah":
		case "nope":
		case "what":
			System.out.println("Well its too late to turn back now. Prepare for battle number one!");
			break;
				default:
					System.out.println("What? Prepare for battle number one!\n");
	}
	System.out.println("You enter the first floor of a magnificent arena, filled with roaring fans.");
	System.out.println("A warrior holding brandishing a sword approaches from the opposite side of the arena.");
	
	while(health>0&&
	ehealth>0){
		int rng= (int)(Math.random()*100+1);
		int Pdmg= (int)(Math.random()*5+2);
		int Kdmg= (int)(Math.random()*3+1);
		int Edmg= (int)(Math.random()*3+1);
		System.out.println("What wil you do?\n");
		System.out.println("Punch, dmg: 2-5, recoil: 2");
		System.out.println("kick, dmg: 1-3");
		System.out.println("Heal, hp: +2");
		System.out.println("Run");
		String e= kbreader.nextLine();
		e=e.toLowerCase();
		switch (e) {
		case "punch":
		if(rng<=95) {
		System.out.println("You threw a punch at your opponent and his health dropped from "+ehealth+" to "+(ehealth=ehealth-Pdmg));
		System.out.println("You break a finger in the punch, and your health drops from "+health+" to "+(health=health-2));
		Pcounter=Pcounter+1;
		}
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg));
		break;
		case "kick":
			if(rng<=95) {
			System.out.println("You kicked the warrior and his health dropped from "+ehealth+" to "+(ehealth=ehealth-Kdmg));
			Kcounter=Kcounter+1;
			}
			System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg));
			break;
		case "heal":
			System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+2));
			System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg));
			Hcounter=Hcounter+1;
			break;
		case "run":
			System.out.println("Theres no running from a fight in battle world!");
			health=health-10;
		}
	}
		if(health<=0
		&&ehealth>0){
			System.out.println("You have been defeated");
			
		}
		if(ehealth<=0
		&& health>0){
			System.out.println("Congratulations, you have defeated your opponent!");
		}
		if(ehealth<=0
		&& health<=0) {
			System.out.println("You and the warrior both collapse in exaustion! It's a draw!");
		}
	}	
}

