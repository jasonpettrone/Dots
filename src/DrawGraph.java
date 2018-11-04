import processing.core.PApplet;

public class DrawGraph extends PApplet{

    private int numXDots;
    private int numYDots;
    private float dotSize;
    private float xDotSeperator;
    private float yDotSeperator;
    private DotGraph g;

    public DrawGraph(DotGraph g, int windowXSize, int windowYSize){

        this.g = g;
        numXDots = g.graph.length;
        numYDots = g.graph[0].length;
        this.xDotSeperator = (float)windowXSize / numXDots;
        this.yDotSeperator = (float)windowYSize / numYDots;
        windowXSize -= xDotSeperator;
        windowYSize -= yDotSeperator;
        this.xDotSeperator = (float)windowXSize / numXDots;
        this.yDotSeperator = (float)windowYSize / numYDots;
        this.dotSize = 30;//(float)(windowXSize * windowYSize) / (numXDots * numYDots);
    }

    public void draw(Main m){

        float xPos = xDotSeperator;
        for(int i = 0; i < numXDots; ++i){
            float yPos = yDotSeperator;
            for(int j = 0; j < numYDots; ++j){
                setDotDrawColor(m,i,j);
                m.ellipse(xPos, yPos,dotSize,dotSize);
                yPos += yDotSeperator;
            }
            xPos += xDotSeperator;
        }
    }

    public void setDotDrawColor(Main m,int i, int j){
        String color = g.graph[i][j].getColor();
        if(color.equals("Green")){
            m.fill(51,255,51);
        }
        else if(color.equals("Yellow")){
            m.fill(255,255,0);
        }
        else if(color.equals("Red")){
            m.fill(255,0,0);
        }
        else if(color.equals("Purple")){
            m.fill(127,0,255);
        }
        else if(color.equals("Blue")){
            m.fill(51,255,255);
        }
    }
}
