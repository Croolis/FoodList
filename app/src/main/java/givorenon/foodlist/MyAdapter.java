package givorenon.foodlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by givorenon on 11.01.16.
 */
public class MyAdapter extends BaseAdapter {
    ArrayList<Dish> dishesList;
    LayoutInflater inflater;
    Context context;
    final int NUM_STARS = 5;

    MyAdapter(Context aContext, ArrayList<Dish> aDishesList) {
        dishesList = aDishesList;
        context = aContext;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dishesList.size();
    }

    @Override
    public View getView(int aPosition, View aConvertView, ViewGroup aParent) {
        View resultView = aConvertView;
        if (resultView == null) {
            resultView = (View) inflater.inflate(R.layout.dish_info, null, false);
        }

        ((TextView) resultView.findViewById(R.id.name)).setText(dishesList.get(aPosition).name);
        ((RatingBar) resultView.findViewById(R.id.rating)).setRating(dishesList.get(aPosition).rating);
        ((RatingBar) resultView.findViewById(R.id.rating)).setNumStars(NUM_STARS);
        ((RatingBar) resultView.findViewById(R.id.rating)).setTag(aPosition);

        resultView.setId(aPosition);

        return resultView;
    }

    @Override
    public long getItemId(int anId) {
        return anId;
    }

    @Override
    public Dish getItem(int anId) {
        return dishesList.get(anId);
    }
}
