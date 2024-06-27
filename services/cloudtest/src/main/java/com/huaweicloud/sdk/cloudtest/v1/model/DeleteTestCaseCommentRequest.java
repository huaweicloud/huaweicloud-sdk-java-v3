package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTestCaseCommentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment_id")

    private String commentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    public DeleteTestCaseCommentRequest withProjectId(String projectId) {
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

    public DeleteTestCaseCommentRequest withTestcaseId(String testcaseId) {
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

    public DeleteTestCaseCommentRequest withCommentId(String commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * 评论uri
     * @return commentId
     */
    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public DeleteTestCaseCommentRequest withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支或者测试计划uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTestCaseCommentRequest that = (DeleteTestCaseCommentRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.testcaseId, that.testcaseId)
            && Objects.equals(this.commentId, that.commentId) && Objects.equals(this.versionUri, that.versionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, testcaseId, commentId, versionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTestCaseCommentRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
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
