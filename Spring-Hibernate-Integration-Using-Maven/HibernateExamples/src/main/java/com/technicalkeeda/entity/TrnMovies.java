package com.technicalkeeda.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/26/13
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "trn_movies", schema = "public", catalog = "technicalkeeda")
@Entity
public class TrnMovies
{
    private long movieId;
    private String director;
    private Long releaseYear;
    private String title;

    @javax.persistence.Column(name = "movie_id")
    @Id
    public long getMovieId()
    {
        return movieId;
    }

    public void setMovieId(long movieId)
    {
        this.movieId = movieId;
    }

    @javax.persistence.Column(name = "director")
    @Basic
    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    @javax.persistence.Column(name = "release_year")
    @Basic
    public Long getReleaseYear()
    {
        return releaseYear;
    }

    public void setReleaseYear(Long releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    @javax.persistence.Column(name = "title")
    @Basic
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        TrnMovies trnMovies = (TrnMovies) o;

        if (movieId != trnMovies.movieId)
        {
            return false;
        }
        if (director != null ? !director.equals(trnMovies.director) : trnMovies.director != null)
        {
            return false;
        }
        if (releaseYear != null ? !releaseYear.equals(trnMovies.releaseYear) : trnMovies.releaseYear != null)
        {
            return false;
        }
        if (title != null ? !title.equals(trnMovies.title) : trnMovies.title != null)
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = (int) (movieId ^ (movieId >>> 32));
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (releaseYear != null ? releaseYear.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
