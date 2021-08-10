package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateTestCaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTestCaseRequestBody body;

    public UpdateTestCaseRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目唯一标识，固定长度32位字符
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateTestCaseRequest withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /** 测试用例唯一标识，固定长度32位字符
     * 
     * @return testcaseId */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public UpdateTestCaseRequest withBody(UpdateTestCaseRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTestCaseRequest withBody(Consumer<UpdateTestCaseRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTestCaseRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateTestCaseRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTestCaseRequestBody body) {
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
        UpdateTestCaseRequest updateTestCaseRequest = (UpdateTestCaseRequest) o;
        return Objects.equals(this.projectId, updateTestCaseRequest.projectId)
            && Objects.equals(this.testcaseId, updateTestCaseRequest.testcaseId)
            && Objects.equals(this.body, updateTestCaseRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, testcaseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
