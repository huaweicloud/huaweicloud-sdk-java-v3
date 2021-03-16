package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * authenticatingProxy模式相关配置。认证模式为authenticating_proxy时必选
 */
public class AuthenticatingProxy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ca")
    
    private String ca;

    public AuthenticatingProxy withCa(String ca) {
        this.ca = ca;
        return this;
    }

    


    /**
     * authenticating_proxy模式配置的x509格式CA证书(base64编码)。 最大长度：1M
     * @return ca
     */
    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticatingProxy authenticatingProxy = (AuthenticatingProxy) o;
        return Objects.equals(this.ca, authenticatingProxy.ca);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ca);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticatingProxy {\n");
        sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
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

