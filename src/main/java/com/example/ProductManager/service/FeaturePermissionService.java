package com.example.ProductManager.service;

import com.example.ProductManager.featurepermissions.FeaturePermissionStatus;
import com.example.ProductManager.featurepermissions.FeaturePermissions;
import com.example.ProductManager.repositories.FeaturePermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeaturePermissionService {

    private final FeaturePermissionsRepository featurePermissionsRepository;

    @Autowired
    public FeaturePermissionService(FeaturePermissionsRepository featurePermissionsRepository) {
        this.featurePermissionsRepository = featurePermissionsRepository;
    }

    public FeaturePermissions findAllFeaturePermissionsByUserId(Long userId){
        return featurePermissionsRepository.findFeaturePermissionsByUser_Id(userId);
    }

    public FeaturePermissions updateFeaturePermissions(Long userId, String featureName, Boolean status) throws Exception {

        FeaturePermissions featurePermissions = featurePermissionsRepository.findFeaturePermissionsByUser_Id(userId);

        switch(featureName) {
            case "feature_a":
                featurePermissions.setFeatureA(status);
                return featurePermissionsRepository.save(featurePermissions);
            case "feature_b":
                featurePermissions.setFeatureB(status);
                return featurePermissionsRepository.save(featurePermissions);
            case "feature_c":
                featurePermissions.setFeatureC(status);
                return featurePermissionsRepository.save(featurePermissions);
            default:
                throw new Exception("Feature not found");
        }

    }

    public FeaturePermissions saveFeaturePermissions(FeaturePermissions featurePermissions){
        return featurePermissionsRepository.save(featurePermissions);
    }

    public FeaturePermissionStatus findFeaturePermissionStatusByUserId(Long userId, String featureName) throws Exception {
        FeaturePermissionStatus featurePermissionStatus = new FeaturePermissionStatus();

        FeaturePermissions featurePermissions = featurePermissionsRepository.findFeaturePermissionsByUser_Id(userId);

        switch(featureName) {
            case "feature_a":
                featurePermissionStatus.setCanAccess(featurePermissions.isFeatureA());
                return featurePermissionStatus;
            case "feature_b":
                featurePermissionStatus.setCanAccess(featurePermissions.isFeatureB());
                return featurePermissionStatus;
            case "feature_c":
                featurePermissionStatus.setCanAccess(featurePermissions.isFeatureC());
                return featurePermissionStatus;
            default:
                throw new Exception("Feature not found");
        }

    }

}
