package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CaseDocSteps
 */
public class CaseDocSteps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_result")

    private String expectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_step")

    private String testStep;

    public CaseDocSteps withExpectResult(String expectResult) {
        this.expectResult = expectResult;
        return this;
    }

    /**
     * 步骤描述
     * @return expectResult
     */
    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public CaseDocSteps withTestStep(String testStep) {
        this.testStep = testStep;
        return this;
    }

    /**
     * 预期结果
     * @return testStep
     */
    public String getTestStep() {
        return testStep;
    }

    public void setTestStep(String testStep) {
        this.testStep = testStep;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaseDocSteps caseDocSteps = (CaseDocSteps) o;
        return Objects.equals(this.expectResult, caseDocSteps.expectResult)
            && Objects.equals(this.testStep, caseDocSteps.testStep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectResult, testStep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseDocSteps {\n");
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
