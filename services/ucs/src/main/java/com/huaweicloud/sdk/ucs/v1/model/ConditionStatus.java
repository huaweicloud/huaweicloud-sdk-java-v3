package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * type为Ready，表示集群是否可用；type为Cluster，表示集群的网络连接状态；type为Federation，表示集群的联邦状态。
 */
public class ConditionStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observedgeneration")

    private Integer observedgeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastTransitionTime")

    private OffsetDateTime lastTransitionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ConditionStatus withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 状态类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConditionStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConditionStatus withObservedgeneration(Integer observedgeneration) {
        this.observedgeneration = observedgeneration;
        return this;
    }

    /**
     * 状态对象的版本
     * @return observedgeneration
     */
    public Integer getObservedgeneration() {
        return observedgeneration;
    }

    public void setObservedgeneration(Integer observedgeneration) {
        this.observedgeneration = observedgeneration;
    }

    public ConditionStatus withLastTransitionTime(OffsetDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    /**
     * 上次状态更新的时间
     * @return lastTransitionTime
     */
    public OffsetDateTime getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    public ConditionStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 状态原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ConditionStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 状态信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConditionStatus that = (ConditionStatus) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.observedgeneration, that.observedgeneration)
            && Objects.equals(this.lastTransitionTime, that.lastTransitionTime)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, observedgeneration, lastTransitionTime, reason, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionStatus {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    observedgeneration: ").append(toIndentedString(observedgeneration)).append("\n");
        sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
