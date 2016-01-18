package givorenon.foodlist;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by givorenon on 11.01.16.
 */
public class Food extends RealmObject {
    @PrimaryKey
    private String id;
    private String name;
    private float rating;
    private String recipe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}