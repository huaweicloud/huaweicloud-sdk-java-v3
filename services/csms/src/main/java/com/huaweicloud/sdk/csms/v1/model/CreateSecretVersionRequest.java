package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSecretVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    @JacksonXmlProperty(localName = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreateSecretVersionRequestBody body;

    public CreateSecretVersionRequest withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public CreateSecretVersionRequest withBody(CreateSecretVersionRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSecretVersionRequest withBody(Consumer<CreateSecretVersionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSecretVersionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateSecretVersionRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSecretVersionRequestBody body) {
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
        CreateSecretVersionRequest createSecretVersionRequest = (CreateSecretVersionRequest) o;
        return Objects.equals(this.secretName, createSecretVersionRequest.secretName)
            && Objects.equals(this.body, createSecretVersionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretVersionRequest {\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
