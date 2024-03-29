package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 响应json
 */
public class CreaseCaseResponseJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_id")

    private Integer testCaseId;

    public CreaseCaseResponseJson withTestCaseId(Integer testCaseId) {
        this.testCaseId = testCaseId;
        return this;
    }

    /**
     * 用例id
     * @return testCaseId
     */
    public Integer getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(Integer testCaseId) {
        this.testCaseId = testCaseId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreaseCaseResponseJson that = (CreaseCaseResponseJson) obj;
        return Objects.equals(this.testCaseId, that.testCaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testCaseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreaseCaseResponseJson {\n");
        sb.append("    testCaseId: ").append(toIndentedString(testCaseId)).append("\n");
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
