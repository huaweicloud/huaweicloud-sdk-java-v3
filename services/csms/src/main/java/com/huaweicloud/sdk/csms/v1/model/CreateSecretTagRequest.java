package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSecretTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    @JacksonXmlProperty(localName = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreateSecretTagRequestBody body;

    public CreateSecretTagRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * 凭据ID
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public CreateSecretTagRequest withBody(CreateSecretTagRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSecretTagRequest withBody(Consumer<CreateSecretTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSecretTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateSecretTagRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSecretTagRequestBody body) {
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
        CreateSecretTagRequest createSecretTagRequest = (CreateSecretTagRequest) o;
        return Objects.equals(this.secretId, createSecretTagRequest.secretId)
            && Objects.equals(this.body, createSecretTagRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretTagRequest {\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
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
