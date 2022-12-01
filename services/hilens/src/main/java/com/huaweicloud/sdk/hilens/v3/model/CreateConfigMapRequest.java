package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateConfigMapRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConfigMapModelBoxDTO body;

    public CreateConfigMapRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 服务名称，hilens或者ief，默认hilens
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CreateConfigMapRequest withBody(ConfigMapModelBoxDTO body) {
        this.body = body;
        return this;
    }

    public CreateConfigMapRequest withBody(Consumer<ConfigMapModelBoxDTO> bodySetter) {
        if (this.body == null) {
            this.body = new ConfigMapModelBoxDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConfigMapModelBoxDTO getBody() {
        return body;
    }

    public void setBody(ConfigMapModelBoxDTO body) {
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
        CreateConfigMapRequest createConfigMapRequest = (CreateConfigMapRequest) o;
        return Objects.equals(this.provider, createConfigMapRequest.provider)
            && Objects.equals(this.body, createConfigMapRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigMapRequest {\n");
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
