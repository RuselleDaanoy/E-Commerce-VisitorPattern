public class HandlingItem implements HandlingFee {
    @Override
    public double viewHandlingFee(FurnitureItem furniture) {
        double handlingCharge = 10.0;
        return handlingCharge * furniture.getDimension();
    }
}