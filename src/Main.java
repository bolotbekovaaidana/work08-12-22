import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Duck swimmable = new Duck("Piter");
        Duck swimmable1 = new Duck("Riter");
        Duck swimmable2 = new Duck("Kiter");
        Duck swimmable3 = new Duck("Titer");
        Duck swimmable4 = new Duck("Diter");
        Swimmable[] a = {swimmable1, swimmable, swimmable2, swimmable3, swimmable4};
        System.out.println(Arrays.deepToString(a));
        swimmable.swim();
        Shark s = new Shark("Nino");
        Shark s1 = new Shark("Pino");
        Shark s2 = new Shark("Rino");
        Shark s3 = new Shark("Tino");
        Shark s4 = new Shark("Mino");
        Swimmable[] b = {s, s1, s2, s3, s4};
        System.out.println(Arrays.deepToString(b));
         s.swim();
        Turtle w = new Turtle("Turt");
        Turtle w1 = new Turtle("Rurt");
        Turtle w2 = new Turtle("Wurt");
        Turtle w3 = new Turtle("Purt");
        Turtle w4 = new Turtle("Burt");
        Swimmable[] c = {w, w1, w2, w3, w4};
        System.out.println(Arrays.deepToString(c));
        w.swim();
    }
}