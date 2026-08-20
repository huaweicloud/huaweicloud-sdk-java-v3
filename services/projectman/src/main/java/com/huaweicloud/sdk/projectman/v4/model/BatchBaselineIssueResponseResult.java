package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量基线工作项的结果项
 */
public class BatchBaselineIssueResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<IssueBaselineResult> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<IssueBaselineResult> failed = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Integer failNum;

    public BatchBaselineIssueResponseResult withSuccess(List<IssueBaselineResult> success) {
        this.success = success;
        return this;
    }

    public BatchBaselineIssueResponseResult addSuccessItem(IssueBaselineResult successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchBaselineIssueResponseResult withSuccess(Consumer<List<IssueBaselineResult>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 基线成功的工作项列表。
     * @return success
     */
    public List<IssueBaselineResult> getSuccess() {
        return success;
    }

    public void setSuccess(List<IssueBaselineResult> success) {
        this.success = success;
    }

    public BatchBaselineIssueResponseResult withFailed(List<IssueBaselineResult> failed) {
        this.failed = failed;
        return this;
    }

    public BatchBaselineIssueResponseResult addFailedItem(IssueBaselineResult failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public BatchBaselineIssueResponseResult withFailed(Consumer<List<IssueBaselineResult>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * 基线失败的工作项列表。
     * @return failed
     */
    public List<IssueBaselineResult> getFailed() {
        return failed;
    }

    public void setFailed(List<IssueBaselineResult> failed) {
        this.failed = failed;
    }

    public BatchBaselineIssueResponseResult withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 成功数量。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public BatchBaselineIssueResponseResult withFailNum(Integer failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * 失败数量。
     * @return failNum
     */
    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBaselineIssueResponseResult that = (BatchBaselineIssueResponseResult) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed)
            && Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failNum, that.failNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failed, successNum, failNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBaselineIssueResponseResult {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
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
