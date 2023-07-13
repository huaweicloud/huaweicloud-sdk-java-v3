package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试用例状态信息，数组长度小于等于50
 */
public class UpdateTestCaseResultBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_id")

    private String executeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateTestCaseResultBean withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 测试用例唯一标识，列表中不允许存在重复的id，固定长度32位字符
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public UpdateTestCaseResultBean withExecuteId(String executeId) {
        this.executeId = executeId;
        return this;
    }

    /**
     * 注册服务执行id，该值不允许重复，不超过32位字符
     * @return executeId
     */
    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    public UpdateTestCaseResultBean withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * 测试用例结果，（0-成功，1-失败，5-执行中，6-停止）
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public UpdateTestCaseResultBean withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 用例结束执行的时间戳，在执行结束时该字段必传
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public UpdateTestCaseResultBean withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 执行用例持续时长ms，更新状态时改字段必传
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public UpdateTestCaseResultBean withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用于记录该次结果执行的备注信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTestCaseResultBean that = (UpdateTestCaseResultBean) obj;
        return Objects.equals(this.testcaseId, that.testcaseId) && Objects.equals(this.executeId, that.executeId)
            && Objects.equals(this.resultId, that.resultId) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testcaseId, executeId, resultId, endTime, duration, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseResultBean {\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    executeId: ").append(toIndentedString(executeId)).append("\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
