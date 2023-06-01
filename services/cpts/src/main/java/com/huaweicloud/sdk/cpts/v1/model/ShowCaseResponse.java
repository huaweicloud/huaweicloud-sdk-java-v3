package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case")

    private CaseInfoDetail testCase;

    public ShowCaseResponse withCode(String code) {
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

    public ShowCaseResponse withMessage(String message) {
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

    public ShowCaseResponse withTestCase(CaseInfoDetail testCase) {
        this.testCase = testCase;
        return this;
    }

    public ShowCaseResponse withTestCase(Consumer<CaseInfoDetail> testCaseSetter) {
        if (this.testCase == null) {
            this.testCase = new CaseInfoDetail();
            testCaseSetter.accept(this.testCase);
        }

        return this;
    }

    /**
     * Get testCase
     * @return testCase
     */
    public CaseInfoDetail getTestCase() {
        return testCase;
    }

    public void setTestCase(CaseInfoDetail testCase) {
        this.testCase = testCase;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCaseResponse showCaseResponse = (ShowCaseResponse) o;
        return Objects.equals(this.code, showCaseResponse.code)
            && Objects.equals(this.message, showCaseResponse.message)
            && Objects.equals(this.testCase, showCaseResponse.testCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, testCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCaseResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    testCase: ").append(toIndentedString(testCase)).append("\n");
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
