import processing.core.PApplet;

public class Main extends PApplet {

    DotGraph g = new DotGraph(6,6);
    DrawGraph drawGraph = new DrawGraph(g,600,600);

    public void settings(){
        size(600, 600);
    }

    public void draw() {
        background(0);
        drawGraph.draw(this);
    }

    public static void main(String[] args){
        PApplet.main("Main");
    }
}
