
public class Drawing {
    private static Drawing instance;
    private Drawing(){}
    public static Drawing getInstance(){
        if (instance == null) {
            instance = new Drawing();
        }
        return instance;
    }
    public void drawShape(Shape shape) {
        if (shape instanceof Square) {
            System.out.println("Drawing a square with color: " + shape.getColor() +
                               " and area: " + shape.calculateArea());
        } else if (shape instanceof Circle) {
            System.out.println("Drawing a circle with color: " + shape.getColor() +
                               " and area: " + shape.calculateArea());
        }
    }
}