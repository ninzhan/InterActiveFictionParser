
public class Place{
	private String name;
	private Place toSouth, toNorth, toEast, toWest;
	private Character hers = null;
	private Treasure mine = null;
	public Place(String named){
		name = named;


	}//1=n 2=e 3=s 4=w
	//	public Place getDirection(int direction){
	//		switch(direction){
	//		case 0:
	//			return toNorth;
	//		case 1:
	//			return toSouth;
	//		case 2:
	//			return toEast;
	//		case 3:
	//			return toWest;
	//		default:
	//			return null;
	//		}
	//	}
	public Place getNorth(){
		return toNorth;
	}
	public void setNorth(Place y ){
		toNorth = y;
	}
	public Place getSouth(){
		return toSouth;
	}
	public void setSouth(Place y ){
		toSouth = y;
	}
	public Place getEast(){
		return toEast;
	}
	public void setEast(Place y ){
		toEast = y;
	}
	public Place getWest(){
		return toWest;
	}
	public void setWest(Place y ){
		toWest = y;
	}
	public String getName(){
		return name;
	}
	public void addPerson(Character him){
		Character hers = him;
	}
	public void removePerson(){
		Character hers = null;
	}
	public Character returnPerson(){
		return hers;
	}
	public String personHere(){
		if (hers != null){
			return hers.returnName();
		}else return null;
	}
	public Treasure returnTreasure(){
		return mine;
	}
	public String treasureHere(){
		if (mine != null){
			return mine.returnName();
		}else return null;
	}
	public int treasureValue(){
		return mine.returnValue();
	}
	public void setTreasure(Treasure y){
		mine = y;
	}
}


