package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 修改自动磁盘扩容配置 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class AlterAutoVolumeExpandConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_volume_expand_enable")

    private Boolean autoVolumeExpandEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_threshold")

    private Integer expandThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_volume_size")

    private Integer maxVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_increment")

    private Integer expandIncrement;

    public AlterAutoVolumeExpandConfig withAutoVolumeExpandEnable(Boolean autoVolumeExpandEnable) {
        this.autoVolumeExpandEnable = autoVolumeExpandEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启磁盘自动扩容。 **约束限制**： 不涉及。 **取值范围**： - true：开启磁盘自动扩容。 - false：关闭磁盘自动扩容。 **默认取值**： 不涉及。
     * @return autoVolumeExpandEnable
     */
    public Boolean getAutoVolumeExpandEnable() {
        return autoVolumeExpandEnable;
    }

    public void setAutoVolumeExpandEnable(Boolean autoVolumeExpandEnable) {
        this.autoVolumeExpandEnable = autoVolumeExpandEnable;
    }

    public AlterAutoVolumeExpandConfig withExpandThreshold(Integer expandThreshold) {
        this.expandThreshold = expandThreshold;
        return this;
    }

    /**
     * **参数解释**： 触发磁盘自动扩容的阈值。 **约束限制**： 不涉及。 **取值范围**： 20%-80%。 **默认取值**： 不涉及。
     * @return expandThreshold
     */
    public Integer getExpandThreshold() {
        return expandThreshold;
    }

    public void setExpandThreshold(Integer expandThreshold) {
        this.expandThreshold = expandThreshold;
    }

    public AlterAutoVolumeExpandConfig withMaxVolumeSize(Integer maxVolumeSize) {
        this.maxVolumeSize = maxVolumeSize;
        return this;
    }

    /**
     * **参数解释**： 磁盘自动扩容的上限值。 **约束限制**： - 需要可以被100整除。 - 需要小于节点数*30000。 - 需要大于当前实例磁盘大小。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxVolumeSize
     */
    public Integer getMaxVolumeSize() {
        return maxVolumeSize;
    }

    public void setMaxVolumeSize(Integer maxVolumeSize) {
        this.maxVolumeSize = maxVolumeSize;
    }

    public AlterAutoVolumeExpandConfig withExpandIncrement(Integer expandIncrement) {
        this.expandIncrement = expandIncrement;
        return this;
    }

    /**
     * **参数解释**： 每次磁盘自动扩容的比例。 **约束限制**： 不涉及。 **取值范围**： 10%-100%。 **默认取值**： 不涉及。
     * @return expandIncrement
     */
    public Integer getExpandIncrement() {
        return expandIncrement;
    }

    public void setExpandIncrement(Integer expandIncrement) {
        this.expandIncrement = expandIncrement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlterAutoVolumeExpandConfig that = (AlterAutoVolumeExpandConfig) obj;
        return Objects.equals(this.autoVolumeExpandEnable, that.autoVolumeExpandEnable)
            && Objects.equals(this.expandThreshold, that.expandThreshold)
            && Objects.equals(this.maxVolumeSize, that.maxVolumeSize)
            && Objects.equals(this.expandIncrement, that.expandIncrement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoVolumeExpandEnable, expandThreshold, maxVolumeSize, expandIncrement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlterAutoVolumeExpandConfig {\n");
        sb.append("    autoVolumeExpandEnable: ").append(toIndentedString(autoVolumeExpandEnable)).append("\n");
        sb.append("    expandThreshold: ").append(toIndentedString(expandThreshold)).append("\n");
        sb.append("    maxVolumeSize: ").append(toIndentedString(maxVolumeSize)).append("\n");
        sb.append("    expandIncrement: ").append(toIndentedString(expandIncrement)).append("\n");
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
