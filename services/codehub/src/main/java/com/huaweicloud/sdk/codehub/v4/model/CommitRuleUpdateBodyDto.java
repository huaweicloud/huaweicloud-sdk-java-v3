package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CommitRuleUpdateBodyDto
 */
public class CommitRuleUpdateBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message_regex")

    private String commitMessageRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message_negative_regex")

    private String commitMessageNegativeRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_regex")

    private String authorRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_email_regex")

    private String authorEmailRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prohibited_file_name_regex")

    private String prohibitedFileNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_file_size")

    private Integer maxFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binary_gate_enabled")

    private Boolean binaryGateEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_modify_binary")

    private Boolean allowedModifyBinary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_binary_file_name_regex")

    private String allowedBinaryFileNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_user_ids")

    private List<Integer> privilegedUserIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    private String effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_rule_check")

    private Boolean skipRuleCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_rule_end_date")

    private String skipRuleEndDate;

    public CommitRuleUpdateBodyDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称。 **约束限制：** 必填。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommitRuleUpdateBodyDto withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支规则。 **约束限制：** 必填。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public CommitRuleUpdateBodyDto withCommitMessageRegex(String commitMessageRegex) {
        this.commitMessageRegex = commitMessageRegex;
        return this;
    }

    /**
     * **参数解释：** 提交信息匹配规则。 所有提交消息都必须进行正则表达式匹配， 例如: \\d+\\..*。 若符合正则匹配，则允许提交。若此字段为空，则允许任何提交消息。 您也可以设置在提交信息中必须包含工作项单号，实现代码的E2E追溯。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return commitMessageRegex
     */
    public String getCommitMessageRegex() {
        return commitMessageRegex;
    }

    public void setCommitMessageRegex(String commitMessageRegex) {
        this.commitMessageRegex = commitMessageRegex;
    }

    public CommitRuleUpdateBodyDto withCommitMessageNegativeRegex(String commitMessageNegativeRegex) {
        this.commitMessageNegativeRegex = commitMessageNegativeRegex;
        return this;
    }

    /**
     * **参数解释：** 提交信息负面匹配规则。 所有提交消息都必须进行正则表达式匹配，例如: \\d+\\..*。 符合正则匹配，则不允许提交。若此字段为空，则允许任何提交消息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return commitMessageNegativeRegex
     */
    public String getCommitMessageNegativeRegex() {
        return commitMessageNegativeRegex;
    }

    public void setCommitMessageNegativeRegex(String commitMessageNegativeRegex) {
        this.commitMessageNegativeRegex = commitMessageNegativeRegex;
    }

    public CommitRuleUpdateBodyDto withAuthorRegex(String authorRegex) {
        this.authorRegex = authorRegex;
        return this;
    }

    /**
     * **参数解释：** 提交人的正则表达式。 提交人必须进行正则表达式匹配， 例如: /([a-zA-Z]\\d){7}/。如果此字段为空，则允许任何提交人。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return authorRegex
     */
    public String getAuthorRegex() {
        return authorRegex;
    }

    public void setAuthorRegex(String authorRegex) {
        this.authorRegex = authorRegex;
    }

    public CommitRuleUpdateBodyDto withAuthorEmailRegex(String authorEmailRegex) {
        this.authorEmailRegex = authorEmailRegex;
        return this;
    }

    /**
     * **参数解释：** 提交人邮箱地址的正则表达式。 所有提交者邮箱地址都必须进行正则表达式匹配， 例如: @my-company.com$。如果此字段为空，则允许任何提交邮箱地址。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return authorEmailRegex
     */
    public String getAuthorEmailRegex() {
        return authorEmailRegex;
    }

    public void setAuthorEmailRegex(String authorEmailRegex) {
        this.authorEmailRegex = authorEmailRegex;
    }

    public CommitRuleUpdateBodyDto withProhibitedFileNameRegex(String prohibitedFileNameRegex) {
        this.prohibitedFileNameRegex = prohibitedFileNameRegex;
        return this;
    }

    /**
     * **参数解释：** 禁止提交的文件名称的正则表达式。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return prohibitedFileNameRegex
     */
    public String getProhibitedFileNameRegex() {
        return prohibitedFileNameRegex;
    }

    public void setProhibitedFileNameRegex(String prohibitedFileNameRegex) {
        this.prohibitedFileNameRegex = prohibitedFileNameRegex;
    }

    public CommitRuleUpdateBodyDto withMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * **参数解释：** 单文件大小限制（MB）。 单文件大小超过上述规格的添加或更新推送将被拒绝，Repo建议的最佳上限值为50MB。 系统支持单文件提交的最大值为300MB。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 50
     * minimum: 1
     * maximum: 300
     * @return maxFileSize
     */
    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public CommitRuleUpdateBodyDto withBinaryGateEnabled(Boolean binaryGateEnabled) {
        this.binaryGateEnabled = binaryGateEnabled;
        return this;
    }

    /**
     * **参数解释：** 禁止新增二进制文件（对特权用户无效）。 **约束限制：** 不涉及。 **取值范围：** - true，禁止新增二进制文件。 - false，允许新增二进制文件。 **默认取值：** 不涉及。
     * @return binaryGateEnabled
     */
    public Boolean getBinaryGateEnabled() {
        return binaryGateEnabled;
    }

    public void setBinaryGateEnabled(Boolean binaryGateEnabled) {
        this.binaryGateEnabled = binaryGateEnabled;
    }

    public CommitRuleUpdateBodyDto withAllowedModifyBinary(Boolean allowedModifyBinary) {
        this.allowedModifyBinary = allowedModifyBinary;
        return this;
    }

    /**
     * **参数解释：** 允许修改二进制文件（对特权用户无效）。 **约束限制：** 不涉及。 **取值范围：** - true，允许修改二进制文件。 - false，禁止修改二进制文件。 **默认取值：** 不涉及。
     * @return allowedModifyBinary
     */
    public Boolean getAllowedModifyBinary() {
        return allowedModifyBinary;
    }

    public void setAllowedModifyBinary(Boolean allowedModifyBinary) {
        this.allowedModifyBinary = allowedModifyBinary;
    }

    public CommitRuleUpdateBodyDto withAllowedBinaryFileNameRegex(String allowedBinaryFileNameRegex) {
        this.allowedBinaryFileNameRegex = allowedBinaryFileNameRegex;
        return this;
    }

    /**
     * **参数解释：** 二进制文件白名单（可直接入库的文件）。 所有被推送的二进制文件名必须进行正则表达式匹配， 例如: (\\.png|\\.xls|\\.xlsx|\\.docx|\\.doc)$ 。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return allowedBinaryFileNameRegex
     */
    public String getAllowedBinaryFileNameRegex() {
        return allowedBinaryFileNameRegex;
    }

    public void setAllowedBinaryFileNameRegex(String allowedBinaryFileNameRegex) {
        this.allowedBinaryFileNameRegex = allowedBinaryFileNameRegex;
    }

    public CommitRuleUpdateBodyDto withPrivilegedUserIds(List<Integer> privilegedUserIds) {
        this.privilegedUserIds = privilegedUserIds;
        return this;
    }

    public CommitRuleUpdateBodyDto addPrivilegedUserIdsItem(Integer privilegedUserIdsItem) {
        if (this.privilegedUserIds == null) {
            this.privilegedUserIds = new ArrayList<>();
        }
        this.privilegedUserIds.add(privilegedUserIdsItem);
        return this;
    }

    public CommitRuleUpdateBodyDto withPrivilegedUserIds(Consumer<List<Integer>> privilegedUserIdsSetter) {
        if (this.privilegedUserIds == null) {
            this.privilegedUserIds = new ArrayList<>();
        }
        privilegedUserIdsSetter.accept(this.privilegedUserIds);
        return this;
    }

    /**
     * **参数解释：** 特权用户ID列表（特权用户可直接推送所有二进制文件入库。 只有特权用户能推送二进制文件。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return privilegedUserIds
     */
    public List<Integer> getPrivilegedUserIds() {
        return privilegedUserIds;
    }

    public void setPrivilegedUserIds(List<Integer> privilegedUserIds) {
        this.privilegedUserIds = privilegedUserIds;
    }

    public CommitRuleUpdateBodyDto withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * **参数解释：** 规则生效时间， 例如: 2025-8-19。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public CommitRuleUpdateBodyDto withSkipRuleCheck(Boolean skipRuleCheck) {
        this.skipRuleCheck = skipRuleCheck;
        return this;
    }

    /**
     * **参数解释：** 跳过规则检测。 **约束限制：** 仅CR仓库支持此参数。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return skipRuleCheck
     */
    public Boolean getSkipRuleCheck() {
        return skipRuleCheck;
    }

    public void setSkipRuleCheck(Boolean skipRuleCheck) {
        this.skipRuleCheck = skipRuleCheck;
    }

    public CommitRuleUpdateBodyDto withSkipRuleEndDate(String skipRuleEndDate) {
        this.skipRuleEndDate = skipRuleEndDate;
        return this;
    }

    /**
     * **参数解释：** 跳过规则检测失效时间， 例如: 2025-8-19 10:00:00。 **约束限制：** 仅CR仓库支持此参数。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return skipRuleEndDate
     */
    public String getSkipRuleEndDate() {
        return skipRuleEndDate;
    }

    public void setSkipRuleEndDate(String skipRuleEndDate) {
        this.skipRuleEndDate = skipRuleEndDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitRuleUpdateBodyDto that = (CommitRuleUpdateBodyDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.branchName, that.branchName)
            && Objects.equals(this.commitMessageRegex, that.commitMessageRegex)
            && Objects.equals(this.commitMessageNegativeRegex, that.commitMessageNegativeRegex)
            && Objects.equals(this.authorRegex, that.authorRegex)
            && Objects.equals(this.authorEmailRegex, that.authorEmailRegex)
            && Objects.equals(this.prohibitedFileNameRegex, that.prohibitedFileNameRegex)
            && Objects.equals(this.maxFileSize, that.maxFileSize)
            && Objects.equals(this.binaryGateEnabled, that.binaryGateEnabled)
            && Objects.equals(this.allowedModifyBinary, that.allowedModifyBinary)
            && Objects.equals(this.allowedBinaryFileNameRegex, that.allowedBinaryFileNameRegex)
            && Objects.equals(this.privilegedUserIds, that.privilegedUserIds)
            && Objects.equals(this.effectiveDate, that.effectiveDate)
            && Objects.equals(this.skipRuleCheck, that.skipRuleCheck)
            && Objects.equals(this.skipRuleEndDate, that.skipRuleEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            branchName,
            commitMessageRegex,
            commitMessageNegativeRegex,
            authorRegex,
            authorEmailRegex,
            prohibitedFileNameRegex,
            maxFileSize,
            binaryGateEnabled,
            allowedModifyBinary,
            allowedBinaryFileNameRegex,
            privilegedUserIds,
            effectiveDate,
            skipRuleCheck,
            skipRuleEndDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitRuleUpdateBodyDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    commitMessageRegex: ").append(toIndentedString(commitMessageRegex)).append("\n");
        sb.append("    commitMessageNegativeRegex: ").append(toIndentedString(commitMessageNegativeRegex)).append("\n");
        sb.append("    authorRegex: ").append(toIndentedString(authorRegex)).append("\n");
        sb.append("    authorEmailRegex: ").append(toIndentedString(authorEmailRegex)).append("\n");
        sb.append("    prohibitedFileNameRegex: ").append(toIndentedString(prohibitedFileNameRegex)).append("\n");
        sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
        sb.append("    binaryGateEnabled: ").append(toIndentedString(binaryGateEnabled)).append("\n");
        sb.append("    allowedModifyBinary: ").append(toIndentedString(allowedModifyBinary)).append("\n");
        sb.append("    allowedBinaryFileNameRegex: ").append(toIndentedString(allowedBinaryFileNameRegex)).append("\n");
        sb.append("    privilegedUserIds: ").append(toIndentedString(privilegedUserIds)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    skipRuleCheck: ").append(toIndentedString(skipRuleCheck)).append("\n");
        sb.append("    skipRuleEndDate: ").append(toIndentedString(skipRuleEndDate)).append("\n");
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
