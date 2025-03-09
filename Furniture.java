public interface Furniture {
    double accept(ShippingFee counter, double distance);
    double accept(HandlingFee counter);
}