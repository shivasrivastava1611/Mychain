package mychain;
import java.util.ArrayList;


public class MyBlockchain {
	
	public static ArrayList<Block> myBlockchain = new ArrayList<Block>();
	public static int difficulty = 5;

	public static void main(String[] args) {	
		addBlock(new Block("First block", "0"));
		
		addBlock(new Block("Second block",myBlockchain.get(myBlockchain.size()-1).hash));
		
		addBlock(new Block("Third block",myBlockchain.get(myBlockchain.size()-1).hash));	
		
	}
	
	
	public static void addBlock(Block block) {
		block.mineBlock(difficulty);
		myBlockchain.add(block);
	}
}
