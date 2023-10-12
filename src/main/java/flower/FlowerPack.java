package flower;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = Math.max(newQuantity, 1);
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
