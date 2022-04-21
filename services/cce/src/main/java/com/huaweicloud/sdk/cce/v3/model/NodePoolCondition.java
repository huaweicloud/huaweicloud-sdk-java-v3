package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点池详细状态。
 */
public class NodePoolCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastProbeTime")

    private String lastProbeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastTransitTime")

    private String lastTransitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public NodePoolCondition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Condition类型，当前支持类型如下 - \"Scalable\"：节点池实际的可扩容状态，如果状态为\"False\"时则不会再次触发节点池扩容行为。 - \"QuotaInsufficient\"：节点池扩容依赖的配额不足，影响节点池可扩容状态。 - \"ResourceInsufficient\"：节点池扩容依赖的资源不足，影响节点池可扩容状态。 - \"UnexpectedError\"：节点池非预期扩容失败，影响节点池可扩容状态。 - \"LockedByOrder\"：包周期节点池被订单锁定，此时Reason为待支付订单ID。 - \"Error\"：节点池错误，通常由于删除失败触发。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodePoolCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Condition当前状态，取值如下 - \"True\" - \"False\" 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NodePoolCondition withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    /**
     * 上次状态检查时间。
     * @return lastProbeTime
     */
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public NodePoolCondition withLastTransitTime(String lastTransitTime) {
        this.lastTransitTime = lastTransitTime;
        return this;
    }

    /**
     * 上次状态变更时间。
     * @return lastTransitTime
     */
    public String getLastTransitTime() {
        return lastTransitTime;
    }

    public void setLastTransitTime(String lastTransitTime) {
        this.lastTransitTime = lastTransitTime;
    }

    public NodePoolCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 上次状态变更原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public NodePoolCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Condition详细描述。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePoolCondition nodePoolCondition = (NodePoolCondition) o;
        return Objects.equals(this.type, nodePoolCondition.type)
            && Objects.equals(this.status, nodePoolCondition.status)
            && Objects.equals(this.lastProbeTime, nodePoolCondition.lastProbeTime)
            && Objects.equals(this.lastTransitTime, nodePoolCondition.lastTransitTime)
            && Objects.equals(this.reason, nodePoolCondition.reason)
            && Objects.equals(this.message, nodePoolCondition.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, lastProbeTime, lastTransitTime, reason, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolCondition {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
        sb.append("    lastTransitTime: ").append(toIndentedString(lastTransitTime)).append("\n");
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
