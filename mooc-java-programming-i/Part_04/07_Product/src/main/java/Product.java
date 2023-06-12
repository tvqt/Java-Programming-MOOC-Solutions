public class Product {
    private double price;
    private int quantity;
    private String name;
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.quantity = amountAtStart;
    }
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
