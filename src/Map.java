import java.util.*;
public class Map{

	private Place[] places = new Place[12];
	private Random rand = new Random();
	public Map(){
		//castle NSEW
		places[0] = new Place("tower");
		
		places[2] = new Place("dungeon");
		places[3] = new Place("drawbridge");
		places[1] = new Place("castle");
		
		places[4] = new Place("pond");
		places[5] = new Place("lake");
		places[6] = new Place("forest");
		places[7] = new Place("river");
		
		places[8] = new Place("cottage");
		places[9] = new Place("bridge");
		places[10]= new Place("road");
		places[10].setNorth(places[rand.nextInt(6)+3]);
		places[10].setEast(places[rand.nextInt(6)+3]);
		places[10].setWest(places[rand.nextInt(6)+3]);
		places[10].setSouth(places[rand.nextInt(6)+3]);
		places[0].setEast(places[2]);
		places[0].setSouth(places[1]);
		places[1].setNorth(places[0]);
		places[1].setEast(places[2]);
		places[1].setSouth(places[3]);
		places[3].setNorth(places[2]);
		places[3].setSouth(places[10]);
		places[3].setEast(places[7]);
		places[3].setWest(places[7]);
		places[5].setNorth(places[7]);
		places[5].setEast(places[10]);
		places[5].setSouth(places[4]);
		places[4].setNorth(places[5]);
		places[4].setEast(places[6]);
		places[6].setNorth(places[10]);
		places[6].setWest(places[4]);
		places[6].setEast(places[8]);
		places[8].setWest(places[6]);
		places[8].setNorth(places[9]);
		places[9].setSouth(places[8]);
		places[9].setNorth(places[10]);
	}
	public Place getPlace(int num){
		return places[num];
	}
	public Place getRandomPlace(){
		
		int num = rand.nextInt(14);
		return places[num];
	}
	public void setPerson(int e, Character y){
		places[e].addPerson(y);
	}
	public void setTreasure(int e, Treasure y){
		
	}
}
