package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 升级Ds响应信息
 */
public class UpdateDaemonsetRespInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reson")

    private String failedReson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public UpdateDaemonsetRespInfo withFailedReson(String failedReson) {
        this.failedReson = failedReson;
        return this;
    }

    /**
     * 失败原因（已废弃，请使用failed_reason）
     * @return failedReson
     */
    public String getFailedReson() {
        return failedReson;
    }

    public void setFailedReson(String failedReson) {
        this.failedReson = failedReson;
    }

    public UpdateDaemonsetRespInfo withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public UpdateDaemonsetRespInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群Id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDaemonsetRespInfo that = (UpdateDaemonsetRespInfo) obj;
        return Objects.equals(this.failedReson, that.failedReson)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedReson, failedReason, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDaemonsetRespInfo {\n");
        sb.append("    failedReson: ").append(toIndentedString(failedReson)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
