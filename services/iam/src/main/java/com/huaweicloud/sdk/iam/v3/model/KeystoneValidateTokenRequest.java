package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneValidateTokenRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Subject-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String xSubjectToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nocatalog")
    
    private String nocatalog;

    public KeystoneValidateTokenRequest withXSubjectToken(String xSubjectToken) {
        this.xSubjectToken = xSubjectToken;
        return this;
    }

    


    /**
     * Get xSubjectToken
     * @return xSubjectToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Subject-Token")
    public String getXSubjectToken() {
        return xSubjectToken;
    }

    public void setXSubjectToken(String xSubjectToken) {
        this.xSubjectToken = xSubjectToken;
    }

    public KeystoneValidateTokenRequest withNocatalog(String nocatalog) {
        this.nocatalog = nocatalog;
        return this;
    }

    


    /**
     * Get nocatalog
     * @return nocatalog
     */
    public String getNocatalog() {
        return nocatalog;
    }

    public void setNocatalog(String nocatalog) {
        this.nocatalog = nocatalog;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneValidateTokenRequest keystoneValidateTokenRequest = (KeystoneValidateTokenRequest) o;
        return Objects.equals(this.xSubjectToken, keystoneValidateTokenRequest.xSubjectToken) &&
            Objects.equals(this.nocatalog, keystoneValidateTokenRequest.nocatalog);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xSubjectToken, nocatalog);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneValidateTokenRequest {\n");
        sb.append("    xSubjectToken: ").append(toIndentedString("******")).append("\n");
        sb.append("    nocatalog: ").append(toIndentedString(nocatalog)).append("\n");
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

