package com.glowpix.services.banner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.glowpix.services.banner.service.BannerService;

@SpringBootTest
class BannerApplicationTests {
    
    @Autowired
    private BannerService bannerService;

	@Test
	void contextLoads() {
	}

    @Test
    void testBannerServiceExists() {
        Assertions.assertNotNull(bannerService);
    }
    
    @Test
    void testBannerListCount() {
        Assertions.assertEquals(bannerService.getBanners().size(), 5);
    }

}
