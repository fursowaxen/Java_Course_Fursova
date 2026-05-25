// Пример принципа подстановки Лисков

// Общий интерфейс для всех фигур
interface Shape {
    int getArea();
}

// Прямоугольник
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public int getArea() {
        return width * height;
    }
}

// Квадрат
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) { this.side = side; }

    @Override
    public int getArea() {
        return side * side;
    }
}


public class Main {
    public static void main(String[] args) {
        // Создаем фигуры
        Rectangle rectangle = new Rectangle(114, 3);
        Square square = new Square(4);

        // Вычисляем площади
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
    }
}
