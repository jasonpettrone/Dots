import java.awt.*;

public class DotHitBox {

    private Point[] hitBounds;

    public DotHitBox(float xPos, float yPos, float xDotSeperator, float yDotSeperator){
        hitBounds = new Point[3];
        hitBounds[0] = new Point((int)xPos - (int)xDotSeperator/2,(int)yPos + (int)yDotSeperator/2);    // Upper left corner
        hitBounds[1] = new Point((int)xPos + (int)xDotSeperator/2,(int)yPos + (int)yDotSeperator/2);    // Upper right corner
        hitBounds[2] = new Point((int)xPos + (int)xDotSeperator/2,(int)yPos - (int)yDotSeperator/2);    // Lower right corner
    }

    public Point[] getHitBounds() {
        return hitBounds;
    }

    public boolean mouseWithinBounds(int mouseX, int mouseY){
        return withinX(mouseX) && withinY(mouseY);
    }

    public boolean withinX(int mouseX){
        return (mouseX > hitBounds[0].x) && (mouseX < hitBounds[1].x);
    }

    public boolean withinY(int mouseY){
        return (mouseY > hitBounds[2].y) && (mouseY < hitBounds[1].y);
    }

}
