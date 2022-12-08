public class Turtle extends Duck implements Swimmable{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Turtle swim so slowly");
    }

    @Override
    public String toString() {
        return "Turtle{}"+super.toString();
    }
}
