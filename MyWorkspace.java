import java.io.*;
import java.util.Random;
import java.util.*;
public class MyWorkspace {
	public static void main(String args[]) {
Scanner kbreader= new Scanner(System.in);
Random rng= new Random();

int K= (int)(Math.random()*3+1);
int P= (int)(Math.random()*4+2);
int E= (int)(Math.random()*3+1);


int health= 10;
int ehealth= 10;

System.out.println("What is your name?");
String name= kbreader.nextLine();
System.out.println("are you ready to fight "+name+"?");
String q=kbreader.nextLine();

switch (q){
	case "yes":
	case "yeah":
	case "sure":
	case "yup":
	case "definately":
	System.out.println("BEGIN!");
break;
case "no":
case "not really":
case "maybe":
case "nah":
	System.out.println("Too bad, there is no going back now!");
	break;
	default:
		System.out.println("What? shut up and fight!");
		
}

System.out.println("A man appears with sword in had ready for battle. What will you do?\n");

System.out.println("    Punch: 2-5 dmg, -1 health");
System.out.println("    kick: 1-3 dmg");
System.out.println("    Heal +2 health");
System.out.println("    Run away");

String w= kbreader.nextLine();
w=w.toLowerCase();

switch (w) {
case "punch":
	System.out.println("You punched the warrior, and his health dropped from "+""+ehealth+" to "+(ehealth= (ehealth-P)));
	System.out.println("You fist hurts from the punch, your health drops from "+health+" to "+(health=(health-1)));
	System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E))+"\n");
	break;
case "kick":
	System.out.println("You kicked the warrior, and his health dropped from "+ehealth+" to "+(ehealth=(ehealth-K)));
	System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
	break;
case "heal":
	System.out.println("You bandaged your wounds, and your health went from"+health+" to "+(health=(health+3)));
	System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
	break;
case "run":
	System.out.println("Never run away from a battle! The warrior hurls his sword at you, and slices your head open! Your health drops from "+health+" to "+(health=(health-10)));
	break;
	default:
		System.out.println("what?");
}

