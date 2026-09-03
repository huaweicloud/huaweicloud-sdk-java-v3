package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskErrorPolicy
 */
public class TaskErrorPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameIpErrorTestCaseCount")

    private Integer sameIpErrorTestCaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sameTestCaseErrorIpCount")

    private String sameTestCaseErrorIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseErrorCount")

    private Integer testCaseErrorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseErrorRatio")

    private Integer testCaseErrorRatio;

    public TaskErrorPolicy withSameIpErrorTestCaseCount(Integer sameIpErrorTestCaseCount) {
        this.sameIpErrorTestCaseCount = sameIpErrorTestCaseCount;
        return this;
    }

    /**
     * 小网拨测：同一个ip异常的用例大于多少个告警
     * @return sameIpErrorTestCaseCount
     */
    public Integer getSameIpErrorTestCaseCount() {
        return sameIpErrorTestCaseCount;
    }

    public void setSameIpErrorTestCaseCount(Integer sameIpErrorTestCaseCount) {
        this.sameIpErrorTestCaseCount = sameIpErrorTestCaseCount;
    }

    public TaskErrorPolicy withSameTestCaseErrorIpCount(String sameTestCaseErrorIpCount) {
        this.sameTestCaseErrorIpCount = sameTestCaseErrorIpCount;
        return this;
    }

    /**
     * 小网拨测:同一用例在N个IP中异常，并且异常的用例个数达到M个告警
     * @return sameTestCaseErrorIpCount
     */
    public String getSameTestCaseErrorIpCount() {
        return sameTestCaseErrorIpCount;
    }

    public void setSameTestCaseErrorIpCount(String sameTestCaseErrorIpCount) {
        this.sameTestCaseErrorIpCount = sameTestCaseErrorIpCount;
    }

    public TaskErrorPolicy withTestCaseErrorCount(Integer testCaseErrorCount) {
        this.testCaseErrorCount = testCaseErrorCount;
        return this;
    }

    /**
     * 任务中多少个用例异常告警
     * @return testCaseErrorCount
     */
    public Integer getTestCaseErrorCount() {
        return testCaseErrorCount;
    }

    public void setTestCaseErrorCount(Integer testCaseErrorCount) {
        this.testCaseErrorCount = testCaseErrorCount;
    }

    public TaskErrorPolicy withTestCaseErrorRatio(Integer testCaseErrorRatio) {
        this.testCaseErrorRatio = testCaseErrorRatio;
        return this;
    }

    /**
     * 任务中多少百分比的用例异常告警
     * @return testCaseErrorRatio
     */
    public Integer getTestCaseErrorRatio() {
        return testCaseErrorRatio;
    }

    public void setTestCaseErrorRatio(Integer testCaseErrorRatio) {
        this.testCaseErrorRatio = testCaseErrorRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskErrorPolicy that = (TaskErrorPolicy) obj;
        return Objects.equals(this.sameIpErrorTestCaseCount, that.sameIpErrorTestCaseCount)
            && Objects.equals(this.sameTestCaseErrorIpCount, that.sameTestCaseErrorIpCount)
            && Objects.equals(this.testCaseErrorCount, that.testCaseErrorCount)
            && Objects.equals(this.testCaseErrorRatio, that.testCaseErrorRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sameIpErrorTestCaseCount, sameTestCaseErrorIpCount, testCaseErrorCount, testCaseErrorRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskErrorPolicy {\n");
        sb.append("    sameIpErrorTestCaseCount: ").append(toIndentedString(sameIpErrorTestCaseCount)).append("\n");
        sb.append("    sameTestCaseErrorIpCount: ").append(toIndentedString(sameTestCaseErrorIpCount)).append("\n");
        sb.append("    testCaseErrorCount: ").append(toIndentedString(testCaseErrorCount)).append("\n");
        sb.append("    testCaseErrorRatio: ").append(toIndentedString(testCaseErrorRatio)).append("\n");
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
