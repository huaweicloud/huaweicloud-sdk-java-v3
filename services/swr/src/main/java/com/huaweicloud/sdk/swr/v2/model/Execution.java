package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Execution
 */
public class Execution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private Integer policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_text")

    private String statusText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeed")

    private Integer succeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_progress")

    private Integer inProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopped")

    private Integer stopped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private String trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public Execution withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Execution withPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Execution withStatus(String status) {
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

    public Execution withStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    /**
     * 状态详情
     * @return statusText
     */
    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Execution withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Execution withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * 失败数
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public Execution withSucceed(Integer succeed) {
        this.succeed = succeed;
        return this;
    }

    /**
     * 成功数
     * @return succeed
     */
    public Integer getSucceed() {
        return succeed;
    }

    public void setSucceed(Integer succeed) {
        this.succeed = succeed;
    }

    public Execution withInProgress(Integer inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * 进行中的数量
     * @return inProgress
     */
    public Integer getInProgress() {
        return inProgress;
    }

    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    public Execution withStopped(Integer stopped) {
        this.stopped = stopped;
        return this;
    }

    /**
     * 停止数
     * @return stopped
     */
    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public Execution withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * 触发类型
     * @return trigger
     */
    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Execution withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Execution withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Execution that = (Execution) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusText, that.statusText)
            && Objects.equals(this.total, that.total) && Objects.equals(this.failed, that.failed)
            && Objects.equals(this.succeed, that.succeed) && Objects.equals(this.inProgress, that.inProgress)
            && Objects.equals(this.stopped, that.stopped) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            policyId,
            status,
            statusText,
            total,
            failed,
            succeed,
            inProgress,
            stopped,
            trigger,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Execution {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    succeed: ").append(toIndentedString(succeed)).append("\n");
        sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
        sb.append("    stopped: ").append(toIndentedString(stopped)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
