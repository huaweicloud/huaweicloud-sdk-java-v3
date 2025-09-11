package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListIpdProjectIssuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_backlog")

    private Boolean isBacklog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_type")

    private String issueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_domain_id")

    private String srcDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view")

    private String view;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SearchIpdIssuesRequestBody body;

    public ListIpdProjectIssuesRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListIpdProjectIssuesRequest withIsBacklog(Boolean isBacklog) {
        this.isBacklog = isBacklog;
        return this;
    }

    /**
     * 是否backlog查询
     * @return isBacklog
     */
    public Boolean getIsBacklog() {
        return isBacklog;
    }

    public void setIsBacklog(Boolean isBacklog) {
        this.isBacklog = isBacklog;
    }

    public ListIpdProjectIssuesRequest withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * 工作项分类：[Epic,FE,IR,RR,SR,US,AR,Bug,Task]
     * @return issueType
     */
    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public ListIpdProjectIssuesRequest withSrcDomainId(String srcDomainId) {
        this.srcDomainId = srcDomainId;
        return this;
    }

    /**
     * 提出项目Id
     * @return srcDomainId
     */
    public String getSrcDomainId() {
        return srcDomainId;
    }

    public void setSrcDomainId(String srcDomainId) {
        this.srcDomainId = srcDomainId;
    }

    public ListIpdProjectIssuesRequest withView(String view) {
        this.view = view;
        return this;
    }

    /**
     * 视图模式[tree,list]
     * @return view
     */
    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public ListIpdProjectIssuesRequest withBody(SearchIpdIssuesRequestBody body) {
        this.body = body;
        return this;
    }

    public ListIpdProjectIssuesRequest withBody(Consumer<SearchIpdIssuesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SearchIpdIssuesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SearchIpdIssuesRequestBody getBody() {
        return body;
    }

    public void setBody(SearchIpdIssuesRequestBody body) {
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
        ListIpdProjectIssuesRequest that = (ListIpdProjectIssuesRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isBacklog, that.isBacklog)
            && Objects.equals(this.issueType, that.issueType) && Objects.equals(this.srcDomainId, that.srcDomainId)
            && Objects.equals(this.view, that.view) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, isBacklog, issueType, srcDomainId, view, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpdProjectIssuesRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isBacklog: ").append(toIndentedString(isBacklog)).append("\n");
        sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
        sb.append("    srcDomainId: ").append(toIndentedString(srcDomainId)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
