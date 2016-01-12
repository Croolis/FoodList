package givorenon.foodlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected ArrayList<Dish> getMockDishesList() {
        ArrayList<Dish> dishesList = new ArrayList<Dish>();
        dishesList.add(new Dish("potatoes", 3));
        dishesList.add(new Dish("tomato", 5));
        dishesList.add(new Dish("carrot", 2));
        dishesList.add(new Dish("onemoredish", 0));
        return dishesList;
    }

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

        ((ListView) findViewById(R.id.listView)).setAdapter(new MyAdapter(this, getMockDishesList()));
    }

    public void showFoodInfo(View view) {
        Intent intent = new Intent(this, FoodInfoActivity.class);
        startActivity(intent);
    }

    public void setText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);
        Editable editable = editText.getText();
        textView.setText(editable);
        addRow(editable.toString());
    }

    public void changeClickable(View view) {
        Button button = (Button) findViewById(R.id.button);
        button.setClickable(!button.isClickable());
    }

    private void addRow(String text) {
        // TODO: new rows
    }

}
