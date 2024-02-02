package playy;

public class Boulder {
	private char symbol='O';
	private boolean live;
	public Boulder (){
		
	}
	public Boulder ( boolean live) {
		
		this.live = live;
	}
	public char getSymbol() {
		return symbol;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
}
