package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class QueryIssueAssociatedItemRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_type")

    private String issueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_field_code")

    private String linkFieldCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private String pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private String pageSize;

    public QueryIssueAssociatedItemRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public QueryIssueAssociatedItemRequest withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项唯一ID。可以通过查询工作项列表或者查询树状工作项接口获取，响应消息体中的id字段的值就是工作项ID。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public QueryIssueAssociatedItemRequest withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * 工作项类型。
     * @return issueType
     */
    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public QueryIssueAssociatedItemRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 项目空间ID，可以通过查询IPD项目列表接口获取，响应消息体中的domain_id字段的值就是项目空间ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public QueryIssueAssociatedItemRequest withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 目标项目的32位uuid，项目唯一标识，通过查询IPD项目列表获取，响应消息体中的project_id字段的值就是项目ID。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public QueryIssueAssociatedItemRequest withLinkFieldCode(String linkFieldCode) {
        this.linkFieldCode = linkFieldCode;
        return this;
    }

    /**
     * 关联字段的字段编码。
     * @return linkFieldCode
     */
    public String getLinkFieldCode() {
        return linkFieldCode;
    }

    public void setLinkFieldCode(String linkFieldCode) {
        this.linkFieldCode = linkFieldCode;
    }

    public QueryIssueAssociatedItemRequest withPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 分页参数，当前页。
     * @return pageNo
     */
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public QueryIssueAssociatedItemRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页参数，页长。
     * @return pageSize
     */
    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryIssueAssociatedItemRequest that = (QueryIssueAssociatedItemRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.issueType, that.issueType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.linkFieldCode, that.linkFieldCode) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, issueId, issueType, domainId, targetProjectId, linkFieldCode, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryIssueAssociatedItemRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    linkFieldCode: ").append(toIndentedString(linkFieldCode)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
