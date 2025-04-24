package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用例步骤结果信息
 */
public class TestCaseStepResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_result")

    private String actualResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_result")

    private String expectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_step")

    private String testStep;

    public TestCaseStepResultInfo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 步骤结果值
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public TestCaseStepResultInfo withActualResult(String actualResult) {
        this.actualResult = actualResult;
        return this;
    }

    /**
     * 步骤实际结果
     * @return actualResult
     */
    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public TestCaseStepResultInfo withExpectResult(String expectResult) {
        this.expectResult = expectResult;
        return this;
    }

    /**
     * 步骤期望结果
     * @return expectResult
     */
    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public TestCaseStepResultInfo withTestStep(String testStep) {
        this.testStep = testStep;
        return this;
    }

    /**
     * 用例操作步骤
     * @return testStep
     */
    public String getTestStep() {
        return testStep;
    }

    public void setTestStep(String testStep) {
        this.testStep = testStep;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseStepResultInfo that = (TestCaseStepResultInfo) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.actualResult, that.actualResult)
            && Objects.equals(this.expectResult, that.expectResult) && Objects.equals(this.testStep, that.testStep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, actualResult, expectResult, testStep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseStepResultInfo {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    actualResult: ").append(toIndentedString(actualResult)).append("\n");
        sb.append("    expectResult: ").append(toIndentedString(expectResult)).append("\n");
        sb.append("    testStep: ").append(toIndentedString(testStep)).append("\n");
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
