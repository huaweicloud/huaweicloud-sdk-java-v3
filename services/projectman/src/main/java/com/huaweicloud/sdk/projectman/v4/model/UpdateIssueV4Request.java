package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateIssueV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IssueRequestV4 body;

    public UpdateIssueV4Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** devcloud的项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateIssueV4Request withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /** 工作项id
     * 
     * @return issueId */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public UpdateIssueV4Request withBody(IssueRequestV4 body) {
        this.body = body;
        return this;
    }

    public UpdateIssueV4Request withBody(Consumer<IssueRequestV4> bodySetter) {
        if (this.body == null) {
            this.body = new IssueRequestV4();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public IssueRequestV4 getBody() {
        return body;
    }

    public void setBody(IssueRequestV4 body) {
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
        UpdateIssueV4Request updateIssueV4Request = (UpdateIssueV4Request) o;
        return Objects.equals(this.projectId, updateIssueV4Request.projectId)
            && Objects.equals(this.issueId, updateIssueV4Request.issueId)
            && Objects.equals(this.body, updateIssueV4Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, issueId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIssueV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
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
