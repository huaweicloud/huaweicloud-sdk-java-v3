package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StagePluginsQueryDTO
 */
public class StagePluginsQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_condition")

    private String useCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comp_id")

    private String compId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comp_name")

    private String compName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_id")

    private String cloudId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_id")

    private String strategyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_tab")

    private String publishTab;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comp_extend_type")

    private String compExtendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    public StagePluginsQueryDTO withUseCondition(String useCondition) {
        this.useCondition = useCondition;
        return this;
    }

    /**
     * **参数解释**： 用于区分插件为流水线可使用/模板可使用。 **约束限制**： 不涉及。 **取值范围**： - pipeline：流水线可使用。 - template：模板可使用。 **默认取值**： 不涉及。 
     * @return useCondition
     */
    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }

    public StagePluginsQueryDTO withCompId(String compId) {
        this.compId = compId;
        return this;
    }

    /**
     * **参数解释**： 微服务ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return compId
     */
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public StagePluginsQueryDTO withCompName(String compName) {
        this.compName = compName;
        return this;
    }

    /**
     * **参数解释**： 微服务名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return compName
     */
    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public StagePluginsQueryDTO withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * **参数解释**： 局点ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return cloudId
     */
    public String getCloudId() {
        return cloudId;
    }

    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    public StagePluginsQueryDTO withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * **参数解释**： 策略ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public StagePluginsQueryDTO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 流水线类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public StagePluginsQueryDTO withPublishTab(String publishTab) {
        this.publishTab = publishTab;
        return this;
    }

    /**
     * **参数解释**： 是否发布流水线。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return publishTab
     */
    public String getPublishTab() {
        return publishTab;
    }

    public void setPublishTab(String publishTab) {
        this.publishTab = publishTab;
    }

    public StagePluginsQueryDTO withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * **参数解释**： 部署平台。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public StagePluginsQueryDTO withCompExtendType(String compExtendType) {
        this.compExtendType = compExtendType;
        return this;
    }

    /**
     * **参数解释**： 组件类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return compExtendType
     */
    public String getCompExtendType() {
        return compExtendType;
    }

    public void setCompExtendType(String compExtendType) {
        this.compExtendType = compExtendType;
    }

    public StagePluginsQueryDTO withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释**： 部署类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StagePluginsQueryDTO that = (StagePluginsQueryDTO) obj;
        return Objects.equals(this.useCondition, that.useCondition) && Objects.equals(this.compId, that.compId)
            && Objects.equals(this.compName, that.compName) && Objects.equals(this.cloudId, that.cloudId)
            && Objects.equals(this.strategyId, that.strategyId) && Objects.equals(this.category, that.category)
            && Objects.equals(this.publishTab, that.publishTab) && Objects.equals(this.platform, that.platform)
            && Objects.equals(this.compExtendType, that.compExtendType)
            && Objects.equals(this.deployType, that.deployType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useCondition,
            compId,
            compName,
            cloudId,
            strategyId,
            category,
            publishTab,
            platform,
            compExtendType,
            deployType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StagePluginsQueryDTO {\n");
        sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
        sb.append("    compId: ").append(toIndentedString(compId)).append("\n");
        sb.append("    compName: ").append(toIndentedString(compName)).append("\n");
        sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    publishTab: ").append(toIndentedString(publishTab)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    compExtendType: ").append(toIndentedString(compExtendType)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
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
