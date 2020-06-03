package com.foryou.tax.invoiceapi.pojo.user;
import net.sf.json.JSONObject;

import java.io.Serializable;

public class UserRolePermissionPojo implements Serializable{

    private static final long serialVersionUID = 1L;
    /**{@link UserRolePojo.id}*/
    private Long rid;
    /**{@link UserPermissionPojo.id}*/
    private Long pid;

    public UserRolePermissionPojo() {
    }
    public UserRolePermissionPojo(Long rid, Long pid) {
        this.rid = rid;
        this.pid = pid;
    }
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
    public String toString(){
        return JSONObject.fromObject(this).toString();
    }
}
