package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DebugCaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_id")

    @JacksonXmlProperty(localName = "test_suite_id")

    private Integer testSuiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private Integer taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    @JacksonXmlProperty(localName = "case_id")

    private Integer caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private DebugCaseRequestBody body;

    public DebugCaseRequest withTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * 测试工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuiteId
     */
    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public DebugCaseRequest withTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * minimum: 0
     * maximum: 2147483647
     * @return taskId
     */
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public DebugCaseRequest withCaseId(Integer caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例id
     * minimum: 0
     * maximum: 2147483647
     * @return caseId
     */
    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public DebugCaseRequest withBody(DebugCaseRequestBody body) {
        this.body = body;
        return this;
    }

    public DebugCaseRequest withBody(Consumer<DebugCaseRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DebugCaseRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DebugCaseRequestBody getBody() {
        return body;
    }

    public void setBody(DebugCaseRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugCaseRequest debugCaseRequest = (DebugCaseRequest) o;
        return Objects.equals(this.testSuiteId, debugCaseRequest.testSuiteId)
            && Objects.equals(this.taskId, debugCaseRequest.taskId)
            && Objects.equals(this.caseId, debugCaseRequest.caseId) && Objects.equals(this.body, debugCaseRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testSuiteId, taskId, caseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugCaseRequest {\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
