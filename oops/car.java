public class Car {

    int price;
    String color;
    String brand;
    int id;

    // Constructor
    Car(int price, String color, String brand, int id) {
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.id = id;
    }

    // Method
    void display() {
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {

        Car c1 = new Car(101, "Red", "Audi A7", 1);

        c1.display();
    }
}