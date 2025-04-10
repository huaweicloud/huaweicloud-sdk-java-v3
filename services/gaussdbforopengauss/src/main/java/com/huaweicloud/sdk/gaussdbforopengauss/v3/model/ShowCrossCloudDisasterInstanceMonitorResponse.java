package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCrossCloudDisasterInstanceMonitorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo")

    private String rpo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto")

    private String rto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo_threshold")

    private String rpoThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_threshold")

    private String rtoThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switchover_progress")

    private String switchoverProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failover_progress")

    private String failoverProgress;

    public ShowCrossCloudDisasterInstanceMonitorResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withRpo(String rpo) {
        this.rpo = rpo;
        return this;
    }

    /**
     * 数据恢复点目标。
     * @return rpo
     */
    public String getRpo() {
        return rpo;
    }

    public void setRpo(String rpo) {
        this.rpo = rpo;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withRto(String rto) {
        this.rto = rto;
        return this;
    }

    /**
     * 数据恢复时间目标。
     * @return rto
     */
    public String getRto() {
        return rto;
    }

    public void setRto(String rto) {
        this.rto = rto;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withRpoThreshold(String rpoThreshold) {
        this.rpoThreshold = rpoThreshold;
        return this;
    }

    /**
     * rpo阈值。
     * @return rpoThreshold
     */
    public String getRpoThreshold() {
        return rpoThreshold;
    }

    public void setRpoThreshold(String rpoThreshold) {
        this.rpoThreshold = rpoThreshold;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withRtoThreshold(String rtoThreshold) {
        this.rtoThreshold = rtoThreshold;
        return this;
    }

    /**
     * rto阈值。
     * @return rtoThreshold
     */
    public String getRtoThreshold() {
        return rtoThreshold;
    }

    public void setRtoThreshold(String rtoThreshold) {
        this.rtoThreshold = rtoThreshold;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withSwitchoverProgress(String switchoverProgress) {
        this.switchoverProgress = switchoverProgress;
        return this;
    }

    /**
     * 主从切换进度。该值为一个百分数。例如：40%。
     * @return switchoverProgress
     */
    public String getSwitchoverProgress() {
        return switchoverProgress;
    }

    public void setSwitchoverProgress(String switchoverProgress) {
        this.switchoverProgress = switchoverProgress;
    }

    public ShowCrossCloudDisasterInstanceMonitorResponse withFailoverProgress(String failoverProgress) {
        this.failoverProgress = failoverProgress;
        return this;
    }

    /**
     * 容灾升主进度。该值为一个百分数。例如：40%。
     * @return failoverProgress
     */
    public String getFailoverProgress() {
        return failoverProgress;
    }

    public void setFailoverProgress(String failoverProgress) {
        this.failoverProgress = failoverProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCrossCloudDisasterInstanceMonitorResponse that = (ShowCrossCloudDisasterInstanceMonitorResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.rpo, that.rpo) && Objects.equals(this.rto, that.rto)
            && Objects.equals(this.rpoThreshold, that.rpoThreshold)
            && Objects.equals(this.rtoThreshold, that.rtoThreshold)
            && Objects.equals(this.switchoverProgress, that.switchoverProgress)
            && Objects.equals(this.failoverProgress, that.failoverProgress);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, status, rpo, rto, rpoThreshold, rtoThreshold, switchoverProgress, failoverProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCrossCloudDisasterInstanceMonitorResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rpo: ").append(toIndentedString(rpo)).append("\n");
        sb.append("    rto: ").append(toIndentedString(rto)).append("\n");
        sb.append("    rpoThreshold: ").append(toIndentedString(rpoThreshold)).append("\n");
        sb.append("    rtoThreshold: ").append(toIndentedString(rtoThreshold)).append("\n");
        sb.append("    switchoverProgress: ").append(toIndentedString(switchoverProgress)).append("\n");
        sb.append("    failoverProgress: ").append(toIndentedString(failoverProgress)).append("\n");
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
