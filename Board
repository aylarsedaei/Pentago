import java.util.Scanner;

public class Player
{
    private int value;
    private String name;

    public Player(int value, String name)
    {
        this.value = value;
        this.name = name;
    }

    public int getValue()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }

    public void Play(Board board)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("It's "+getName()+"'s turn.");
        System.out.println("Insert the block you want to put your pawn in:");
        int block = input.nextInt();
        System.out.println("Insert the position you want to put your pawn in:");
        int positionI = input.nextInt();
        int positionJ = input.nextInt();
        board.getBlock(block-1).setPosition(positionI-1,positionJ-1,value);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        board.updateBoard();
        board.printBoard();

        System.out.println("Which block do you intend to rotate?");
        block = input.nextInt();
        if (!(board.getBlock(block-1).isEmpty()))
        {
            System.out.println("In which direction do you want to rotate this block? (CW/CCW)");
            String direction = input.next();
            board.getBlock(block-1).rotate(direction);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            board.updateBoard();
            board.printBoard();
        }
    }
}
