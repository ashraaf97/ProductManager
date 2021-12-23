package com.example.ProductManager.featurepermissions;

import lombok.Data;

@Data
public class FeaturePermissionRequest {

    private String featureName;
    private String email;
    private boolean enable;

}
