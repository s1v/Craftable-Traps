package craftable_traps;

import craftable_traps.recipes.*;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.inventory.recipe.Recipes;

import java.util.Arrays;

@ModEntry
public class CraftableTraps {
    public void postInit() {
        Arrays.stream(Arrow.recipes).forEach(Recipes::registerModRecipe);
        Arrays.stream(Flame.recipes).forEach(Recipes::registerModRecipe);
        Arrays.stream(Void_.recipes).forEach(Recipes::registerModRecipe);
        Arrays.stream(Saw.recipes).forEach(Recipes::registerModRecipe);
    }
}
