package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 舰队启用联邦或权限策略信息
 */
public class ClusterGroupCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastTransitionTime")

    private OffsetDateTime lastTransitionTime;

    public ClusterGroupCondition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。 - Federation：舰队启用联邦状态类型 - Policy：权限策略
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterGroupCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 舰队启用的联邦或权限策略的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterGroupCondition withReason(String reason) {
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

    public ClusterGroupCondition withMessage(String message) {
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

    public ClusterGroupCondition withLastTransitionTime(OffsetDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    /**
     * 状态更新时间
     * @return lastTransitionTime
     */
    public OffsetDateTime getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterGroupCondition that = (ClusterGroupCondition) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.message, that.message)
            && Objects.equals(this.lastTransitionTime, that.lastTransitionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, reason, message, lastTransitionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterGroupCondition {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
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
