package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TestCasePolicy
 */
public class TestCasePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_times")

    private Integer failedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryTimes")

    private Integer retryTimes;

    public TestCasePolicy withFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
        return this;
    }

    /**
     * 单用例失败多少次告警
     * @return failedTimes
     */
    public Integer getFailedTimes() {
        return failedTimes;
    }

    public void setFailedTimes(Integer failedTimes) {
        this.failedTimes = failedTimes;
    }

    public TestCasePolicy withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * 单用例重试多少次后告警
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCasePolicy that = (TestCasePolicy) obj;
        return Objects.equals(this.failedTimes, that.failedTimes) && Objects.equals(this.retryTimes, that.retryTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedTimes, retryTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCasePolicy {\n");
        sb.append("    failedTimes: ").append(toIndentedString(failedTimes)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
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
