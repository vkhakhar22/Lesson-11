import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        System.out.println("-Lambda-");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.forEach((x) -> {
            System.out.println(x);
        });
        numbers.forEach(n -> {
            if (n == 40)
                System.out.println("Match found");
        });
    }

}
