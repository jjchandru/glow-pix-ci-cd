package com.glowpix.services.banner.model;

import java.util.Objects;

public class Movie {
    private int id;
    private String title;
    private String filmRating;
    private float viewerRating;
    private int year;
    private int playDurationInMinutes;

    public Movie() {
    }

    public Movie(int id, String title, String filmRating, float viewerRating, int year, int playDurationInMinutes) {
        super();
        this.id = id;
        this.title = title;
        this.filmRating = filmRating;
        this.viewerRating = viewerRating;
        this.year = year;
        this.playDurationInMinutes = playDurationInMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    public float getViewerRating() {
        return viewerRating;
    }

    public void setViewerRating(float viewerRating) {
        this.viewerRating = viewerRating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPlayDurationInMinutes() {
        return playDurationInMinutes;
    }

    public void setPlayDurationInMinutes(int playDurationInMinutes) {
        this.playDurationInMinutes = playDurationInMinutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return String.format(
                "Movie [id=%s, title=%s, filmRating=%s, viewerRating=%s, year=%s, playDurationInMinutes=%s]",
                id, title, filmRating, viewerRating, year, playDurationInMinutes);
    }

}
