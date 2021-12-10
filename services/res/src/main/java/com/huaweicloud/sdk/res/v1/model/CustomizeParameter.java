package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 自定义参数 */
public class CustomizeParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_type")

    private String behaviorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Double threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduplication")

    private String deduplication;

    public CustomizeParameter withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /** 别名。
     * 
     * @return alias */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CustomizeParameter withBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }

    /** 行为类型。
     * 
     * @return behaviorType */
    public String getBehaviorType() {
        return behaviorType;
    }

    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
    }

    public CustomizeParameter withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /** 阈值。 minimum: 0 maximum: 1
     * 
     * @return threshold */
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public CustomizeParameter withDeduplication(String deduplication) {
        this.deduplication = deduplication;
        return this;
    }

    /** 去重。
     * 
     * @return deduplication */
    public String getDeduplication() {
        return deduplication;
    }

    public void setDeduplication(String deduplication) {
        this.deduplication = deduplication;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeParameter customizeParameter = (CustomizeParameter) o;
        return Objects.equals(this.alias, customizeParameter.alias)
            && Objects.equals(this.behaviorType, customizeParameter.behaviorType)
            && Objects.equals(this.threshold, customizeParameter.threshold)
            && Objects.equals(this.deduplication, customizeParameter.deduplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, behaviorType, threshold, deduplication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeParameter {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    behaviorType: ").append(toIndentedString(behaviorType)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    deduplication: ").append(toIndentedString(deduplication)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
