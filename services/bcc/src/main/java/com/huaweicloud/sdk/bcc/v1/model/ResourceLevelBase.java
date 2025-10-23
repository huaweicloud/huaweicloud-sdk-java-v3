package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceLevelBase
 */
public class ResourceLevelBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_name")

    private String resourceLevelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "providers")

    private List<String> providers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level")

    private Integer resourceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_type")

    private Integer applyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_rule")

    private String applyRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_rule_id")

    private String complianceRuleId;

    public ResourceLevelBase withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceLevelBase withResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
        return this;
    }

    /**
     * 资源等级名称
     * @return resourceLevelName
     */
    public String getResourceLevelName() {
        return resourceLevelName;
    }

    public void setResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
    }

    public ResourceLevelBase withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    public ResourceLevelBase addProvidersItem(String providersItem) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(providersItem);
        return this;
    }

    public ResourceLevelBase withProviders(Consumer<List<String>> providersSetter) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        providersSetter.accept(this.providers);
        return this;
    }

    /**
     * 云服务
     * @return providers
     */
    public List<String> getProviders() {
        return providers;
    }

    public void setProviders(List<String> providers) {
        this.providers = providers;
    }

    public ResourceLevelBase withResourceLevel(Integer resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * 重要程度
     * minimum: 1
     * maximum: 5
     * @return resourceLevel
     */
    public Integer getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(Integer resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public ResourceLevelBase withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ResourceLevelBase withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResourceLevelBase withApplyType(Integer applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * 应用方式
     * minimum: 1
     * maximum: 4
     * @return applyType
     */
    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public ResourceLevelBase withApplyRule(String applyRule) {
        this.applyRule = applyRule;
        return this;
    }

    /**
     * 应用规则
     * @return applyRule
     */
    public String getApplyRule() {
        return applyRule;
    }

    public void setApplyRule(String applyRule) {
        this.applyRule = applyRule;
    }

    public ResourceLevelBase withComplianceRuleId(String complianceRuleId) {
        this.complianceRuleId = complianceRuleId;
        return this;
    }

    /**
     * 合规规则ID
     * @return complianceRuleId
     */
    public String getComplianceRuleId() {
        return complianceRuleId;
    }

    public void setComplianceRuleId(String complianceRuleId) {
        this.complianceRuleId = complianceRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLevelBase that = (ResourceLevelBase) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceLevelName, that.resourceLevelName)
            && Objects.equals(this.providers, that.providers) && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.applyType, that.applyType) && Objects.equals(this.applyRule, that.applyRule)
            && Objects.equals(this.complianceRuleId, that.complianceRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceLevelName,
            providers,
            resourceLevel,
            domainId,
            description,
            applyType,
            applyRule,
            complianceRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceLevelBase {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceLevelName: ").append(toIndentedString(resourceLevelName)).append("\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
        sb.append("    applyRule: ").append(toIndentedString(applyRule)).append("\n");
        sb.append("    complianceRuleId: ").append(toIndentedString(complianceRuleId)).append("\n");
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
