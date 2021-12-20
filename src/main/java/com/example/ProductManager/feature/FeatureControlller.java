package com.example.ProductManager.feature;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/feature")
public class FeatureControlller {


    @GetMapping
    @ResponseBody
    public FeaturePermissionStatus getUserFeaturePermission(@RequestParam String email, @RequestParam String featureName) {




        return null;
    }

}
