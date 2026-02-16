public class Order {
    private int id;
    private int amount;
    public Order(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
    public String toString() {
        return "Order: " + id + ", amount: " + amount;
    }
}
