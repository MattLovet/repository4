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
	System.out.println("You must fight to survive!");
	System.out.println("Press enter to continue.");
	String continue1=kbreader.nextLine();
	
	while(health>0&&
	ehealth>0){
		int rng= (int)(Math.random()*100+1);
		int Pdmg= (int)(Math.random()*4+2);
		int Kdmg=2;
		int Edmg= (int)(Math.random()*3+1);
		System.out.println("What wil you do?\n");
		System.out.println("Punch, dmg: 2-5, "+(2-Pcounter)+" uses");
		System.out.println("kick, dmg: 2");
		System.out.println("Heal, hp: +2, uses "+(2-Hcounter));
		System.out.println("Run");
		String e= kbreader.nextLine();
		e=e.toLowerCase();
		switch (e) {
		case "punch":
		if(rng<=85) {
			if (Pcounter<=1) {
		System.out.println("You threw a punch at your opponent and his health dropped from "+ehealth+" to "+(ehealth=ehealth-Pdmg));
			}else {
				System.out.println("Out of uses!");
			}
		Pcounter=Pcounter+1;
		}else {
			System.out.println("You're attack missed!");
		}
		System.out.println("Press enter to continue.");
		String continue2=kbreader.nextLine();
		if(ehealth>0) {
		System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg)+"\n");
		System.out.println("Press enter to continue.");
		String continue4=kbreader.nextLine();
		}
		break;
		case "kick":
			if(rng<=95) {
			System.out.println("You kicked the warrior and his health dropped from "+ehealth+" to "+(ehealth=ehealth-Kdmg));
			Kcounter=Kcounter+1;
			}else {
				System.out.println("You're attack missed!");
			}
			System.out.println("Press enter to continue.");
			String continue5=kbreader.nextLine();
			if (ehealth>0) {
			System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg)+"\n");
			System.out.println("Press enter to continue.");
			String continue6=kbreader.nextLine();
			}
			break;
		case "heal":
			if(Hcounter==2) {
				System.out.println("Out of bandages");
			}else {
			System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+4));
			System.out.println("Press enter to continue.");
			String continue8=kbreader.nextLine();
			System.out.println("The warrior strikes back, and knocks your health from "+health+" to "+(health=health-Edmg)+"\n");
			Hcounter=Hcounter+1;
			System.out.println("Press enter to continue.");
			String continue7=kbreader.nextLine();
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
	
	
	
	
	//fight 2
	
	
	
	
	Hcounter=0;
	int Scounter=0;
	if(health>0) {
System.out.println("As a reward for your success in round one, you are rewarded with a rusty sword, and some makeshift armor.");
System.out.println("Attack learned: slash, dmg: 3-6");
System.out.println("punch uses increased from 2 to 3");
System.out.println("health restored and increased from 15 to 25\n");
health=25;
System.out.println("Press enter to continue.");
String r=kbreader.nextLine();
System.out.println("The floor of the arena begins to rise up like an elevator.");
System.out.println("The stadium filled with fans disapears beneath you, just to give way to another above.");
System.out.println("A door opens on the opposite end of the arena, and a women enters.\n");
System.out.println("Press enter to continue.");
String t=kbreader.nextLine();
System.out.println("I am Alicaryn of planet Othea! Surrender or prepare to die!\n");
System.out.println("Alicaryn, without hesitation, begins her attack.");
int Ghealth= 20;
Pcounter=0;
while(health>0
		&& Ghealth>0) {
	int Eatk= (int)(Math.random()*100+1);
	int rng= (int)(Math.random()*100+1);
	int Pdmg= (int)(Math.random()*4+2);
	int Kdmg= 2;
	int EAdmg= 2;
	int EDAdmg= (int)(Math.random()*4+2);
	int Sdmg= (int)(Math.random()*4+3);
	System.out.println("What wil you do?\n");
	System.out.println("Punch, dmg: 2-5, "+(3-Pcounter)+" uses");
	System.out.println("kick, dmg: 2");
	System.out.println("Heal, hp: +2, uses "+(2-Hcounter));
	System.out.println("Slash, dmg: 3-6");
	String y= kbreader.nextLine();
	y=y.toLowerCase();
	switch(y) {
	case "punch":
		if(rng<=95) {
			if (Pcounter<=2) {
	System.out.println("You threw a punch at your opponent and her health dropped from "+Ghealth+" to "+(Ghealth=Ghealth-Pdmg));
	Pcounter=Pcounter+1;
			}else {
		System.out.println("Out of uses!");
	}
	}else {
	System.out.println("You're attack missed!");
		}
		System.out.println("Press enter to continue.");
		String continue9=kbreader.nextLine();
		if (Ghealth>0) {
	if(Eatk<=60) {
		System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
	}else if(Eatk>60 && Eatk<=95) {
		System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
	}else if(Eatk>95) {
		System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
	}
		}
	System.out.println("Press enter to continue.");
	String continue10=kbreader.nextLine();
	break;
	case "kick":
		if(rng<=95) {
		System.out.println("You execute a spinning back kick and Graces' health drops from "+Ghealth+" to "+(Ghealth=Ghealth-Kdmg));
		Kcounter=Kcounter+1;
		}else {
			System.out.println("You're attack missed!");
		}
		System.out.println("Press enter to continue.");
		String continue11=kbreader.nextLine();
		if(Ghealth>0) {
		if(Eatk<=60) {
			System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
		}else if(Eatk>60 && Eatk<=95) {
			System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
		}else if(Eatk>95) {
			System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
		}
		}
		System.out.println("Press enter to continue.");
		String continue12=kbreader.nextLine();
		break;
	case "heal":
		if(Hcounter==2) {
			System.out.println("Out of bandages");
		}else {
		System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+4));
		Hcounter=Hcounter+1;
		System.out.println("Press enter to continue.");
		String continue13=kbreader.nextLine();
		}
	if(Eatk<=60) {
		System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
	}else if(Eatk>60 && Eatk<=95) {
		System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
	}else if(Eatk>95) {
		System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
	}
	System.out.println("Press enter to continue.");
	String continue14=kbreader.nextLine();
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
		System.out.println("Press enter to continue.");
		String continue15=kbreader.nextLine();
		if(Ghealth>0) {
		if(Eatk<=60) {
			System.out.println("Grace fires off a single arrow. Upon impact, your health drops from " +health+" to "+(health=health-EAdmg));
		}else if(Eatk>60 && Eatk<=95) {
			System.out.println("Grace quick fires two arrows. Upon impact, your health drops from "+health+" to "+(health=health-EDAdmg));
		}else if(Eatk>95) {
			System.out.println("Grace quickly drinks a healing potion strapped to her belt, and her health goes from "+ Ghealth + " to "+(Ghealth=Ghealth+5));
		}
		}
		System.out.println("Press enter to continue.");
		String continue16=kbreader.nextLine();
}
}
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

			
			
	//fight 3		
			
			
			
	
			if (health>0) {
				System.out.println("As a reward for completing the second round you recieve a wooden bow and arrow.");
				System.out.println("Attack learned: double shot- 3 damage to two targets, 5 uses");
				System.out.println("Attack learned: limit break- If your health is less than 5 this attack does 7 damage");
				System.out.println("Attack learned: Battle Cry- Your next attack does a bonus 2 damage");
				System.out.println("Attack lost: slash");
				System.out.println("punch uses increased to 4");
				System.out.println("Press enter to continue!");
				String continue16= kbreader.nextLine();
				
				System.out.println("Once again the stage floor moves like an elevator bringing you up to the next stage of the arena.");
				System.out.println("Once the floor stops two men step out from a door on the opposite end of the fighting stage.");
				System.out.println("Press enter to continue!");
				String continue17= kbreader.nextLine();
			
				
				System.out.println("We are the fighting Wallamir brothers! And you will not defeat us!");
				health=35;
				int B1health=15;
				int B2health=15;
				Pcounter=0;
				Hcounter=0;
				int DScounter=0;
				
				while(health>0 & (B1health>0||B2health>0)) {
				int Eatk= (int)(Math.random()*100+1);
				int Ehit=(int)(Math.random()*100+1);
				int rng= (int)(Math.random()*100+1);
				int Pdmg= (int)(Math.random()*4+2);
				int Kdmg= 2;
				int DSdmg= 3;
				int LBdmg= 7;
				int Bdmg= (int)(Math.random()*6+3);
				int LSdmg= 10;
				int LMcounter=0;
				int LMUcounter=0;
				int LKcounter=0;
				
				System.out.println("Which brother will you attack?\n");
				System.out.println("Brother 1");
				System.out.println("Brother 2");
				String targetPicker=kbreader.nextLine();
				targetPicker=targetPicker.toLowerCase();
				switch(targetPicker) {
				case "brother 1":
					System.out.println("What will you do?");
					System.out.println("Punch, dmg: 2-5, "+(4-Pcounter)+" uses");
					System.out.println("Limit breaker: 7, if health is 5 or less");
					System.out.println("Battle Cry: +2 damage to your next attack");
					System.out.println("Double shot: 3 damage to every enemy, "+(4-DScounter)+" uses");
					System.out.println("kick, dmg: 2");
					System.out.println("Heal, hp: +2, uses "+(2-Hcounter));
					String attackPicker=kbreader.nextLine();
					attackPicker=attackPicker.toLowerCase();
					switch(attackPicker) {
					case "punch":
						if(Pcounter<=3) {
							if(rng<=90) {
								if (LMcounter==1) {
									Pdmg+=2;
								}
							System.out.println("You punch the first brother with a mighty blow! His health drops from "+ B1health+" to "+(B1health-=Pdmg));
							LMcounter=0;
							Pcounter+=1;
							}else {
								System.out.println("Your attack Missed!");
								Pcounter+=1;
							}
						}else {
							System.out.println("Out of uses!");
						}
						System.out.println("Press enter to continue!");
						String continue18= kbreader.nextLine();;
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue19= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue20= kbreader.nextLine();
						break;
					
					
					
					case "limit breaker":
						if(health<=5) {
							if(LMcounter==1) {
								LBdmg+=2;
							}
							System.out.println("You summon up all the strength you can muster and attack the First brother with a mighty blow!\nThe First brotheres health drops from " +B1health+ " to "+ (B1health-=LBdmg));
						LMcounter=0;
						}else {
							System.out.println("You try to summon the strength for a limit break attack, but nothing happens.");
						}
						System.out.println("Press enter to continue!");
						String continue21= kbreader.nextLine();
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue22= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue23= kbreader.nextLine();
						break;
						
						
					case "battle cry":
						LMcounter+=1;
						System.out.println("You let out a mighty cry and feel power surging through your veins!");
						
						System.out.println("Press enter to continue!");
						String continue24= kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue25= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue26= kbreader.nextLine();
		            break;
		            
		            
		            
					case "double shot":
						if(DScounter<=3) {
							if(rng<=80) {
								if(LMcounter==1) {
									DSdmg+=2;
								}
								System.out.println("Your let loose two arrows from your bow, both of which connecting with a different brother!\n The first brothers health drops from " +B1health+" to "+(B1health-=DSdmg)+"\nThe second brothers health drops from " +B2health+ " to "+(B2health-=DSdmg));
							LMcounter=0;
							DScounter+=1;
							}else {
								System.out.println("Your arrows missed!");
								DScounter+=1;
							}
						}
						
						System.out.println("Press enter to continue!");
						String continue27=kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue28= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue29= kbreader.nextLine();
						break;
						
						
						
					case "kick":
						if(rng<=95) {
							if(LMcounter==1) {
								Kdmg+=2;
							}
							System.out.println("You suprise the first brother with a powerful kick, and his health goes from "+ B1health +" to "+(B1health-=Kdmg));
							LMcounter=0;
						}
						System.out.println("Press enter to continue!");
						String continue30=kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue31= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue32= kbreader.nextLine();
						break;
						
						
						
					case "heal":
						if (Hcounter==2) {
							System.out.print("Out of bandages!");
						}else {
							System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+4));
							Hcounter+=1;
						}
						System.out.println("Press enter to continue!");
						String continue33=kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue34= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue35= kbreader.nextLine();
					}
					
					break;
					
				case "brother 2":
					System.out.println("What will you do?");
					System.out.println("Punch, dmg: 2-5, "+(4-Pcounter)+" uses");
					System.out.println("Limit breaker: 7, if health is 5 or less");
					System.out.println("Battle Cry: +2 damage to your next attack");
					System.out.println("Double shot: 3 damage to every enemy, "+(4-DScounter)+" uses");
					System.out.println("kick, dmg: 2");
					System.out.println("Heal, hp: +2, uses "+(2-Hcounter));
					String attackPicker2=kbreader.nextLine();
					attackPicker2=attackPicker2.toLowerCase();
					switch(attackPicker2) {
					case "punch":
						if(Pcounter<=3) {
							if(rng<=90) {
								if (LMcounter==1) {
									Pdmg+=2;
								}
							System.out.println("You punch the first brother with a mighty blow! His health drops from "+ B2health+" to "+(B2health-=Pdmg));
							LMcounter=0;
							Pcounter+=1;
							}else {
								System.out.println("Your attack Missed!");
								Pcounter+=1;
							}
						}else {
							System.out.println("Out of uses!");
						}
						System.out.println("Press enter to continue!");
						String continue18= kbreader.nextLine();;
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue19= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue20= kbreader.nextLine();
						break;
					
					
					
					case "limit breaker":
						if(health<=5) {
							if(LMcounter==1) {
								LBdmg+=2;
							}
							System.out.println("You summon up all the strength you can muster and attack the First brother with a mighty blow!\nThe First brotheres health drops from " +B2health+ " to "+ (B2health-=LBdmg));
						LMcounter=0;
						}else {
							System.out.println("You try to summon the strength for a limit break attack, but nothing happens.");
						}
						System.out.println("Press enter to continue!");
						String continue21= kbreader.nextLine();
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue22= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue23= kbreader.nextLine();
						break;
						
						
					case "battle cry":
						LMcounter+=1;
						System.out.println("You let out a mighty cry and feel power surging through your veins!");
						
						System.out.println("Press enter to continue!");
						String continue24= kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue25= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue26= kbreader.nextLine();
		            break;
		            
		            
		            
					case "double shot":
						if(DScounter<=3) {
							if(rng<=80) {
								if(LMcounter==1) {
									DSdmg+=2;
								}
								System.out.println("Your let loose two arrows from your bow, both of which connecting with a different brother!\n The first brothers health drops from " +B1health+" to "+(B1health-=DSdmg)+"\nThe second brothers health drops from " +B2health+ " to "+(B2health-=DSdmg));
							LMcounter=0;
							DScounter+=1;
							}else {
								System.out.println("Your arrows missed!");
								DScounter+=1;
							}
						}
						
						System.out.println("Press enter to continue!");
						String continue27=kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue28= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue29= kbreader.nextLine();
						break;
						
						
						
					case "kick":
						if(rng<=95) {
							if(LMcounter==1) {
								Kdmg+=2;
							}
							System.out.println("You suprise the first brother with a powerful kick, and his health goes from "+ B2health +" to "+(B2health-=Kdmg));
							LMcounter=0;
						}
						System.out.println("Press enter to continue!");
						String continue30=kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue31= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue32= kbreader.nextLine();
						break;
						
						
						
					case "heal":
						if (Hcounter==2) {
							System.out.print("Out of bandages!");
						}else {
							System.out.println("you bandaged your wounds, and you health goes from "+health+" to "+(health=health+4));
							Hcounter+=1;
						}
						System.out.println("Press enter to continue!");
						String continue33=kbreader.nextLine();
						
						if(B1health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The first brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the first brothers attack");
								}
						}
							if(Ehit>85) {
								System.out.println("Both Brothers attack together, sending out a flurry of blows too fast to dodge!\nYour health drops from "+health+" to "+(health-=LSdmg));
								LKcounter++;
							}
					}
						System.out.println("Press enter to continue!");
						String continue34= kbreader.nextLine();
						
						if(LKcounter<1) {
						if(B2health>0) {
							if(Eatk<=85) {
								if(Ehit<=65) {
									System.out.println("The second brother nimbly slices your side with his dagger, bringing your health from "+ health + " to "+(health-=Bdmg));
								}else {
									System.out.println("You Dodge the second brothers attack");
								}
							}
						}
						}else {
							LKcounter--;
						}
						System.out.println("Press enter to continue!");
						String continue35= kbreader.nextLine();
					}
				}
				}
			}
}
}
				
				
				
			
				
				
				
				
				
			





