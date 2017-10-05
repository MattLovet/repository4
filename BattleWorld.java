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
	System.out.println("You enter the first floor of a magnificent arena, filled with cheering fans.");
	System.out.println("A warrior brandishing a sword approaches from the opposite side of the arena.");
	
	while(health>0&&
	ehealth>0){
		int rng= (int)(Math.random()*100+1);
		int Pdmg= (int)(Math.random()*4+2);
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
		}else {
			System.out.println("You're attack missed!");
		}
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg)+"\n");
		break;
		case "kick":
			if(rng<=95) {
			System.out.println("You kicked the warrior and his health dropped from "+ehealth+" to "+(ehealth=ehealth-Kdmg));
			Kcounter=Kcounter+1;
			}else {
				System.out.println("You're attack missed!");
			}
			System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg)+"\n");
			break;
		case "heal":
			if(Hcounter==2) {
				System.out.println("Out of bandages");
			}else {
			System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+4));
			System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg)+"\n");
			Hcounter=Hcounter+1;
			}
			break;
		case "run":
			System.out.println("Theres no running from a fight in battle world!");
			health=health-10;
	}
		if(health<=0
		&&ehealth>0){
			System.out.println("You have been defeated");
			
		}
		if(ehealth<=0
		&& health>0){
			System.out.println("Congratulations, you have defeated your opponent!\n");
		}
		if(ehealth<=0
		&& health<=0) {
			System.out.println("You and the warrior both collapse in exaustion! It's a draw!");
		}
	}	
	Hcounter=0;
	int Scounter=0;
	if(health>0) {
System.out.println("As a reward for your success in round one, you are rewared with a rusty sword, and some makeshift armor.");
System.out.println("Attack learned: slash, dmg: 3-6");
System.out.println("health restored and increased from 15 to 25\n");
health=25;
System.out.println("Press enter to continue.");
String r=kbreader.nextLine();
System.out.println("The floor of the arena begins to rise up like an elevator.");
System.out.println("The stadium filled with fans disapears beneath you, just to give way to another above.");
System.out.println("A door opens on the opposite end of the arena, and a women enters.\n");
System.out.println("Press enter to continue.");
String t=kbreader.nextLine();
System.out.println("I am Grace! The Greatest Archer from my home planet! Prepare to die\n");
System.out.println("Grace, without hesitation, begins her attack.");
int Ghealth= 20;
while(health>0
		&& Ghealth>0) {
	int Eatk= (int)(Math.random()*100+1);
	int rng= (int)(Math.random()*100+1);
	int Pdmg= (int)(Math.random()*4+2);
	int Kdmg= (int)(Math.random()*3+1);
	int EAdmg= (int)(Math.random()*3+1);
	int EDAdmg= (int)(Math.random()*3+2);
	int Sdmg= (int)(Math.random()*4+3);
	System.out.println("What wil you do?\n");
	System.out.println("Punch, dmg: 2-5, recoil: 2");
	System.out.println("kick, dmg: 1-3");
	System.out.println("Heal, hp: +2");
	System.out.println("Slash, dmg: 3-6");
	String y= kbreader.nextLine();
	y=y.toLowerCase();
	switch(y) {
	case "punch":
		if(rng<=95) {
	System.out.println("You threw a punch at your opponent and her health dropped from "+Ghealth+" to "+(Ghealth=Ghealth-Pdmg));
	System.out.println("You break a finger in the punch, and your health drops from "+health+" to "+(health=health-2));
	Pcounter=Pcounter+1;
	}else {
	System.out.println("You're attack missed!");
		}
	if(Eatk<=60) {
		System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
	}else if(Eatk>60 && Eatk<=95) {
		System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
	}else if(Eatk>95) {
		System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
	}
	break;
	case "kick":
		if(rng<=95) {
		System.out.println("You execute a spinning back kick and Graces' health drops from "+Ghealth+" to "+(Ghealth=Ghealth-Kdmg));
		Kcounter=Kcounter+1;
		}else {
			System.out.println("You're attack missed!");
		}
		if(Eatk<=60) {
			System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
		}else if(Eatk>60 && Eatk<=95) {
			System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
		}else if(Eatk>95) {
			System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
		}
		break;
	case "heal":
		if(Hcounter==2) {
			System.out.println("Out of bandages");
		}else {
		System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+4));
		Hcounter=Hcounter+1;
		}
	if(Eatk<=60) {
		System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
	}else if(Eatk>60 && Eatk<=95) {
		System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
	}else if(Eatk>95) {
		System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
	}
	break;
	case "slash":
		if(Scounter>=2) {
			System.out.println("You're sword is broken and cannot be used!");
		}else {
		if(rng<=95) {
			System.out.println("You slash Grace using your sword, and her health is knocked from "+Ghealth+" to "+(Ghealth=Ghealth-Sdmg));
			System.out.println("The sword shatters to pieces upon contact.");
			Scounter=Scounter+1;
		}
		}
		if(Eatk<=60) {
			System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
		}else if(Eatk>60 && Eatk<=95) {
			System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
		}else if(Eatk>95) {
			System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
		}
}
}
}
	if(health<=0
			&&ehealth>0){
				System.out.println("You have been defeated");
				System.out.println("Stats: Punch used " +Pcounter+" times, kick used "+Kcounter+" times, heal used "+Hcounter+" times, slash used "+Scounter+" times");
			}
			if(ehealth<=0
			&& health>0){
				System.out.println("Congratulations, you have defeated your opponent!\n");
				System.out.println("Stats: Punch used " +Pcounter+" times, kick used "+Kcounter+" times, heal used "+Hcounter+" times, slash used "+Scounter+" times");
			}
			if(ehealth<=0
			&& health<=0) {
				System.out.println("You and the warrior both collapse in exaustion! It's a draw!");
				System.out.println("Stats: Punch used " +Pcounter+" times, kick used "+Kcounter+" times, heal used "+Hcounter+" times, slash used "+Scounter+" times");
			}
//next fight	
}
}



