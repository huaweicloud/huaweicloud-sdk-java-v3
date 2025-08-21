package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowProjectGeneralPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_fork")

    private Boolean disableFork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_developer_create_branch")

    private Boolean forbiddenDeveloperCreateBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_developer_create_tag")

    private Boolean forbiddenDeveloperCreateTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_committer_create_branch")

    private Boolean forbiddenCommitterCreateBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name_regex")

    private String branchNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name_regex")

    private String tagNameRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_pre_merge_ref")

    private Boolean generatePreMergeRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden_gitlab_access")

    private Boolean forbiddenGitlabAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rebase_disable_trigger_webhook")

    private Boolean rebaseDisableTriggerWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_gpg_verified")

    private Boolean openGpgVerified;

    public ShowProjectGeneralPolicyResponse withDisableFork(Boolean disableFork) {
        this.disableFork = disableFork;
        return this;
    }

    /**
     * **参数解释：** 是否禁用fork。
     * @return disableFork
     */
    public Boolean getDisableFork() {
        return disableFork;
    }

    public void setDisableFork(Boolean disableFork) {
        this.disableFork = disableFork;
    }

    public ShowProjectGeneralPolicyResponse withForbiddenDeveloperCreateBranch(Boolean forbiddenDeveloperCreateBranch) {
        this.forbiddenDeveloperCreateBranch = forbiddenDeveloperCreateBranch;
        return this;
    }

    /**
     * **参数解释：** 是否禁止开发者创建分支。
     * @return forbiddenDeveloperCreateBranch
     */
    public Boolean getForbiddenDeveloperCreateBranch() {
        return forbiddenDeveloperCreateBranch;
    }

    public void setForbiddenDeveloperCreateBranch(Boolean forbiddenDeveloperCreateBranch) {
        this.forbiddenDeveloperCreateBranch = forbiddenDeveloperCreateBranch;
    }

    public ShowProjectGeneralPolicyResponse withForbiddenDeveloperCreateTag(Boolean forbiddenDeveloperCreateTag) {
        this.forbiddenDeveloperCreateTag = forbiddenDeveloperCreateTag;
        return this;
    }

    /**
     * **参数解释：** 是否禁用开发者创建tag。
     * @return forbiddenDeveloperCreateTag
     */
    public Boolean getForbiddenDeveloperCreateTag() {
        return forbiddenDeveloperCreateTag;
    }

    public void setForbiddenDeveloperCreateTag(Boolean forbiddenDeveloperCreateTag) {
        this.forbiddenDeveloperCreateTag = forbiddenDeveloperCreateTag;
    }

    public ShowProjectGeneralPolicyResponse withForbiddenCommitterCreateBranch(Boolean forbiddenCommitterCreateBranch) {
        this.forbiddenCommitterCreateBranch = forbiddenCommitterCreateBranch;
        return this;
    }

    /**
     * **参数解释：** 禁止开发者创建标签。
     * @return forbiddenCommitterCreateBranch
     */
    public Boolean getForbiddenCommitterCreateBranch() {
        return forbiddenCommitterCreateBranch;
    }

    public void setForbiddenCommitterCreateBranch(Boolean forbiddenCommitterCreateBranch) {
        this.forbiddenCommitterCreateBranch = forbiddenCommitterCreateBranch;
    }

    public ShowProjectGeneralPolicyResponse withBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
        return this;
    }

    /**
     * **参数解释：** 分支名称正则表达式。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return branchNameRegex
     */
    public String getBranchNameRegex() {
        return branchNameRegex;
    }

    public void setBranchNameRegex(String branchNameRegex) {
        this.branchNameRegex = branchNameRegex;
    }

    public ShowProjectGeneralPolicyResponse withTagNameRegex(String tagNameRegex) {
        this.tagNameRegex = tagNameRegex;
        return this;
    }

    /**
     * **参数解释：** 标签名正则表达式。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return tagNameRegex
     */
    public String getTagNameRegex() {
        return tagNameRegex;
    }

    public void setTagNameRegex(String tagNameRegex) {
        this.tagNameRegex = tagNameRegex;
    }

    public ShowProjectGeneralPolicyResponse withGeneratePreMergeRef(Boolean generatePreMergeRef) {
        this.generatePreMergeRef = generatePreMergeRef;
        return this;
    }

    /**
     * **参数解释：** 生成合并请求预合并。
     * @return generatePreMergeRef
     */
    public Boolean getGeneratePreMergeRef() {
        return generatePreMergeRef;
    }

    public void setGeneratePreMergeRef(Boolean generatePreMergeRef) {
        this.generatePreMergeRef = generatePreMergeRef;
    }

    public ShowProjectGeneralPolicyResponse withForbiddenGitlabAccess(Boolean forbiddenGitlabAccess) {
        this.forbiddenGitlabAccess = forbiddenGitlabAccess;
        return this;
    }

    /**
     * **参数解释：** 是否禁止repo访问。
     * @return forbiddenGitlabAccess
     */
    public Boolean getForbiddenGitlabAccess() {
        return forbiddenGitlabAccess;
    }

    public void setForbiddenGitlabAccess(Boolean forbiddenGitlabAccess) {
        this.forbiddenGitlabAccess = forbiddenGitlabAccess;
    }

    public ShowProjectGeneralPolicyResponse withRebaseDisableTriggerWebhook(Boolean rebaseDisableTriggerWebhook) {
        this.rebaseDisableTriggerWebhook = rebaseDisableTriggerWebhook;
        return this;
    }

    /**
     * **参数解释：** MR rebase是否禁止触发webhook事件。
     * @return rebaseDisableTriggerWebhook
     */
    public Boolean getRebaseDisableTriggerWebhook() {
        return rebaseDisableTriggerWebhook;
    }

    public void setRebaseDisableTriggerWebhook(Boolean rebaseDisableTriggerWebhook) {
        this.rebaseDisableTriggerWebhook = rebaseDisableTriggerWebhook;
    }

    public ShowProjectGeneralPolicyResponse withOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
        return this;
    }

    /**
     * **参数解释：** 是否开启gpg公钥验证。
     * @return openGpgVerified
     */
    public Boolean getOpenGpgVerified() {
        return openGpgVerified;
    }

    public void setOpenGpgVerified(Boolean openGpgVerified) {
        this.openGpgVerified = openGpgVerified;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectGeneralPolicyResponse that = (ShowProjectGeneralPolicyResponse) obj;
        return Objects.equals(this.disableFork, that.disableFork)
            && Objects.equals(this.forbiddenDeveloperCreateBranch, that.forbiddenDeveloperCreateBranch)
            && Objects.equals(this.forbiddenDeveloperCreateTag, that.forbiddenDeveloperCreateTag)
            && Objects.equals(this.forbiddenCommitterCreateBranch, that.forbiddenCommitterCreateBranch)
            && Objects.equals(this.branchNameRegex, that.branchNameRegex)
            && Objects.equals(this.tagNameRegex, that.tagNameRegex)
            && Objects.equals(this.generatePreMergeRef, that.generatePreMergeRef)
            && Objects.equals(this.forbiddenGitlabAccess, that.forbiddenGitlabAccess)
            && Objects.equals(this.rebaseDisableTriggerWebhook, that.rebaseDisableTriggerWebhook)
            && Objects.equals(this.openGpgVerified, that.openGpgVerified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disableFork,
            forbiddenDeveloperCreateBranch,
            forbiddenDeveloperCreateTag,
            forbiddenCommitterCreateBranch,
            branchNameRegex,
            tagNameRegex,
            generatePreMergeRef,
            forbiddenGitlabAccess,
            rebaseDisableTriggerWebhook,
            openGpgVerified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectGeneralPolicyResponse {\n");
        sb.append("    disableFork: ").append(toIndentedString(disableFork)).append("\n");
        sb.append("    forbiddenDeveloperCreateBranch: ")
            .append(toIndentedString(forbiddenDeveloperCreateBranch))
            .append("\n");
        sb.append("    forbiddenDeveloperCreateTag: ")
            .append(toIndentedString(forbiddenDeveloperCreateTag))
            .append("\n");
        sb.append("    forbiddenCommitterCreateBranch: ")
            .append(toIndentedString(forbiddenCommitterCreateBranch))
            .append("\n");
        sb.append("    branchNameRegex: ").append(toIndentedString(branchNameRegex)).append("\n");
        sb.append("    tagNameRegex: ").append(toIndentedString(tagNameRegex)).append("\n");
        sb.append("    generatePreMergeRef: ").append(toIndentedString(generatePreMergeRef)).append("\n");
        sb.append("    forbiddenGitlabAccess: ").append(toIndentedString(forbiddenGitlabAccess)).append("\n");
        sb.append("    rebaseDisableTriggerWebhook: ")
            .append(toIndentedString(rebaseDisableTriggerWebhook))
            .append("\n");
        sb.append("    openGpgVerified: ").append(toIndentedString(openGpgVerified)).append("\n");
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
