
public class Weapon {
	private String name;
	private int attack, ammo;
	public Weapon(String named, int att, int amm){
		attack = att;
		name = named;
		ammo = amm;
	}
	public int getAttack(){
		return attack;
	}
	public String getName(){
		return name;
	}
	public int getAmmo(){
		return ammo;
	}
	public void decAmmo(){
		ammo--;
	}
	
	public String toString(){
		return name;
	}
}
