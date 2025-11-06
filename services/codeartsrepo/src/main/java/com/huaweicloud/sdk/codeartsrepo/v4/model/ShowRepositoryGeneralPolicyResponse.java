package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRepositoryGeneralPolicyResponse extends SdkResponse {

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
    @JsonProperty(value = "create_branch_whitelist_users")

    private List<PushRuleDevelopersDto> createBranchWhitelistUsers = null;

    public ShowRepositoryGeneralPolicyResponse withDisableFork(Boolean disableFork) {
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

    public ShowRepositoryGeneralPolicyResponse withGeneratePreMergeRef(Boolean generatePreMergeRef) {
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

    public ShowRepositoryGeneralPolicyResponse withBranchNameRegex(String branchNameRegex) {
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

    public ShowRepositoryGeneralPolicyResponse withTagNameRegex(String tagNameRegex) {
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

    public ShowRepositoryGeneralPolicyResponse withForbiddenDeveloperCreateBranch(
        Boolean forbiddenDeveloperCreateBranch) {
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

    public ShowRepositoryGeneralPolicyResponse withCreateBranchWhitelistUsers(
        List<PushRuleDevelopersDto> createBranchWhitelistUsers) {
        this.createBranchWhitelistUsers = createBranchWhitelistUsers;
        return this;
    }

    public ShowRepositoryGeneralPolicyResponse addCreateBranchWhitelistUsersItem(
        PushRuleDevelopersDto createBranchWhitelistUsersItem) {
        if (this.createBranchWhitelistUsers == null) {
            this.createBranchWhitelistUsers = new ArrayList<>();
        }
        this.createBranchWhitelistUsers.add(createBranchWhitelistUsersItem);
        return this;
    }

    public ShowRepositoryGeneralPolicyResponse withCreateBranchWhitelistUsers(
        Consumer<List<PushRuleDevelopersDto>> createBranchWhitelistUsersSetter) {
        if (this.createBranchWhitelistUsers == null) {
            this.createBranchWhitelistUsers = new ArrayList<>();
        }
        createBranchWhitelistUsersSetter.accept(this.createBranchWhitelistUsers);
        return this;
    }

    /**
     * **参数解释：** 开发人员创建分支权限白名单。
     * @return createBranchWhitelistUsers
     */
    public List<PushRuleDevelopersDto> getCreateBranchWhitelistUsers() {
        return createBranchWhitelistUsers;
    }

    public void setCreateBranchWhitelistUsers(List<PushRuleDevelopersDto> createBranchWhitelistUsers) {
        this.createBranchWhitelistUsers = createBranchWhitelistUsers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRepositoryGeneralPolicyResponse that = (ShowRepositoryGeneralPolicyResponse) obj;
        return Objects.equals(this.disableFork, that.disableFork)
            && Objects.equals(this.generatePreMergeRef, that.generatePreMergeRef)
            && Objects.equals(this.branchNameRegex, that.branchNameRegex)
            && Objects.equals(this.tagNameRegex, that.tagNameRegex)
            && Objects.equals(this.forbiddenDeveloperCreateBranch, that.forbiddenDeveloperCreateBranch)
            && Objects.equals(this.createBranchWhitelistUsers, that.createBranchWhitelistUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disableFork,
            generatePreMergeRef,
            branchNameRegex,
            tagNameRegex,
            forbiddenDeveloperCreateBranch,
            createBranchWhitelistUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepositoryGeneralPolicyResponse {\n");
        sb.append("    disableFork: ").append(toIndentedString(disableFork)).append("\n");
        sb.append("    generatePreMergeRef: ").append(toIndentedString(generatePreMergeRef)).append("\n");
        sb.append("    branchNameRegex: ").append(toIndentedString(branchNameRegex)).append("\n");
        sb.append("    tagNameRegex: ").append(toIndentedString(tagNameRegex)).append("\n");
        sb.append("    forbiddenDeveloperCreateBranch: ")
            .append(toIndentedString(forbiddenDeveloperCreateBranch))
            .append("\n");
        sb.append("    createBranchWhitelistUsers: ").append(toIndentedString(createBranchWhitelistUsers)).append("\n");
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
