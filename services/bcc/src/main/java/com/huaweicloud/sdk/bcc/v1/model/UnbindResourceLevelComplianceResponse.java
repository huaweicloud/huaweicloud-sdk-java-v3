package com.huaweicloud.sdk.bcc.v1.model;

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
public class UnbindResourceLevelComplianceResponse extends SdkResponse {

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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_type")

    private Integer applyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_rule")

    private String applyRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_rule")

    private ComplianceRule complianceRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_count_list")

    private List<LevelResourceCount> resourceCountList = null;

    public UnbindResourceLevelComplianceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源分级ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnbindResourceLevelComplianceResponse withResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
        return this;
    }

    /**
     * 资源分级名称
     * @return resourceLevelName
     */
    public String getResourceLevelName() {
        return resourceLevelName;
    }

    public void setResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
    }

    public UnbindResourceLevelComplianceResponse withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    public UnbindResourceLevelComplianceResponse addProvidersItem(String providersItem) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(providersItem);
        return this;
    }

    public UnbindResourceLevelComplianceResponse withProviders(Consumer<List<String>> providersSetter) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        providersSetter.accept(this.providers);
        return this;
    }

    /**
     * 资源类型
     * @return providers
     */
    public List<String> getProviders() {
        return providers;
    }

    public void setProviders(List<String> providers) {
        this.providers = providers;
    }

    public UnbindResourceLevelComplianceResponse withResourceLevel(Integer resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * 资产级别，支持五级 。1公开，2一般，3关键，4重要，5核心
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

    public UnbindResourceLevelComplianceResponse withDescription(String description) {
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

    public UnbindResourceLevelComplianceResponse withDomainId(String domainId) {
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

    public UnbindResourceLevelComplianceResponse withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public UnbindResourceLevelComplianceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UnbindResourceLevelComplianceResponse withApplyType(Integer applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * 应用方式。1：按标签匹配；2：按照资源类型和资源名称正则匹配；3：按照资源ID
     * minimum: 0
     * maximum: 2147483647
     * @return applyType
     */
    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public UnbindResourceLevelComplianceResponse withApplyRule(String applyRule) {
        this.applyRule = applyRule;
        return this;
    }

    /**
     * 应用的规则
     * @return applyRule
     */
    public String getApplyRule() {
        return applyRule;
    }

    public void setApplyRule(String applyRule) {
        this.applyRule = applyRule;
    }

    public UnbindResourceLevelComplianceResponse withComplianceRule(ComplianceRule complianceRule) {
        this.complianceRule = complianceRule;
        return this;
    }

    public UnbindResourceLevelComplianceResponse withComplianceRule(Consumer<ComplianceRule> complianceRuleSetter) {
        if (this.complianceRule == null) {
            this.complianceRule = new ComplianceRule();
            complianceRuleSetter.accept(this.complianceRule);
        }

        return this;
    }

    /**
     * Get complianceRule
     * @return complianceRule
     */
    public ComplianceRule getComplianceRule() {
        return complianceRule;
    }

    public void setComplianceRule(ComplianceRule complianceRule) {
        this.complianceRule = complianceRule;
    }

    public UnbindResourceLevelComplianceResponse withResourceCountList(List<LevelResourceCount> resourceCountList) {
        this.resourceCountList = resourceCountList;
        return this;
    }

    public UnbindResourceLevelComplianceResponse addResourceCountListItem(LevelResourceCount resourceCountListItem) {
        if (this.resourceCountList == null) {
            this.resourceCountList = new ArrayList<>();
        }
        this.resourceCountList.add(resourceCountListItem);
        return this;
    }

    public UnbindResourceLevelComplianceResponse withResourceCountList(
        Consumer<List<LevelResourceCount>> resourceCountListSetter) {
        if (this.resourceCountList == null) {
            this.resourceCountList = new ArrayList<>();
        }
        resourceCountListSetter.accept(this.resourceCountList);
        return this;
    }

    /**
     * 各类资源数量
     * @return resourceCountList
     */
    public List<LevelResourceCount> getResourceCountList() {
        return resourceCountList;
    }

    public void setResourceCountList(List<LevelResourceCount> resourceCountList) {
        this.resourceCountList = resourceCountList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnbindResourceLevelComplianceResponse that = (UnbindResourceLevelComplianceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceLevelName, that.resourceLevelName)
            && Objects.equals(this.providers, that.providers) && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.applyType, that.applyType)
            && Objects.equals(this.applyRule, that.applyRule)
            && Objects.equals(this.complianceRule, that.complianceRule)
            && Objects.equals(this.resourceCountList, that.resourceCountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceLevelName,
            providers,
            resourceLevel,
            description,
            domainId,
            organizationId,
            projectId,
            applyType,
            applyRule,
            complianceRule,
            resourceCountList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindResourceLevelComplianceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceLevelName: ").append(toIndentedString(resourceLevelName)).append("\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
        sb.append("    applyRule: ").append(toIndentedString(applyRule)).append("\n");
        sb.append("    complianceRule: ").append(toIndentedString(complianceRule)).append("\n");
        sb.append("    resourceCountList: ").append(toIndentedString(resourceCountList)).append("\n");
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
