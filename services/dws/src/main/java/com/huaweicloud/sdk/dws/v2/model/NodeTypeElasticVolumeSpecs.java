package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 如果规格为弹性容量规格，则该属性为规格典配的弹性容量信息，包括存储类型、最小容量、最大容量以及步长信息，如果为固定存储规格，则该属性为null。 **取值范围**： 不涉及。
 */
public class NodeTypeElasticVolumeSpecs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

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
     * **参数解释**： 云盘存储类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeTypeElasticVolumeSpecs withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释**： 云盘容量调整步长。 **取值范围**： 不涉及。
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public NodeTypeElasticVolumeSpecs withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * **参数解释**： 云盘支持的最小容量。 **取值范围**： 不涉及。
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
     * **参数解释**： 云盘支持的最大容量。 **取值范围**： 不涉及。
     * @return maxSize
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeTypeElasticVolumeSpecs that = (NodeTypeElasticVolumeSpecs) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.step, that.step)
            && Objects.equals(this.minSize, that.minSize) && Objects.equals(this.maxSize, that.maxSize);
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
