package com.example.ProductManager.featurepermissions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeaturePermissionStatus {
    private boolean canAccess;

    public FeaturePermissionStatus() {

    }
}
