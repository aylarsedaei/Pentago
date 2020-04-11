public class Block
{
    private int[][] position;

    public Block()
    {
        position = new int[3][3];
    }

    public void setPosition(int i, int j, int player)
    {
        position[i][j] = player;
    }

public class Block
{
    //an array of integers to save the state of positions
    private int[][] position;

    /**
     * constructor
     * news the position array
     */
    public Block()
    {
        position = new int[3][3];
    }

    /**
     * This method sets the selected position to the value of player.
     * @param i the selected row index of block
     * @param j the selected column index of block
     * @param player value assigned to the player who wants to put a pawn in this position
     */
    public void setPosition(int i, int j, int player)
    {
        position[i][j] = player;
    }

    /**
     * This method checks the position and returns an integer that shows the state of this position.
     * @param i the selected row index of block
     * @param j the selected column index of block
     * @return if a pawn is in it, returns the player's value, else returns 0
     */
    public int getPosition(int i, int j)
    {
        return position[i][j];
    }

    /**
     * this method rotates the block clockwise or counter-clockwise for 90 degrees.
     * @param direction a string as the direction of rotation clockwise(CW) or counter-clockwise (CCW)
     */
    public void rotate(String direction)
    {
        if (!isEmpty())
       {
           if (direction.equals("CW"))
                rotateCW();
            else if (direction.equals("CCW"))
                rotateCCW();
            else
                throw new IllegalArgumentException("Please insert valid input.");
       }
    }

    /**
     * this method swaps two values in an two dimentional array of integers
     * @param arr the array you want to work with
     * @param index1 row index of the first element
     * @param index2 column index of the first element
     * @param index3 row index of the second element
     * @param index4 column index of the second element
     */
    private void swap(int[][] arr, int index1, int index2,int index3, int index4)
    {
        int temp;
        temp = arr[index1][index2];
        arr[index1][index2] = arr[index3][index4];
        arr[index3][index4] = temp;
    }

    /**
     * rotates the block 90 degrees clockwise
     */
    public void rotateCW()
    {
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                swap(position,i,j,j,(2-i));
    }

    /**
     * rotates the block 90 degrees counter-clockwise
     */
    public void rotateCCW()
    {
        for (int i=0; i<3; i++)
            for (int j=0;j<3; j++)
                swap(position,i,j,(2-j),i);
    }

    /**
     * checks if this block is empty
     * @return true if all positions are '0'
     */
    public boolean isEmpty()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                if (position[i][j] != '0')
                    return false;
        }
        return true;
    }
}
    public int getPosition(int i, int j)
    {
        return position[i][j];
    }

    public void rotate(String direction)
    {
        if (!isEmpty())
       {
           if (direction.equals("CW"))
                rotateCW();
            else if (direction.equals("CCW"))
                rotateCCW();
            else
                throw new IllegalArgumentException("Please insert valid input.");
       }
    }

    private void swap(int[][] arr, int index1, int index2,int index3, int index4)
    {
        int temp;
        temp = arr[index1][index2];
        arr[index1][index2] = arr[index3][index4];
        arr[index3][index4] = temp;
    }

    public void rotateCW()
    {
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                swap(position,i,j,j,(2-i));
    }

    public void rotateCCW()
    {
        for (int i=0; i<3; i++)
            for (int j=0;j<3; j++)
                swap(position,i,j,(2-j),i);
    }




    /**
     * checks if this block is empty
     * @return true if all positions are '0'
     */
    public boolean isEmpty()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                if (position[i][j] != '0')
                    return false;
        }
        return true;
    }

}
