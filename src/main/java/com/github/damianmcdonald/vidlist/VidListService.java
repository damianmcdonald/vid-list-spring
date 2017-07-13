package com.github.damianmcdonald.vidlist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VidListService {

    @Value("${api.key}")
    private String API_KEY;

    @Value("${api.url}")
    private String API_URL;

    @Value("${vid.ids}")
    private String[] VID_IDS;

    protected String[] getVidIds() {
        return VID_IDS;
    }

    protected String getVideoDataById(final String id) {
        final String formattedUrl = String.format(API_URL, id, API_KEY);
        return new RestTemplate().getForEntity(formattedUrl, String.class).getBody();
    }

}
