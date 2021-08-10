package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SetAuditlogPolicyRequestBody */
public class SetAuditlogPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_auditlogs")

    private Boolean reserveAuditlogs;

    public SetAuditlogPolicyRequestBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /** 审计日志保存天数，取值范围0~732。0表示关闭审计日志策略。
     * 
     * @return keepDays */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SetAuditlogPolicyRequestBody withReserveAuditlogs(Boolean reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
        return this;
    }

    /** 仅关闭审计日志策略时有效。 - true（默认），表示关闭审计日志策略的同时，保留历史审计日志。 - false，表示关闭审计日志策略的同时，删除已有的历史审计日志。
     * 
     * @return reserveAuditlogs */
    public Boolean getReserveAuditlogs() {
        return reserveAuditlogs;
    }

    public void setReserveAuditlogs(Boolean reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetAuditlogPolicyRequestBody setAuditlogPolicyRequestBody = (SetAuditlogPolicyRequestBody) o;
        return Objects.equals(this.keepDays, setAuditlogPolicyRequestBody.keepDays)
            && Objects.equals(this.reserveAuditlogs, setAuditlogPolicyRequestBody.reserveAuditlogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, reserveAuditlogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAuditlogPolicyRequestBody {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    reserveAuditlogs: ").append(toIndentedString(reserveAuditlogs)).append("\n");
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
