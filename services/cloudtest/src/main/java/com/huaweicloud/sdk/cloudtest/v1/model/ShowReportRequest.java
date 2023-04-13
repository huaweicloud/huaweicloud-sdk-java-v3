package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowReportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private GenerateReportInfo body;

    public ShowReportRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowReportRequest withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 分支/计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public ShowReportRequest withBody(GenerateReportInfo body) {
        this.body = body;
        return this;
    }

    public ShowReportRequest withBody(Consumer<GenerateReportInfo> bodySetter) {
        if (this.body == null) {
            this.body = new GenerateReportInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public GenerateReportInfo getBody() {
        return body;
    }

    public void setBody(GenerateReportInfo body) {
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
        ShowReportRequest showReportRequest = (ShowReportRequest) o;
        return Objects.equals(this.projectId, showReportRequest.projectId)
            && Objects.equals(this.planId, showReportRequest.planId)
            && Objects.equals(this.body, showReportRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, planId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportRequest {\n");
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
