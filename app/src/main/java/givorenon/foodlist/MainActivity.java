package givorenon.foodlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> foodList;
    DataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        dataBase = DataBase.getInstance();
        foodList = dataBase.getFoodList(getApplicationContext());
        ((ListView) findViewById(R.id.listView)).setAdapter(new MyAdapter(this, foodList));
    }

    public void showFoodInfo(View view) {
        Intent intent = new Intent(this, FoodInfoActivity.class);
        int id = Integer.valueOf(view.getTag().toString());
        intent.putExtra("recipe", foodList.get(id).getRecipe());
        startActivity(intent);
    }

    public void addFood(View view) {
        Intent intent = new Intent(this, AddFoodActivity.class);
        startActivity(intent);
    }

}
