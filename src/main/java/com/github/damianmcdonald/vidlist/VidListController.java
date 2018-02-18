package com.github.damianmcdonald.vidlist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VidListController {

    @Autowired
    VidListService vidListService;

    @RequestMapping(value = "/video/{category}", method = RequestMethod.GET)
    public @ResponseBody
    String getVideoByCategory(@PathVariable final String category) throws Exception {
        return vidListService.getVideoData(category);
    }

}
