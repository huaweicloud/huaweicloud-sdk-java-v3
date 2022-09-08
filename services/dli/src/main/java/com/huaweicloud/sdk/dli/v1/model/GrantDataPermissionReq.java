package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据授权的请求body体。
 */
public class GrantDataPermissionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<GrantDataPermissionRespPrivilege> privileges = null;

    public GrantDataPermissionReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 被赋权的用户名称，该用户将有权访问指定的数据库或数据表，被收回或者更新访问权限。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public GrantDataPermissionReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 指定赋权或回收。值为：grant，revoke或update。 说明： 当用户同时拥有grant和revoke权限的时候才有权限使用update操作。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public GrantDataPermissionReq withPrivileges(List<GrantDataPermissionRespPrivilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    public GrantDataPermissionReq addPrivilegesItem(GrantDataPermissionRespPrivilege privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public GrantDataPermissionReq withPrivileges(Consumer<List<GrantDataPermissionRespPrivilege>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 赋权信息。
     * @return privileges
     */
    public List<GrantDataPermissionRespPrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<GrantDataPermissionRespPrivilege> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GrantDataPermissionReq grantDataPermissionReq = (GrantDataPermissionReq) o;
        return Objects.equals(this.userName, grantDataPermissionReq.userName)
            && Objects.equals(this.action, grantDataPermissionReq.action)
            && Objects.equals(this.privileges, grantDataPermissionReq.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, action, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantDataPermissionReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
