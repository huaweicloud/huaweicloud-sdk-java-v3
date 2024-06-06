package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回收站策略。
 */
public class RecyclePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_period_in_days")

    private String retentionPeriodInDays;

    public RecyclePolicy withRetentionPeriodInDays(String retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    /**
     * 保留天数，1-7天。
     * @return retentionPeriodInDays
     */
    public String getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    public void setRetentionPeriodInDays(String retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecyclePolicy that = (RecyclePolicy) obj;
        return Objects.equals(this.retentionPeriodInDays, that.retentionPeriodInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionPeriodInDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecyclePolicy {\n");
        sb.append("    retentionPeriodInDays: ").append(toIndentedString(retentionPeriodInDays)).append("\n");
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
