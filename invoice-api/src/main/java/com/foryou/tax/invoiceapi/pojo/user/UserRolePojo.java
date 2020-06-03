package com.foryou.tax.invoiceapi.pojo.user;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class UserRolePojo implements Serializable{

    private static final long serialVersionUID = 1L;
    /**{@link UserPojo.id}*/
    private Long uid;
    /**{@link UserRolePojo.id}*/
    private Long rid;

    private Long id;
    /**角色名称*/
    private String name;
    /**角色类型*/
    private String type;

    /**
     * 用户ID (用String， 考虑多个ID，现在只有一个ID)
     */
    private String userId;
    /**
     * 是否勾选
     */
    private String marker;

    //***做 role --> permission 一对多处理
    private List<UserPermissionPojo> permissions = new LinkedList<UserPermissionPojo>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public List<UserPermissionPojo> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<UserPermissionPojo> permissions) {
        this.permissions = permissions;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCheck(){
        return StringUtils.equals(userId,marker);
    }
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserRolePojo(Long uid, Long rid) {
        this.uid = uid;
        this.rid = rid;
    }
    public UserRolePojo() {
    }
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
    public String toString(){
        return JSONObject.fromObject(this).toString();
    }
}
