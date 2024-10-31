package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试步骤信息
 */
public class ResultStepVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_step")

    private String testStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_result")

    private String expectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_result")

    private String actualResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_name")

    private String resultName;

    public ResultStepVo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ResultStepVo withTestStep(String testStep) {
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

    public ResultStepVo withExpectResult(String expectResult) {
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

    public ResultStepVo withActualResult(String actualResult) {
        this.actualResult = actualResult;
        return this;
    }

    /**
     * 实际结果
     * @return actualResult
     */
    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public ResultStepVo withResultName(String resultName) {
        this.resultName = resultName;
        return this;
    }

    /**
     * 测试结果名称
     * @return resultName
     */
    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultStepVo that = (ResultStepVo) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.testStep, that.testStep)
            && Objects.equals(this.expectResult, that.expectResult)
            && Objects.equals(this.actualResult, that.actualResult) && Objects.equals(this.resultName, that.resultName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, testStep, expectResult, actualResult, resultName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultStepVo {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    testStep: ").append(toIndentedString(testStep)).append("\n");
        sb.append("    expectResult: ").append(toIndentedString(expectResult)).append("\n");
        sb.append("    actualResult: ").append(toIndentedString(actualResult)).append("\n");
        sb.append("    resultName: ").append(toIndentedString(resultName)).append("\n");
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
