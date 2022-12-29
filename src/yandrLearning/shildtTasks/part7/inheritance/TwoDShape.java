package yandrLearning.shildtTasks.part7.inheritance;

public class TwoDShape {
    private double width;
    private double height;
    public TwoDShape() {
        width = height = 0;
    }

    public TwoDShape(double side) {
        width = height = side;
    }

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("width = " + width + ", height = " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    public Triangle() {
        super();
        style = "none";
    }

    public Triangle(double side) {
        super(side);
        style = "blank";
    }

    public Triangle(double height, double width, String style) {
        super(width, height);
        this.style = style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println(style + " triangle");
    }
}

class Rectangle extends TwoDShape {
    public Rectangle() {
        super(0,0);
    }

    public Rectangle(double width, double height) {
        super(width, height);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4);
        Triangle triangle1 = new Triangle(8,12,"contour");
        Triangle triangle2 = new Triangle();
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();

        rectangle.setHeight(6);
        rectangle.setWidth(6);

        rectangle1.setHeight(6);
        rectangle1.setWidth(8);

        triangle.showDim();
        System.out.println("area = " + triangle.area());
        triangle.showStyle();

        triangle1.showDim();
        System.out.println("area = " + triangle1.area());
        triangle1.showStyle();

        triangle2.showDim();
        System.out.println("area = " + triangle2.area());
        triangle2.showStyle();

        rectangle.showDim();
        System.out.println("is Square = " + rectangle.isSquare());
        System.out.println("area = " + rectangle.area());

        rectangle1.showDim();
        System.out.println("is Square = " + rectangle1.isSquare());
        System.out.println("area = " + rectangle1.area());

    }
}
