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
            m.ellipse(xPos,yPos,dotSize,dotSize);
            for(int j = 0; j < numYDots; ++j){
                m.ellipse(xPos, yPos,dotSize,dotSize);
                yPos += yDotSeperator;
            }
            xPos += xDotSeperator;
        }
    }
}
