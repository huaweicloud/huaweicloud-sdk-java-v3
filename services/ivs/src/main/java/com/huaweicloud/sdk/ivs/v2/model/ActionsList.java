package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ActionsList
 */
public class ActionsList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Double confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private Integer action;

    public ActionsList withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，取值范围0～1。
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public ActionsList withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * 动作编号，取值范围：[1,2,3,4]，其中： • 1：左摇头 • 2：右摇头 • 3：点头 • 4：嘴部动作
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsList actionsList = (ActionsList) o;
        return Objects.equals(this.confidence, actionsList.confidence)
            && Objects.equals(this.action, actionsList.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsList {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
