package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTestCaseInPlanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTestCaseInPlanRequestBody body;

    public CreateTestCaseInPlanRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目唯一标识，固定长度32位字符
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateTestCaseInPlanRequest withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 计划唯一标识，固定长度32位字符
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public CreateTestCaseInPlanRequest withBody(CreateTestCaseInPlanRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTestCaseInPlanRequest withBody(Consumer<CreateTestCaseInPlanRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTestCaseInPlanRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTestCaseInPlanRequestBody getBody() {
        return body;
    }

    public void setBody(CreateTestCaseInPlanRequestBody body) {
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
        CreateTestCaseInPlanRequest createTestCaseInPlanRequest = (CreateTestCaseInPlanRequest) o;
        return Objects.equals(this.projectId, createTestCaseInPlanRequest.projectId)
            && Objects.equals(this.planId, createTestCaseInPlanRequest.planId)
            && Objects.equals(this.body, createTestCaseInPlanRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, planId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTestCaseInPlanRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
