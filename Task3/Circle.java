public class Circle extends Shape {
    int radius;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    public double perimeter() {
        return (3.14*2*radius);
    }

    public double area() {
        return (3.14*radius*radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area = "+c1.perimeter());
        System.out.println("Area = "+c1.area());
    }
    
}
