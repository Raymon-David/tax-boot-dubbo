package com.foryou.tax.invoiceapi.pojo.user;


import com.foryou.tax.invoiceapi.pojo.user.UserPojo;

import java.io.Serializable;

/**
 * 用户角色分配 查询列表BO
 *
 */
public class UserRoleAllocationPojo extends UserPojo implements Serializable{

    private static final long serialVersionUID = 1L;

    //Role Name列转行，以,分割
    private String roleNames;
    //Role Id列转行，以‘,’分割
    private String roleIds;
    public String getRoleNames() {
        return roleNames;
    }
    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }
    public String getRoleIds() {
        return roleIds;
    }
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

}
