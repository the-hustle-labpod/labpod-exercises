import java.util.Scanner;

public class Product {
    private String name;
    private String brand;

    public Product(String name, String brand, double price, boolean isUseful) {
        this.name = name;
        this.brand = brand;

        this.price = price;
        this.isUseful = isUseful;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }





    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isUseful() {
        return isUseful;
    }

    public void setUseful(boolean useful) {
        isUseful = useful;
    }


    private double price;
    private boolean isUseful;
public static String isExpensive() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("what is the price of product? ");
    double userInput = scanner.nextDouble();
    if (userInput > 100) {

    }
    return "it is expensive";
}

    public static void main(String[] args) {
        Product product = new Product("bag", "kate-spade", 400, true);
        System.out.println(product.isExpensive());

    }
}
