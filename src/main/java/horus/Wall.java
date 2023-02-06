package horus;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        List<Block> blocksByColor = blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .collect(Collectors.toList());

        return Optional.ofNullable(blocksByColor.get(0));
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> material.equals(block.getMaterial()))
                .collect(Collectors.toList());
    }
}
