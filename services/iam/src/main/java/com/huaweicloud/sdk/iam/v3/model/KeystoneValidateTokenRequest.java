package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneValidateTokenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")

    private String xSubjectToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nocatalog")

    private String nocatalog;

    public KeystoneValidateTokenRequest withXSubjectToken(String xSubjectToken) {
        this.xSubjectToken = xSubjectToken;
        return this;
    }

    /**
     * 待校验的token。
     * @return xSubjectToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")
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
     * 如果设置该参数，返回的响应体中将不显示catalog信息。任何非空字符串都将解释为true，并使该字段生效。
     * @return nocatalog
     */
    public String getNocatalog() {
        return nocatalog;
    }

    public void setNocatalog(String nocatalog) {
        this.nocatalog = nocatalog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoneValidateTokenRequest that = (KeystoneValidateTokenRequest) obj;
        return Objects.equals(this.xSubjectToken, that.xSubjectToken) && Objects.equals(this.nocatalog, that.nocatalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSubjectToken, nocatalog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneValidateTokenRequest {\n");
        sb.append("    xSubjectToken: ").append(toIndentedString(xSubjectToken)).append("\n");
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
