package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSecretRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SecretRequestBody body;

    public CreateSecretRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 服务提供者：ief或hilens，选择设备纳管到不同的平台。不填默认为hilens平台
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CreateSecretRequest withBody(SecretRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSecretRequest withBody(Consumer<SecretRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SecretRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SecretRequestBody getBody() {
        return body;
    }

    public void setBody(SecretRequestBody body) {
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
        CreateSecretRequest createSecretRequest = (CreateSecretRequest) o;
        return Objects.equals(this.provider, createSecretRequest.provider)
            && Objects.equals(this.body, createSecretRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretRequest {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
