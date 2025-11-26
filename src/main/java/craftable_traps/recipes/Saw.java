package craftable_traps.recipes;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;

public class Saw {
    public static final Recipe[] recipes = {
            new Recipe("woodsawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("woodwall", 10)
                    }
            ),
            new Recipe(
                    "stonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("stonewall", 10)
                    }
            ),
            new Recipe(
                    "sandstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("sandstonewall", 10)
                    }
            ),
            new Recipe(
                    "swampstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("swampstonewall", 10)
                    }
            ),
            new Recipe(
                    "snowstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("snowstonewall", 10)
                    }
            ),
            new Recipe(
                    "icesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("icewall", 10)
                    }
            ),
            new Recipe(
                    "granitesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("granitewall", 10)
                    }
            ),
            new Recipe(
                    "dungeonsawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("dungeonwall", 10)
                    }
            ),
            new Recipe(
                    "deepstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("deepstonewall", 10)
                    }
            ),
            new Recipe(
                    "obsidiansawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("obsidianwall", 10)
                    }
            ),
            new Recipe(
                    "deepsnowstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("deepsnowstonewall", 10)
                    }
            ),
            new Recipe(
                    "basaltsawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("basaltwall", 10)
                    }
            ),
            new Recipe(
                    "deepswampstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("deepswampstonewall", 10)
                    }
            ),
            new Recipe(
                    "deepsandstonesawtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("ironbar", 10),
                            new Ingredient("deepsandstonewall", 10)
                    }
            ),
            new Recipe(
                    "traptrack", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("minecarttrack", 1)
                    }
            ),
    };
}
