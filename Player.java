import java.util.Scanner;

public class Player
{
    //integer value to save in the positions arrays
    private int value;
    //name of player
    private String name;

    /**
     * constructor
     * @param value
     * @param name
     */
    public Player(int value, String name)
    {
        this.value = value;
        this.name = name;
    }

    /**
     * value getter method
     * @return integer value of
     */
    public int getValue()
    {
        return value;
    }

    /**
     * name getter method
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     * This method is used to run the play for each player.
     * It gets proper input and updates the map after each move.
     * @param board the board in wich our player is playing
     */
    public void Play(Board board)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("It's "+getName()+"'s turn.");
        System.out.println("Insert the block you want to put your pawn in:");
        int blockI = input.nextInt();
        int blockJ = input.nextInt();
        System.out.println("Insert the position you want to put your pawn in:");
        int positionI = input.nextInt();
        int positionJ = input.nextInt();
        board.getBlock(blockI-1, blockJ-1).setPosition(positionI-1,positionJ-1,getValue());
        /*System.out.print("\033[H\033[2J");
        System.out.flush();*/
        board.updateBoard();
        board.printBoard();

        System.out.println("Which block do you intend to rotate?");
        blockI = input.nextInt();
        blockJ = input.nextInt();
        if (!(board.getBlock(blockI-1, blockJ-1).isEmpty()))
        {
            System.out.println("In which direction do you want to rotate this block? (CW/CCW)");
            String direction = input.next();
            board.getBlock(blockI-1, blockJ-1).rotate(direction);
            /*System.out.print("\033[H\033[2J");
            System.out.flush();*/
            board.updateBoard();
            board.printBoard();
        }
    }
}
