package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSpecIssueStayTimesRequestBody
 */
public class ListSpecIssueStayTimesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_ids")

    private List<String> issueIds = null;

    public ListSpecIssueStayTimesRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目uuid
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListSpecIssueStayTimesRequestBody withIssueIds(List<String> issueIds) {
        this.issueIds = issueIds;
        return this;
    }

    public ListSpecIssueStayTimesRequestBody addIssueIdsItem(String issueIdsItem) {
        if (this.issueIds == null) {
            this.issueIds = new ArrayList<>();
        }
        this.issueIds.add(issueIdsItem);
        return this;
    }

    public ListSpecIssueStayTimesRequestBody withIssueIds(Consumer<List<String>> issueIdsSetter) {
        if (this.issueIds == null) {
            this.issueIds = new ArrayList<>();
        }
        issueIdsSetter.accept(this.issueIds);
        return this;
    }

    /**
     * 工作项id字符串列表
     * @return issueIds
     */
    public List<String> getIssueIds() {
        return issueIds;
    }

    public void setIssueIds(List<String> issueIds) {
        this.issueIds = issueIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSpecIssueStayTimesRequestBody listSpecIssueStayTimesRequestBody = (ListSpecIssueStayTimesRequestBody) o;
        return Objects.equals(this.projectId, listSpecIssueStayTimesRequestBody.projectId)
            && Objects.equals(this.issueIds, listSpecIssueStayTimesRequestBody.issueIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, issueIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecIssueStayTimesRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
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
