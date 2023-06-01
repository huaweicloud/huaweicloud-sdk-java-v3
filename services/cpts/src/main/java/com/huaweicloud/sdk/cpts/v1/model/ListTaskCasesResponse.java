package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTaskCasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_cases")

    private List<TestCaseBriefInfo> testCases = null;

    public ListTaskCasesResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListTaskCasesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListTaskCasesResponse withTestCases(List<TestCaseBriefInfo> testCases) {
        this.testCases = testCases;
        return this;
    }

    public ListTaskCasesResponse addTestCasesItem(TestCaseBriefInfo testCasesItem) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        this.testCases.add(testCasesItem);
        return this;
    }

    public ListTaskCasesResponse withTestCases(Consumer<List<TestCaseBriefInfo>> testCasesSetter) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        testCasesSetter.accept(this.testCases);
        return this;
    }

    /**
     * 用例列表
     * @return testCases
     */
    public List<TestCaseBriefInfo> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCaseBriefInfo> testCases) {
        this.testCases = testCases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTaskCasesResponse listTaskCasesResponse = (ListTaskCasesResponse) o;
        return Objects.equals(this.code, listTaskCasesResponse.code)
            && Objects.equals(this.message, listTaskCasesResponse.message)
            && Objects.equals(this.testCases, listTaskCasesResponse.testCases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, testCases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskCasesResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
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
