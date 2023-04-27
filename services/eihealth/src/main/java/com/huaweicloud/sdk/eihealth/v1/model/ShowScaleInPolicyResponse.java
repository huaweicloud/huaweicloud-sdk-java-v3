package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowScaleInPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_time")

    private Integer idleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_after_add")

    private Integer delayAfterAdd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_after_delete")

    private Integer delayAfterDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_after_failure")

    private Integer delayAfterFailure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_nodes_batch_deletion")

    private Integer maxNodesBatchDeletion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_interval")

    private Integer checkInterval;

    public ShowScaleInPolicyResponse withIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
        return this;
    }

    /**
     * 空置时间
     * @return idleTime
     */
    public Integer getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
    }

    public ShowScaleInPolicyResponse withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 缩容阈值
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public ShowScaleInPolicyResponse withDelayAfterAdd(Integer delayAfterAdd) {
        this.delayAfterAdd = delayAfterAdd;
        return this;
    }

    /**
     * 扩容后多久再次判断缩容
     * @return delayAfterAdd
     */
    public Integer getDelayAfterAdd() {
        return delayAfterAdd;
    }

    public void setDelayAfterAdd(Integer delayAfterAdd) {
        this.delayAfterAdd = delayAfterAdd;
    }

    public ShowScaleInPolicyResponse withDelayAfterDelete(Integer delayAfterDelete) {
        this.delayAfterDelete = delayAfterDelete;
        return this;
    }

    /**
     * 节点删除后多久再次判断缩容
     * @return delayAfterDelete
     */
    public Integer getDelayAfterDelete() {
        return delayAfterDelete;
    }

    public void setDelayAfterDelete(Integer delayAfterDelete) {
        this.delayAfterDelete = delayAfterDelete;
    }

    public ShowScaleInPolicyResponse withDelayAfterFailure(Integer delayAfterFailure) {
        this.delayAfterFailure = delayAfterFailure;
        return this;
    }

    /**
     * 缩容失败后多久再次判断缩容
     * @return delayAfterFailure
     */
    public Integer getDelayAfterFailure() {
        return delayAfterFailure;
    }

    public void setDelayAfterFailure(Integer delayAfterFailure) {
        this.delayAfterFailure = delayAfterFailure;
    }

    public ShowScaleInPolicyResponse withMaxNodesBatchDeletion(Integer maxNodesBatchDeletion) {
        this.maxNodesBatchDeletion = maxNodesBatchDeletion;
        return this;
    }

    /**
     * 缩容并发数
     * @return maxNodesBatchDeletion
     */
    public Integer getMaxNodesBatchDeletion() {
        return maxNodesBatchDeletion;
    }

    public void setMaxNodesBatchDeletion(Integer maxNodesBatchDeletion) {
        this.maxNodesBatchDeletion = maxNodesBatchDeletion;
    }

    public ShowScaleInPolicyResponse withCheckInterval(Integer checkInterval) {
        this.checkInterval = checkInterval;
        return this;
    }

    /**
     * 检查间隔
     * @return checkInterval
     */
    public Integer getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(Integer checkInterval) {
        this.checkInterval = checkInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScaleInPolicyResponse showScaleInPolicyResponse = (ShowScaleInPolicyResponse) o;
        return Objects.equals(this.idleTime, showScaleInPolicyResponse.idleTime)
            && Objects.equals(this.threshold, showScaleInPolicyResponse.threshold)
            && Objects.equals(this.delayAfterAdd, showScaleInPolicyResponse.delayAfterAdd)
            && Objects.equals(this.delayAfterDelete, showScaleInPolicyResponse.delayAfterDelete)
            && Objects.equals(this.delayAfterFailure, showScaleInPolicyResponse.delayAfterFailure)
            && Objects.equals(this.maxNodesBatchDeletion, showScaleInPolicyResponse.maxNodesBatchDeletion)
            && Objects.equals(this.checkInterval, showScaleInPolicyResponse.checkInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idleTime,
            threshold,
            delayAfterAdd,
            delayAfterDelete,
            delayAfterFailure,
            maxNodesBatchDeletion,
            checkInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScaleInPolicyResponse {\n");
        sb.append("    idleTime: ").append(toIndentedString(idleTime)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    delayAfterAdd: ").append(toIndentedString(delayAfterAdd)).append("\n");
        sb.append("    delayAfterDelete: ").append(toIndentedString(delayAfterDelete)).append("\n");
        sb.append("    delayAfterFailure: ").append(toIndentedString(delayAfterFailure)).append("\n");
        sb.append("    maxNodesBatchDeletion: ").append(toIndentedString(maxNodesBatchDeletion)).append("\n");
        sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
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
