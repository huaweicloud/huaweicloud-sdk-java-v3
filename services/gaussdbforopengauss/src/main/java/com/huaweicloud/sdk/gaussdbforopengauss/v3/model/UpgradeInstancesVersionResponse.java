package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class UpgradeInstancesVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<String> jobIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeeded_num")

    private Integer succeededNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_instance_ids")

    private List<String> failedInstanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_messages")

    private List<String> errorMessages = null;

    public UpgradeInstancesVersionResponse withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public UpgradeInstancesVersionResponse addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public UpgradeInstancesVersionResponse withJobIds(Consumer<List<String>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 任务id。
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public UpgradeInstancesVersionResponse withSucceededNum(Integer succeededNum) {
        this.succeededNum = succeededNum;
        return this;
    }

    /**
     * 下发成功的实例数量
     * @return succeededNum
     */
    public Integer getSucceededNum() {
        return succeededNum;
    }

    public void setSucceededNum(Integer succeededNum) {
        this.succeededNum = succeededNum;
    }

    public UpgradeInstancesVersionResponse withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 下发失败的实例数量
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public UpgradeInstancesVersionResponse withFailedInstanceIds(List<String> failedInstanceIds) {
        this.failedInstanceIds = failedInstanceIds;
        return this;
    }

    public UpgradeInstancesVersionResponse addFailedInstanceIdsItem(String failedInstanceIdsItem) {
        if (this.failedInstanceIds == null) {
            this.failedInstanceIds = new ArrayList<>();
        }
        this.failedInstanceIds.add(failedInstanceIdsItem);
        return this;
    }

    public UpgradeInstancesVersionResponse withFailedInstanceIds(Consumer<List<String>> failedInstanceIdsSetter) {
        if (this.failedInstanceIds == null) {
            this.failedInstanceIds = new ArrayList<>();
        }
        failedInstanceIdsSetter.accept(this.failedInstanceIds);
        return this;
    }

    /**
     * 下发失败的实例ID列表
     * @return failedInstanceIds
     */
    public List<String> getFailedInstanceIds() {
        return failedInstanceIds;
    }

    public void setFailedInstanceIds(List<String> failedInstanceIds) {
        this.failedInstanceIds = failedInstanceIds;
    }

    public UpgradeInstancesVersionResponse withErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }

    public UpgradeInstancesVersionResponse addErrorMessagesItem(String errorMessagesItem) {
        if (this.errorMessages == null) {
            this.errorMessages = new ArrayList<>();
        }
        this.errorMessages.add(errorMessagesItem);
        return this;
    }

    public UpgradeInstancesVersionResponse withErrorMessages(Consumer<List<String>> errorMessagesSetter) {
        if (this.errorMessages == null) {
            this.errorMessages = new ArrayList<>();
        }
        errorMessagesSetter.accept(this.errorMessages);
        return this;
    }

    /**
     * 下发失败错误信息列表
     * @return errorMessages
     */
    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeInstancesVersionResponse that = (UpgradeInstancesVersionResponse) obj;
        return Objects.equals(this.jobIds, that.jobIds) && Objects.equals(this.succeededNum, that.succeededNum)
            && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.failedInstanceIds, that.failedInstanceIds)
            && Objects.equals(this.errorMessages, that.errorMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobIds, succeededNum, failedNum, failedInstanceIds, errorMessages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeInstancesVersionResponse {\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
        sb.append("    succeededNum: ").append(toIndentedString(succeededNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    failedInstanceIds: ").append(toIndentedString(failedInstanceIds)).append("\n");
        sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
