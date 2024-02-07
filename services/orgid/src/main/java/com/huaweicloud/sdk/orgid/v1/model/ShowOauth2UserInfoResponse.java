package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOauth2UserInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private String tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    public ShowOauth2UserInfoResponse withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * 租户code，这里即企业code
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public ShowOauth2UserInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户显示名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOauth2UserInfoResponse withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 手机号
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public ShowOauth2UserInfoResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户登录账号
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowOauth2UserInfoResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户外部id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowOauth2UserInfoResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShowOauth2UserInfoResponse withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色，枚举：user或者admin
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOauth2UserInfoResponse that = (ShowOauth2UserInfoResponse) obj;
        return Objects.equals(this.tenant, that.tenant) && Objects.equals(this.name, that.name)
            && Objects.equals(this.mobile, that.mobile) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.email, that.email)
            && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenant, name, mobile, userName, userId, email, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOauth2UserInfoResponse {\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
