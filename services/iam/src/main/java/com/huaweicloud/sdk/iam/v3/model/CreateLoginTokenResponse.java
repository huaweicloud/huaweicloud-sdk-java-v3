package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginToken;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateLoginTokenResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logintoken")
    
    private LoginToken logintoken = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Subject-LoginToken")
    
    private String xSubjectLoginToken;

    public CreateLoginTokenResponse withLogintoken(LoginToken logintoken) {
        this.logintoken = logintoken;
        return this;
    }

    public CreateLoginTokenResponse withLogintoken(Consumer<LoginToken> logintokenSetter) {
        if(this.logintoken == null ){
            this.logintoken = new LoginToken();
            logintokenSetter.accept(this.logintoken);
        }
        
        return this;
    }


    /**
     * Get logintoken
     * @return logintoken
     */
    public LoginToken getLogintoken() {
        return logintoken;
    }

    public void setLogintoken(LoginToken logintoken) {
        this.logintoken = logintoken;
    }

    public CreateLoginTokenResponse withXSubjectLoginToken(String xSubjectLoginToken) {
        this.xSubjectLoginToken = xSubjectLoginToken;
        return this;
    }

    


    /**
     * Get xSubjectLoginToken
     * @return xSubjectLoginToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Subject-LoginToken")
    public String getXSubjectLoginToken() {
        return xSubjectLoginToken;
    }

    public void setXSubjectLoginToken(String xSubjectLoginToken) {
        this.xSubjectLoginToken = xSubjectLoginToken;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLoginTokenResponse createLoginTokenResponse = (CreateLoginTokenResponse) o;
        return Objects.equals(this.logintoken, createLoginTokenResponse.logintoken) &&
            Objects.equals(this.xSubjectLoginToken, createLoginTokenResponse.xSubjectLoginToken);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logintoken, xSubjectLoginToken);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoginTokenResponse {\n");
        sb.append("    logintoken: ").append(toIndentedString(logintoken)).append("\n");
        sb.append("    xSubjectLoginToken: ").append(toIndentedString(xSubjectLoginToken)).append("\n");
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

