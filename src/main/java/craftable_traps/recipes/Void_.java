package craftable_traps.recipes;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;

public class Void_ {
    public static final Recipe[] recipes = {
            new Recipe(
                    "dungeonvoidtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("voidshard", 10),
                            new Ingredient("dungeonwall", 10)
                    }
            ),
    };
}
