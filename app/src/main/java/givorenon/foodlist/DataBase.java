package givorenon.foodlist;

import android.content.Context;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by givorenon on 13.01.16.
 */
public class DataBase {
    private static DataBase instance = null;

    private ArrayList<Food> foodList;

    private DataBase() {
        foodList = new ArrayList<>();
    }

    public static DataBase getInstance() {
        if (instance == null)
            instance = new DataBase();
        return instance;
    }

    public ArrayList<Food> getFoodList(Context context) {
        Realm realm = Realm.getInstance(context);
        RealmResults<Food> foodQueryResult = realm.where(Food.class)
                .findAll();
        ArrayList<Food> foodList = new ArrayList<>();
        for (Food food : foodQueryResult) {
            foodList.add(food);
        }

        return foodList;
    }

    public void addFood(Food food, Context context) {
        Realm realm = Realm.getInstance(context);

        realm.beginTransaction();
        realm.copyToRealm(food);
        realm.commitTransaction();
    }
}
