package com.huaweicloud.sdk.coc.v1.model;

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
public class ShowPatchBaselineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_id")

    private String baselineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_scene")

    private String baselineScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_rules")

    private List<PatchRule> approvalRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_baseline_rules")

    private List<CustomBaselineRule> customBaselineRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_patch_baseline")

    private Boolean defaultPatchBaseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rejected_patches")

    private String rejectedPatches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rejected_action")

    private String rejectedAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approved_patches")

    private String approvedPatches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approved_compliance")

    private String approvedCompliance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_security_approved")

    private Boolean enableSecurityApproved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private Long modifiedTime;

    public ShowPatchBaselineResponse withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * 补丁基准ID
     * @return baselineId
     */
    public String getBaselineId() {
        return baselineId;
    }

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    public ShowPatchBaselineResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 补丁基准名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPatchBaselineResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 补丁基准描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowPatchBaselineResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowPatchBaselineResponse withBaselineScene(String baselineScene) {
        this.baselineScene = baselineScene;
        return this;
    }

    /**
     * 基线使用场景(CCE、ECS、BMS)
     * @return baselineScene
     */
    public String getBaselineScene() {
        return baselineScene;
    }

    public void setBaselineScene(String baselineScene) {
        this.baselineScene = baselineScene;
    }

    public ShowPatchBaselineResponse withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 基线规则类型(Standard,Custom)
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public ShowPatchBaselineResponse withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 操作系统
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ShowPatchBaselineResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 补丁基准类型（公共/自定义）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowPatchBaselineResponse withApprovalRules(List<PatchRule> approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }

    public ShowPatchBaselineResponse addApprovalRulesItem(PatchRule approvalRulesItem) {
        if (this.approvalRules == null) {
            this.approvalRules = new ArrayList<>();
        }
        this.approvalRules.add(approvalRulesItem);
        return this;
    }

    public ShowPatchBaselineResponse withApprovalRules(Consumer<List<PatchRule>> approvalRulesSetter) {
        if (this.approvalRules == null) {
            this.approvalRules = new ArrayList<>();
        }
        approvalRulesSetter.accept(this.approvalRules);
        return this;
    }

    /**
     * 操作系统的批准规则
     * @return approvalRules
     */
    public List<PatchRule> getApprovalRules() {
        return approvalRules;
    }

    public void setApprovalRules(List<PatchRule> approvalRules) {
        this.approvalRules = approvalRules;
    }

    public ShowPatchBaselineResponse withCustomBaselineRules(List<CustomBaselineRule> customBaselineRules) {
        this.customBaselineRules = customBaselineRules;
        return this;
    }

    public ShowPatchBaselineResponse addCustomBaselineRulesItem(CustomBaselineRule customBaselineRulesItem) {
        if (this.customBaselineRules == null) {
            this.customBaselineRules = new ArrayList<>();
        }
        this.customBaselineRules.add(customBaselineRulesItem);
        return this;
    }

    public ShowPatchBaselineResponse withCustomBaselineRules(
        Consumer<List<CustomBaselineRule>> customBaselineRulesSetter) {
        if (this.customBaselineRules == null) {
            this.customBaselineRules = new ArrayList<>();
        }
        customBaselineRulesSetter.accept(this.customBaselineRules);
        return this;
    }

    /**
     * 自定义基线列表
     * @return customBaselineRules
     */
    public List<CustomBaselineRule> getCustomBaselineRules() {
        return customBaselineRules;
    }

    public void setCustomBaselineRules(List<CustomBaselineRule> customBaselineRules) {
        this.customBaselineRules = customBaselineRules;
    }

    public ShowPatchBaselineResponse withDefaultPatchBaseline(Boolean defaultPatchBaseline) {
        this.defaultPatchBaseline = defaultPatchBaseline;
        return this;
    }

    /**
     * 是否默认基准
     * @return defaultPatchBaseline
     */
    public Boolean getDefaultPatchBaseline() {
        return defaultPatchBaseline;
    }

    public void setDefaultPatchBaseline(Boolean defaultPatchBaseline) {
        this.defaultPatchBaseline = defaultPatchBaseline;
    }

    public ShowPatchBaselineResponse withRejectedPatches(String rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
        return this;
    }

    /**
     * 拒绝的补丁
     * @return rejectedPatches
     */
    public String getRejectedPatches() {
        return rejectedPatches;
    }

    public void setRejectedPatches(String rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
    }

    public ShowPatchBaselineResponse withRejectedAction(String rejectedAction) {
        this.rejectedAction = rejectedAction;
        return this;
    }

    /**
     * 拒绝策略
     * @return rejectedAction
     */
    public String getRejectedAction() {
        return rejectedAction;
    }

    public void setRejectedAction(String rejectedAction) {
        this.rejectedAction = rejectedAction;
    }

    public ShowPatchBaselineResponse withApprovedPatches(String approvedPatches) {
        this.approvedPatches = approvedPatches;
        return this;
    }

    /**
     * 批准的补丁
     * @return approvedPatches
     */
    public String getApprovedPatches() {
        return approvedPatches;
    }

    public void setApprovedPatches(String approvedPatches) {
        this.approvedPatches = approvedPatches;
    }

    public ShowPatchBaselineResponse withApprovedCompliance(String approvedCompliance) {
        this.approvedCompliance = approvedCompliance;
        return this;
    }

    /**
     * 批准的补丁合规性级别
     * @return approvedCompliance
     */
    public String getApprovedCompliance() {
        return approvedCompliance;
    }

    public void setApprovedCompliance(String approvedCompliance) {
        this.approvedCompliance = approvedCompliance;
    }

    public ShowPatchBaselineResponse withEnableSecurityApproved(Boolean enableSecurityApproved) {
        this.enableSecurityApproved = enableSecurityApproved;
        return this;
    }

    /**
     * 批准的补丁是否安全更新
     * @return enableSecurityApproved
     */
    public Boolean getEnableSecurityApproved() {
        return enableSecurityApproved;
    }

    public void setEnableSecurityApproved(Boolean enableSecurityApproved) {
        this.enableSecurityApproved = enableSecurityApproved;
    }

    public ShowPatchBaselineResponse withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public ShowPatchBaselineResponse withModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * modifiedTime
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPatchBaselineResponse that = (ShowPatchBaselineResponse) obj;
        return Objects.equals(this.baselineId, that.baselineId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.region, that.region)
            && Objects.equals(this.baselineScene, that.baselineScene) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.operatingSystem, that.operatingSystem) && Objects.equals(this.type, that.type)
            && Objects.equals(this.approvalRules, that.approvalRules)
            && Objects.equals(this.customBaselineRules, that.customBaselineRules)
            && Objects.equals(this.defaultPatchBaseline, that.defaultPatchBaseline)
            && Objects.equals(this.rejectedPatches, that.rejectedPatches)
            && Objects.equals(this.rejectedAction, that.rejectedAction)
            && Objects.equals(this.approvedPatches, that.approvedPatches)
            && Objects.equals(this.approvedCompliance, that.approvedCompliance)
            && Objects.equals(this.enableSecurityApproved, that.enableSecurityApproved)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineId,
            name,
            description,
            region,
            baselineScene,
            ruleType,
            operatingSystem,
            type,
            approvalRules,
            customBaselineRules,
            defaultPatchBaseline,
            rejectedPatches,
            rejectedAction,
            approvedPatches,
            approvedCompliance,
            enableSecurityApproved,
            createdTime,
            modifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPatchBaselineResponse {\n");
        sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    baselineScene: ").append(toIndentedString(baselineScene)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    approvalRules: ").append(toIndentedString(approvalRules)).append("\n");
        sb.append("    customBaselineRules: ").append(toIndentedString(customBaselineRules)).append("\n");
        sb.append("    defaultPatchBaseline: ").append(toIndentedString(defaultPatchBaseline)).append("\n");
        sb.append("    rejectedPatches: ").append(toIndentedString(rejectedPatches)).append("\n");
        sb.append("    rejectedAction: ").append(toIndentedString(rejectedAction)).append("\n");
        sb.append("    approvedPatches: ").append(toIndentedString(approvedPatches)).append("\n");
        sb.append("    approvedCompliance: ").append(toIndentedString(approvedCompliance)).append("\n");
        sb.append("    enableSecurityApproved: ").append(toIndentedString(enableSecurityApproved)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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
