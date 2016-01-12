package givorenon.foodlist;

/**
 * Created by givorenon on 11.01.16.
 */
public class Dish {
    public String name;
    public float rating;

    Dish(String aName, float aRating) {
        name = aName;
        rating = aRating;
    }

    Dish(String aName, int aRating) {
        name = aName;
        rating = new Float(aRating);
    }
}