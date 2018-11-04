public class DotGraph {

    public Dot[][] graph;

    public DotGraph(int numCols, int numRows){
        graph = new Dot[numCols][numRows];
        for(int i = 0; i < graph.length; ++i){
            for(int j = 0; j < graph[0].length; ++j){
                graph[i][j] = new Dot(i,j);
            }
        }
    }
}
