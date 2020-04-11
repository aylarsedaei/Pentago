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
