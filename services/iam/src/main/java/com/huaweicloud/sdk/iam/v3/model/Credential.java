package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class Credential  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expires_at")
    
    private String expiresAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access")
    
    private String access;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="secret")
    
    private String secret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="securitytoken")
    
    private String securitytoken;

    public Credential withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    


    /**
     * AK/SK和securitytoken的过期时间。
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Credential withAccess(String access) {
        this.access = access;
        return this;
    }

    


    /**
     * 获取的AK。
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public Credential withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    


    /**
     * 获取的SK。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Credential withSecuritytoken(String securitytoken) {
        this.securitytoken = securitytoken;
        return this;
    }

    


    /**
     * securitytoken是将所获的AK、SK等信息进行加密后的字符串。
     * @return securitytoken
     */
    public String getSecuritytoken() {
        return securitytoken;
    }

    public void setSecuritytoken(String securitytoken) {
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
        Credential credential = (Credential) o;
        return Objects.equals(this.expiresAt, credential.expiresAt) &&
            Objects.equals(this.access, credential.access) &&
            Objects.equals(this.secret, credential.secret) &&
            Objects.equals(this.securitytoken, credential.securitytoken);
    }
    @Override
    public int hashCode() {
        return Objects.hash(expiresAt, access, secret, securitytoken);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Credential {\n");
            sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
            sb.append("    access: ").append(toIndentedString(access)).append("\n");
            sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

