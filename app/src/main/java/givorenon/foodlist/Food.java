package givorenon.foodlist;

/**
 * Created by givorenon on 11.01.16.
 */
public class Food {
    public String name;
    public float rating;
    public String recipe;

    Food(String aName, float aRating, String aRecipe) {
        name = aName;
        rating = aRating;
        recipe = aRecipe;
    }

    Food(String aName, float aRating) {
        name = aName;
        rating = aRating;
        recipe = "Sorry, there is no recipe";
    }
}