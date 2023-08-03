package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowInstanceUsersEntity
 */
public class ShowInstanceUsersEntity {

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

    public ShowInstanceUsersEntity withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。  由英文字符开头，只能由英文字母、数字、中划线、下划线组成，长度为4~64的字符。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowInstanceUsersEntity withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 用户角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ShowInstanceUsersEntity withDefaultApp(Boolean defaultApp) {
        this.defaultApp = defaultApp;
        return this;
    }

    /**
     * 是否为默认应用。
     * @return defaultApp
     */
    public Boolean getDefaultApp() {
        return defaultApp;
    }

    public void setDefaultApp(Boolean defaultApp) {
        this.defaultApp = defaultApp;
    }

    public ShowInstanceUsersEntity withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceUsersEntity that = (ShowInstanceUsersEntity) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.role, that.role)
            && Objects.equals(this.defaultApp, that.defaultApp) && Objects.equals(this.createdTime, that.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role, defaultApp, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceUsersEntity {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    defaultApp: ").append(toIndentedString(defaultApp)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
