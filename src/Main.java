import processing.core.PApplet;

import java.awt.*;

public class Main extends PApplet {

    DotGraph g = new DotGraph(6,6);
    DrawGraph drawGraph = new DrawGraph(g,600,600);
    DotHitBoxGraph hitboxes = drawGraph.generateDotHitBoxes();

    public void settings(){
        size(600, 600);
    }

    public void draw() {
        background(0);
        drawGraph.draw(this);
        for(int i = 0; i < hitboxes.dotHitBoxes.length; ++i){
            for(int j = 0; j < hitboxes.dotHitBoxes[0].length; ++j){
                Point[] bounds = hitboxes.dotHitBoxes[i][j].getHitBounds();
                DotHitBox hitBox = hitboxes.dotHitBoxes[i][j];
                if(hitBox.mouseWithinBounds(mouseX,mouseY)){
                    fill(255,0,0);
                    rect(bounds[0].x, bounds[0].y, bounds[1].x - bounds[0].x, bounds[2].y - bounds[1].y);
                }
            }
        }
    }

    public static void main(String[] args){
        PApplet.main("Main");
    }
}
