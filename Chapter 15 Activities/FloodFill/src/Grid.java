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
            pixels[spot.getColumn()][spot.getRow()] = count;
            count++;
            //north
            if(spot.getRow()+1<SIZE){
                if(pixels[spot.getColumn()][spot.getRow()+1]==0){
                    coords.push(new Pair(spot.getColumn(),spot.getRow()+1));
                }
            }
            //east
            if(spot.getColumn()+1<SIZE){
                if(pixels[spot.getColumn()+1][spot.getRow()]==0){
                    coords.push(new Pair(spot.getColumn()+1,spot.getRow()));
                }
            }
            //south
            if(spot.getRow()-1>=0){
                if(pixels[spot.getColumn()][spot.getRow()+1]==0){
                    coords.push(new Pair(spot.getColumn(),spot.getRow()+1));
                }
            }
            //west
            if(spot.getColumn()+1<SIZE){
                if(pixels[spot.getColumn()][spot.getRow()+1]==0){
                    coords.push(new Pair(spot.getColumn(),spot.getRow()+1));
                }
            }
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
