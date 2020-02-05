package Parent;

public class Child {

    int numberOfTeeth;
    public Child(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }
    public void report() {
        System.out.println("I have " + this.numberOfTeeth + " teefs.");
    }

}
