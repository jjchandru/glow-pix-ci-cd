package com.glowpix.services.banner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glowpix.services.banner.model.Banner;
import com.glowpix.services.banner.service.BannerService;

@RestController
@RequestMapping("/banners")
public class BannerController {
    
    @Autowired
    private BannerService bannerService;

    @GetMapping
    public List<Banner> getBanners() {
        return bannerService.getBanners();
    }
}
