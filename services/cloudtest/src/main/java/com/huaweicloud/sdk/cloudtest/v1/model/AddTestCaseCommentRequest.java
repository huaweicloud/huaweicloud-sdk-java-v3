package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddTestCaseCommentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TestCaseCommentInfo body;

    public AddTestCaseCommentRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AddTestCaseCommentRequest withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 用例uri
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public AddTestCaseCommentRequest withBody(TestCaseCommentInfo body) {
        this.body = body;
        return this;
    }

    public AddTestCaseCommentRequest withBody(Consumer<TestCaseCommentInfo> bodySetter) {
        if (this.body == null) {
            this.body = new TestCaseCommentInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TestCaseCommentInfo getBody() {
        return body;
    }

    public void setBody(TestCaseCommentInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTestCaseCommentRequest that = (AddTestCaseCommentRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.testcaseId, that.testcaseId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, testcaseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTestCaseCommentRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
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
