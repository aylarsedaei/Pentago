import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //creates a board for playing
        Board pentago = new Board();
        //creating two players
        Player red = new Player (1, "Red");
        Player blue = new Player(2, "Blue");

        //the infinite loop of the game, it ends in case of winning or draw
        while (true)
        {
            pentago.printBoard();
            //Red's Turn
            red.Play(pentago);
            if (pentago.checkWin(red.getValue()) == red.getValue()
                && pentago.checkWin(blue.getValue()) != blue.getValue())
            {
                System.out.println("Red wins!");
                break;
            }

            //Blue's Turn
            blue.Play(pentago);
            pentago.checkWin(blue.getValue());
            if (pentago.checkWin(blue.getValue()) == blue.getValue()
                && pentago.checkWin(red.getValue()) != red.getValue())
            {
                System.out.println("Blue wins!");
                break;
            }

            if (pentago.checkWin(blue.getValue())!=blue.getValue()
              && pentago.checkWin(red.getValue()) != red.getValue())
            {
                System.out.println("It's a draw");
                break;
            }
        }
    }


}
