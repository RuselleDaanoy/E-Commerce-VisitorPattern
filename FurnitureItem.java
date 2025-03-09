public class FurnitureItem implements Furniture {
    private String type;
    private double dimension;

    public FurnitureItem(String type, double dimension) {
        this.type = type;
        this.dimension = dimension;
    }

    public String getType() {
        return type;
    }

    public double getDimension() {
        return dimension;
    }

    @Override
    public double accept(ShippingFee counter, double distance) {
        return counter.viewShippingFee(this, distance);
    }

    @Override
    public double accept(HandlingFee counter) {
        return counter.viewHandlingFee(this);
    }
}