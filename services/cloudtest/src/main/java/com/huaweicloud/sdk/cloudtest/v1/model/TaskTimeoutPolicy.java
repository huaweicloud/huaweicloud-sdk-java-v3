package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskTimeoutPolicy
 */
public class TaskTimeoutPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameIpTimeoutTestCaseCount")

    private Integer sameIpTimeoutTestCaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameTestCaseTimeoutIpCount")

    private String sameTestCaseTimeoutIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseTimeoutCount")

    private Integer testCaseTimeoutCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseTimeoutRatio")

    private Integer testCaseTimeoutRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutTimes")

    private Integer timeoutTimes;

    public TaskTimeoutPolicy withSameIpTimeoutTestCaseCount(Integer sameIpTimeoutTestCaseCount) {
        this.sameIpTimeoutTestCaseCount = sameIpTimeoutTestCaseCount;
        return this;
    }

    /**
     * 小网拨测：同一个ip超时的用例大于多少个告警
     * @return sameIpTimeoutTestCaseCount
     */
    public Integer getSameIpTimeoutTestCaseCount() {
        return sameIpTimeoutTestCaseCount;
    }

    public void setSameIpTimeoutTestCaseCount(Integer sameIpTimeoutTestCaseCount) {
        this.sameIpTimeoutTestCaseCount = sameIpTimeoutTestCaseCount;
    }

    public TaskTimeoutPolicy withSameTestCaseTimeoutIpCount(String sameTestCaseTimeoutIpCount) {
        this.sameTestCaseTimeoutIpCount = sameTestCaseTimeoutIpCount;
        return this;
    }

    /**
     * 小网拨测:同一用例在N个IP中超时，并且超时的用例个数达到M个告警
     * @return sameTestCaseTimeoutIpCount
     */
    public String getSameTestCaseTimeoutIpCount() {
        return sameTestCaseTimeoutIpCount;
    }

    public void setSameTestCaseTimeoutIpCount(String sameTestCaseTimeoutIpCount) {
        this.sameTestCaseTimeoutIpCount = sameTestCaseTimeoutIpCount;
    }

    public TaskTimeoutPolicy withTestCaseTimeoutCount(Integer testCaseTimeoutCount) {
        this.testCaseTimeoutCount = testCaseTimeoutCount;
        return this;
    }

    /**
     * 任务中多少个用例超时告警
     * @return testCaseTimeoutCount
     */
    public Integer getTestCaseTimeoutCount() {
        return testCaseTimeoutCount;
    }

    public void setTestCaseTimeoutCount(Integer testCaseTimeoutCount) {
        this.testCaseTimeoutCount = testCaseTimeoutCount;
    }

    public TaskTimeoutPolicy withTestCaseTimeoutRatio(Integer testCaseTimeoutRatio) {
        this.testCaseTimeoutRatio = testCaseTimeoutRatio;
        return this;
    }

    /**
     * 任务中多少百分比的用例超时告警
     * @return testCaseTimeoutRatio
     */
    public Integer getTestCaseTimeoutRatio() {
        return testCaseTimeoutRatio;
    }

    public void setTestCaseTimeoutRatio(Integer testCaseTimeoutRatio) {
        this.testCaseTimeoutRatio = testCaseTimeoutRatio;
    }

    public TaskTimeoutPolicy withTimeoutTimes(Integer timeoutTimes) {
        this.timeoutTimes = timeoutTimes;
        return this;
    }

    /**
     * 任务连续超时告警
     * @return timeoutTimes
     */
    public Integer getTimeoutTimes() {
        return timeoutTimes;
    }

    public void setTimeoutTimes(Integer timeoutTimes) {
        this.timeoutTimes = timeoutTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskTimeoutPolicy that = (TaskTimeoutPolicy) obj;
        return Objects.equals(this.sameIpTimeoutTestCaseCount, that.sameIpTimeoutTestCaseCount)
            && Objects.equals(this.sameTestCaseTimeoutIpCount, that.sameTestCaseTimeoutIpCount)
            && Objects.equals(this.testCaseTimeoutCount, that.testCaseTimeoutCount)
            && Objects.equals(this.testCaseTimeoutRatio, that.testCaseTimeoutRatio)
            && Objects.equals(this.timeoutTimes, that.timeoutTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sameIpTimeoutTestCaseCount,
            sameTestCaseTimeoutIpCount,
            testCaseTimeoutCount,
            testCaseTimeoutRatio,
            timeoutTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskTimeoutPolicy {\n");
        sb.append("    sameIpTimeoutTestCaseCount: ").append(toIndentedString(sameIpTimeoutTestCaseCount)).append("\n");
        sb.append("    sameTestCaseTimeoutIpCount: ").append(toIndentedString(sameTestCaseTimeoutIpCount)).append("\n");
        sb.append("    testCaseTimeoutCount: ").append(toIndentedString(testCaseTimeoutCount)).append("\n");
        sb.append("    testCaseTimeoutRatio: ").append(toIndentedString(testCaseTimeoutRatio)).append("\n");
        sb.append("    timeoutTimes: ").append(toIndentedString(timeoutTimes)).append("\n");
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
