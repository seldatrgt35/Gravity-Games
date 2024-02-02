package playy;

import static playy.Constant.EARTH;
import static playy.Constant.GAME_FIELD_X;
import static playy.Constant.GAME_FIELD_Y;
import static playy.Constant.ROBOT;

import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Robot {
	private char symbol='X';
	private boolean live;
	int posx;
	int posy;
	int oldposx;
	int oldposy;
	int dir; // 1:sol 2:yuk 3:sağ 4:aşa
	
	Random rnd = new Random();
	
	
	public Robot(int x, int y){
		oldposx=posx=x;
		oldposy=posy=y;
		dir=rnd.nextInt(4)+1;
	}
	
	public void move() {
		if(rnd.nextInt(100)<10) changedir();
		if(dir==1) posx--;
		if(dir==2) posy--;
		if(dir==3) posx++;
		if(dir==4) posy++;
	}
	
	public void changedir() {
		dir=rnd.nextInt(4)+1;
	}

	public void moveOldPos() {
		posx=oldposx;
		posy=oldposy;
	}
	
	public void setNewPos() {
		oldposx=posx;
		oldposy=posy;
	}
	

	public Robot( boolean live) {
		
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
