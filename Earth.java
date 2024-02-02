package playy;

public class Earth {
	private char symbol=':';
	private boolean live;
	public Earth (){
		
	}
	public Earth( boolean live) {
		
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
