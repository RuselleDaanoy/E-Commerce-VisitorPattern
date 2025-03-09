public class OnlineShop {
    public static void main(String[] args) {
        FurnitureItem chair = new FurnitureItem("Chair", 2.5);
        FurnitureItem table = new FurnitureItem("Table", 4.0);
        FurnitureItem sofa = new FurnitureItem("Sofa", 5.0);

        ShippingFee shippingCalculator = new ShippingItem();
        HandlingFee handlingCalculator = new HandlingItem();

        System.out.println(chair.getType() + " Shipping Cost: $" + chair.accept(shippingCalculator, 22));
        System.out.println(chair.getType() + " Handling Cost: $" + chair.accept(handlingCalculator));

        System.out.println(table.getType() + " Shipping Cost: $" + table.accept(shippingCalculator, 20));
        System.out.println(table.getType() + " Handling Cost: $" + table.accept(handlingCalculator));

        System.out.println(sofa.getType() + " Shipping Cost: $" + sofa.accept(shippingCalculator, 13));
        System.out.println(sofa.getType() + " Handling Cost: $" + sofa.accept(handlingCalculator));
    }
}