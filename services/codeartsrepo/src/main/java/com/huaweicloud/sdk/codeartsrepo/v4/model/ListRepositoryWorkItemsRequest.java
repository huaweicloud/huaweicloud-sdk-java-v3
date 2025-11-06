package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRepositoryWorkItemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ipd")

    private Boolean isIpd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    public ListRepositoryWorkItemsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListRepositoryWorkItemsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRepositoryWorkItemsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRepositoryWorkItemsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位uuid，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/en-us/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **取值范围：** 字符串长度32。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListRepositoryWorkItemsRequest withIsIpd(Boolean isIpd) {
        this.isIpd = isIpd;
        return this;
    }

    /**
     * **参数解释：** 是否为IPD类型项目的工作项。 **取值范围：** true/false
     * @return isIpd
     */
    public Boolean getIsIpd() {
        return isIpd;
    }

    public void setIsIpd(Boolean isIpd) {
        this.isIpd = isIpd;
    }

    public ListRepositoryWorkItemsRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * **参数解释：** 工作项标题搜索关键字。 **取值范围：** 字符串长度不少于1，不超过200。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ListRepositoryWorkItemsRequest withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * **参数解释：** 合并请求的目标分支，如果要获取合并请求可关联的工作项列表，则需要传递该字段。  **约束限制：** 不支持以 - . refs/heads/ refs/remotes/ 开头，不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾。  **取值范围：** 字符串长度不少于1，不超过200。 **默认取值：** 不涉及。
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryWorkItemsRequest that = (ListRepositoryWorkItemsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.isIpd, that.isIpd) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.targetBranch, that.targetBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, offset, limit, projectId, isIpd, subject, targetBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryWorkItemsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isIpd: ").append(toIndentedString(isIpd)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
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
