package craftable_traps.recipes;

import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;

public class Flame {
    public static final Recipe[] recipes = {
            new Recipe(
                    "stoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("stonewall", 10)
                    }
            ),
            new Recipe(
                    "sandstoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("sandstonewall", 10)
                    }
            ),
            new Recipe(
                    "swampstoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("swampstonewall", 10)
                    }
            ),
            new Recipe(
                    "graniteflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("granitewall", 10)
                    }
            ),
            new Recipe(
                    "dungeonflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("dungeonwall", 10)
                    }
            ),
            new Recipe(
                    "deepstoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("deepstonewall", 10)
                    }
            ),
            new Recipe(
                    "obsidianflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("obsidianwall", 10)
                    }
            ),
            new Recipe(
                    "deepsnowstoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("deepsnowstonewall", 10)
                    }
            ),
            new Recipe(
                    "basaltflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("basaltwall", 10)
                    }
            ),
            new Recipe(
                    "deepswampstoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("deepswampstonewall", 10)
                    }
            ),
            new Recipe(
                    "deepsandstoneflametrap", 1, RecipeTechRegistry.WORKSTATION,
                    new Ingredient[]{
                            new Ingredient("firearrow", 10),
                            new Ingredient("deepsandstonewall", 10)
                    }
            ),
    };
}
