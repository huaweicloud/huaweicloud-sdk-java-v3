package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobLogRequest
 */
public class JobLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_id")

    private String bridgeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification_id")

    private String classificationId;

    public JobLogRequest withBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    /**
     * 桥接作业id
     * @return bridgeId
     */
    public String getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
    }

    public JobLogRequest withClassificationId(String classificationId) {
        this.classificationId = classificationId;
        return this;
    }

    /**
     * 分类作业id
     * @return classificationId
     */
    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobLogRequest jobLogRequest = (JobLogRequest) o;
        return Objects.equals(this.bridgeId, jobLogRequest.bridgeId)
            && Objects.equals(this.classificationId, jobLogRequest.classificationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridgeId, classificationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobLogRequest {\n");
        sb.append("    bridgeId: ").append(toIndentedString(bridgeId)).append("\n");
        sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
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
