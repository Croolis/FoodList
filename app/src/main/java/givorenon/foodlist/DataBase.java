package givorenon.foodlist;

import java.util.ArrayList;

/**
 * Created by givorenon on 13.01.16.
 */
public class DataBase {
    private static DataBase instance = null;

    private ArrayList<Food> foodList;

    private DataBase() {
        foodList = new ArrayList<Food>();
        foodList.add(new Food("potatoes", 3));
        foodList.add(new Food("tomato", 5));
        foodList.add(new Food("carrot", 2));
        foodList.add(new Food("onemoredish", 0));
    }

    public static DataBase getInstance() {
        if (instance == null)
            instance = new DataBase();
        return instance;
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void addFood(Food food) {
        foodList.add(food);
    }
}
