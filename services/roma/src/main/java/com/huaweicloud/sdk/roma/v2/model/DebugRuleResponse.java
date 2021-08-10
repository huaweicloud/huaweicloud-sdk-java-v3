package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class DebugRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result")

    private String testResult;

    public DebugRuleResponse withTestResult(String testResult) {
        this.testResult = testResult;
        return this;
    }

    /** 规则测试输出结果
     * 
     * @return testResult */
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugRuleResponse debugRuleResponse = (DebugRuleResponse) o;
        return Objects.equals(this.testResult, debugRuleResponse.testResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugRuleResponse {\n");
        sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
