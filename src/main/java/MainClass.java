import horus.Block;
import horus.Wall;
import horus.materials.Granite;
import horus.materials.Marble;
import horus.materials.Sandstone;

import java.util.List;

public class MainClass {
    public static void main(String args[]) {
        Wall wall = new Wall(List.of(new Granite("Grey", "Granite"),
                new Marble("White", "Marble"),
                new Marble("Pink", "Marble"),
                new Sandstone("Yellow", "Sandstone")));

        System.out.println(wall.count());

        wall.findBlockByColor("White").ifPresent(value -> System.out.println(value.getMaterial()));
        wall.findBlockByColor("Yellow").ifPresent(value -> System.out.println(value.getMaterial()));

        List<Block> blocks = wall.findBlocksByMaterial("Marble");
        System.out.println(blocks.get(0).getMaterial());
        System.out.println(blocks.get(1).getMaterial());
    }
}
