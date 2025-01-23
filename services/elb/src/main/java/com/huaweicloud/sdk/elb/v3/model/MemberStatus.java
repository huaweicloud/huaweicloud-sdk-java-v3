package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 后端服务器操作状态。
 */
public class MemberStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private MemberHealthCheckFailedReason reason;

    public MemberStatus withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 参数解释：监听器ID
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public MemberStatus withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /**
     * 参数解释：后端服务器的健康状态。  取值范围： - ONLINE：后端服务器正常。 - NO_MONITOR：后端服务器所在的服务器组没有健康检查器。 - OFFLINE：后端服务器关联的ECS服务器不存在或已关机。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public MemberStatus withReason(MemberHealthCheckFailedReason reason) {
        this.reason = reason;
        return this;
    }

    public MemberStatus withReason(Consumer<MemberHealthCheckFailedReason> reasonSetter) {
        if (this.reason == null) {
            this.reason = new MemberHealthCheckFailedReason();
            reasonSetter.accept(this.reason);
        }

        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    public MemberHealthCheckFailedReason getReason() {
        return reason;
    }

    public void setReason(MemberHealthCheckFailedReason reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberStatus that = (MemberStatus) obj;
        return Objects.equals(this.listenerId, that.listenerId)
            && Objects.equals(this.operatingStatus, that.operatingStatus) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerId, operatingStatus, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberStatus {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
