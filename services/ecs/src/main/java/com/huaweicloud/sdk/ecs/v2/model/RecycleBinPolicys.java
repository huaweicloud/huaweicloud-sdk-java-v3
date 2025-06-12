package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecycleBinPolicys
 */
public class RecycleBinPolicys {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_threshold_day")

    private Integer recycleThresholdDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hour")

    private Integer retentionHour;

    public RecycleBinPolicys withRecycleThresholdDay(Integer recycleThresholdDay) {
        this.recycleThresholdDay = recycleThresholdDay;
        return this;
    }

    /**
     * 创建多久的虚拟机可以进入回收站
     * @return recycleThresholdDay
     */
    public Integer getRecycleThresholdDay() {
        return recycleThresholdDay;
    }

    public void setRecycleThresholdDay(Integer recycleThresholdDay) {
        this.recycleThresholdDay = recycleThresholdDay;
    }

    public RecycleBinPolicys withRetentionHour(Integer retentionHour) {
        this.retentionHour = retentionHour;
        return this;
    }

    /**
     * 虚拟机进入回收站后多久删除
     * @return retentionHour
     */
    public Integer getRetentionHour() {
        return retentionHour;
    }

    public void setRetentionHour(Integer retentionHour) {
        this.retentionHour = retentionHour;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleBinPolicys that = (RecycleBinPolicys) obj;
        return Objects.equals(this.recycleThresholdDay, that.recycleThresholdDay)
            && Objects.equals(this.retentionHour, that.retentionHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recycleThresholdDay, retentionHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleBinPolicys {\n");
        sb.append("    recycleThresholdDay: ").append(toIndentedString(recycleThresholdDay)).append("\n");
        sb.append("    retentionHour: ").append(toIndentedString(retentionHour)).append("\n");
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
