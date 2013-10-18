import java.util.*;
public class Game {
	public static boolean won = false;
	
	static Map map = new Map();
	static Scanner input = new Scanner(System.in);
	static Society people = new Society();
	static TreasureChest gimme = new TreasureChest();
	static Random rand = new Random();
	static int score = 0;
	static Place here = map.getPlace(0);
	static Character player;
	public static void runGame(){
			System.out.println("You are in the " + here.getName());
			
			if (here.returnPerson() != null){
				System.out.println("The " + here.personHere()+" is here.");
			}
			if (here.returnTreasure() !=null){
				System.out.println("The " + here.returnTreasure().returnName()+" is here.");
			}
			System.out.println("What do you want to do?");
			String in = input.nextLine();
			//user input converter
			if(in.equals("Attack")){
				if (here.returnPerson() != null){
					player.doCombat(here.returnPerson(), here);
				}else{
					System.out.println("What can you Attack?");
				}
			}else if (in.equals("move")){
				System.out.println("What direction?");
				in = input.nextLine();
				if(in.equals("north") && here.getNorth() != null){
					here = here.getNorth();
				}else if (in.equals("south") && here.getSouth() != null){
					here = here.getSouth();
				}else if (in.equals("west") && here.getWest() != null){
					here = here.getWest();
				}else if (in.equals("east") && here.getEast() != null){
					here = here.getEast();
				}else { 
					System.out.println("You can't go that way");
					if (here.returnPerson() != null){
						player.doCombat(here.returnPerson(), here);
					}
				}
			}else if (in.equals("take")){
				if (here.treasureHere() != null){
					score = score +here.treasureValue();
					System.out.println("Your score is " + score +"!");
					here.setTreasure(null);
				}else{
					System.out.println("Did you want the dirt?");
				}
				
			}else if(in.equals("pieFight")){
				System.out.println("Pie is many things.");
				System.out.println("Pie is edible.");
				System.out.println("Pie is yummy.");
				System.out.println("You will like pie!");
				System.out.println("ATTACK!!!!HOHIOHOHOHOHSFEHFASD");
				System.out.println("What?");
				if (here.returnPerson() != null){
					System.out.println("The person here doesn't like your face!");
					player.doCombat(here.returnPerson(), here);
				}
			}
			
			
			
		
		}


	public static void main(String[] args) {

		
		Place here = map.getPlace(0);
		int num = 0;
		System.out.println("What is your name");
		String name = input.nextLine();

		System.out.println("Choose your class: Archer Swordsman Basher Wierdo");
		String clas = input.nextLine();

		if (clas.equals("Archer")){
			num = 0;
		}else if (clas.equals("Swordsman")){
			num = 1;
		}else if (clas.equals("Basher")){
			num = 2;
		}else if (clas.equals("Wierdo")){
			num = 3;
		}
		
		Character player = new Character(name, num);
		System.out.println("Your Weapon is the " + player.getWeaponName());
		System.out.println("Your mission is to find all of the treasure.");
		System.out.println("Everyone is hostile. Once your score is 500 you win!");
		
		
		for(int x = 0; x<10; x++){
			map.getPlace(rand.nextInt(10)).setTreasure(gimme.getTreasure(rand.nextInt(10)));
		}
		while(won == false){
			System.out.println(here.returnPerson());
			runGame();
			if (score >= 500){
				won = true;
				break;
			}
		}

		if(won == false){
			System.out.println("You lost");
		}else{
			System.out.println("You won!");
		}




	}

}

