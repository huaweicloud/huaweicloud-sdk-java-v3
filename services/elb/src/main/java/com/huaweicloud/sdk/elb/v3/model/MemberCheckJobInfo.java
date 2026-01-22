package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：后端服务器检查任务结果。
 */
public class MemberCheckJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private MemberCheckJobResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_total_num")

    private Integer checkItemTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_finished_num")

    private Integer checkItemFinishedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    public MemberCheckJobInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：检查任务状态。  **取值范围**： - processed：检查任务执行完成。 - processing：检查任务执行中。 - failed：检查任务执行失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MemberCheckJobInfo withResult(MemberCheckJobResult result) {
        this.result = result;
        return this;
    }

    public MemberCheckJobInfo withResult(Consumer<MemberCheckJobResult> resultSetter) {
        if (this.result == null) {
            this.result = new MemberCheckJobResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public MemberCheckJobResult getResult() {
        return result;
    }

    public void setResult(MemberCheckJobResult result) {
        this.result = result;
    }

    public MemberCheckJobInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：任务创建时间。  **取值范围**：不涉及
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public MemberCheckJobInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：任务更新时间。  **取值范围**：不涉及
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MemberCheckJobInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public MemberCheckJobInfo withCheckItemTotalNum(Integer checkItemTotalNum) {
        this.checkItemTotalNum = checkItemTotalNum;
        return this;
    }

    /**
     * **参数解释**：检查项总个数。  **取值范围**：不涉及
     * @return checkItemTotalNum
     */
    public Integer getCheckItemTotalNum() {
        return checkItemTotalNum;
    }

    public void setCheckItemTotalNum(Integer checkItemTotalNum) {
        this.checkItemTotalNum = checkItemTotalNum;
    }

    public MemberCheckJobInfo withCheckItemFinishedNum(Integer checkItemFinishedNum) {
        this.checkItemFinishedNum = checkItemFinishedNum;
        return this;
    }

    /**
     * **参数解释**：已检查完成的检查项个数。  **取值范围**：不涉及
     * @return checkItemFinishedNum
     */
    public Integer getCheckItemFinishedNum() {
        return checkItemFinishedNum;
    }

    public void setCheckItemFinishedNum(Integer checkItemFinishedNum) {
        this.checkItemFinishedNum = checkItemFinishedNum;
    }

    public MemberCheckJobInfo withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * **参数解释**：后端服务器所关联的监听器，查询在该监听器下后端服务器的状态。  **取值范围**：不涉及
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public MemberCheckJobInfo withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * **参数解释**：后端服务器ID。  **取值范围**：不涉及
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberCheckJobInfo that = (MemberCheckJobInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.result, that.result)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.checkItemTotalNum, that.checkItemTotalNum)
            && Objects.equals(this.checkItemFinishedNum, that.checkItemFinishedNum)
            && Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            result,
            createdAt,
            updatedAt,
            jobId,
            checkItemTotalNum,
            checkItemFinishedNum,
            listenerId,
            memberId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberCheckJobInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    checkItemTotalNum: ").append(toIndentedString(checkItemTotalNum)).append("\n");
        sb.append("    checkItemFinishedNum: ").append(toIndentedString(checkItemFinishedNum)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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
