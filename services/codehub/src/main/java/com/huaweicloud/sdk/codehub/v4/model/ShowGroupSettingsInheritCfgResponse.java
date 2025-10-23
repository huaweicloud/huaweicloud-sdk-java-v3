package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowGroupSettingsInheritCfgResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_update")

    private Boolean canUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private Integer parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownership")

    private Integer ownership;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pbi")

    private Integer pbi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_branches")

    private Integer protectedBranches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_tags")

    private Integer protectedTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_rules")

    private Integer pushRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_requests")

    private Integer changeRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_ctrl_items")

    private Integer customCtrlItems;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviews")

    private Integer reviews;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issues")

    private Integer issues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cr_evaluation")

    private Integer crEvaluation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "e2e_settings")

    private Integer e2eSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "committer_settings")

    private Integer committerSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhook_settings")

    private Integer webhookSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_event_settings")

    private Integer streamEventSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_settings")

    private Integer pipelineSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_templates")

    private Integer issueTemplates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cr_comment_templates")

    private Integer crCommentTemplates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_requests")

    private Integer mergeRequests;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mr_branch_policies")

    private Integer mrBranchPolicies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_settings")

    private Integer repositorySettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_keys")

    private Integer deployKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark")

    private Integer watermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    public ShowGroupSettingsInheritCfgResponse withCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }

    /**
     * **参数解释：** 是否可用。
     * @return canUpdate
     */
    public Boolean getCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public ShowGroupSettingsInheritCfgResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记录id。
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

    public ShowGroupSettingsInheritCfgResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowGroupSettingsInheritCfgResponse withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * **参数解释：** 代码组id。
     * minimum: 1
     * maximum: 2147483647
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ShowGroupSettingsInheritCfgResponse withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：** 父id。
     * minimum: 1
     * maximum: 2147483647
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public ShowGroupSettingsInheritCfgResponse withOwnership(Integer ownership) {
        this.ownership = ownership;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return ownership
     */
    public Integer getOwnership() {
        return ownership;
    }

    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    public ShowGroupSettingsInheritCfgResponse withPbi(Integer pbi) {
        this.pbi = pbi;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return pbi
     */
    public Integer getPbi() {
        return pbi;
    }

    public void setPbi(Integer pbi) {
        this.pbi = pbi;
    }

    public ShowGroupSettingsInheritCfgResponse withProtectedBranches(Integer protectedBranches) {
        this.protectedBranches = protectedBranches;
        return this;
    }

    /**
     * **参数解释：** 保护分支策略。
     * minimum: 1
     * maximum: 2147483647
     * @return protectedBranches
     */
    public Integer getProtectedBranches() {
        return protectedBranches;
    }

    public void setProtectedBranches(Integer protectedBranches) {
        this.protectedBranches = protectedBranches;
    }

    public ShowGroupSettingsInheritCfgResponse withProtectedTags(Integer protectedTags) {
        this.protectedTags = protectedTags;
        return this;
    }

    /**
     * **参数解释：** 保护tag策略。
     * minimum: 1
     * maximum: 2147483647
     * @return protectedTags
     */
    public Integer getProtectedTags() {
        return protectedTags;
    }

    public void setProtectedTags(Integer protectedTags) {
        this.protectedTags = protectedTags;
    }

    public ShowGroupSettingsInheritCfgResponse withPushRules(Integer pushRules) {
        this.pushRules = pushRules;
        return this;
    }

    /**
     * **参数解释：** 推送规则策略。
     * minimum: 1
     * maximum: 2147483647
     * @return pushRules
     */
    public Integer getPushRules() {
        return pushRules;
    }

    public void setPushRules(Integer pushRules) {
        this.pushRules = pushRules;
    }

    public ShowGroupSettingsInheritCfgResponse withChangeRequests(Integer changeRequests) {
        this.changeRequests = changeRequests;
        return this;
    }

    /**
     * **参数解释：** cr策略。
     * minimum: 1
     * maximum: 2147483647
     * @return changeRequests
     */
    public Integer getChangeRequests() {
        return changeRequests;
    }

    public void setChangeRequests(Integer changeRequests) {
        this.changeRequests = changeRequests;
    }

    public ShowGroupSettingsInheritCfgResponse withCustomCtrlItems(Integer customCtrlItems) {
        this.customCtrlItems = customCtrlItems;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return customCtrlItems
     */
    public Integer getCustomCtrlItems() {
        return customCtrlItems;
    }

    public void setCustomCtrlItems(Integer customCtrlItems) {
        this.customCtrlItems = customCtrlItems;
    }

    public ShowGroupSettingsInheritCfgResponse withReviews(Integer reviews) {
        this.reviews = reviews;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return reviews
     */
    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public ShowGroupSettingsInheritCfgResponse withIssues(Integer issues) {
        this.issues = issues;
        return this;
    }

    /**
     * **参数解释：** issue继承模式。
     * minimum: 1
     * maximum: 2147483647
     * @return issues
     */
    public Integer getIssues() {
        return issues;
    }

    public void setIssues(Integer issues) {
        this.issues = issues;
    }

    public ShowGroupSettingsInheritCfgResponse withCrEvaluation(Integer crEvaluation) {
        this.crEvaluation = crEvaluation;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return crEvaluation
     */
    public Integer getCrEvaluation() {
        return crEvaluation;
    }

    public void setCrEvaluation(Integer crEvaluation) {
        this.crEvaluation = crEvaluation;
    }

    public ShowGroupSettingsInheritCfgResponse withE2eSettings(Integer e2eSettings) {
        this.e2eSettings = e2eSettings;
        return this;
    }

    /**
     * **参数解释：** e2e策略。
     * minimum: 1
     * maximum: 2147483647
     * @return e2eSettings
     */
    public Integer getE2eSettings() {
        return e2eSettings;
    }

    public void setE2eSettings(Integer e2eSettings) {
        this.e2eSettings = e2eSettings;
    }

    public ShowGroupSettingsInheritCfgResponse withCommitterSettings(Integer committerSettings) {
        this.committerSettings = committerSettings;
        return this;
    }

    /**
     * **参数解释：** 提交策略。
     * minimum: 1
     * maximum: 2147483647
     * @return committerSettings
     */
    public Integer getCommitterSettings() {
        return committerSettings;
    }

    public void setCommitterSettings(Integer committerSettings) {
        this.committerSettings = committerSettings;
    }

    public ShowGroupSettingsInheritCfgResponse withWebhookSettings(Integer webhookSettings) {
        this.webhookSettings = webhookSettings;
        return this;
    }

    /**
     * **参数解释：** webhook策略。
     * minimum: 1
     * maximum: 2147483647
     * @return webhookSettings
     */
    public Integer getWebhookSettings() {
        return webhookSettings;
    }

    public void setWebhookSettings(Integer webhookSettings) {
        this.webhookSettings = webhookSettings;
    }

    public ShowGroupSettingsInheritCfgResponse withStreamEventSettings(Integer streamEventSettings) {
        this.streamEventSettings = streamEventSettings;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return streamEventSettings
     */
    public Integer getStreamEventSettings() {
        return streamEventSettings;
    }

    public void setStreamEventSettings(Integer streamEventSettings) {
        this.streamEventSettings = streamEventSettings;
    }

    public ShowGroupSettingsInheritCfgResponse withPipelineSettings(Integer pipelineSettings) {
        this.pipelineSettings = pipelineSettings;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return pipelineSettings
     */
    public Integer getPipelineSettings() {
        return pipelineSettings;
    }

    public void setPipelineSettings(Integer pipelineSettings) {
        this.pipelineSettings = pipelineSettings;
    }

    public ShowGroupSettingsInheritCfgResponse withIssueTemplates(Integer issueTemplates) {
        this.issueTemplates = issueTemplates;
        return this;
    }

    /**
     * **参数解释：** issue模板继承模式。
     * minimum: 1
     * maximum: 2147483647
     * @return issueTemplates
     */
    public Integer getIssueTemplates() {
        return issueTemplates;
    }

    public void setIssueTemplates(Integer issueTemplates) {
        this.issueTemplates = issueTemplates;
    }

    public ShowGroupSettingsInheritCfgResponse withCrCommentTemplates(Integer crCommentTemplates) {
        this.crCommentTemplates = crCommentTemplates;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return crCommentTemplates
     */
    public Integer getCrCommentTemplates() {
        return crCommentTemplates;
    }

    public void setCrCommentTemplates(Integer crCommentTemplates) {
        this.crCommentTemplates = crCommentTemplates;
    }

    public ShowGroupSettingsInheritCfgResponse withMergeRequests(Integer mergeRequests) {
        this.mergeRequests = mergeRequests;
        return this;
    }

    /**
     * **参数解释：** 排序id。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequests
     */
    public Integer getMergeRequests() {
        return mergeRequests;
    }

    public void setMergeRequests(Integer mergeRequests) {
        this.mergeRequests = mergeRequests;
    }

    public ShowGroupSettingsInheritCfgResponse withMrBranchPolicies(Integer mrBranchPolicies) {
        this.mrBranchPolicies = mrBranchPolicies;
        return this;
    }

    /**
     * **参数解释：** 合并请求策略。
     * minimum: 1
     * maximum: 2147483647
     * @return mrBranchPolicies
     */
    public Integer getMrBranchPolicies() {
        return mrBranchPolicies;
    }

    public void setMrBranchPolicies(Integer mrBranchPolicies) {
        this.mrBranchPolicies = mrBranchPolicies;
    }

    public ShowGroupSettingsInheritCfgResponse withRepositorySettings(Integer repositorySettings) {
        this.repositorySettings = repositorySettings;
        return this;
    }

    /**
     * **参数解释：** 仓库策略。
     * minimum: 1
     * maximum: 2147483647
     * @return repositorySettings
     */
    public Integer getRepositorySettings() {
        return repositorySettings;
    }

    public void setRepositorySettings(Integer repositorySettings) {
        this.repositorySettings = repositorySettings;
    }

    public ShowGroupSettingsInheritCfgResponse withDeployKeys(Integer deployKeys) {
        this.deployKeys = deployKeys;
        return this;
    }

    /**
     * **参数解释：** 部署密钥策略。
     * minimum: 1
     * maximum: 2147483647
     * @return deployKeys
     */
    public Integer getDeployKeys() {
        return deployKeys;
    }

    public void setDeployKeys(Integer deployKeys) {
        this.deployKeys = deployKeys;
    }

    public ShowGroupSettingsInheritCfgResponse withWatermark(Integer watermark) {
        this.watermark = watermark;
        return this;
    }

    /**
     * **参数解释：** 水印策略。
     * minimum: 1
     * maximum: 2147483647
     * @return watermark
     */
    public Integer getWatermark() {
        return watermark;
    }

    public void setWatermark(Integer watermark) {
        this.watermark = watermark;
    }

    public ShowGroupSettingsInheritCfgResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowGroupSettingsInheritCfgResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupSettingsInheritCfgResponse that = (ShowGroupSettingsInheritCfgResponse) obj;
        return Objects.equals(this.canUpdate, that.canUpdate) && Objects.equals(this.id, that.id)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.namespaceId, that.namespaceId)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.ownership, that.ownership)
            && Objects.equals(this.pbi, that.pbi) && Objects.equals(this.protectedBranches, that.protectedBranches)
            && Objects.equals(this.protectedTags, that.protectedTags) && Objects.equals(this.pushRules, that.pushRules)
            && Objects.equals(this.changeRequests, that.changeRequests)
            && Objects.equals(this.customCtrlItems, that.customCtrlItems) && Objects.equals(this.reviews, that.reviews)
            && Objects.equals(this.issues, that.issues) && Objects.equals(this.crEvaluation, that.crEvaluation)
            && Objects.equals(this.e2eSettings, that.e2eSettings)
            && Objects.equals(this.committerSettings, that.committerSettings)
            && Objects.equals(this.webhookSettings, that.webhookSettings)
            && Objects.equals(this.streamEventSettings, that.streamEventSettings)
            && Objects.equals(this.pipelineSettings, that.pipelineSettings)
            && Objects.equals(this.issueTemplates, that.issueTemplates)
            && Objects.equals(this.crCommentTemplates, that.crCommentTemplates)
            && Objects.equals(this.mergeRequests, that.mergeRequests)
            && Objects.equals(this.mrBranchPolicies, that.mrBranchPolicies)
            && Objects.equals(this.repositorySettings, that.repositorySettings)
            && Objects.equals(this.deployKeys, that.deployKeys) && Objects.equals(this.watermark, that.watermark)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canUpdate,
            id,
            productId,
            namespaceId,
            parentId,
            ownership,
            pbi,
            protectedBranches,
            protectedTags,
            pushRules,
            changeRequests,
            customCtrlItems,
            reviews,
            issues,
            crEvaluation,
            e2eSettings,
            committerSettings,
            webhookSettings,
            streamEventSettings,
            pipelineSettings,
            issueTemplates,
            crCommentTemplates,
            mergeRequests,
            mrBranchPolicies,
            repositorySettings,
            deployKeys,
            watermark,
            createdAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupSettingsInheritCfgResponse {\n");
        sb.append("    canUpdate: ").append(toIndentedString(canUpdate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
        sb.append("    pbi: ").append(toIndentedString(pbi)).append("\n");
        sb.append("    protectedBranches: ").append(toIndentedString(protectedBranches)).append("\n");
        sb.append("    protectedTags: ").append(toIndentedString(protectedTags)).append("\n");
        sb.append("    pushRules: ").append(toIndentedString(pushRules)).append("\n");
        sb.append("    changeRequests: ").append(toIndentedString(changeRequests)).append("\n");
        sb.append("    customCtrlItems: ").append(toIndentedString(customCtrlItems)).append("\n");
        sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    crEvaluation: ").append(toIndentedString(crEvaluation)).append("\n");
        sb.append("    e2eSettings: ").append(toIndentedString(e2eSettings)).append("\n");
        sb.append("    committerSettings: ").append(toIndentedString(committerSettings)).append("\n");
        sb.append("    webhookSettings: ").append(toIndentedString(webhookSettings)).append("\n");
        sb.append("    streamEventSettings: ").append(toIndentedString(streamEventSettings)).append("\n");
        sb.append("    pipelineSettings: ").append(toIndentedString(pipelineSettings)).append("\n");
        sb.append("    issueTemplates: ").append(toIndentedString(issueTemplates)).append("\n");
        sb.append("    crCommentTemplates: ").append(toIndentedString(crCommentTemplates)).append("\n");
        sb.append("    mergeRequests: ").append(toIndentedString(mergeRequests)).append("\n");
        sb.append("    mrBranchPolicies: ").append(toIndentedString(mrBranchPolicies)).append("\n");
        sb.append("    repositorySettings: ").append(toIndentedString(repositorySettings)).append("\n");
        sb.append("    deployKeys: ").append(toIndentedString(deployKeys)).append("\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
