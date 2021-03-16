package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginTokenDomain;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LoginTokenUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private LoginTokenDomain domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_expires_at")
    
    private String passwordExpiresAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public LoginTokenUser withDomain(LoginTokenDomain domain) {
        this.domain = domain;
        return this;
    }

    public LoginTokenUser withDomain(Consumer<LoginTokenDomain> domainSetter) {
        if(this.domain == null ){
            this.domain = new LoginTokenDomain();
            domainSetter.accept(this.domain);
        }
        
        return this;
    }


    /**
     * Get domain
     * @return domain
     */
    public LoginTokenDomain getDomain() {
        return domain;
    }

    public void setDomain(LoginTokenDomain domain) {
        this.domain = domain;
    }

    

    public LoginTokenUser withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 被委托方用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public LoginTokenUser withPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    


    /**
     * 被委托方用户的密码过期时间。
     * @return passwordExpiresAt
     */
    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    

    public LoginTokenUser withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 被委托方用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginTokenUser loginTokenUser = (LoginTokenUser) o;
        return Objects.equals(this.domain, loginTokenUser.domain) &&
            Objects.equals(this.name, loginTokenUser.name) &&
            Objects.equals(this.passwordExpiresAt, loginTokenUser.passwordExpiresAt) &&
            Objects.equals(this.id, loginTokenUser.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, name, passwordExpiresAt, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginTokenUser {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

