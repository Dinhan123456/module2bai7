import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ComparableCircle[] circles = new ComparableCircle[3];
       circles[0] = new ComparableCircle(3.6);
       circles[1] = new ComparableCircle();
       circles[2] = new ComparableCircle(3.5, "indigo", false);
        System.out.println("pre-sort:");
       for (ComparableCircle circle : circles) {
           System.out.println(circle);
       }
       Arrays.sort(circles);
       System.out.println("After-sorted:");
       for (ComparableCircle circle : circles) {
           System.out.println(circle);
       }
    }
}