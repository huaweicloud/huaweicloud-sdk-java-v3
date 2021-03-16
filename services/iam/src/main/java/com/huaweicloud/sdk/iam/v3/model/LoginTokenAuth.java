package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginTokenSecurityToken;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LoginTokenAuth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="securitytoken")
    
    private LoginTokenSecurityToken securitytoken;

    public LoginTokenAuth withSecuritytoken(LoginTokenSecurityToken securitytoken) {
        this.securitytoken = securitytoken;
        return this;
    }

    public LoginTokenAuth withSecuritytoken(Consumer<LoginTokenSecurityToken> securitytokenSetter) {
        if(this.securitytoken == null ){
            this.securitytoken = new LoginTokenSecurityToken();
            securitytokenSetter.accept(this.securitytoken);
        }
        
        return this;
    }


    /**
     * Get securitytoken
     * @return securitytoken
     */
    public LoginTokenSecurityToken getSecuritytoken() {
        return securitytoken;
    }

    public void setSecuritytoken(LoginTokenSecurityToken securitytoken) {
        this.securitytoken = securitytoken;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginTokenAuth loginTokenAuth = (LoginTokenAuth) o;
        return Objects.equals(this.securitytoken, loginTokenAuth.securitytoken);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securitytoken);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginTokenAuth {\n");
        sb.append("    securitytoken: ").append(toIndentedString(securitytoken)).append("\n");
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

