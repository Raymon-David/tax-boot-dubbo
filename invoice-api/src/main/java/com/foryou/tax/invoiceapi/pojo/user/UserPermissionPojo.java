package com.foryou.tax.invoiceapi.pojo.user;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

public class UserPermissionPojo implements Serializable{

    private static final long serialVersionUID = 1L;
    private Long id;
    /** 操作的url */
    private String url;
    /** 操作的名称 */
    private String name;
    /**
     * 是否勾选
     */
    private String marker;
    /**
     * role Id
     */
    private String roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheck(){
        return StringUtils.equals(roleId,marker);
    }
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String toString() {
        return JSONObject.fromObject(this).toString();
    }
}
