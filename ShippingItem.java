public class ShippingItem implements ShippingFee {
    @Override
    public double viewShippingFee(FurnitureItem furniture, double distance) {
        double baseRate = 5.0;
        return baseRate * furniture.getDimension() * distance;
    }
}