package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回收站的回收配置。
 */
public class RecycleBinPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_threshold_hour")

    private Integer recycleThresholdHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hour")

    private Integer retentionHour;

    public RecycleBinPolicy withRecycleThresholdHour(Integer recycleThresholdHour) {
        this.recycleThresholdHour = recycleThresholdHour;
        return this;
    }

    /**
     * 允许进入回收站的最小创建时间，不足此时长则删除时不满足进入回收站的条件。
     * @return recycleThresholdHour
     */
    public Integer getRecycleThresholdHour() {
        return recycleThresholdHour;
    }

    public void setRecycleThresholdHour(Integer recycleThresholdHour) {
        this.recycleThresholdHour = recycleThresholdHour;
    }

    public RecycleBinPolicy withRetentionHour(Integer retentionHour) {
        this.retentionHour = retentionHour;
        return this;
    }

    /**
     * 进入回收站的最大保留时长。
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
        RecycleBinPolicy that = (RecycleBinPolicy) obj;
        return Objects.equals(this.recycleThresholdHour, that.recycleThresholdHour)
            && Objects.equals(this.retentionHour, that.retentionHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recycleThresholdHour, retentionHour);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleBinPolicy {\n");
        sb.append("    recycleThresholdHour: ").append(toIndentedString(recycleThresholdHour)).append("\n");
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
