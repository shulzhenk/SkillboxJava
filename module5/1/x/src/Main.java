// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int min = 2;
        int max = 8;

        for (int i = 1; i <= 7; i++)
        {
            if (i != 1 )
            {
                ++min;
                --max;
                System.out.println();
            }

            for (int j = 1; j <= 7; j++) {
                if (j == min - 1 || j == max - 1)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }

            }
        }
    }
}