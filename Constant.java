package playy;

import enigma.console.TextAttributes;

import static java.awt.Color.*;

public class Constant {
    public static final int ROBOT_COUNT = 7;
    public static final int GAME_FIELD_X = 55;
    public static final int GAME_FIELD_Y = 25;
    public static final int TREASURE_COUNT = 30;
    public static final int EMPTY_SQUARE_COUNT = 200;
    public static final int EARTH_SQUARES = 180;
    public static final int FPS = 10;
    public static final int FPS_QUEUE = 30;
    public static final int BACKPACK_SIZE = 8;
    public static final int QUEUE_SIZE = 15;
    public static final int STACK_SIZE = 8;
    public static final TextAttributes PLAYER_COLOR = new TextAttributes(GREEN, BLACK);
    public static final TextAttributes ROBOT_COLOR = new TextAttributes(YELLOW, BLACK);
    public static final TextAttributes WALL_COLOR = new TextAttributes(WHITE, BLACK);
    public static final TextAttributes EARTH_COLOR = new TextAttributes(BLACK, WHITE);
    public static final TextAttributes BOULDER_COLOR = new TextAttributes(BLACK, WHITE);
    public static final TextAttributes TREASURE_COLOR = new TextAttributes(RED, WHITE);
    public static final TextAttributes CONSOLE_COLOR = new TextAttributes(BLACK, WHITE);
    public static final TextAttributes TEXT_COLOR = new TextAttributes(BLACK, WHITE);
    public static final char BOULDER = 'O';
    public static final char WALL = '#';
    public static final char EARTH = ':';
    public static final char PLAYER = 'P';
    public static final char ROBOT = 'X';
    public static final char EMPTY = ' ';
    public static final char TREASURE_1 = 49;
    public static final char TREASURE_2 = 50;
    public static final char TREASURE_3 = 51;

}