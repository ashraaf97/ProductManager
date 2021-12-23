package com.example.ProductManager.controller;

import com.example.ProductManager.featurepermissions.FeaturePermissionRequest;
import com.example.ProductManager.featurepermissions.FeaturePermissionStatus;
import com.example.ProductManager.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("feature")
public class FeatureController extends BaseController{

    @GetMapping
    @ResponseBody
    public FeaturePermissionStatus getUserFeaturePermission(@RequestParam String email, @RequestParam String featureName) throws Exception {

        User user = userService.findUserByEmail(email);
        return featurePermissionService.findFeaturePermissionStatusByUserId(user.getId(),featureName);


    }

    @PostMapping
    public void postUserFeaturePermission(@RequestBody FeaturePermissionRequest request) {
        try {
            User user = userService.findUserByEmail(request.getEmail());
            featurePermissionService.updateFeaturePermissions(user.getId(), request.getFeatureName(), request.isEnable());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_MODIFIED);
        }
    }

}
