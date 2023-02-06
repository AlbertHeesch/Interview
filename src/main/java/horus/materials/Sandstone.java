package horus.materials;

import horus.Block;

public class Sandstone implements Block {
    private final String color;
    private final String material;

    public Sandstone(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
