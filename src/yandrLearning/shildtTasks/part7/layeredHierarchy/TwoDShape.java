package yandrLearning.shildtTasks.part7.layeredHierarchy;

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
    private String style;

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
class ColorTriangle extends Triangle{
    private  String color;

    public ColorTriangle(double height, double width, String style, String color) {
        super(height, width, style);
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    void showColor() {
        System.out.println("color: " + color);
    }
}


class Test {
    public static void main(String[] args) {
        ColorTriangle[] triangles ={ new ColorTriangle(6,4,"shaded","red")
                ,new ColorTriangle(8,12,"contour","black")};
        for (ColorTriangle triangle:triangles) {
            triangle.showStyle();
            triangle.showColor();
            triangle.showDim();
            System.out.println("area = " + triangle.area()+"\n");
        }

    }
}
