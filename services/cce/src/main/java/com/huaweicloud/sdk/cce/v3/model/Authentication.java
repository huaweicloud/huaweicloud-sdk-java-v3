package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.AuthenticatingProxy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Authentication
 */
public class Authentication  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authenticatingProxy")
    
    private AuthenticatingProxy authenticatingProxy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;

    public Authentication withAuthenticatingProxy(AuthenticatingProxy authenticatingProxy) {
        this.authenticatingProxy = authenticatingProxy;
        return this;
    }

    public Authentication withAuthenticatingProxy(Consumer<AuthenticatingProxy> authenticatingProxySetter) {
        if(this.authenticatingProxy == null ){
            this.authenticatingProxy = new AuthenticatingProxy();
            authenticatingProxySetter.accept(this.authenticatingProxy);
        }
        
        return this;
    }


    /**
     * Get authenticatingProxy
     * @return authenticatingProxy
     */
    public AuthenticatingProxy getAuthenticatingProxy() {
        return authenticatingProxy;
    }

    public void setAuthenticatingProxy(AuthenticatingProxy authenticatingProxy) {
        this.authenticatingProxy = authenticatingProxy;
    }

    

    public Authentication withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 集群认证模式。  - kubernetes 1.11及之前版本的集群支持“x509”、“rbac”和“authenticating_proxy”，默认取值为“x509”。 - kubernetes 1.13及以上版本的集群支持“rbac”和“authenticating_proxy”，默认取值为“rbac”。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Authentication authentication = (Authentication) o;
        return Objects.equals(this.authenticatingProxy, authentication.authenticatingProxy) &&
            Objects.equals(this.mode, authentication.mode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authenticatingProxy, mode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authentication {\n");
        sb.append("    authenticatingProxy: ").append(toIndentedString(authenticatingProxy)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

