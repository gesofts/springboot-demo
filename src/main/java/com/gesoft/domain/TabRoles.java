package com.gesoft.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by WCL on 2017/11/2.
 */
@Entity
public class TabRoles {
    @Id@GeneratedValue
    private int roleId;
    private String roleName;
    private String roleMemo;
}
