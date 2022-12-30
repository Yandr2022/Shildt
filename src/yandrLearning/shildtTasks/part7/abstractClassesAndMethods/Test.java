package yandrLearning.shildtTasks.part7.abstractClassesAndMethods;

abstract class TwoDShape {
    private double width;
    private double height;
    final private String name;

    public TwoDShape() {
        name = "figure";
        width = height = 0;
    }

    public TwoDShape(double side, String name) {
        width = height = side;
        this.name = name;
    }

    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public TwoDShape(TwoDShape twoDShape) {
        width = twoDShape.width;
        height = twoDShape.height;
        name = twoDShape.name;
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

    public String getName() {
        return name;
    }

    void showDim() {
        System.out.println("width = " + width + ", height = " + height);
    }

    abstract double area();
}

class Triangle extends TwoDShape {
    String style;

    public Triangle() {
        super();
        style = "none";
    }

    public Triangle(double side) {
        super(side, "Triangle");
        style = "blank";
    }

    public Triangle(double height, double width, String style) {
        super(width, height, "Triangle");
        this.style = style;
    }

    public Triangle(Triangle triangle) {
        super(triangle);
        style = triangle.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println(style + getName());
    }
}

class Rectangle extends TwoDShape {
    public Rectangle() {
        super();
    }

    public Rectangle(double side) {
        super(side, "Rectangle");
    }

    public Rectangle(double width, double height) {
        super(width, height, "Rectangle");
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
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

        TwoDShape[] shapes = {new Triangle(12, 8, "contour"), new Rectangle(10)
                , new Rectangle(10, 4), new Triangle(7),new Triangle()};

        for (TwoDShape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            shape.showDim();
            System.out.println("area = " + shape.area() + "\n");
        }

    }
}
