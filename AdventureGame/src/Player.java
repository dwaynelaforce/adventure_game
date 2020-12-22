import java.util.ArrayList;

public class Player {

	// attributes
	
	int health;
	ArrayList<String> inventory;
	
	// constructor
	
	public Player() {
		this.setHealth(10);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public ArrayList<String> getInventory() {
		return inventory;
	}

	public void addToInventory(String item) {
		this.inventory.add(item);
	}
	
	public void removeFromInventory(String item) {
		this.inventory.remove(item);
	}
	
	
}
