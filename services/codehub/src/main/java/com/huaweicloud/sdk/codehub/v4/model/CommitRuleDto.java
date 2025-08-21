package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommitRuleDto
 */
public class CommitRuleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message_regex")

    private String commitMessageRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message_negative_regex")

    private String commitMessageNegativeRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prohibited_file_name_regex")

    private String prohibitedFileNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email_regex")

    private String authorEmailRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_file_size")

    private Integer maxFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_max_file_size")

    private Integer allowedMaxFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    private String effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binary_gate_enabled")

    private Boolean binaryGateEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_users")

    private List<RepositoryUserBasicDto> privilegedUsers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_modify_binary")

    private Boolean allowedModifyBinary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_binary_file_name_regex")

    private String allowedBinaryFileNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_regex")

    private Object authorRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_rule_check")

    private Boolean skipRuleCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_rule_end_date")

    private String skipRuleEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public CommitRuleDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 主键ID。 **取值范围：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CommitRuleDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。 **取值范围：** 不涉及。
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

    public CommitRuleDto withCommitMessageRegex(String commitMessageRegex) {
        this.commitMessageRegex = commitMessageRegex;
        return this;
    }

    /**
     * **参数解释：** 提交信息匹配规则。
     * @return commitMessageRegex
     */
    public String getCommitMessageRegex() {
        return commitMessageRegex;
    }

    public void setCommitMessageRegex(String commitMessageRegex) {
        this.commitMessageRegex = commitMessageRegex;
    }

    public CommitRuleDto withCommitMessageNegativeRegex(String commitMessageNegativeRegex) {
        this.commitMessageNegativeRegex = commitMessageNegativeRegex;
        return this;
    }

    /**
     * **参数解释：** 提交信息负面匹配规则。
     * @return commitMessageNegativeRegex
     */
    public String getCommitMessageNegativeRegex() {
        return commitMessageNegativeRegex;
    }

    public void setCommitMessageNegativeRegex(String commitMessageNegativeRegex) {
        this.commitMessageNegativeRegex = commitMessageNegativeRegex;
    }

    public CommitRuleDto withProhibitedFileNameRegex(String prohibitedFileNameRegex) {
        this.prohibitedFileNameRegex = prohibitedFileNameRegex;
        return this;
    }

    /**
     * **参数解释：** 禁止提交的文件名称。
     * @return prohibitedFileNameRegex
     */
    public String getProhibitedFileNameRegex() {
        return prohibitedFileNameRegex;
    }

    public void setProhibitedFileNameRegex(String prohibitedFileNameRegex) {
        this.prohibitedFileNameRegex = prohibitedFileNameRegex;
    }

    public CommitRuleDto withAuthorEmailRegex(String authorEmailRegex) {
        this.authorEmailRegex = authorEmailRegex;
        return this;
    }

    /**
     * **参数解释：** 提交人邮箱地址。
     * @return authorEmailRegex
     */
    public String getAuthorEmailRegex() {
        return authorEmailRegex;
    }

    public void setAuthorEmailRegex(String authorEmailRegex) {
        this.authorEmailRegex = authorEmailRegex;
    }

    public CommitRuleDto withMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * **参数解释：** 单文件大小限制（MB）。
     * minimum: 0
     * maximum: 300
     * @return maxFileSize
     */
    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public CommitRuleDto withAllowedMaxFileSize(Integer allowedMaxFileSize) {
        this.allowedMaxFileSize = allowedMaxFileSize;
        return this;
    }

    /**
     * **参数解释：** 允许的最大单文件大小（MB）。
     * minimum: 0
     * maximum: 300
     * @return allowedMaxFileSize
     */
    public Integer getAllowedMaxFileSize() {
        return allowedMaxFileSize;
    }

    public void setAllowedMaxFileSize(Integer allowedMaxFileSize) {
        this.allowedMaxFileSize = allowedMaxFileSize;
    }

    public CommitRuleDto withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * **参数解释：** 规则生效时间。
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public CommitRuleDto withBinaryGateEnabled(Boolean binaryGateEnabled) {
        this.binaryGateEnabled = binaryGateEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否禁止新增二进制文件（对特权用户无效）。 **约束限制：** 不涉及。 **取值范围：** - true，禁止新增二进制文件。 - false，允许新增二进制文件。
     * @return binaryGateEnabled
     */
    public Boolean getBinaryGateEnabled() {
        return binaryGateEnabled;
    }

    public void setBinaryGateEnabled(Boolean binaryGateEnabled) {
        this.binaryGateEnabled = binaryGateEnabled;
    }

    public CommitRuleDto withPrivilegedUsers(List<RepositoryUserBasicDto> privilegedUsers) {
        this.privilegedUsers = privilegedUsers;
        return this;
    }

    public CommitRuleDto addPrivilegedUsersItem(RepositoryUserBasicDto privilegedUsersItem) {
        if (this.privilegedUsers == null) {
            this.privilegedUsers = new ArrayList<>();
        }
        this.privilegedUsers.add(privilegedUsersItem);
        return this;
    }

    public CommitRuleDto withPrivilegedUsers(Consumer<List<RepositoryUserBasicDto>> privilegedUsersSetter) {
        if (this.privilegedUsers == null) {
            this.privilegedUsers = new ArrayList<>();
        }
        privilegedUsersSetter.accept(this.privilegedUsers);
        return this;
    }

    /**
     * **参数解释：** 特权用户（特权用户可直接推送所有二进制文件入库）。
     * @return privilegedUsers
     */
    public List<RepositoryUserBasicDto> getPrivilegedUsers() {
        return privilegedUsers;
    }

    public void setPrivilegedUsers(List<RepositoryUserBasicDto> privilegedUsers) {
        this.privilegedUsers = privilegedUsers;
    }

    public CommitRuleDto withAllowedModifyBinary(Boolean allowedModifyBinary) {
        this.allowedModifyBinary = allowedModifyBinary;
        return this;
    }

    /**
     * **参数解释：** 是否允许修改二进制文件（对特权用户无效）。 **约束限制：** 不涉及。 **取值范围：** - true，允许修改二进制文件。 - false，禁止修改二进制文件。
     * @return allowedModifyBinary
     */
    public Boolean getAllowedModifyBinary() {
        return allowedModifyBinary;
    }

    public void setAllowedModifyBinary(Boolean allowedModifyBinary) {
        this.allowedModifyBinary = allowedModifyBinary;
    }

    public CommitRuleDto withAllowedBinaryFileNameRegex(String allowedBinaryFileNameRegex) {
        this.allowedBinaryFileNameRegex = allowedBinaryFileNameRegex;
        return this;
    }

    /**
     * **参数解释：** 二进制文件白名单（可直接入库的文件）。
     * @return allowedBinaryFileNameRegex
     */
    public String getAllowedBinaryFileNameRegex() {
        return allowedBinaryFileNameRegex;
    }

    public void setAllowedBinaryFileNameRegex(String allowedBinaryFileNameRegex) {
        this.allowedBinaryFileNameRegex = allowedBinaryFileNameRegex;
    }

    public CommitRuleDto withAuthorRegex(Object authorRegex) {
        this.authorRegex = authorRegex;
        return this;
    }

    /**
     * **参数解释：** 提交人。
     * @return authorRegex
     */
    public Object getAuthorRegex() {
        return authorRegex;
    }

    public void setAuthorRegex(Object authorRegex) {
        this.authorRegex = authorRegex;
    }

    public CommitRuleDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CommitRuleDto withSkipRuleCheck(Boolean skipRuleCheck) {
        this.skipRuleCheck = skipRuleCheck;
        return this;
    }

    /**
     * **参数解释：** 是否跳过规则检测。 **约束限制：** 不涉及。 **取值范围：** - true，跳过规则检测。 - false，不跳过规则检测。
     * @return skipRuleCheck
     */
    public Boolean getSkipRuleCheck() {
        return skipRuleCheck;
    }

    public void setSkipRuleCheck(Boolean skipRuleCheck) {
        this.skipRuleCheck = skipRuleCheck;
    }

    public CommitRuleDto withSkipRuleEndDate(String skipRuleEndDate) {
        this.skipRuleEndDate = skipRuleEndDate;
        return this;
    }

    /**
     * **参数解释：** 失效时间。
     * @return skipRuleEndDate
     */
    public String getSkipRuleEndDate() {
        return skipRuleEndDate;
    }

    public void setSkipRuleEndDate(String skipRuleEndDate) {
        this.skipRuleEndDate = skipRuleEndDate;
    }

    public CommitRuleDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommitRuleDto withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支规则。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public CommitRuleDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitRuleDto that = (CommitRuleDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.commitMessageRegex, that.commitMessageRegex)
            && Objects.equals(this.commitMessageNegativeRegex, that.commitMessageNegativeRegex)
            && Objects.equals(this.prohibitedFileNameRegex, that.prohibitedFileNameRegex)
            && Objects.equals(this.authorEmailRegex, that.authorEmailRegex)
            && Objects.equals(this.maxFileSize, that.maxFileSize)
            && Objects.equals(this.allowedMaxFileSize, that.allowedMaxFileSize)
            && Objects.equals(this.effectiveDate, that.effectiveDate)
            && Objects.equals(this.binaryGateEnabled, that.binaryGateEnabled)
            && Objects.equals(this.privilegedUsers, that.privilegedUsers)
            && Objects.equals(this.allowedModifyBinary, that.allowedModifyBinary)
            && Objects.equals(this.allowedBinaryFileNameRegex, that.allowedBinaryFileNameRegex)
            && Objects.equals(this.authorRegex, that.authorRegex) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.skipRuleCheck, that.skipRuleCheck)
            && Objects.equals(this.skipRuleEndDate, that.skipRuleEndDate) && Objects.equals(this.name, that.name)
            && Objects.equals(this.branchName, that.branchName) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repositoryId,
            commitMessageRegex,
            commitMessageNegativeRegex,
            prohibitedFileNameRegex,
            authorEmailRegex,
            maxFileSize,
            allowedMaxFileSize,
            effectiveDate,
            binaryGateEnabled,
            privilegedUsers,
            allowedModifyBinary,
            allowedBinaryFileNameRegex,
            authorRegex,
            updatedAt,
            skipRuleCheck,
            skipRuleEndDate,
            name,
            branchName,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitRuleDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    commitMessageRegex: ").append(toIndentedString(commitMessageRegex)).append("\n");
        sb.append("    commitMessageNegativeRegex: ").append(toIndentedString(commitMessageNegativeRegex)).append("\n");
        sb.append("    prohibitedFileNameRegex: ").append(toIndentedString(prohibitedFileNameRegex)).append("\n");
        sb.append("    authorEmailRegex: ").append(toIndentedString(authorEmailRegex)).append("\n");
        sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
        sb.append("    allowedMaxFileSize: ").append(toIndentedString(allowedMaxFileSize)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    binaryGateEnabled: ").append(toIndentedString(binaryGateEnabled)).append("\n");
        sb.append("    privilegedUsers: ").append(toIndentedString(privilegedUsers)).append("\n");
        sb.append("    allowedModifyBinary: ").append(toIndentedString(allowedModifyBinary)).append("\n");
        sb.append("    allowedBinaryFileNameRegex: ").append(toIndentedString(allowedBinaryFileNameRegex)).append("\n");
        sb.append("    authorRegex: ").append(toIndentedString(authorRegex)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    skipRuleCheck: ").append(toIndentedString(skipRuleCheck)).append("\n");
        sb.append("    skipRuleEndDate: ").append(toIndentedString(skipRuleEndDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
