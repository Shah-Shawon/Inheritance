import java.util.Scanner;

public class InitializeArrayRunner {
    public static void main(String[] args) {
        final int LENGTH=10;
        int[] array = new int[LENGTH];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<LENGTH;i++){

            array[i]=in.nextInt();
        }
        InitializeArray object = new InitializeArray(array,LENGTH);
        object.printEvenIndexs();
        object.printEvenElements();
        object.printElementsInRverseOrder();
        object.printFirstAndLast();
    }
}
