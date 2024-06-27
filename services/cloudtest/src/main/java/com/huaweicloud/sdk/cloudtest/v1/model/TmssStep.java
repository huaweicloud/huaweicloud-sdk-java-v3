package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TmssStep
 */
public class TmssStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expectResult")

    private String expectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testStep")

    private String testStep;

    public TmssStep withExpectResult(String expectResult) {
        this.expectResult = expectResult;
        return this;
    }

    /**
     * 测试步骤
     * @return expectResult
     */
    public String getExpectResult() {
        return expectResult;
    }

    public void setExpectResult(String expectResult) {
        this.expectResult = expectResult;
    }

    public TmssStep withTestStep(String testStep) {
        this.testStep = testStep;
        return this;
    }

    /**
     * 预期结果对象
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
        TmssStep that = (TmssStep) obj;
        return Objects.equals(this.expectResult, that.expectResult) && Objects.equals(this.testStep, that.testStep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expectResult, testStep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmssStep {\n");
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
