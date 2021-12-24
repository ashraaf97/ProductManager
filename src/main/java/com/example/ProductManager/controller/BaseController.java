package com.example.ProductManager.controller;

import com.example.ProductManager.service.FeaturePermissionService;
import com.example.ProductManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController {

    @Autowired
    UserService userService;

    @Autowired
    FeaturePermissionService featurePermissionService;

}
