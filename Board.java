public class Board
{
    protected Block[][] block;
    protected int[][] board;

    public Board()
    {
        block = new Block[2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                block[i][j] = new Block();
            }
        }
        board = new int[6][6];
        //initialization of the board
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                board[i][j] = 0;
            }
        }
    }

    public Block getBlock(int i, int j)
    {
        return block[i][j];
    }

    //🔴 🔵

    public void updateBoard()
    {
        for (int iBlock=0; iBlock<2; iBlock++)
        {
            for (int jBlock=0; jBlock<2; jBlock++)
            {
                for (int i=0; i<3; i++)
                {
                    for (int j=0; j<3; j++)
                    {
                        board[iBlock*3 + i][jBlock*2 + j] = block[iBlock][jBlock].getPosition(iBlock,jBlock);
                    }
                }
            }
        }
    }

    public void printBoard()
    {
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                switch (board[i][j])
                {
                    case 0:
                        System.out.print(" __ ");
                        break;
                    case 1: //red
                        System.out.print("\uD83D\uDD34 ");
                        break;
                    case 2: //blue
                        System.out.print("\uD83D\uDD35 ");
                        break;
                }

                if (j == 5)
                    System.out.print("\n");

                if (j == 2)
                    System.out.print("|");
                if (j == 5 && i == 2)
                    System.out.print("-------------------------");
            }
            System.out.println(" ");
        }
    }


    public int checkWin(int player)
    {
        for (int i=0; i<2; i++)
        {
            for (int j=0; j<2; j++)
            {
                if (board[i][j] == player
                        && board[i][j] == board[i+1][j]
                        && board[i+1][j] == board[i+2][j]
                        && board[i+2][j] == board[i+3][j]
                        && board[i+3][j] == board[i+4][j])
                    return board[i][j];
                else if (board[i][j] == player
                        && board[i][j] == board[i][j+1]
                        && board[i][j+1] == board[i][j+2]
                        && board[i][j+2] == board[i][j+3]
                        && board[i][j+3] == board[i][j+4])
                    return board[i][j];
            }
        }
        return 0;
    }
}
