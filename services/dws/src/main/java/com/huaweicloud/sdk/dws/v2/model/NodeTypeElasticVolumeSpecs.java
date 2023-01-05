package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 如果规格为弹性容量规格，则该属性为规格典配的弹性容量信息，包括存储类型、最小容量、最大容量以及步长信息，如果为固定存储规格，则该属性为null。
 */
public class NodeTypeElasticVolumeSpecs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private String step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_size")

    private Integer minSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_size")

    private Integer maxSize;

    public NodeTypeElasticVolumeSpecs withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 云盘存储类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeTypeElasticVolumeSpecs withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * 云盘容量调整步长。
     * @return step
     */
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public NodeTypeElasticVolumeSpecs withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * 云盘支持的最小容量。
     * @return minSize
     */
    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public NodeTypeElasticVolumeSpecs withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * 云盘支持的最大容量。
     * @return maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeTypeElasticVolumeSpecs nodeTypeElasticVolumeSpecs = (NodeTypeElasticVolumeSpecs) o;
        return Objects.equals(this.type, nodeTypeElasticVolumeSpecs.type)
            && Objects.equals(this.step, nodeTypeElasticVolumeSpecs.step)
            && Objects.equals(this.minSize, nodeTypeElasticVolumeSpecs.minSize)
            && Objects.equals(this.maxSize, nodeTypeElasticVolumeSpecs.maxSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, step, minSize, maxSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTypeElasticVolumeSpecs {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
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
