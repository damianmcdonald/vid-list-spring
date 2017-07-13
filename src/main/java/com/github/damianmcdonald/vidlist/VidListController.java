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

    @RequestMapping(value = "/vidids", method = RequestMethod.GET)
    public @ResponseBody
    String[] geVidIds() throws Exception {
        return vidListService.getVidIds();
    }

    @RequestMapping(value = "/video/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String getVideoById(@PathVariable final String id) throws Exception {
        return vidListService.getVideoDataById(id);
    }

}
