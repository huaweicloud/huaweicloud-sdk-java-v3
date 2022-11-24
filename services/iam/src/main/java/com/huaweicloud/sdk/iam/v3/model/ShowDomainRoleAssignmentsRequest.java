package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDomainRoleAssignmentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject.user_id")

    private String subjectUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject.group_id")

    private String subjectGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject.agency_id")

    private String subjectAgencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope.project_id")

    private String scopeProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope.domain_id")

    private String scopeDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope.enterprise_projects_id")

    private String scopeEnterpriseProjectsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_inherited")

    private Boolean isInherited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_group")

    private Boolean includeGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private String page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private String perPage;

    public ShowDomainRoleAssignmentsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 待查询账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowDomainRoleAssignmentsRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 策略ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ShowDomainRoleAssignmentsRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 授权主体,取值范围：user、group、agency。该参数与subject.user_id、subject.group_id、subject.agency_id只能选择一个。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ShowDomainRoleAssignmentsRequest withSubjectUserId(String subjectUserId) {
        this.subjectUserId = subjectUserId;
        return this;
    }

    /**
     * 授权的IAM用户ID。
     * @return subjectUserId
     */
    public String getSubjectUserId() {
        return subjectUserId;
    }

    public void setSubjectUserId(String subjectUserId) {
        this.subjectUserId = subjectUserId;
    }

    public ShowDomainRoleAssignmentsRequest withSubjectGroupId(String subjectGroupId) {
        this.subjectGroupId = subjectGroupId;
        return this;
    }

    /**
     * 授权的用户组ID。
     * @return subjectGroupId
     */
    public String getSubjectGroupId() {
        return subjectGroupId;
    }

    public void setSubjectGroupId(String subjectGroupId) {
        this.subjectGroupId = subjectGroupId;
    }

    public ShowDomainRoleAssignmentsRequest withSubjectAgencyId(String subjectAgencyId) {
        this.subjectAgencyId = subjectAgencyId;
        return this;
    }

    /**
     * 授权的委托ID。
     * @return subjectAgencyId
     */
    public String getSubjectAgencyId() {
        return subjectAgencyId;
    }

    public void setSubjectAgencyId(String subjectAgencyId) {
        this.subjectAgencyId = subjectAgencyId;
    }

    public ShowDomainRoleAssignmentsRequest withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 授权范围，取值范围：project、domain、enterprise_project。该参数与scope.project_id、scope.domain_id、scope.enterprise_projects_id只能选择一个。 > - 如需查看全局服务授权记录，scope取值domain或填写scope.domain_id。 > - 如需查看基于所有资源的授权记录，scope取值为domain，且is_inherited取值为true > - 如需查看基于项目的授权记录，scope取值为project或填写scope.project_id。 > - 如需查看基于企业项目的授权记录，scope取值为enterprise_project或填写scope.enterprise_project_id。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ShowDomainRoleAssignmentsRequest withScopeProjectId(String scopeProjectId) {
        this.scopeProjectId = scopeProjectId;
        return this;
    }

    /**
     * 授权的项目ID。
     * @return scopeProjectId
     */
    public String getScopeProjectId() {
        return scopeProjectId;
    }

    public void setScopeProjectId(String scopeProjectId) {
        this.scopeProjectId = scopeProjectId;
    }

    public ShowDomainRoleAssignmentsRequest withScopeDomainId(String scopeDomainId) {
        this.scopeDomainId = scopeDomainId;
        return this;
    }

    /**
     * 待查询账号ID。
     * @return scopeDomainId
     */
    public String getScopeDomainId() {
        return scopeDomainId;
    }

    public void setScopeDomainId(String scopeDomainId) {
        this.scopeDomainId = scopeDomainId;
    }

    public ShowDomainRoleAssignmentsRequest withScopeEnterpriseProjectsId(String scopeEnterpriseProjectsId) {
        this.scopeEnterpriseProjectsId = scopeEnterpriseProjectsId;
        return this;
    }

    /**
     * 授权的企业项目ID。
     * @return scopeEnterpriseProjectsId
     */
    public String getScopeEnterpriseProjectsId() {
        return scopeEnterpriseProjectsId;
    }

    public void setScopeEnterpriseProjectsId(String scopeEnterpriseProjectsId) {
        this.scopeEnterpriseProjectsId = scopeEnterpriseProjectsId;
    }

    public ShowDomainRoleAssignmentsRequest withIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
        return this;
    }

    /**
     * 是否包含基于所有项目授权的记录，默认为false。当参数scope=domain或者scope.domain_id存在时生效。true：查询基于所有项目授权的记录。 false：查询基于全局服务授权的记录。
     * @return isInherited
     */
    public Boolean getIsInherited() {
        return isInherited;
    }

    public void setIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
    }

    public ShowDomainRoleAssignmentsRequest withIncludeGroup(Boolean includeGroup) {
        this.includeGroup = includeGroup;
        return this;
    }

    /**
     * 是否包含基于IAM用户所属用户组授权的记录，默认为true。当参数subject=user或者subject.user_id存在时生效。true：查询基于IAM用户授权、IAM用户所属用户组授权的记录。 false：仅查询基于IAM用户授权的记录。
     * @return includeGroup
     */
    public Boolean getIncludeGroup() {
        return includeGroup;
    }

    public void setIncludeGroup(Boolean includeGroup) {
        this.includeGroup = includeGroup;
    }

    public ShowDomainRoleAssignmentsRequest withPage(String page) {
        this.page = page;
        return this;
    }

    /**
     * 分页查询时数据的页数，查询值最小为1。需要与per_page同时存在。
     * @return page
     */
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public ShowDomainRoleAssignmentsRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 分页查询时每页的数据个数，取值范围为[1,50]。需要与page同时存在。
     * @return perPage
     */
    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainRoleAssignmentsRequest showDomainRoleAssignmentsRequest = (ShowDomainRoleAssignmentsRequest) o;
        return Objects.equals(this.domainId, showDomainRoleAssignmentsRequest.domainId)
            && Objects.equals(this.roleId, showDomainRoleAssignmentsRequest.roleId)
            && Objects.equals(this.subject, showDomainRoleAssignmentsRequest.subject)
            && Objects.equals(this.subjectUserId, showDomainRoleAssignmentsRequest.subjectUserId)
            && Objects.equals(this.subjectGroupId, showDomainRoleAssignmentsRequest.subjectGroupId)
            && Objects.equals(this.subjectAgencyId, showDomainRoleAssignmentsRequest.subjectAgencyId)
            && Objects.equals(this.scope, showDomainRoleAssignmentsRequest.scope)
            && Objects.equals(this.scopeProjectId, showDomainRoleAssignmentsRequest.scopeProjectId)
            && Objects.equals(this.scopeDomainId, showDomainRoleAssignmentsRequest.scopeDomainId)
            && Objects.equals(this.scopeEnterpriseProjectsId,
                showDomainRoleAssignmentsRequest.scopeEnterpriseProjectsId)
            && Objects.equals(this.isInherited, showDomainRoleAssignmentsRequest.isInherited)
            && Objects.equals(this.includeGroup, showDomainRoleAssignmentsRequest.includeGroup)
            && Objects.equals(this.page, showDomainRoleAssignmentsRequest.page)
            && Objects.equals(this.perPage, showDomainRoleAssignmentsRequest.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            roleId,
            subject,
            subjectUserId,
            subjectGroupId,
            subjectAgencyId,
            scope,
            scopeProjectId,
            scopeDomainId,
            scopeEnterpriseProjectsId,
            isInherited,
            includeGroup,
            page,
            perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainRoleAssignmentsRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    subjectUserId: ").append(toIndentedString(subjectUserId)).append("\n");
        sb.append("    subjectGroupId: ").append(toIndentedString(subjectGroupId)).append("\n");
        sb.append("    subjectAgencyId: ").append(toIndentedString(subjectAgencyId)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    scopeProjectId: ").append(toIndentedString(scopeProjectId)).append("\n");
        sb.append("    scopeDomainId: ").append(toIndentedString(scopeDomainId)).append("\n");
        sb.append("    scopeEnterpriseProjectsId: ").append(toIndentedString(scopeEnterpriseProjectsId)).append("\n");
        sb.append("    isInherited: ").append(toIndentedString(isInherited)).append("\n");
        sb.append("    includeGroup: ").append(toIndentedString(includeGroup)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
