package moncalaGame;

public class Pit {
	
	
	private int count;
	
	public Pit(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void addMarble() {
		count = this.count +1;
	}
	
	

}
