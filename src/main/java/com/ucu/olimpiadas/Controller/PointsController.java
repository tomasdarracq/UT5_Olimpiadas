package com.ucu.olimpiadas.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/points")
public class PointsController {

    @RequestMapping("/calculate")
    public void calculatePoints() {

    }
}
