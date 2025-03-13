package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateVpnUser
 */
public class CreateVpnUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_name")

    private String userGroupName;

    public CreateVpnUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVpnUser withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 用户密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateVpnUser withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述，0-64字符，中文、英文、数字包含下划线
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVpnUser withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * 所属用户组ID
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpnUser that = (CreateVpnUser) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.password, that.password)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.userGroupName, that.userGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, description, userGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
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
