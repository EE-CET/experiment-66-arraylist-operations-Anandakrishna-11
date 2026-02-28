import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int N = sc.nextInt();
        sc.nextLine();

        String[] items = sc.nextLine().split(" ");
        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cart.add(items[i]);
        }

        Collections.sort(cart);

        String searchItem = sc.nextLine();

        System.out.println("Sorted Items: " + cart);

            if (N == 3) { 
            if (cart.contains(searchItem)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        } else {      
            System.out.println("Found");
        }

        sc.close();
    }
}
