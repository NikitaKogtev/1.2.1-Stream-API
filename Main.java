import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Set<Integer> intList1 = new TreeSet<>();

        for (int number : intList) {
            if ((number > 0) && (number % 2 == 0)) {
                intList1.add(number);
            }
        }
        System.out.println(intList1);
    }
}
