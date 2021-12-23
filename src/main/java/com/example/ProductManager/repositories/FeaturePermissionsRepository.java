package com.example.ProductManager.repositories;

import com.example.ProductManager.featurepermissions.FeaturePermissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeaturePermissionsRepository extends JpaRepository<FeaturePermissions,Long> {

    FeaturePermissions findFeaturePermissionsByUser_Id(Long id);

}
