import processing.core.PApplet;

public class Main extends PApplet {

    int xOffset = 100;
    int yOffset = 50;
    int numXDots = 6;
    int numYDots = 6;
    int dotSpacing = 100;
    int dotSize = 40;

    public void settings(){
        DotGraph g = new DotGraph(6,6);
        size(600, 600);
    }

    public void draw(){
        background(0);
        // Draw the dots to the window
        int xSpacing = 0;
        int ySpacing = 0;
        for(int i = 0; i < numXDots - 1; ++i){
            ySpacing = 0;
            ellipse(xSpacing+xOffset,ySpacing + yOffset,dotSize,dotSize);
            for(int j = 0; j < numYDots - 1; ++j){
                ySpacing += dotSpacing;
                ellipse(xSpacing+xOffset, ySpacing + yOffset, dotSize,dotSize);
            }
            xSpacing += dotSpacing;
        }
        ellipse(mouseX, mouseY, 20, 20);
    }

    public static void main(String[] args){
        PApplet.main("Main");
    }
}
