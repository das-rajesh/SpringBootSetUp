package com.patrickgrimard.controller;

import com.patrickgrimard.Widget;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XTL on 8/14/2014.
 */
@RequestMapping("/api/**")
@RestController
public class WidgetController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {
        return new Widget("green", 10, 7);
    }
}
