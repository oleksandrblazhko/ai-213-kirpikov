package com.uedge.lab9.controller;

import com.uedge.lab9.model.SafeWater;
import com.uedge.lab9.service.SafeWaterService;
import com.uedge.lab9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WaterController {

    @Autowired
    private SafeWaterService safeWaterService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String login() {
        return "main-page";
    }


    @PostMapping("/water-info")
    public String waterStateInfo(@RequestParam String username, @RequestParam String location, Model model) {

        SafeWater safeWater = new SafeWater();
        String waterInfo = safeWater.checkWater(username, location);
        model.addAttribute("waterInfo", waterInfo);

        return "water-info";
    }

}