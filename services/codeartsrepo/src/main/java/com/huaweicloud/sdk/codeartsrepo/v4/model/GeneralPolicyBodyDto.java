package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GeneralPolicyBodyDto
 */
public class GeneralPolicyBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_fork")

    private Boolean disableFork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_pre_merge_ref")

    private Boolean generatePreMergeRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name_regex")

    private String branchNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name_regex")

    private String tagNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_developer_create_branch")

    private Boolean forbiddenDeveloperCreateBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_branch_whitelist_user_ids")

    private String createBranchWhitelistUserIds;

    public GeneralPolicyBodyDto withDisableFork(Boolean disableFork) {
        this.disableFork = disableFork;
        return this;
    }

    /**
     * **参数解释：** 是否禁止fork该仓库。 **约束限制：** 不涉及。 **取值范围：** - true，禁止fork。 - false，允许fork。 **默认取值：** 不涉及。
     * @return disableFork
     */
    public Boolean getDisableFork() {
        return disableFork;
    }

    public void setDisableFork(Boolean disableFork) {
        this.disableFork = disableFork;
    }

    public GeneralPolicyBodyDto withGeneratePreMergeRef(Boolean generatePreMergeRef) {
        this.generatePreMergeRef = generatePreMergeRef;
        return this;
    }

    /**
     * **参数解释：** 是否预合并MR。 **约束限制：** 不涉及。 **取值范围：** - true，禁止预合并MR。 - false，允许预合并MR。 **默认取值：** 不涉及。
     * @return generatePreMergeRef
     */
    public Boolean getGeneratePreMergeRef() {
        return generatePreMergeRef;
    }

    public void setGeneratePreMergeRef(Boolean generatePreMergeRef) {
        this.generatePreMergeRef = generatePreMergeRef;
    }

    public GeneralPolicyBodyDto withBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
        return this;
    }

    /**
     * **参数解释：** 分支名规则。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return branchNameRegex
     */
    public String getBranchNameRegex() {
        return branchNameRegex;
    }

    public void setBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
    }

    public GeneralPolicyBodyDto withTagNameRegex(String tagNameRegex) {
        this.tagNameRegex = tagNameRegex;
        return this;
    }

    /**
     * **参数解释：** Tag名规则。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagNameRegex
     */
    public String getTagNameRegex() {
        return tagNameRegex;
    }

    public void setTagNameRegex(String tagNameRegex) {
        this.tagNameRegex = tagNameRegex;
    }

    public GeneralPolicyBodyDto withForbiddenDeveloperCreateBranch(Boolean forbiddenDeveloperCreateBranch) {
        this.forbiddenDeveloperCreateBranch = forbiddenDeveloperCreateBranch;
        return this;
    }

    /**
     * **参数解释：** 是否禁止开发者创建分支。 **约束限制：** 不涉及。 **取值范围：** - true，禁止开发者创建分支。 - false，允许开发者创建分支。
     * @return forbiddenDeveloperCreateBranch
     */
    public Boolean getForbiddenDeveloperCreateBranch() {
        return forbiddenDeveloperCreateBranch;
    }

    public void setForbiddenDeveloperCreateBranch(Boolean forbiddenDeveloperCreateBranch) {
        this.forbiddenDeveloperCreateBranch = forbiddenDeveloperCreateBranch;
    }

    public GeneralPolicyBodyDto withCreateBranchWhitelistUserIds(String createBranchWhitelistUserIds) {
        this.createBranchWhitelistUserIds = createBranchWhitelistUserIds;
        return this;
    }

    /**
     * **参数解释：** 开发人员创建分支权限例外白名单。多个用户ID使用逗号分隔。
     * @return createBranchWhitelistUserIds
     */
    public String getCreateBranchWhitelistUserIds() {
        return createBranchWhitelistUserIds;
    }

    public void setCreateBranchWhitelistUserIds(String createBranchWhitelistUserIds) {
        this.createBranchWhitelistUserIds = createBranchWhitelistUserIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralPolicyBodyDto that = (GeneralPolicyBodyDto) obj;
        return Objects.equals(this.disableFork, that.disableFork)
            && Objects.equals(this.generatePreMergeRef, that.generatePreMergeRef)
            && Objects.equals(this.branchNameRegex, that.branchNameRegex)
            && Objects.equals(this.tagNameRegex, that.tagNameRegex)
            && Objects.equals(this.forbiddenDeveloperCreateBranch, that.forbiddenDeveloperCreateBranch)
            && Objects.equals(this.createBranchWhitelistUserIds, that.createBranchWhitelistUserIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disableFork,
            generatePreMergeRef,
            branchNameRegex,
            tagNameRegex,
            forbiddenDeveloperCreateBranch,
            createBranchWhitelistUserIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralPolicyBodyDto {\n");
        sb.append("    disableFork: ").append(toIndentedString(disableFork)).append("\n");
        sb.append("    generatePreMergeRef: ").append(toIndentedString(generatePreMergeRef)).append("\n");
        sb.append("    branchNameRegex: ").append(toIndentedString(branchNameRegex)).append("\n");
        sb.append("    tagNameRegex: ").append(toIndentedString(tagNameRegex)).append("\n");
        sb.append("    forbiddenDeveloperCreateBranch: ")
            .append(toIndentedString(forbiddenDeveloperCreateBranch))
            .append("\n");
        sb.append("    createBranchWhitelistUserIds: ")
            .append(toIndentedString(createBranchWhitelistUserIds))
            .append("\n");
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
