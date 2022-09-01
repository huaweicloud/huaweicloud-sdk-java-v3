package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class KeystoneCreateUserTokenByPasswordAndMfaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nocatalog")

    @JacksonXmlProperty(localName = "nocatalog")

    private String nocatalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private KeystoneCreateUserTokenByPasswordAndMfaRequestBody body;

    public KeystoneCreateUserTokenByPasswordAndMfaRequest withNocatalog(String nocatalog) {
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

    public KeystoneCreateUserTokenByPasswordAndMfaRequest withBody(
        KeystoneCreateUserTokenByPasswordAndMfaRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneCreateUserTokenByPasswordAndMfaRequest withBody(
        Consumer<KeystoneCreateUserTokenByPasswordAndMfaRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneCreateUserTokenByPasswordAndMfaRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public KeystoneCreateUserTokenByPasswordAndMfaRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneCreateUserTokenByPasswordAndMfaRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateUserTokenByPasswordAndMfaRequest keystoneCreateUserTokenByPasswordAndMfaRequest =
            (KeystoneCreateUserTokenByPasswordAndMfaRequest) o;
        return Objects.equals(this.nocatalog, keystoneCreateUserTokenByPasswordAndMfaRequest.nocatalog)
            && Objects.equals(this.body, keystoneCreateUserTokenByPasswordAndMfaRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nocatalog, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateUserTokenByPasswordAndMfaRequest {\n");
        sb.append("    nocatalog: ").append(toIndentedString(nocatalog)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
