package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TestCaseTimeoutPolicy
 */
public class TestCaseTimeoutPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutTimes")

    private Integer timeoutTimes;

    public TestCaseTimeoutPolicy withTimeoutTimes(Integer timeoutTimes) {
        this.timeoutTimes = timeoutTimes;
        return this;
    }

    /**
     * 用例超时多少次告警
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
        TestCaseTimeoutPolicy that = (TestCaseTimeoutPolicy) obj;
        return Objects.equals(this.timeoutTimes, that.timeoutTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeoutTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseTimeoutPolicy {\n");
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
