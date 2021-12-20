package com.example.ProductManager.feature;

import lombok.Data;

@Data
public class FeaturePermissionRequest {

    private String featureName;
    private String email;
    private boolean enable;

}
