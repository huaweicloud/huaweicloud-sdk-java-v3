package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SwitchCpcsTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<String> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private SwitchTokenResponseAk ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_at")

    private String expiredAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issued_at")

    private String issuedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private SwitchTokenResponseUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-CPCS-Token")

    private String xCPCSToken;

    public SwitchCpcsTokenResponse withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public SwitchCpcsTokenResponse addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public SwitchCpcsTokenResponse withRoles(Consumer<List<String>> rolesSetter) {
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
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public SwitchCpcsTokenResponse withAk(SwitchTokenResponseAk ak) {
        this.ak = ak;
        return this;
    }

    public SwitchCpcsTokenResponse withAk(Consumer<SwitchTokenResponseAk> akSetter) {
        if (this.ak == null) {
            this.ak = new SwitchTokenResponseAk();
            akSetter.accept(this.ak);
        }

        return this;
    }

    /**
     * Get ak
     * @return ak
     */
    public SwitchTokenResponseAk getAk() {
        return ak;
    }

    public void setAk(SwitchTokenResponseAk ak) {
        this.ak = ak;
    }

    public SwitchCpcsTokenResponse withExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * 过期时间
     * @return expiredAt
     */
    public String getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public SwitchCpcsTokenResponse withIssuedAt(String issuedAt) {
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

    public SwitchCpcsTokenResponse withUser(SwitchTokenResponseUser user) {
        this.user = user;
        return this;
    }

    public SwitchCpcsTokenResponse withUser(Consumer<SwitchTokenResponseUser> userSetter) {
        if (this.user == null) {
            this.user = new SwitchTokenResponseUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public SwitchTokenResponseUser getUser() {
        return user;
    }

    public void setUser(SwitchTokenResponseUser user) {
        this.user = user;
    }

    public SwitchCpcsTokenResponse withXCPCSToken(String xCPCSToken) {
        this.xCPCSToken = xCPCSToken;
        return this;
    }

    /**
     * Get xCPCSToken
     * @return xCPCSToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-CPCS-Token")
    public String getXCPCSToken() {
        return xCPCSToken;
    }

    public void setXCPCSToken(String xCPCSToken) {
        this.xCPCSToken = xCPCSToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchCpcsTokenResponse that = (SwitchCpcsTokenResponse) obj;
        return Objects.equals(this.roles, that.roles) && Objects.equals(this.ak, that.ak)
            && Objects.equals(this.expiredAt, that.expiredAt) && Objects.equals(this.issuedAt, that.issuedAt)
            && Objects.equals(this.user, that.user) && Objects.equals(this.xCPCSToken, that.xCPCSToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles, ak, expiredAt, issuedAt, user, xCPCSToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchCpcsTokenResponse {\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    xCPCSToken: ").append(toIndentedString(xCPCSToken)).append("\n");
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
