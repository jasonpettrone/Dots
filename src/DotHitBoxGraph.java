public class DotHitBoxGraph {

    public DotHitBox[][] dotHitBoxes;
    public DotHitBoxGraph(int numCols, int numRows){
        dotHitBoxes = new DotHitBox[numCols][numRows];
    }

    public void add(DotHitBox dotHitBox, int i, int j){
        dotHitBoxes[i][j] = dotHitBox;
    }

    public DotHitBox mouseHit(int mouseX, int mouseY){
        for(int i = 0; i < dotHitBoxes.length; ++i){
            for(int j = 0; j < dotHitBoxes[0].length; ++j){
                if(dotHitBoxes[i][j].mouseWithinBounds(mouseX,mouseY)){
                    return dotHitBoxes[i][j];
                }
            }
        }
        return null;
    }
}
