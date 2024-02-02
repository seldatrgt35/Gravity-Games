package playy;


public class Player {
    private int score;
    private Stack backPack;
    private int teleportRight;


    public Player() {
    }

    public Player(int score, Stack backPack, int teleportRight) {
        this.score = score;
        this.backPack = backPack;
        this.teleportRight = teleportRight;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Stack getBackPack() {
        return backPack;
    }

    public void setBackPack(Stack backPack) {
        this.backPack = backPack;
    }

    public int getTeleportRight() {
        return teleportRight;
    }

    public void setTeleportRight(int teleportRight) {
        this.teleportRight = teleportRight;
    }



}