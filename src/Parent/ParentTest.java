package Parent;

public class ParentTest {
    public static void main(String[] args){
        Child child1 = new Child(32);
        child1.report();

        Grandchild child2 = new Grandchild();
        child2.report();
    }
}
