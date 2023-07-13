package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiskAutoExpansionPolicy
 */
public class DiskAutoExpansionPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public DiskAutoExpansionPolicy withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 触发自动扩容阈值，只支持输入80、85和90。默认阈值为90，即当已使用存储空间达到总存储空间的90%或者可用空间小于10GB时就会触发扩容。
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public DiskAutoExpansionPolicy withStep(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * 扩容步长（s%），默认为10，支持输入10、15和20。当触发自动扩容的时候，自动扩容当前存储空间的s%（非10倍数向上取整。小数点后四舍五入，默认一次最小100G，账户余额不足时，会导致包年包月实例扩容失败）
     * @return step
     */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public DiskAutoExpansionPolicy withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 实例通过自动扩容所能达到的存储空间上限,单位：GB。需要大于等于实例购买的存储空间大小，且最大上限不能超过实例当前规格支持的最大存储容量。批量自动扩容时，不支持自定义存储自动扩容上限，默认扩容至所选实例对应的最大存储空间。
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
        DiskAutoExpansionPolicy that = (DiskAutoExpansionPolicy) obj;
        return Objects.equals(this.threshold, that.threshold) && Objects.equals(this.step, that.step)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threshold, step, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskAutoExpansionPolicy {\n");
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
