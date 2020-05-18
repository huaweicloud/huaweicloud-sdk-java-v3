package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUserResultExtra;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class KeystoneUserResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwd_status")
    
    private Boolean pwdStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_project_id")
    
    private String lastProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="forceResetPwd")
    
    private Boolean forceResetPwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_expires_at")
    
    private String passwordExpiresAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwd_strength")
    
    private String pwdStrength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra")
    
    private KeystoneUserResultExtra extra = null;

    public KeystoneUserResult withPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
        return this;
    }

    


    /**
     * IAM用户密码状态。true：需要修改密码，false：正常。
     * @return pwdStatus
     */
    public Boolean getPwdStatus() {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    public KeystoneUserResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * IAM用户所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneUserResult withLastProjectId(String lastProjectId) {
        this.lastProjectId = lastProjectId;
        return this;
    }

    


    /**
     * IAM用户退出系统前，在控制台最后访问的项目ID。
     * @return lastProjectId
     */
    public String getLastProjectId() {
        return lastProjectId;
    }

    public void setLastProjectId(String lastProjectId) {
        this.lastProjectId = lastProjectId;
    }

    public KeystoneUserResult withForceResetPwd(Boolean forceResetPwd) {
        this.forceResetPwd = forceResetPwd;
        return this;
    }

    


    /**
     * IAM用户下次登录是否强制重置密码。
     * @return forceResetPwd
     */
    public Boolean getForceResetPwd() {
        return forceResetPwd;
    }

    public void setForceResetPwd(Boolean forceResetPwd) {
        this.forceResetPwd = forceResetPwd;
    }

    public KeystoneUserResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * IAM用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeystoneUserResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * IAM用户描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KeystoneUserResult withPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    


    /**
     * IAM用户密码过期时间（UTC时间），“null”表示密码不过期。
     * @return passwordExpiresAt
     */
    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    public KeystoneUserResult withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneUserResult withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
        }
        linksSetter.accept(this.links);
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public KeystoneUserResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * IAM用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KeystoneUserResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * IAM用户是否启用。true表示启用，false表示停用，默认为true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public KeystoneUserResult withPwdStrength(String pwdStrength) {
        this.pwdStrength = pwdStrength;
        return this;
    }

    


    /**
     * IAM用户的密码强度。high：密码强度高；mid：密码强度中等；low：密码强度低。
     * @return pwdStrength
     */
    public String getPwdStrength() {
        return pwdStrength;
    }

    public void setPwdStrength(String pwdStrength) {
        this.pwdStrength = pwdStrength;
    }

    public KeystoneUserResult withExtra(KeystoneUserResultExtra extra) {
        this.extra = extra;
        return this;
    }

    public KeystoneUserResult withExtra(Consumer<KeystoneUserResultExtra> extraSetter) {
        if(this.extra == null ){
            this.extra = new KeystoneUserResultExtra();
        }
        extraSetter.accept(this.extra);
        return this;
    }


    /**
     * Get extra
     * @return extra
     */
    public KeystoneUserResultExtra getExtra() {
        return extra;
    }

    public void setExtra(KeystoneUserResultExtra extra) {
        this.extra = extra;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUserResult keystoneUserResult = (KeystoneUserResult) o;
        return Objects.equals(this.pwdStatus, keystoneUserResult.pwdStatus) &&
            Objects.equals(this.domainId, keystoneUserResult.domainId) &&
            Objects.equals(this.lastProjectId, keystoneUserResult.lastProjectId) &&
            Objects.equals(this.forceResetPwd, keystoneUserResult.forceResetPwd) &&
            Objects.equals(this.name, keystoneUserResult.name) &&
            Objects.equals(this.description, keystoneUserResult.description) &&
            Objects.equals(this.passwordExpiresAt, keystoneUserResult.passwordExpiresAt) &&
            Objects.equals(this.links, keystoneUserResult.links) &&
            Objects.equals(this.id, keystoneUserResult.id) &&
            Objects.equals(this.enabled, keystoneUserResult.enabled) &&
            Objects.equals(this.pwdStrength, keystoneUserResult.pwdStrength) &&
            Objects.equals(this.extra, keystoneUserResult.extra);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pwdStatus, domainId, lastProjectId, forceResetPwd, name, description, passwordExpiresAt, links, id, enabled, pwdStrength, extra);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUserResult {\n");
            sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    lastProjectId: ").append(toIndentedString(lastProjectId)).append("\n");
            sb.append("    forceResetPwd: ").append(toIndentedString(forceResetPwd)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
            sb.append("    pwdStrength: ").append(toIndentedString(pwdStrength)).append("\n");
            sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

