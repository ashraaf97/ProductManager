package com.example.ProductManager.service;

import com.example.ProductManager.featurepermissions.FeaturePermissionStatus;
import com.example.ProductManager.featurepermissions.FeaturePermissions;

public interface FeaturePermissionService {

    public FeaturePermissions findAllFeaturePermissionsByUserId(Long userId);

    public FeaturePermissions updateFeaturePermissions(Long userId, String featureName, Boolean status) throws Exception;

    public FeaturePermissions saveFeaturePermissions(FeaturePermissions featurePermissions);

    public FeaturePermissionStatus findFeaturePermissionStatusByUserId(Long userId, String featureName) throws Exception;

}
