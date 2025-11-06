package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户下仓库列表
 */
public class TenantRepositoryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Double capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_number")

    private Integer memberNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public TenantRepositoryDto withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释：** 仓库所有者。 **取值范围：** 字符串长度不少于1，不超过128。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TenantRepositoryDto withCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释：** 仓库容量,单位:MB,保留2位小数。 **取值范围：** 不涉及。
     * @return capacity
     */
    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public TenantRepositoryDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 仓库状态。 **取值范围：** - 0，正常。 - 3，冻结。 - 4，关闭。 - 5，清理中。 - 7，删除中。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TenantRepositoryDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * **参数解释：** 内容审核结果。 **取值范围：** true，审核通过。 false，审核未通过。
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    public TenantRepositoryDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TenantRepositoryDto withMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
        return this;
    }

    /**
     * **参数解释：** 成员数量。 **取值范围：** 不涉及。
     * @return memberNumber
     */
    public Integer getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    public TenantRepositoryDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库Id。 **取值范围：** 不涉及。
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public TenantRepositoryDto withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释：** 仓库名。 **取值范围：** 不涉及。
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public TenantRepositoryDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名。 **取值范围：** 不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TenantRepositoryDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目Id。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantRepositoryDto that = (TenantRepositoryDto) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.status, that.status) && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.memberNumber, that.memberNumber)
            && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner,
            capacity,
            status,
            moderationResult,
            createTime,
            memberNumber,
            repositoryId,
            repositoryName,
            projectName,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantRepositoryDto {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    memberNumber: ").append(toIndentedString(memberNumber)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
