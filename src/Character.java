import java.util.*;
public class Character {
	Random rand = new Random();
	private int attack, defence;
	private String name;
	private Weapon invent;
	private Class clases;
	private Classes classes = new Classes();
	private boolean isAlive = true;
	public Character(String named, int num){
		attack = rand.nextInt(25)+25;
		defence =rand.nextInt(25)+25;
		name = named;
		clases = classes.getClas(num);
		int [] modarray = clases.returnMod();
		attack += modarray[0];
		defence += modarray[1];
		invent = clases.returnWeapon();
		attack += invent.getAttack();
	}
	//	public void modStats(int[] modarray){
	//		attack += modarray[0];
	//		defence += modarray[1];
	//		health += modarray[2];
	//	}//psudocode
	public int returnAttack(){
		return attack;
	}
	public int returnDefence(){
		return defence;
	}
	public void modAttack(int mod){
		attack += mod;
	}
	public void modDefence(int mod){
		defence += mod;
	}
	public String returnName(){
		return name;
	}
	public Class getClas(){
		return clases;
	}
	public Weapon getWeapon(){
		return invent;
	}
	public String getWeaponName(){
		return invent.getName();
	}
	public boolean getLife(){
		return isAlive;
	}
	public void doCombat(Character her, Place here){
		boolean herIsAlive = true;
		while (herIsAlive == true && isAlive == true){
			if (attack > her.returnDefence()){
				System.out.println("You killed the " + her.returnName());
				here.removePerson();
				herIsAlive = false;
				
			}else if (attack <= her.returnDefence()){
				System.out.println("The "+ her.returnName()+" Is unaffected!");
				herIsAlive = true;
			}else if (her.returnAttack() > defence){
				System.out.println("You died");
				herIsAlive = true;
				isAlive = false;
			}

		}
	}
}
