package com.example.ProductManager.featurepermissions;

import com.example.ProductManager.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "feature_permissions")
@Table(name = "feature_permissions")
@AllArgsConstructor
public class FeaturePermissions implements Serializable {

    @Id
    private Long id;

    @OneToOne()
    @JoinColumn(name = "user_id",
                foreignKey = @ForeignKey(
                        name = "user_id_fk"
                )  )
    private User user;

    @Column(name = "feature_A")
    private boolean FeatureA;

    @Column(name = "feature_B")
    private boolean FeatureB;

    @Column(name = "feature_C")
    private boolean FeatureC;


    public FeaturePermissions() {

    }
}
