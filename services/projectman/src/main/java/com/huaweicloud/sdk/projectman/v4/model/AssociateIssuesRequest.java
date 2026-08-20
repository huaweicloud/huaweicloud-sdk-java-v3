package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateIssuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_domain_id")

    private String dstDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IssueAssociateVO body;

    public AssociateIssuesRequest withProjectId(String projectId) {
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

    public AssociateIssuesRequest withIssueId(String issueId) {
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

    public AssociateIssuesRequest withDstDomainId(String dstDomainId) {
        this.dstDomainId = dstDomainId;
        return this;
    }

    /**
     * 目标项目的32位UUID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。非跨项目场景，与请求路径中的project_id一致。
     * @return dstDomainId
     */
    public String getDstDomainId() {
        return dstDomainId;
    }

    public void setDstDomainId(String dstDomainId) {
        this.dstDomainId = dstDomainId;
    }

    public AssociateIssuesRequest withBody(IssueAssociateVO body) {
        this.body = body;
        return this;
    }

    public AssociateIssuesRequest withBody(Consumer<IssueAssociateVO> bodySetter) {
        if (this.body == null) {
            this.body = new IssueAssociateVO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IssueAssociateVO getBody() {
        return body;
    }

    public void setBody(IssueAssociateVO body) {
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
        AssociateIssuesRequest that = (AssociateIssuesRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.dstDomainId, that.dstDomainId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, issueId, dstDomainId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateIssuesRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    dstDomainId: ").append(toIndentedString(dstDomainId)).append("\n");
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
