import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Tesla","df","dfd"};
    String[] cars2 = {"Volvo", "BMW", "Tesla"};
    
    // Returns 0 because the arrays are equal
    System.out.println(Arrays.compare(cars, cars2)); 

    //
    //     String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
    // Arrays.sort(cars);
    // for (String i : cars) {
    //   System.out.println(i);
    // }
    }
}
