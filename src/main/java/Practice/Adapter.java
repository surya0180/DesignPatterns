package Practice;

interface Shape {
    void draw();
}

class Rectangle {
    public void drawRectangle() {
        System.out.println("I am drawing rectangle");
    }
}

class RectangleAdapter implements Shape {
    private final Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}

public class Adapter {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        RectangleAdapter adapter = new RectangleAdapter(rect);
        adapter.draw();
    }
}