if(health<=0) {
	System.out.println("You have died!");
}else if(ehealth<=0) {
	System.out.println("You have defeated your opponent!\n You Win!");
}else {
	System.out.println("what will you do next?\n");
	
	System.out.println("    Punch: 2-5 dmg, -1 health");
	System.out.println("    kick: 1-3 dmg");
	System.out.println("    Heal +2 health");
	System.out.println("    Run away");
	
	String r= kbreader.nextLine();
	r=r.toLowerCase();

	switch (r) {
	case "punch":
		System.out.println("You punched the warrior, and his health dropped from "+""+ehealth+" to "+(ehealth= (ehealth-P)));
		System.out.println("You fist hurts from the punch, your health drops from "+health+" to "+(health=(health-1)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "kick":
		System.out.println("You kicked the warrior, and his health dropped from "+ehealth+" to "+(ehealth=(ehealth-K)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "heal":
		System.out.println("You bandaged your wounds, and your health went from"+health+" to "+(health=(health+3)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "run":
		System.out.println("Never run away from a battle! The warrior hurls his sword at you, and slices your head open! Your health drops from "+health+" to "+(health=(health-10)));
	}
}

if(health<=0) {
	System.out.println("");
}else if(ehealth<=0) {
	System.out.println("You have defeated your opponent!\n You Win!");
}else {
	System.out.println("what will you do next?\n");
	
	System.out.println("    Punch: 2-5 dmg, -1 health");
	System.out.println("    kick: 1-3 dmg");
	System.out.println("    Heal +2 health");
	System.out.println("    Run away");
	
	String r= kbreader.nextLine();
	r=r.toLowerCase();

	switch (r) {
	case "punch":
		System.out.println("You punched the warrior, and his health dropped from "+""+ehealth+" to "+(ehealth= (ehealth-P)));
		System.out.println("You fist hurts from the punch, your health drops from "+health+" to "+(health=(health-1)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "kick":
		System.out.println("You kicked the warrior, and his health dropped from "+ehealth+" to "+(ehealth=(ehealth-K)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "heal":
		System.out.println("You bandaged your wounds, and your health went from"+health+" to "+(health=(health+3)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "run":
		System.out.println("Never run away from a battle! The warrior hurls his sword at you, and slices your head open! Your health drops from "+health+" to "+(health=(health-10)));
	}
}

if(health<=0) {
	System.out.println("");
}else if(ehealth<=0) {
	System.out.println("You have defeated your opponent!\n You Win!");
}else {
	System.out.println("what will you do next?\n");
	
	System.out.println("    Punch: 2-5 dmg, -1 health");
	System.out.println("    kick: 1-3 dmg");
	System.out.println("    Heal +2 health");
	System.out.println("    Run away");
	
	String r= kbreader.nextLine();
	r=r.toLowerCase();

	switch (r) {
	case "punch":
		System.out.println("You punched the warrior, and his health dropped from "+""+ehealth+" to "+(ehealth= (ehealth-P)));
		System.out.println("You fist hurts from the punch, your health drops from "+health+" to "+(health=(health-1)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "kick":
		System.out.println("You kicked the warrior, and his health dropped from "+ehealth+" to "+(ehealth=(ehealth-K)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "heal":
		System.out.println("You bandaged your wounds, and your health went from"+health+" to "+(health=(health+3)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "run":
		System.out.println("Never run away from a battle! The warrior hurls his sword at you, and slices your head open! Your health drops from "+health+" to "+(health=(health-10)));
	}
}

if(health<=0) {
	System.out.println("");
}else if(ehealth<=0) {
	System.out.println("");
}else {
	System.out.println("what will you do next?\n");
	
	System.out.println("    Punch: 2-5 dmg, -1 health");
	System.out.println("    kick: 1-3 dmg");
	System.out.println("    Heal +2 health");
	System.out.println("    Run away");
	
	String r= kbreader.nextLine();
	r=r.toLowerCase();

	switch (r) {
	case "punch":
		System.out.println("You punched the warrior, and his health dropped from "+""+ehealth+" to "+(ehealth= (ehealth-P)));
		System.out.println("You fist hurts from the punch, your health drops from "+health+" to "+(health=(health-2)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "kick":
		System.out.println("You kicked the warrior, and his health dropped from "+ehealth+" to "+(ehealth=(ehealth-K)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "heal":
		System.out.println("You bandaged your wounds, and your health went from"+health+" to "+(health=(health+2)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "run":
		System.out.println("Never run away from a battle! The warrior hurls his sword at you, and slices your head open! Your health drops from "+health+" to "+(health=(health-10)));
	}
}

if(health<=0) {
	System.out.println("");
}else if(ehealth<=0) {
	System.out.println("");
}else {
	System.out.println("what will you do next?\n");
	
	System.out.println("    Punch: 2-5 dmg, -1 health");
	System.out.println("    kick: 1-3 dmg");
	System.out.println("    Heal +2 health");
	System.out.println("    Run away");
	
	String r= kbreader.nextLine();
	r=r.toLowerCase();

	switch (r) {
	case "punch":
		System.out.println("You punched the warrior, and his health dropped from "+""+ehealth+" to "+(ehealth= (ehealth-P)));
		System.out.println("You fist hurts from the punch, your health drops from "+health+" to "+(health=(health-2)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "kick":
		System.out.println("You kicked the warrior, and his health dropped from "+ehealth+" to "+(ehealth=(ehealth-K)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "heal":
		System.out.println("You bandaged your wounds, and your health went from"+health+" to "+(health=(health+2)));
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=(health-E)));
		break;
	case "run":
		System.out.println("Never run away from a battle! The warrior hurls his sword at you, and slices your head open! Your health drops from "+health+" to "+(health=(health-10)));
	}
}




	


		


}
}
