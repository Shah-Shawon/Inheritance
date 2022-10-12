import java.util.Random;

public class Permutation
{
    public static void main(String[] args)
    {
        Random gen = new Random();

        int[] permutation = new int[10];
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int arraySize = array.length;

        for(int i = 0; i < permutation.length; i++)
        {
            int randPos = gen.nextInt(arraySize);

            permutation[i] = array[randPos];

            for(int j = randPos + 1; j < arraySize; j++)
            {
                array[j - 1] = array[j];
            }
            arraySize--;
        }

        printArray(permutation);
    }
    
    public static void printArray(int[] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            if (i > 0)
            {
                System.out.print(" | ");
            }
            System.out.printf("%2d", values[i]);
        }
        System.out.println();
    }
}