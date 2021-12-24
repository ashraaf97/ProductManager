package com.example.ProductManager.service;

import com.example.ProductManager.featurepermissions.FeaturePermissionStatus;
import com.example.ProductManager.featurepermissions.FeaturePermissions;
import com.example.ProductManager.repositories.FeaturePermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeaturePermissionServiceImpl implements FeaturePermissionService{

    private final FeaturePermissionsRepository featurePermissionsRepository;

    @Autowired
    public FeaturePermissionServiceImpl(FeaturePermissionsRepository featurePermissionsRepository) {
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
                break;
            case "feature_b":
                featurePermissions.setFeatureB(status);
                break;
            case "feature_c":
                featurePermissions.setFeatureC(status);
                break;
            default:
                throw new Exception("Feature not found");
        }

        return featurePermissionsRepository.save(featurePermissions);
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
                break;
            case "feature_b":
                featurePermissionStatus.setCanAccess(featurePermissions.isFeatureB());
                break;
            case "feature_c":
                featurePermissionStatus.setCanAccess(featurePermissions.isFeatureC());
                break;
            default:
                throw new Exception("Feature not found");
        }
        return featurePermissionStatus;
    }

}
