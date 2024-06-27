package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListIteratorIssueTreeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_id")

    private String iteratorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IssueTreeInfo body;

    public ListIteratorIssueTreeRequest withProjectId(String projectId) {
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

    public ListIteratorIssueTreeRequest withIteratorId(String iteratorId) {
        this.iteratorId = iteratorId;
        return this;
    }

    /**
     * 迭代uri
     * @return iteratorId
     */
    public String getIteratorId() {
        return iteratorId;
    }

    public void setIteratorId(String iteratorId) {
        this.iteratorId = iteratorId;
    }

    public ListIteratorIssueTreeRequest withBody(IssueTreeInfo body) {
        this.body = body;
        return this;
    }

    public ListIteratorIssueTreeRequest withBody(Consumer<IssueTreeInfo> bodySetter) {
        if (this.body == null) {
            this.body = new IssueTreeInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IssueTreeInfo getBody() {
        return body;
    }

    public void setBody(IssueTreeInfo body) {
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
        ListIteratorIssueTreeRequest that = (ListIteratorIssueTreeRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.iteratorId, that.iteratorId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, iteratorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIteratorIssueTreeRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    iteratorId: ").append(toIndentedString(iteratorId)).append("\n");
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
