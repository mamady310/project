import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")) {
        System.out.print("Input: ");
        input = scanner.next().toLowerCase();
        if (input.equals("quit"))
            break;
        System.out.println(input);
  
    } 

}
}


