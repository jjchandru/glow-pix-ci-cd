package com.glowpix.services.banner.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.glowpix.services.banner.model.Banner;
import com.glowpix.services.banner.model.Movie;

@Service
public class BannerService {
    private static final ArrayList<Banner> BANNERS = new ArrayList<>();
    private static final ArrayList<Movie> MOVIES = new ArrayList<>();
    
    public BannerService() {
        MOVIES.add(new Movie(1, "The Shawshank Redemption", "R", 9.3f, 1994, 142));
        MOVIES.add(new Movie(2, "The God Father", "R", 9.2f, 1972, 175));
        MOVIES.add(new Movie(3, "The Dark Knight", "PG-13", 9.0f, 2008, 152));
        MOVIES.add(new Movie(4, "The God Father Part II", "R", 9.0f, 2008, 152));
        MOVIES.add(new Movie(5, "12 Angry Men", "R", 9.0f, 1957, 96));
        
        BANNERS.add(new Banner(1, 1, MOVIES.get(0)));
        BANNERS.add(new Banner(2, 2, MOVIES.get(1)));
        BANNERS.add(new Banner(3, 3, MOVIES.get(2)));
        BANNERS.add(new Banner(4, 4, MOVIES.get(3)));
        BANNERS.add(new Banner(5, 5, MOVIES.get(4)));
    }
    
    public List<Banner> getBanners() {
        return BANNERS;
    }
}
