package givorenon.foodlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class AddFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void addFood(View view) {
        String name = ((TextView) findViewById(R.id.foodName)).getText().toString();
        String recipe = ((TextView) findViewById(R.id.foodRecipe)).getText().toString();
        float rating = ((RatingBar) findViewById(R.id.foodRating)).getRating();
        Food newFood = new Food();
        newFood.setId(name);
        newFood.setRating(rating);
        newFood.setName(name);
        newFood.setRecipe(recipe);

        DataBase dataBase = DataBase.getInstance();
        dataBase.addFood(newFood, getApplicationContext());

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
