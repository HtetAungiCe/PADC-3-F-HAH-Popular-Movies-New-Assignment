package hah.htetaunghlaing.popular_movies.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import hah.htetaunghlaing.popular_movies.R;
import hah.htetaunghlaing.popular_movies.delegates.MoviesItemDelegates;

/**
 * Created by Htet Aung Hlaing on 12/7/2017.
 */

public class MoviesViewHolder extends RecyclerView.ViewHolder {
    private MoviesItemDelegates nMoviesItemDelegates;


    public MoviesViewHolder(View itemView, MoviesItemDelegates moviesItemDelegates) {

        super(itemView);
        ButterKnife.bind(this, itemView);
        nMoviesItemDelegates=moviesItemDelegates;

    }

    @OnClick(R.id.cv_movies_item)
    public void onTapMoviesItem(View view) {

       // Toast.makeText(view.getContext(),"You click items",Toast.LENGTH_SHORT).show();
        nMoviesItemDelegates.onTapMoviesItem();
    }
}

