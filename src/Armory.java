import java.util.Random;


public final  class Armory {
	private Weapon [] items = new Weapon[16];
	
	
	public Armory(){
		//constructor
		//Ranged
		items[0] = new Weapon("knife", 10, 4);
		items[1] = new Weapon("bow and arrow", 5, 10);
		items[2] = new Weapon( "dagger", 8, 7);
		items[3] = new Weapon("crossbow", 4, 15);
		//Swordsman
		items[4] = new Weapon("sword", 10, 99);
		items[5] = new Weapon("spear", 6, 99);
		items[6] = new Weapon("scythe", 7, 99);
		items[7] = new Weapon("pike", 8, 99);
		//Basher
		items[8] = new Weapon("really large rock", 10, 1);
		items[9] = new Weapon("axe", 20, 99);
		items[10] = new Weapon("trout or herring (I can't quite tell which)", 2, 1);
		items[11] = new Weapon("mace", 25, 99);
		//whip
		items[12] = new Weapon("whip", 7, 99);
		items[13] = new Weapon("magic wand", 10, 50);
		items[14] = new Weapon("catapult", 50, 1);
		items[15] = new Weapon("bucket of flaming oil", 100, 1);
		
	}
	
	public Weapon getWeapon(int num){
		return items[num];
	}
	public Weapon getRandomWeapon(){
		Random rand = new Random();
		int num = rand.nextInt(14);
		return items[num];
	}
}
