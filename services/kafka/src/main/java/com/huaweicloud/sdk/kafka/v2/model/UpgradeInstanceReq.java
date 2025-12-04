package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradeInstanceReq
 */
public class UpgradeInstanceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_schedule")

    private Boolean isSchedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    private Long executeAt;

    public UpgradeInstanceReq withIsSchedule(Boolean isSchedule) {
        this.isSchedule = isSchedule;
        return this;
    }

    /**
     * 是否作为定时任务执行。若非定时执行，is_schedule和execute_at字段可为空。若为定时执行，is_schedule为true，execute_at字段非空。
     * @return isSchedule
     */
    public Boolean getIsSchedule() {
        return isSchedule;
    }

    public void setIsSchedule(Boolean isSchedule) {
        this.isSchedule = isSchedule;
    }

    public UpgradeInstanceReq withExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * 定时时间，格式为Unix时间戳，单位为毫秒
     * @return executeAt
     */
    public Long getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeInstanceReq that = (UpgradeInstanceReq) obj;
        return Objects.equals(this.isSchedule, that.isSchedule) && Objects.equals(this.executeAt, that.executeAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSchedule, executeAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeInstanceReq {\n");
        sb.append("    isSchedule: ").append(toIndentedString(isSchedule)).append("\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
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
