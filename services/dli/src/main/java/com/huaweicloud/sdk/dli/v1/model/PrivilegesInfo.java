package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 权限信息
 */
public class PrivilegesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_admin")

    @JacksonXmlProperty(localName = "is_admin")

    private Boolean isAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    @JacksonXmlProperty(localName = "privileges")

    private List<String> privileges = null;

    public PrivilegesInfo withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * 判断用户是否为管理员。
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public PrivilegesInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称，即该用户在当前数据库上有权限。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PrivilegesInfo withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public PrivilegesInfo addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public PrivilegesInfo withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 该用户在数据库上的权限
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
        PrivilegesInfo privilegesInfo = (PrivilegesInfo) o;
        return Objects.equals(this.isAdmin, privilegesInfo.isAdmin)
            && Objects.equals(this.userName, privilegesInfo.userName)
            && Objects.equals(this.privileges, privilegesInfo.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdmin, userName, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegesInfo {\n");
        sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
