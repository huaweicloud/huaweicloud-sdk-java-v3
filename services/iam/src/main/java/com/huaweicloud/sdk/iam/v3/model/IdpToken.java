package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UnscopedTokenUser;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class IdpToken  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issued_at")
    
    private String issuedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expires_at")
    
    private String expiresAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="methods")
    
    private List<String> methods = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private UnscopedTokenUser user = null;

    public IdpToken withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    


    /**
     * token产生时间。
     * @return issuedAt
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public IdpToken withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    


    /**
     * token到期时间。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public IdpToken withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    
    public IdpToken addMethodsItem(String methodsItem) {
        this.methods.add(methodsItem);
        return this;
    }

    public IdpToken withMethods(Consumer<List<String>> methodsSetter) {
        if(this.methods == null ){
            this.methods = new ArrayList<>();
        }
        methodsSetter.accept(this.methods);
        return this;
    }

    /**
     * 获取token的方式。
     * @return methods
     */
    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public IdpToken withUser(UnscopedTokenUser user) {
        this.user = user;
        return this;
    }

    public IdpToken withUser(Consumer<UnscopedTokenUser> userSetter) {
        if(this.user == null ){
            this.user = new UnscopedTokenUser();
            userSetter.accept(this.user);
        }
        
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public UnscopedTokenUser getUser() {
        return user;
    }

    public void setUser(UnscopedTokenUser user) {
        this.user = user;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdpToken idpToken = (IdpToken) o;
        return Objects.equals(this.issuedAt, idpToken.issuedAt) &&
            Objects.equals(this.expiresAt, idpToken.expiresAt) &&
            Objects.equals(this.methods, idpToken.methods) &&
            Objects.equals(this.user, idpToken.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(issuedAt, expiresAt, methods, user);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdpToken {\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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

