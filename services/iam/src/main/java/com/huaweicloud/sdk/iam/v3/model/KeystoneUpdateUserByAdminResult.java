package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUserResultExtra;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class KeystoneUpdateUserByAdminResult  {



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
    
    private LinksSelf links;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra")
    
    private KeystoneUserResultExtra extra;

    public KeystoneUpdateUserByAdminResult withPwdStatus(Boolean pwdStatus) {
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

    

    public KeystoneUpdateUserByAdminResult withDomainId(String domainId) {
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

    

    public KeystoneUpdateUserByAdminResult withLastProjectId(String lastProjectId) {
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

    

    public KeystoneUpdateUserByAdminResult withName(String name) {
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

    

    public KeystoneUpdateUserByAdminResult withDescription(String description) {
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

    

    public KeystoneUpdateUserByAdminResult withPasswordExpiresAt(String passwordExpiresAt) {
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

    

    public KeystoneUpdateUserByAdminResult withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public KeystoneUpdateUserByAdminResult withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    

    public KeystoneUpdateUserByAdminResult withId(String id) {
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

    

    public KeystoneUpdateUserByAdminResult withEnabled(Boolean enabled) {
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

    

    public KeystoneUpdateUserByAdminResult withExtra(KeystoneUserResultExtra extra) {
        this.extra = extra;
        return this;
    }

    public KeystoneUpdateUserByAdminResult withExtra(Consumer<KeystoneUserResultExtra> extraSetter) {
        if(this.extra == null ){
            this.extra = new KeystoneUserResultExtra();
            extraSetter.accept(this.extra);
        }
        
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
        KeystoneUpdateUserByAdminResult keystoneUpdateUserByAdminResult = (KeystoneUpdateUserByAdminResult) o;
        return Objects.equals(this.pwdStatus, keystoneUpdateUserByAdminResult.pwdStatus) &&
            Objects.equals(this.domainId, keystoneUpdateUserByAdminResult.domainId) &&
            Objects.equals(this.lastProjectId, keystoneUpdateUserByAdminResult.lastProjectId) &&
            Objects.equals(this.name, keystoneUpdateUserByAdminResult.name) &&
            Objects.equals(this.description, keystoneUpdateUserByAdminResult.description) &&
            Objects.equals(this.passwordExpiresAt, keystoneUpdateUserByAdminResult.passwordExpiresAt) &&
            Objects.equals(this.links, keystoneUpdateUserByAdminResult.links) &&
            Objects.equals(this.id, keystoneUpdateUserByAdminResult.id) &&
            Objects.equals(this.enabled, keystoneUpdateUserByAdminResult.enabled) &&
            Objects.equals(this.extra, keystoneUpdateUserByAdminResult.extra);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pwdStatus, domainId, lastProjectId, name, description, passwordExpiresAt, links, id, enabled, extra);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateUserByAdminResult {\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    lastProjectId: ").append(toIndentedString(lastProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

