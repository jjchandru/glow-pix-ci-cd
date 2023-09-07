package com.glowpix.services.banner.model;

import java.util.Objects;

public class Banner {
    private int id;
    private int sequence;
    private Movie movie;

    public Banner() {
    }

    public Banner(int id, int sequence, Movie movie) {
        super();
        this.id = id;
        this.sequence = sequence;
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
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
        Banner other = (Banner) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return String.format("Banner [id=%s, sequence=%s, movie=%s]", id, sequence, movie);
    }

}
