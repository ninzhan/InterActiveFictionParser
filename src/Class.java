import java.util.*;

public class Class {
	private String clases;
	private Weapon weapon;
	private int[] modArray= new int[3];
	Random rand = new Random();
	private Armory weapons = new Armory();
	public Class(String named, int attack, int defence,  int num){
		modArray[0] = attack;
		modArray[1] = defence;
		clases = named;
		weapon = weapons.getWeapon(num);
	}
	public int[] returnMod(){
		return modArray;
	}
	public Weapon returnWeapon(){
		return weapon;
	}
	public String returnClass(){
		return clases;
	}
}
