package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowInstanceUsersRespUsers */
public class ShowInstanceUsersRespUsers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_app")

    private Boolean defaultApp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    public ShowInstanceUsersRespUsers withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 用户名称。
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowInstanceUsersRespUsers withRole(String role) {
        this.role = role;
        return this;
    }

    /** 用户角色。
     * 
     * @return role */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ShowInstanceUsersRespUsers withDefaultApp(Boolean defaultApp) {
        this.defaultApp = defaultApp;
        return this;
    }

    /** 是否为默认应用。
     * 
     * @return defaultApp */
    public Boolean getDefaultApp() {
        return defaultApp;
    }

    public void setDefaultApp(Boolean defaultApp) {
        this.defaultApp = defaultApp;
    }

    public ShowInstanceUsersRespUsers withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建时间。
     * 
     * @return createdTime */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceUsersRespUsers showInstanceUsersRespUsers = (ShowInstanceUsersRespUsers) o;
        return Objects.equals(this.userName, showInstanceUsersRespUsers.userName)
            && Objects.equals(this.role, showInstanceUsersRespUsers.role)
            && Objects.equals(this.defaultApp, showInstanceUsersRespUsers.defaultApp)
            && Objects.equals(this.createdTime, showInstanceUsersRespUsers.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role, defaultApp, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceUsersRespUsers {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    defaultApp: ").append(toIndentedString(defaultApp)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
