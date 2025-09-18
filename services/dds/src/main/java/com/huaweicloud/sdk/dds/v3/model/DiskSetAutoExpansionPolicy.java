package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiskSetAutoExpansionPolicy
 */
public class DiskSetAutoExpansionPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public DiskSetAutoExpansionPolicy withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：** 实例ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DiskSetAutoExpansionPolicy withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * **参数解释：** 触发自动扩容阈值，只支持输入80、85和90。默认阈值为90，即当已使用存储空间达到总存储空间的90%时就会触发扩容。集群实例的自动扩容阈值指的是每个shard。 **约束限制：** 只支持输入80、85和90。 **取值范围：** 80、85和90 **默认取值：** 90。
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public DiskSetAutoExpansionPolicy withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释：** 扩容步长（s%），默认为10，支持输入10、15和20。当触发自动扩容的时候，自动扩容当前存储空间的s%（非10倍数向上取整。小数点后四舍五入，默认一次最小10G，账户余额不足时，会导致包年包月实例扩容失败）。 **约束限制：** 只支持输入10、15和20。 **取值范围：** 10、15和20。 **默认取值：** 10。
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public DiskSetAutoExpansionPolicy withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 最大扩容上限，即当自动扩容达到上限后不再触发自动扩容。 **约束限制：** 实例规格小于8U时，自动扩容上限为5000GB；大于等于8U时，自动扩容上限为10000GB。 **取值范围：** 实例规格小于8U时，自动扩容上限为5000GB；大于等于8U时，自动扩容上限为10000GB。 **默认取值：** 5000。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskSetAutoExpansionPolicy that = (DiskSetAutoExpansionPolicy) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.step, that.step) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, threshold, step, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskSetAutoExpansionPolicy {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
