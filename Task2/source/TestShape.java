public class TestShape {
    public static void main(String[] args) {

        Shape a = new Shape("black", false);
        Circle b = new Circle(2.0, "blue", true);
        Rectangle c = new Rectangle(3.0, 4.0, "yellow", true);
        Square d = new Square(5.0, "green", true);

        System.out.println(a);
        System.out.println(b + " area = " + b.getArea());
        System.out.println(c + " area = " + c.getArea());
        System.out.println(d + " area = " + d.getArea());

        System.out.println();

        System.out.println("=== Test Square Setter ===");

        System.out.println("Awal         : " + d);

        d.setWidth(8.0);
        System.out.println("setWidth(8)  : " + d);

        d.setLength(3.0);
        System.out.println("setLength(3) : " + d);

        System.out.println("Area         : " + d.getArea());
        System.out.println("Perimeter    : " + d.getPerimeter());
    }
}