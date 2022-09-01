package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConfigurationParameterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    @JacksonXmlProperty(localName = "config_id")

    private String configId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateConfigurationParameterRequestBody body;

    public UpdateConfigurationParameterRequest withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * 参数模板ID。
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public UpdateConfigurationParameterRequest withBody(UpdateConfigurationParameterRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateConfigurationParameterRequest withBody(Consumer<UpdateConfigurationParameterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateConfigurationParameterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateConfigurationParameterRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateConfigurationParameterRequestBody body) {
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
        UpdateConfigurationParameterRequest updateConfigurationParameterRequest =
            (UpdateConfigurationParameterRequest) o;
        return Objects.equals(this.configId, updateConfigurationParameterRequest.configId)
            && Objects.equals(this.body, updateConfigurationParameterRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationParameterRequest {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
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
