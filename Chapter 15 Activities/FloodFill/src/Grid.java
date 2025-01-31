import java.util.Stack;
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    private Stack<Pair> coords = new Stack<Pair>(); //coords of spots to be filled

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        Pair theFirstPair = new Pair(row,column);
        coords.push(theFirstPair);

        int count = 1;
        while(coords.size()>0){
            Pair spot = coords.pop();
            if((spot.getColumn()>=0 && spot.getColumn()<SIZE && spot.getRow()>=0 && spot.getRow() <SIZE) && pixels[spot.getRow()][spot.getColumn()] ==0){
                pixels[spot.getRow()][spot.getColumn()] = count;
                count++;

                //add south east north west
                coords.push(new Pair(spot.getRow()-1,spot.getColumn()));
                coords.push(new Pair(spot.getRow(),spot.getColumn()+1));
                coords.push(new Pair(spot.getRow()+1,spot.getColumn()));
                coords.push(new Pair(spot.getRow(),spot.getColumn()-1));
                
                
                
            }
            //else do nothing, the spot is popped off already
        }
    
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
