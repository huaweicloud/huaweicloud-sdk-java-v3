package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchAddScalingInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    @JacksonXmlProperty(localName = "scaling_group_id")

    private String scalingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchAddInstancesOption body;

    public BatchAddScalingInstancesRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    /**
     * 实例ID。
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public BatchAddScalingInstancesRequest withBody(BatchAddInstancesOption body) {
        this.body = body;
        return this;
    }

    public BatchAddScalingInstancesRequest withBody(Consumer<BatchAddInstancesOption> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddInstancesOption();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchAddInstancesOption getBody() {
        return body;
    }

    public void setBody(BatchAddInstancesOption body) {
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
        BatchAddScalingInstancesRequest batchAddScalingInstancesRequest = (BatchAddScalingInstancesRequest) o;
        return Objects.equals(this.scalingGroupId, batchAddScalingInstancesRequest.scalingGroupId)
            && Objects.equals(this.body, batchAddScalingInstancesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddScalingInstancesRequest {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
