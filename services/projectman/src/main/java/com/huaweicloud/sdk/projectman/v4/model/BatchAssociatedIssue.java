package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联工作项详情
 */
public class BatchAssociatedIssue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_issue_id")

    private Integer sourceIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private SimpleProject project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private SimpleUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusVo status;

    public BatchAssociatedIssue withSourceIssueId(Integer sourceIssueId) {
        this.sourceIssueId = sourceIssueId;
        return this;
    }

    /**
     * 关联工作项ID
     * @return sourceIssueId
     */
    public Integer getSourceIssueId() {
        return sourceIssueId;
    }

    public void setSourceIssueId(Integer sourceIssueId) {
        this.sourceIssueId = sourceIssueId;
    }

    public BatchAssociatedIssue withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 工作项标题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BatchAssociatedIssue withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项ID
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public BatchAssociatedIssue withProject(SimpleProject project) {
        this.project = project;
        return this;
    }

    public BatchAssociatedIssue withProject(Consumer<SimpleProject> projectSetter) {
        if (this.project == null) {
            this.project = new SimpleProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public SimpleProject getProject() {
        return project;
    }

    public void setProject(SimpleProject project) {
        this.project = project;
    }

    public BatchAssociatedIssue withUser(SimpleUser user) {
        this.user = user;
        return this;
    }

    public BatchAssociatedIssue withUser(Consumer<SimpleUser> userSetter) {
        if (this.user == null) {
            this.user = new SimpleUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public BatchAssociatedIssue withStatus(StatusVo status) {
        this.status = status;
        return this;
    }

    public BatchAssociatedIssue withStatus(Consumer<StatusVo> statusSetter) {
        if (this.status == null) {
            this.status = new StatusVo();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusVo getStatus() {
        return status;
    }

    public void setStatus(StatusVo status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAssociatedIssue that = (BatchAssociatedIssue) obj;
        return Objects.equals(this.sourceIssueId, that.sourceIssueId) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.issueId, that.issueId) && Objects.equals(this.project, that.project)
            && Objects.equals(this.user, that.user) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceIssueId, subject, issueId, project, user, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAssociatedIssue {\n");
        sb.append("    sourceIssueId: ").append(toIndentedString(sourceIssueId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
