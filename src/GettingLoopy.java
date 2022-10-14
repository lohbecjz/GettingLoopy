/**
 * @author lohbecjz@mail.uc.edu
 */

public class GettingLoopy
{
    public static void main(String[] args)
    {
        // A loop that counts up by 1 from 0 to 30
        for(int count = 0; count <= 30; count++)
        {
            System.out.println(count);
        }

        // A loop that counts down by 1 from 30 to 0
        for(int count = 30; count >= 0; count--)
        {
            System.out.println(count);
        }

        // A loop that counts up by 3 from 0 to 18
        for(int count = 0; count <= 18; count = count + 3)
        {
            System.out.println(count);
        }

        // A loop that counts down by 2 from 10 to 0
        for(int count = 10; count >= 0; count = count - 2)
        {
            System.out.println(count);
        }

        // A nested loop that creates this figure (there are no blank lines)
        // *
        // **
        // ***
        // ****
        // *****
        final int ROW = 5;
        final int COL = 5;

        for(int row = 0; row <= ROW; row++)
        {
            // Inner loop goes across the row through the columns
            for(int col = 0; col <= row; col++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }

        // A nested loop that creates this figure (there are no blank lines)
        // *****
        // ****
        // ***
        // **
        // *
        for(int row = 5; row >= 0; row--)
        {
            // Inner loop goes across the row through the columns
            for(int col = 0; col <= row; col++)
            {
                System.out.printf("*");
            }
            System.out.println("");
        }

        // A nested loop that creates this figure (there are no blank lines)
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int row = 0; row <= ROW; row++)
        {
            // Inner loop goes across the row through the columns
            for(int col = 0; col <= COL; col++)
            {
                System.out.printf("*", row * col);
            }
            System.out.println("");
        }



    }
}