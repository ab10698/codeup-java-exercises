package shapes;

public class Square extends Rectangle {
//    private int side;

    public Square(int side){
        super(side, side);
//        this.side = side;
    }

    public double getArea() {
        return (int) Math.pow(this.length,2);
    }
}
