package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 回收策略。 */
public class RecyclePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open_recycle_policy")

    private Boolean isOpenRecyclePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_period_in_days")

    private String retentionPeriodInDays;

    public RecyclePolicy withIsOpenRecyclePolicy(Boolean isOpenRecyclePolicy) {
        this.isOpenRecyclePolicy = isOpenRecyclePolicy;
        return this;
    }

    /** 是否打开回收策略，取值为“true”或“false”。
     * 
     * @return isOpenRecyclePolicy */
    public Boolean getIsOpenRecyclePolicy() {
        return isOpenRecyclePolicy;
    }

    public void setIsOpenRecyclePolicy(Boolean isOpenRecyclePolicy) {
        this.isOpenRecyclePolicy = isOpenRecyclePolicy;
    }

    public RecyclePolicy withRetentionPeriodInDays(String retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    /** 保留时间，设置已删除实例保留天数，支持整数，可设置范围为1~7天。 当“is_open_recycle_policy”取值为“true”时且“retention_period_in_days”为空，保留时间默认是7天。
     * 
     * @return retentionPeriodInDays */
    public String getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    public void setRetentionPeriodInDays(String retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecyclePolicy recyclePolicy = (RecyclePolicy) o;
        return Objects.equals(this.isOpenRecyclePolicy, recyclePolicy.isOpenRecyclePolicy)
            && Objects.equals(this.retentionPeriodInDays, recyclePolicy.retentionPeriodInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpenRecyclePolicy, retentionPeriodInDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicy {\n");
        sb.append("    isOpenRecyclePolicy: ").append(toIndentedString(isOpenRecyclePolicy)).append("\n");
        sb.append("    retentionPeriodInDays: ").append(toIndentedString(retentionPeriodInDays)).append("\n");
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
