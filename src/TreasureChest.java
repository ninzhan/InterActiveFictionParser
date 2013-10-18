import java.util.Random;

public class TreasureChest {
	private Treasure[] items = new Treasure[15];
	
	public TreasureChest(){
		
		items[0] = new Treasure(100,"diamond");
		items[1] = new Treasure(80,"gold coin");
		items[2] = new Treasure(90,"ruby");
		items[3] = new Treasure(150,"crown");
		items[4] = new Treasure(10,"braclet");
		items[5] = new Treasure(400,"necklace");
		items[6] = new Treasure(70,"emerald");
		items[7] = new Treasure(50,"bronze coin");
		items[8] = new Treasure(100,"silver coin");
		items[9] = new Treasure(200,"goblet");
		items[10] = new Treasure(100,"ring");
		items[11] = new Treasure(100,"gold bar");
		items[12] = new Treasure(500,"magic lamp");
		items[13] = new Treasure(100,"saphire");
		
		items[14] = new Treasure(90,"pearl");
		
	}
	
	public Treasure getTreasure(int num){
		return items[num];
	}
	public Treasure getRandomTreasure(){
		Random rand = new Random();
		int num = rand.nextInt(14);
		return items[num];
	}
	
}
