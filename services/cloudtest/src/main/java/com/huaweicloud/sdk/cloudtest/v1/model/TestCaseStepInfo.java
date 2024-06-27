package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对外测试步骤
 */
public class TestCaseStepInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_step")

    private String testStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_result")

    private String expectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_actual")

    private String stepActual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_result")

    private String stepResult;

    public TestCaseStepInfo withTestStep(String testStep) {
        this.testStep = testStep;
        return this;
    }

    /**
     * 测试步骤
     * @return testStep
     */
    public String getTestStep() {
        return testStep;
    }

    public void setTestStep(String testStep) {
        this.testStep = testStep;
    }

    public TestCaseStepInfo withExpectResult(String expectResult) {
        this.expectResult = expectResult;
        return this;
    }

    /**
     * 预期结果
     * @return expectResult
     */
    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public TestCaseStepInfo withStepActual(String stepActual) {
        this.stepActual = stepActual;
        return this;
    }

    /**
     * 步骤的实际结果
     * @return stepActual
     */
    public String getStepActual() {
        return stepActual;
    }

    public void setStepActual(String stepActual) {
        this.stepActual = stepActual;
    }

    public TestCaseStepInfo withStepResult(String stepResult) {
        this.stepResult = stepResult;
        return this;
    }

    /**
     * 步骤结果
     * @return stepResult
     */
    public String getStepResult() {
        return stepResult;
    }

    public void setStepResult(String stepResult) {
        this.stepResult = stepResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseStepInfo that = (TestCaseStepInfo) obj;
        return Objects.equals(this.testStep, that.testStep) && Objects.equals(this.expectResult, that.expectResult)
            && Objects.equals(this.stepActual, that.stepActual) && Objects.equals(this.stepResult, that.stepResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testStep, expectResult, stepActual, stepResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseStepInfo {\n");
        sb.append("    testStep: ").append(toIndentedString(testStep)).append("\n");
        sb.append("    expectResult: ").append(toIndentedString(expectResult)).append("\n");
        sb.append("    stepActual: ").append(toIndentedString(stepActual)).append("\n");
        sb.append("    stepResult: ").append(toIndentedString(stepResult)).append("\n");
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
