package playy;

public class Wall {
	private char symbol='X';
	private boolean live;
	public Wall (){
		
	}
	public Wall ( boolean live) {
		
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
