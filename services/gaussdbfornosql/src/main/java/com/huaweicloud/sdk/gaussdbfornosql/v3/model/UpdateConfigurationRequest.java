package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConfigurationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    private String configId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateConfigurationRequestBody body;

    public UpdateConfigurationRequest withConfigId(String configId) {
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

    public UpdateConfigurationRequest withBody(UpdateConfigurationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateConfigurationRequest withBody(Consumer<UpdateConfigurationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateConfigurationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateConfigurationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateConfigurationRequestBody body) {
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
        UpdateConfigurationRequest updateConfigurationRequest = (UpdateConfigurationRequest) o;
        return Objects.equals(this.configId, updateConfigurationRequest.configId)
            && Objects.equals(this.body, updateConfigurationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationRequest {\n");
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
