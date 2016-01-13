package givorenon.foodlist;

import java.util.ArrayList;

/**
 * Created by givorenon on 13.01.16.
 */
public class DataBase {
    private static DataBase instance = null;

    private ArrayList<Food> foodList;

    private DataBase() {
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
