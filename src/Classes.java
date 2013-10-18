import java.util.*;
public final class Classes {
	private Class[] classes= new Class[5];

	private Random rand = new Random();
	public Classes(){
		classes[0] = new Class("Archer", 0, 15,  rand.nextInt(3));
		classes[1] = new Class("Swordsman", 5, 10, rand.nextInt(3)+4);
		classes[2] = new Class("Basher", 10, 10, rand.nextInt(3)+8);
		classes[3] = new Class("Wierdo", 10, 5, rand.nextInt(3)+12);
	}
	public Class getClas(int num){
		return classes[num];
	}
	public Weapon getWeapon(int num){
		return classes[num].returnWeapon();
	}
}

