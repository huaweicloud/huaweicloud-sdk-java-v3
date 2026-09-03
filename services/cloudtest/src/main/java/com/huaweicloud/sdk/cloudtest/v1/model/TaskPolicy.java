package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskPolicy
 */
public class TaskPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_times")

    private Integer failedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameIpFailedTestCaseCount")

    private Integer sameIpFailedTestCaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameTestCaseFailedIpCount")

    private String sameTestCaseFailedIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseFailedCount")

    private Integer testCaseFailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseFailedRatio")

    private Integer testCaseFailedRatio;

    public TaskPolicy withFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
        return this;
    }

    /**
     * 任务连续失败N次告警
     * @return failedTimes
     */
    public Integer getFailedTimes() {
        return failedTimes;
    }

    public void setFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
    }

    public TaskPolicy withSameIpFailedTestCaseCount(Integer sameIpFailedTestCaseCount) {
        this.sameIpFailedTestCaseCount = sameIpFailedTestCaseCount;
        return this;
    }

    /**
     * 小网拨测：同一个ip失败的用例大于多少个告警
     * @return sameIpFailedTestCaseCount
     */
    public Integer getSameIpFailedTestCaseCount() {
        return sameIpFailedTestCaseCount;
    }

    public void setSameIpFailedTestCaseCount(Integer sameIpFailedTestCaseCount) {
        this.sameIpFailedTestCaseCount = sameIpFailedTestCaseCount;
    }

    public TaskPolicy withSameTestCaseFailedIpCount(String sameTestCaseFailedIpCount) {
        this.sameTestCaseFailedIpCount = sameTestCaseFailedIpCount;
        return this;
    }

    /**
     * 小网拨测:同一用例在N个IP中失败，并且失败的用例个数达到M个
     * @return sameTestCaseFailedIpCount
     */
    public String getSameTestCaseFailedIpCount() {
        return sameTestCaseFailedIpCount;
    }

    public void setSameTestCaseFailedIpCount(String sameTestCaseFailedIpCount) {
        this.sameTestCaseFailedIpCount = sameTestCaseFailedIpCount;
    }

    public TaskPolicy withTestCaseFailedCount(Integer testCaseFailedCount) {
        this.testCaseFailedCount = testCaseFailedCount;
        return this;
    }

    /**
     * 任务中多少个用例失败告警
     * @return testCaseFailedCount
     */
    public Integer getTestCaseFailedCount() {
        return testCaseFailedCount;
    }

    public void setTestCaseFailedCount(Integer testCaseFailedCount) {
        this.testCaseFailedCount = testCaseFailedCount;
    }

    public TaskPolicy withTestCaseFailedRatio(Integer testCaseFailedRatio) {
        this.testCaseFailedRatio = testCaseFailedRatio;
        return this;
    }

    /**
     * 任务中多少百分比的用例失败告警
     * @return testCaseFailedRatio
     */
    public Integer getTestCaseFailedRatio() {
        return testCaseFailedRatio;
    }

    public void setTestCaseFailedRatio(Integer testCaseFailedRatio) {
        this.testCaseFailedRatio = testCaseFailedRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskPolicy that = (TaskPolicy) obj;
        return Objects.equals(this.failedTimes, that.failedTimes)
            && Objects.equals(this.sameIpFailedTestCaseCount, that.sameIpFailedTestCaseCount)
            && Objects.equals(this.sameTestCaseFailedIpCount, that.sameTestCaseFailedIpCount)
            && Objects.equals(this.testCaseFailedCount, that.testCaseFailedCount)
            && Objects.equals(this.testCaseFailedRatio, that.testCaseFailedRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedTimes,
            sameIpFailedTestCaseCount,
            sameTestCaseFailedIpCount,
            testCaseFailedCount,
            testCaseFailedRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskPolicy {\n");
        sb.append("    failedTimes: ").append(toIndentedString(failedTimes)).append("\n");
        sb.append("    sameIpFailedTestCaseCount: ").append(toIndentedString(sameIpFailedTestCaseCount)).append("\n");
        sb.append("    sameTestCaseFailedIpCount: ").append(toIndentedString(sameTestCaseFailedIpCount)).append("\n");
        sb.append("    testCaseFailedCount: ").append(toIndentedString(testCaseFailedCount)).append("\n");
        sb.append("    testCaseFailedRatio: ").append(toIndentedString(testCaseFailedRatio)).append("\n");
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
