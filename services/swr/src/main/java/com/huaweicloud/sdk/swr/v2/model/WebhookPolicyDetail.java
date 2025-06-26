package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WebhookPolicyDetail
 */
public class WebhookPolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<Target> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_types")

    private List<String> eventTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_rules")

    private List<ScopeRule> scopeRules = null;

    public WebhookPolicyDetail withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 触发器ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WebhookPolicyDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 触发器策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookPolicyDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 触发器策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhookPolicyDetail withTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public WebhookPolicyDetail addTargetsItem(Target targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public WebhookPolicyDetail withTargets(Consumer<List<Target>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 触发目标
     * @return targets
     */
    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public WebhookPolicyDetail withEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public WebhookPolicyDetail addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    public WebhookPolicyDetail withEventTypes(Consumer<List<String>> eventTypesSetter) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        eventTypesSetter.accept(this.eventTypes);
        return this;
    }

    /**
     * 事件类型
     * @return eventTypes
     */
    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public WebhookPolicyDetail withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否使用，可选true或false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public WebhookPolicyDetail withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public WebhookPolicyDetail withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public WebhookPolicyDetail withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public WebhookPolicyDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookPolicyDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookPolicyDetail withScopeRules(List<ScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
        return this;
    }

    public WebhookPolicyDetail addScopeRulesItem(ScopeRule scopeRulesItem) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        this.scopeRules.add(scopeRulesItem);
        return this;
    }

    public WebhookPolicyDetail withScopeRules(Consumer<List<ScopeRule>> scopeRulesSetter) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        scopeRulesSetter.accept(this.scopeRules);
        return this;
    }

    /**
     * 触发作用范围规则
     * @return scopeRules
     */
    public List<ScopeRule> getScopeRules() {
        return scopeRules;
    }

    public void setScopeRules(List<ScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebhookPolicyDetail that = (WebhookPolicyDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.targets, that.targets)
            && Objects.equals(this.eventTypes, that.eventTypes) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.namespaceId, that.namespaceId)
            && Objects.equals(this.namespaceName, that.namespaceName) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.scopeRules, that.scopeRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            targets,
            eventTypes,
            enabled,
            namespaceId,
            namespaceName,
            creator,
            createdAt,
            updatedAt,
            scopeRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPolicyDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    scopeRules: ").append(toIndentedString(scopeRules)).append("\n");
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
