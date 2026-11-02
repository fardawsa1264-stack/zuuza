//class FoodOrder {
//    private String dishName;
//    private double basePrice;
//    private int quantity;
//
//    public FoodOrder(String dishName, double basePrice, int quantity) {
//        this.dishName = dishName;
//        this.basePrice = basePrice;
//        this.quantity = quantity;
//    }
//
//
//    public String getDishName() {
//        return dishName;
//    }
//
//    public double getBasePrice() {
//        return basePrice;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//
//    public void calculateTotal() {
//        double total = basePrice * quantity;
//
//        System.out.printf(
//                "Order %s: %d x %.2f = %.2f%n",
//                dishName, quantity, basePrice, total
//        );
//    }
//}
//
//
//class DineInOrder extends FoodOrder {
//    private int tableNumber;
//
//    public DineInOrder(String dishName, double basePrice,
//                       int quantity, int tableNumber) {
//        super(dishName, basePrice, quantity);
//        this.tableNumber = tableNumber;
//    }
//
//    @Override
//    public void calculateTotal() {
//        double subtotal = getBasePrice() * getQuantity();
//        double serviceCharge = subtotal * 0.10;
//        double total = subtotal + serviceCharge;
//
//        System.out.printf(
//                "Dine-in %s at table %d: %.2f + service 10%% = %.2f%n",
//                getDishName(), tableNumber, subtotal, total
//        );
//    }
//}
//
//
//class DeliveryOrder extends FoodOrder {
//    private double deliveryFee;
//
//    public DeliveryOrder(String dishName, double basePrice,
//                         int quantity, double deliveryFee) {
//        super(dishName, basePrice, quantity);
//        this.deliveryFee = deliveryFee;
//    }
//
//    @Override
//    public void calculateTotal() {
//        double subtotal = getBasePrice() * getQuantity();
//        double total = subtotal + deliveryFee;
//
//        System.out.printf(
//                "Delivery %s: %.2f + delivery fee %.2f = %.2f%n",
//                getDishName(), subtotal, deliveryFee, total
//        );
//    }
//}
//
//class main {
//    public static void main(String[] args) {
//
//        DineInOrder dineIn = new DineInOrder(
//                "Shah cadey", 1200, 2, 5
//        );
//
//        DeliveryOrder delivery = new DeliveryOrder(
//                "Bi", 2800, 1, 2000
//        );
//
//        dineIn.calculateTotal();
//
//        System.out.println();
//
//        delivery.calculateTotal();
//    }
//}