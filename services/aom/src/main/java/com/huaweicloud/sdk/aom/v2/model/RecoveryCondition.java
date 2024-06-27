package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecoveryCondition
 */
public class RecoveryCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_timeframe")

    private Integer recoveryTimeframe;

    public RecoveryCondition withRecoveryTimeframe(Integer recoveryTimeframe) {
        this.recoveryTimeframe = recoveryTimeframe;
        return this;
    }

    /**
     * 告警恢复周期的个数。
     * @return recoveryTimeframe
     */
    public Integer getRecoveryTimeframe() {
        return recoveryTimeframe;
    }

    public void setRecoveryTimeframe(Integer recoveryTimeframe) {
        this.recoveryTimeframe = recoveryTimeframe;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecoveryCondition that = (RecoveryCondition) obj;
        return Objects.equals(this.recoveryTimeframe, that.recoveryTimeframe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recoveryTimeframe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecoveryCondition {\n");
        sb.append("    recoveryTimeframe: ").append(toIndentedString(recoveryTimeframe)).append("\n");
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
