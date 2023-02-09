package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Policy
 */
public class Policy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_exceptions")

    private List<PolicyItem> allowExceptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<PolicyItemCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_mask_policy_items")

    private List<DataMaskPolicyItem> dataMaskPolicyItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_exceptions")

    private List<PolicyItem> denyExceptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_policy_items")

    private List<PolicyItem> denyPolicyItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_audit_enabled")

    private Boolean isAuditEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_policy")

    private Boolean isDefaultPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deny_all_else")

    private Boolean isDenyAllElse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enabled")

    private Boolean isEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private Object options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_items")

    private List<PolicyItem> policyItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_labels")

    private List<String> policyLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_priority")

    private Integer policyPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private Integer policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_signature")

    private String resourceSignature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private Map<String, PolicyResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_filter_policy_items")

    private List<RowFilterPolicyItem> rowFilterPolicyItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity_schedules")

    private List<ValiditySchedule> validitySchedules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Long version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    public Policy withAllowExceptions(List<PolicyItem> allowExceptions) {
        this.allowExceptions = allowExceptions;
        return this;
    }

    public Policy addAllowExceptionsItem(PolicyItem allowExceptionsItem) {
        if (this.allowExceptions == null) {
            this.allowExceptions = new ArrayList<>();
        }
        this.allowExceptions.add(allowExceptionsItem);
        return this;
    }

    public Policy withAllowExceptions(Consumer<List<PolicyItem>> allowExceptionsSetter) {
        if (this.allowExceptions == null) {
            this.allowExceptions = new ArrayList<>();
        }
        allowExceptionsSetter.accept(this.allowExceptions);
        return this;
    }

    /**
     * 排除的允许策略
     * @return allowExceptions
     */
    public List<PolicyItem> getAllowExceptions() {
        return allowExceptions;
    }

    public void setAllowExceptions(List<PolicyItem> allowExceptions) {
        this.allowExceptions = allowExceptions;
    }

    public Policy withConditions(List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public Policy addConditionsItem(PolicyItemCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public Policy withConditions(Consumer<List<PolicyItemCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 条件属性
     * @return conditions
     */
    public List<PolicyItemCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
    }

    public Policy withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public Policy withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Policy withDataMaskPolicyItems(List<DataMaskPolicyItem> dataMaskPolicyItems) {
        this.dataMaskPolicyItems = dataMaskPolicyItems;
        return this;
    }

    public Policy addDataMaskPolicyItemsItem(DataMaskPolicyItem dataMaskPolicyItemsItem) {
        if (this.dataMaskPolicyItems == null) {
            this.dataMaskPolicyItems = new ArrayList<>();
        }
        this.dataMaskPolicyItems.add(dataMaskPolicyItemsItem);
        return this;
    }

    public Policy withDataMaskPolicyItems(Consumer<List<DataMaskPolicyItem>> dataMaskPolicyItemsSetter) {
        if (this.dataMaskPolicyItems == null) {
            this.dataMaskPolicyItems = new ArrayList<>();
        }
        dataMaskPolicyItemsSetter.accept(this.dataMaskPolicyItems);
        return this;
    }

    /**
     * 类掩码策略条目
     * @return dataMaskPolicyItems
     */
    public List<DataMaskPolicyItem> getDataMaskPolicyItems() {
        return dataMaskPolicyItems;
    }

    public void setDataMaskPolicyItems(List<DataMaskPolicyItem> dataMaskPolicyItems) {
        this.dataMaskPolicyItems = dataMaskPolicyItems;
    }

    public Policy withDenyExceptions(List<PolicyItem> denyExceptions) {
        this.denyExceptions = denyExceptions;
        return this;
    }

    public Policy addDenyExceptionsItem(PolicyItem denyExceptionsItem) {
        if (this.denyExceptions == null) {
            this.denyExceptions = new ArrayList<>();
        }
        this.denyExceptions.add(denyExceptionsItem);
        return this;
    }

    public Policy withDenyExceptions(Consumer<List<PolicyItem>> denyExceptionsSetter) {
        if (this.denyExceptions == null) {
            this.denyExceptions = new ArrayList<>();
        }
        denyExceptionsSetter.accept(this.denyExceptions);
        return this;
    }

    /**
     * 拒绝排除策略
     * @return denyExceptions
     */
    public List<PolicyItem> getDenyExceptions() {
        return denyExceptions;
    }

    public void setDenyExceptions(List<PolicyItem> denyExceptions) {
        this.denyExceptions = denyExceptions;
    }

    public Policy withDenyPolicyItems(List<PolicyItem> denyPolicyItems) {
        this.denyPolicyItems = denyPolicyItems;
        return this;
    }

    public Policy addDenyPolicyItemsItem(PolicyItem denyPolicyItemsItem) {
        if (this.denyPolicyItems == null) {
            this.denyPolicyItems = new ArrayList<>();
        }
        this.denyPolicyItems.add(denyPolicyItemsItem);
        return this;
    }

    public Policy withDenyPolicyItems(Consumer<List<PolicyItem>> denyPolicyItemsSetter) {
        if (this.denyPolicyItems == null) {
            this.denyPolicyItems = new ArrayList<>();
        }
        denyPolicyItemsSetter.accept(this.denyPolicyItems);
        return this;
    }

    /**
     * 拒绝策略
     * @return denyPolicyItems
     */
    public List<PolicyItem> getDenyPolicyItems() {
        return denyPolicyItems;
    }

    public void setDenyPolicyItems(List<PolicyItem> denyPolicyItems) {
        this.denyPolicyItems = denyPolicyItems;
    }

    public Policy withDescription(String description) {
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

    public Policy withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 唯一guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Policy withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 主键
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Policy withIsAuditEnabled(Boolean isAuditEnabled) {
        this.isAuditEnabled = isAuditEnabled;
        return this;
    }

    /**
     * 是否支持审计
     * @return isAuditEnabled
     */
    public Boolean getIsAuditEnabled() {
        return isAuditEnabled;
    }

    public void setIsAuditEnabled(Boolean isAuditEnabled) {
        this.isAuditEnabled = isAuditEnabled;
    }

    public Policy withIsDefaultPolicy(Boolean isDefaultPolicy) {
        this.isDefaultPolicy = isDefaultPolicy;
        return this;
    }

    /**
     * 是否默认策略
     * @return isDefaultPolicy
     */
    public Boolean getIsDefaultPolicy() {
        return isDefaultPolicy;
    }

    public void setIsDefaultPolicy(Boolean isDefaultPolicy) {
        this.isDefaultPolicy = isDefaultPolicy;
    }

    public Policy withIsDenyAllElse(Boolean isDenyAllElse) {
        this.isDenyAllElse = isDenyAllElse;
        return this;
    }

    /**
     * 是否拒绝所有
     * @return isDenyAllElse
     */
    public Boolean getIsDenyAllElse() {
        return isDenyAllElse;
    }

    public void setIsDenyAllElse(Boolean isDenyAllElse) {
        this.isDenyAllElse = isDenyAllElse;
    }

    public Policy withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * 是否启动
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Policy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Policy withOptions(Object options) {
        this.options = options;
        return this;
    }

    /**
     * 选项
     * @return options
     */
    public Object getOptions() {
        return options;
    }

    public void setOptions(Object options) {
        this.options = options;
    }

    public Policy withPolicyItems(List<PolicyItem> policyItems) {
        this.policyItems = policyItems;
        return this;
    }

    public Policy addPolicyItemsItem(PolicyItem policyItemsItem) {
        if (this.policyItems == null) {
            this.policyItems = new ArrayList<>();
        }
        this.policyItems.add(policyItemsItem);
        return this;
    }

    public Policy withPolicyItems(Consumer<List<PolicyItem>> policyItemsSetter) {
        if (this.policyItems == null) {
            this.policyItems = new ArrayList<>();
        }
        policyItemsSetter.accept(this.policyItems);
        return this;
    }

    /**
     * 策略信息数组
     * @return policyItems
     */
    public List<PolicyItem> getPolicyItems() {
        return policyItems;
    }

    public void setPolicyItems(List<PolicyItem> policyItems) {
        this.policyItems = policyItems;
    }

    public Policy withPolicyLabels(List<String> policyLabels) {
        this.policyLabels = policyLabels;
        return this;
    }

    public Policy addPolicyLabelsItem(String policyLabelsItem) {
        if (this.policyLabels == null) {
            this.policyLabels = new ArrayList<>();
        }
        this.policyLabels.add(policyLabelsItem);
        return this;
    }

    public Policy withPolicyLabels(Consumer<List<String>> policyLabelsSetter) {
        if (this.policyLabels == null) {
            this.policyLabels = new ArrayList<>();
        }
        policyLabelsSetter.accept(this.policyLabels);
        return this;
    }

    /**
     * 策略便签
     * @return policyLabels
     */
    public List<String> getPolicyLabels() {
        return policyLabels;
    }

    public void setPolicyLabels(List<String> policyLabels) {
        this.policyLabels = policyLabels;
    }

    public Policy withPolicyPriority(Integer policyPriority) {
        this.policyPriority = policyPriority;
        return this;
    }

    /**
     * 策略优先级
     * @return policyPriority
     */
    public Integer getPolicyPriority() {
        return policyPriority;
    }

    public void setPolicyPriority(Integer policyPriority) {
        this.policyPriority = policyPriority;
    }

    public Policy withPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 策略类型
     * @return policyType
     */
    public Integer getPolicyType() {
        return policyType;
    }

    public void setPolicyType(Integer policyType) {
        this.policyType = policyType;
    }

    public Policy withResourceSignature(String resourceSignature) {
        this.resourceSignature = resourceSignature;
        return this;
    }

    /**
     * 资源签名
     * @return resourceSignature
     */
    public String getResourceSignature() {
        return resourceSignature;
    }

    public void setResourceSignature(String resourceSignature) {
        this.resourceSignature = resourceSignature;
    }

    public Policy withResources(Map<String, PolicyResource> resources) {
        this.resources = resources;
        return this;
    }

    public Policy putResourcesItem(String key, PolicyResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new HashMap<>();
        }
        this.resources.put(key, resourcesItem);
        return this;
    }

    public Policy withResources(Consumer<Map<String, PolicyResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new HashMap<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源
     * @return resources
     */
    public Map<String, PolicyResource> getResources() {
        return resources;
    }

    public void setResources(Map<String, PolicyResource> resources) {
        this.resources = resources;
    }

    public Policy withRowFilterPolicyItems(List<RowFilterPolicyItem> rowFilterPolicyItems) {
        this.rowFilterPolicyItems = rowFilterPolicyItems;
        return this;
    }

    public Policy addRowFilterPolicyItemsItem(RowFilterPolicyItem rowFilterPolicyItemsItem) {
        if (this.rowFilterPolicyItems == null) {
            this.rowFilterPolicyItems = new ArrayList<>();
        }
        this.rowFilterPolicyItems.add(rowFilterPolicyItemsItem);
        return this;
    }

    public Policy withRowFilterPolicyItems(Consumer<List<RowFilterPolicyItem>> rowFilterPolicyItemsSetter) {
        if (this.rowFilterPolicyItems == null) {
            this.rowFilterPolicyItems = new ArrayList<>();
        }
        rowFilterPolicyItemsSetter.accept(this.rowFilterPolicyItems);
        return this;
    }

    /**
     * 行过滤策略条目
     * @return rowFilterPolicyItems
     */
    public List<RowFilterPolicyItem> getRowFilterPolicyItems() {
        return rowFilterPolicyItems;
    }

    public void setRowFilterPolicyItems(List<RowFilterPolicyItem> rowFilterPolicyItems) {
        this.rowFilterPolicyItems = rowFilterPolicyItems;
    }

    public Policy withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 服务
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Policy withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Policy withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Policy withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新者
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Policy withValiditySchedules(List<ValiditySchedule> validitySchedules) {
        this.validitySchedules = validitySchedules;
        return this;
    }

    public Policy addValiditySchedulesItem(ValiditySchedule validitySchedulesItem) {
        if (this.validitySchedules == null) {
            this.validitySchedules = new ArrayList<>();
        }
        this.validitySchedules.add(validitySchedulesItem);
        return this;
    }

    public Policy withValiditySchedules(Consumer<List<ValiditySchedule>> validitySchedulesSetter) {
        if (this.validitySchedules == null) {
            this.validitySchedules = new ArrayList<>();
        }
        validitySchedulesSetter.accept(this.validitySchedules);
        return this;
    }

    /**
     * 验证周期
     * @return validitySchedules
     */
    public List<ValiditySchedule> getValiditySchedules() {
        return validitySchedules;
    }

    public void setValiditySchedules(List<ValiditySchedule> validitySchedules) {
        this.validitySchedules = validitySchedules;
    }

    public Policy withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Policy withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 域
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Policy policy = (Policy) o;
        return Objects.equals(this.allowExceptions, policy.allowExceptions)
            && Objects.equals(this.conditions, policy.conditions) && Objects.equals(this.createTime, policy.createTime)
            && Objects.equals(this.createdBy, policy.createdBy)
            && Objects.equals(this.dataMaskPolicyItems, policy.dataMaskPolicyItems)
            && Objects.equals(this.denyExceptions, policy.denyExceptions)
            && Objects.equals(this.denyPolicyItems, policy.denyPolicyItems)
            && Objects.equals(this.description, policy.description) && Objects.equals(this.guid, policy.guid)
            && Objects.equals(this.id, policy.id) && Objects.equals(this.isAuditEnabled, policy.isAuditEnabled)
            && Objects.equals(this.isDefaultPolicy, policy.isDefaultPolicy)
            && Objects.equals(this.isDenyAllElse, policy.isDenyAllElse)
            && Objects.equals(this.isEnabled, policy.isEnabled) && Objects.equals(this.name, policy.name)
            && Objects.equals(this.options, policy.options) && Objects.equals(this.policyItems, policy.policyItems)
            && Objects.equals(this.policyLabels, policy.policyLabels)
            && Objects.equals(this.policyPriority, policy.policyPriority)
            && Objects.equals(this.policyType, policy.policyType)
            && Objects.equals(this.resourceSignature, policy.resourceSignature)
            && Objects.equals(this.resources, policy.resources)
            && Objects.equals(this.rowFilterPolicyItems, policy.rowFilterPolicyItems)
            && Objects.equals(this.service, policy.service) && Objects.equals(this.serviceType, policy.serviceType)
            && Objects.equals(this.updateTime, policy.updateTime) && Objects.equals(this.updatedBy, policy.updatedBy)
            && Objects.equals(this.validitySchedules, policy.validitySchedules)
            && Objects.equals(this.version, policy.version) && Objects.equals(this.zoneName, policy.zoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowExceptions,
            conditions,
            createTime,
            createdBy,
            dataMaskPolicyItems,
            denyExceptions,
            denyPolicyItems,
            description,
            guid,
            id,
            isAuditEnabled,
            isDefaultPolicy,
            isDenyAllElse,
            isEnabled,
            name,
            options,
            policyItems,
            policyLabels,
            policyPriority,
            policyType,
            resourceSignature,
            resources,
            rowFilterPolicyItems,
            service,
            serviceType,
            updateTime,
            updatedBy,
            validitySchedules,
            version,
            zoneName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policy {\n");
        sb.append("    allowExceptions: ").append(toIndentedString(allowExceptions)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    dataMaskPolicyItems: ").append(toIndentedString(dataMaskPolicyItems)).append("\n");
        sb.append("    denyExceptions: ").append(toIndentedString(denyExceptions)).append("\n");
        sb.append("    denyPolicyItems: ").append(toIndentedString(denyPolicyItems)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isAuditEnabled: ").append(toIndentedString(isAuditEnabled)).append("\n");
        sb.append("    isDefaultPolicy: ").append(toIndentedString(isDefaultPolicy)).append("\n");
        sb.append("    isDenyAllElse: ").append(toIndentedString(isDenyAllElse)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    policyItems: ").append(toIndentedString(policyItems)).append("\n");
        sb.append("    policyLabels: ").append(toIndentedString(policyLabels)).append("\n");
        sb.append("    policyPriority: ").append(toIndentedString(policyPriority)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    resourceSignature: ").append(toIndentedString(resourceSignature)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    rowFilterPolicyItems: ").append(toIndentedString(rowFilterPolicyItems)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    validitySchedules: ").append(toIndentedString(validitySchedules)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
