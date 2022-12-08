public class Duck implements Swimmable{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Duck swim with help of legs");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
