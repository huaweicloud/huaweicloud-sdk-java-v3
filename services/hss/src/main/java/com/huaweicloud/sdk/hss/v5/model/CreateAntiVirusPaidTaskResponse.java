package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAntiVirusPaidTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reasons")

    private List<FailReasons> failReasons = null;

    public CreateAntiVirusPaidTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 任务ID **取值范围**: 字符长度1-64位 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateAntiVirusPaidTaskResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**: 策略ID **取值范围**: 字符长度1-64位 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CreateAntiVirusPaidTaskResponse withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释** 是否全部成功 **取值范围** true: 是 false: 否 
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public CreateAntiVirusPaidTaskResponse withFailReasons(List<FailReasons> failReasons) {
        this.failReasons = failReasons;
        return this;
    }

    public CreateAntiVirusPaidTaskResponse addFailReasonsItem(FailReasons failReasonsItem) {
        if (this.failReasons == null) {
            this.failReasons = new ArrayList<>();
        }
        this.failReasons.add(failReasonsItem);
        return this;
    }

    public CreateAntiVirusPaidTaskResponse withFailReasons(Consumer<List<FailReasons>> failReasonsSetter) {
        if (this.failReasons == null) {
            this.failReasons = new ArrayList<>();
        }
        failReasonsSetter.accept(this.failReasons);
        return this;
    }

    /**
     * **参数解释** 主机结果列表 **取值范围** 不涉及 
     * @return failReasons
     */
    public List<FailReasons> getFailReasons() {
        return failReasons;
    }

    public void setFailReasons(List<FailReasons> failReasons) {
        this.failReasons = failReasons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAntiVirusPaidTaskResponse that = (CreateAntiVirusPaidTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.result, that.result) && Objects.equals(this.failReasons, that.failReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, policyId, result, failReasons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAntiVirusPaidTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    failReasons: ").append(toIndentedString(failReasons)).append("\n");
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
