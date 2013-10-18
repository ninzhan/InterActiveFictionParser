import java.util.*;
public class Society{

	private Character[] people  = new Character[12];
	public Society(){
		people[0] = new Character("Prince",1);
		people[1] = new Character("Princess",0);
		people[2] = new Character("Duke",0);
		people[3] = new Character("Duchess",3);
		people[4] = new Character("Peasant boy",0);
		people[5] = new Character("peasant girl",2);
		people[7] = new Character("king",2);
		people[8] = new Character("witch",3);
		people[9] = new Character("wizard",3);
		people[10] = new Character("knight",1);
		people[11] = new Character("jester",3);
	}
	public Character getCharacter(int num){
		return people[num];
	}
	public Character getRandomCharacter(){
		Random rand = new Random();
		int num = rand.nextInt(14);
		return people[num];
	}
}

