package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListVariablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private Integer variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_id")

    private Integer testSuiteId;

    public ListVariablesRequest withVariableType(Integer variableType) {
        this.variableType = variableType;
        return this;
    }

    /** 变量类型 minimum: 0 maximum: 2147483647
     * 
     * @return variableType */
    public Integer getVariableType() {
        return variableType;
    }

    public void setVariableType(Integer variableType) {
        this.variableType = variableType;
    }

    public ListVariablesRequest withTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /** 测试工程id minimum: 0 maximum: 2147483647
     * 
     * @return testSuiteId */
    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVariablesRequest listVariablesRequest = (ListVariablesRequest) o;
        return Objects.equals(this.variableType, listVariablesRequest.variableType)
            && Objects.equals(this.testSuiteId, listVariablesRequest.testSuiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableType, testSuiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVariablesRequest {\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
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
