import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting input from the given string
        int []numbers = Arrays.stream(inpuString.split(",")).mapToInt(Integer::parseInt).toArray();

        // printing result
        System.out.println(DoubleExists.isDoubleExists(numbers));

        // closing resource
        sc.close();
    }
}