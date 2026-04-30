package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 换取的token实例
 */
public class SwitchTokenResponseToken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private SwitchTokenResponseTokenApp app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<SwitchTokenResponseTokenRoles> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issued_at")

    private String issuedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private SwitchTokenResponseTokenUser user;

    public SwitchTokenResponseToken withApp(SwitchTokenResponseTokenApp app) {
        this.app = app;
        return this;
    }

    public SwitchTokenResponseToken withApp(Consumer<SwitchTokenResponseTokenApp> appSetter) {
        if (this.app == null) {
            this.app = new SwitchTokenResponseTokenApp();
            appSetter.accept(this.app);
        }

        return this;
    }

    /**
     * Get app
     * @return app
     */
    public SwitchTokenResponseTokenApp getApp() {
        return app;
    }

    public void setApp(SwitchTokenResponseTokenApp app) {
        this.app = app;
    }

    public SwitchTokenResponseToken withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * 过期时间
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public SwitchTokenResponseToken withRoles(List<SwitchTokenResponseTokenRoles> roles) {
        this.roles = roles;
        return this;
    }

    public SwitchTokenResponseToken addRolesItem(SwitchTokenResponseTokenRoles rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public SwitchTokenResponseToken withRoles(Consumer<List<SwitchTokenResponseTokenRoles>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色列表
     * @return roles
     */
    public List<SwitchTokenResponseTokenRoles> getRoles() {
        return roles;
    }

    public void setRoles(List<SwitchTokenResponseTokenRoles> roles) {
        this.roles = roles;
    }

    public SwitchTokenResponseToken withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * 签发时间
     * @return issuedAt
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public SwitchTokenResponseToken withUser(SwitchTokenResponseTokenUser user) {
        this.user = user;
        return this;
    }

    public SwitchTokenResponseToken withUser(Consumer<SwitchTokenResponseTokenUser> userSetter) {
        if (this.user == null) {
            this.user = new SwitchTokenResponseTokenUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public SwitchTokenResponseTokenUser getUser() {
        return user;
    }

    public void setUser(SwitchTokenResponseTokenUser user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchTokenResponseToken that = (SwitchTokenResponseToken) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.expiresAt, that.expiresAt)
            && Objects.equals(this.roles, that.roles) && Objects.equals(this.issuedAt, that.issuedAt)
            && Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, expiresAt, roles, issuedAt, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchTokenResponseToken {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
