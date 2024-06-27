package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTestCasesByIssueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QueryTestCasesByIssueInfo body;

    public ListTestCasesByIssueRequest withProjectId(String projectId) {
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

    public ListTestCasesByIssueRequest withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 需求id
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public ListTestCasesByIssueRequest withBody(QueryTestCasesByIssueInfo body) {
        this.body = body;
        return this;
    }

    public ListTestCasesByIssueRequest withBody(Consumer<QueryTestCasesByIssueInfo> bodySetter) {
        if (this.body == null) {
            this.body = new QueryTestCasesByIssueInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public QueryTestCasesByIssueInfo getBody() {
        return body;
    }

    public void setBody(QueryTestCasesByIssueInfo body) {
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
        ListTestCasesByIssueRequest that = (ListTestCasesByIssueRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, issueId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestCasesByIssueRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
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
