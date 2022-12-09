public class Shark extends Duck implements Swimmable{
    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Shark swim so fast");
    }

    @Override
    public String toString() {
        return "Shark{}"+super.toString();
    }
}