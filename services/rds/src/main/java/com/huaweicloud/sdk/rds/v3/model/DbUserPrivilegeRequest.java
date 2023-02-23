package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 入参对象
 */
public class DbUserPrivilegeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private String authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<String> privileges = null;

    public DbUserPrivilegeRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 账号，数据库相关联的帐号
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DbUserPrivilegeRequest withAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * 授权SQL类型,枚举： 1、ROLE(支持对指定用户设置以下权限) 2、RECYCLING_ROLE(支持对指定用户回收以下权限) 3、SYSTEM_ROLE(支持对指定用户授予以下系统角色) 4、RECYCLING_SYSTEM_ROLE(支持对指定用户回收以下系统角色)
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    public DbUserPrivilegeRequest withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public DbUserPrivilegeRequest addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public DbUserPrivilegeRequest withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 支持用户设置的权限集合。 1、privilege_type为ROLE时需要使用,枚举： CREATEDB CREATEROLE LOGIN REPLICATION 2、privilege_type为RECYCLING_ROLE时需要使用,枚举： NOCREATEDB NOCREATEROLE NOLOGIN NOREPLICATION 3、privilege_type为SYSTEM_ROLE /RECYCLING_ SYSTEM_ROLE时需要使用,枚举： pg_monitor pg_signal_backend root
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
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
        DbUserPrivilegeRequest dbUserPrivilegeRequest = (DbUserPrivilegeRequest) o;
        return Objects.equals(this.userName, dbUserPrivilegeRequest.userName)
            && Objects.equals(this.authorizationType, dbUserPrivilegeRequest.authorizationType)
            && Objects.equals(this.privileges, dbUserPrivilegeRequest.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, authorizationType, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbUserPrivilegeRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
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
