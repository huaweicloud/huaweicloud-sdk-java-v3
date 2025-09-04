package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateScalingConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_configuration_id")

    private String scalingConfigurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateScalingConfigOption body;

    public UpdateScalingConfigRequest withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    /**
     * Get scalingConfigurationId
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public UpdateScalingConfigRequest withBody(UpdateScalingConfigOption body) {
        this.body = body;
        return this;
    }

    public UpdateScalingConfigRequest withBody(Consumer<UpdateScalingConfigOption> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateScalingConfigOption();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateScalingConfigOption getBody() {
        return body;
    }

    public void setBody(UpdateScalingConfigOption body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScalingConfigRequest that = (UpdateScalingConfigRequest) obj;
        return Objects.equals(this.scalingConfigurationId, that.scalingConfigurationId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScalingConfigRequest {\n");
        sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
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
