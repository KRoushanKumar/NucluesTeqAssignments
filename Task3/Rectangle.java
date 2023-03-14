public class Rectangle extends Shape {
    int lenght,width;
    

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return lenght+width;
    }

    @Override
    public double area() {
        return lenght*width;
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 8);
        System.out.println("Area = "+r1.perimeter());
        System.out.println("Area = "+r1.area());
    }
    
}
