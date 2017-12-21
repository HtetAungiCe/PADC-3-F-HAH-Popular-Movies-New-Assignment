package hah.htetaunghlaing.popular_movies.data.vo;

import java.util.List;

/**
 * Created by Htet Aung Hlaing on 12/21/2017.
 */

public class MoviesVO {
    private int voteCount;
    private int id;
    private boolean video;
    private double voteAverage;
    private String title;
    private long populatity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private List<Integer> genreIds;
    private boolean backdropPath;
    private String adult;
    private String overView;
    private String releaseDate;

    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public long getPopulatity() {
        return populatity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public boolean isBackdropPath() {
        return backdropPath;
    }

    public String getAdult() {
        return adult;
    }

    public String getOverView() {
        return overView;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
