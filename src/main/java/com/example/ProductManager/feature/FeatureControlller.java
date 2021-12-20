package com.example.ProductManager.feature;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/feature")
public class FeatureControlller {


    @GetMapping
    public List<FeaturePermissionStatus> getAllUserFeaturePermissions(){

        List<FeaturePermissionStatus> fakePermissions = Arrays.asList(
                new FeaturePermissionStatus(true),
                new FeaturePermissionStatus(false)
        );

        return fakePermissions;
    }

//    @GetMapping
//    @ResponseBody
//    public FeaturePermissionStatus getUserFeaturePermission(@RequestParam String email, @RequestParam String featureName) {
//
//
//
//
//        return null;
//    }

    @PostMapping
    public void  postUserFeaturePermission(){


    }

}
