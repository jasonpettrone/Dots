import java.util.Random;

public class Dot {

    private final String[] COLORS = new String[]{"Red","Green","Blue","Yellow","Purple"};
    private final static Random r = new Random();
    private String color;
    private int xPos;
    private int yPos;

    public Dot(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
        color = COLORS[r.nextInt(COLORS.length)];
    }

    public Dot(int xPos, int yPos, String color){
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
    }
}
