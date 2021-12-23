package com.example.ProductManager.user;

//import com.example.ProductManager.featurepermissions.FeaturePermissions;
import com.example.ProductManager.featurepermissions.FeaturePermissions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long id;
    private String email;
    private String password;

    @OneToOne(cascade=CascadeType.PERSIST, mappedBy = "user")
    private FeaturePermissions featurePermissions;


    public User() {

    }
}


