package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateScalingPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_id")

    @JacksonXmlProperty(localName = "scaling_policy_id")

    private String scalingPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateScalingPolicyOption body;

    public UpdateScalingPolicyRequest withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    /**
     * 伸缩策略ID。
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    public UpdateScalingPolicyRequest withBody(UpdateScalingPolicyOption body) {
        this.body = body;
        return this;
    }

    public UpdateScalingPolicyRequest withBody(Consumer<UpdateScalingPolicyOption> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateScalingPolicyOption();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateScalingPolicyOption getBody() {
        return body;
    }

    public void setBody(UpdateScalingPolicyOption body) {
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
        UpdateScalingPolicyRequest updateScalingPolicyRequest = (UpdateScalingPolicyRequest) o;
        return Objects.equals(this.scalingPolicyId, updateScalingPolicyRequest.scalingPolicyId)
            && Objects.equals(this.body, updateScalingPolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingPolicyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScalingPolicyRequest {\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
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
