package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class KeystoneShowUserResult  {



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
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;

    public KeystoneShowUserResult withPwdStatus(Boolean pwdStatus) {
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

    public KeystoneShowUserResult withDomainId(String domainId) {
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

    public KeystoneShowUserResult withLastProjectId(String lastProjectId) {
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

    public KeystoneShowUserResult withName(String name) {
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

    public KeystoneShowUserResult withDescription(String description) {
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

    public KeystoneShowUserResult withPasswordExpiresAt(String passwordExpiresAt) {
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

    public KeystoneShowUserResult withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneShowUserResult withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
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

    public KeystoneShowUserResult withId(String id) {
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

    public KeystoneShowUserResult withEnabled(Boolean enabled) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowUserResult keystoneShowUserResult = (KeystoneShowUserResult) o;
        return Objects.equals(this.pwdStatus, keystoneShowUserResult.pwdStatus) &&
            Objects.equals(this.domainId, keystoneShowUserResult.domainId) &&
            Objects.equals(this.lastProjectId, keystoneShowUserResult.lastProjectId) &&
            Objects.equals(this.name, keystoneShowUserResult.name) &&
            Objects.equals(this.description, keystoneShowUserResult.description) &&
            Objects.equals(this.passwordExpiresAt, keystoneShowUserResult.passwordExpiresAt) &&
            Objects.equals(this.links, keystoneShowUserResult.links) &&
            Objects.equals(this.id, keystoneShowUserResult.id) &&
            Objects.equals(this.enabled, keystoneShowUserResult.enabled);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pwdStatus, domainId, lastProjectId, name, description, passwordExpiresAt, links, id, enabled);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowUserResult {\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    lastProjectId: ").append(toIndentedString(lastProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

