package craftable_traps.recipes;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;

public class Arrow {
    public static final Recipe[] recipes = {
            new Recipe("woodarrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("woodwall", 10)
                    }
            ),
            new Recipe("dryadarrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("dryadwall", 10)
                    }
            ),
            new Recipe(
                    "stonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("stonewall", 10)
                    }
            ),
            new Recipe(
                    "sandstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("sandstonewall", 10)
                    }
            ),
            new Recipe(
                    "swampstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("swampstonewall", 10)
                    }
            ),
            new Recipe(
                    "snowstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("snowstonewall", 10)
                    }
            ),
            new Recipe(
                    "icearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("icewall", 10)
                    }
            ),
            new Recipe(
                    "granitearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("granitewall", 10)
                    }
            ),
            new Recipe(
                    "dungeonarrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("dungeonwall", 10)
                    }
            ),
            new Recipe(
                    "deepstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("deepstonewall", 10)
                    }
            ),
            new Recipe(
                    "obsidianarrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("obsidianwall", 10)
                    }
            ),
            new Recipe(
                    "deepsnowstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("deepsnowstonewall", 10)
                    }
            ),
            new Recipe(
                    "basaltarrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("basaltwall", 10)
                    }
            ),
            new Recipe(
                    "deepswampstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("deepswampstonewall", 10)
                    }
            ),
            new Recipe(
                    "deepsandstonearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("deepsandstonewall", 10)
                    }
            ),
            new Recipe(
                    "spidercastlearrowtrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("stonearrow", 10),
                            new Ingredient("spidercastlewall", 10)
                    }
            ),
    };
}
