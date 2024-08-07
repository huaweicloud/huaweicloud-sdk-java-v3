package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问分析结果。
 */
public class FindingSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private List<String> action = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzed_at")

    private OffsetDateTime analyzedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private List<FindingCondition> condition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finding_type")

    private FindingType findingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private FindingPrincipal principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_owner_account")

    private String resourceOwnerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_project_id")

    private String resourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<FindingSourceType> sources = null;

    /**
     * 访问分析结果当前状态。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        /**
         * Enum ARCHIVED for value: "archived"
         */
        public static final StatusEnum ARCHIVED = new StatusEnum("archived");

        /**
         * Enum RESOLVED for value: "resolved"
         */
        public static final StatusEnum RESOLVED = new StatusEnum("resolved");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("archived", ARCHIVED);
            map.put("resolved", RESOLVED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public FindingSummary withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public FindingSummary addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public FindingSummary withAction(Consumer<List<String>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 允许外部主体使用的操作。
     * @return action
     */
    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public FindingSummary withAnalyzedAt(OffsetDateTime analyzedAt) {
        this.analyzedAt = analyzedAt;
        return this;
    }

    /**
     * 分析资源的时间。
     * @return analyzedAt
     */
    public OffsetDateTime getAnalyzedAt() {
        return analyzedAt;
    }

    public void setAnalyzedAt(OffsetDateTime analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    public FindingSummary withCondition(List<FindingCondition> condition) {
        this.condition = condition;
        return this;
    }

    public FindingSummary addConditionItem(FindingCondition conditionItem) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        this.condition.add(conditionItem);
        return this;
    }

    public FindingSummary withCondition(Consumer<List<FindingCondition>> conditionSetter) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        conditionSetter.accept(this.condition);
        return this;
    }

    /**
     * 分析的策略语句中导致访问分析结果的条件。
     * @return condition
     */
    public List<FindingCondition> getCondition() {
        return condition;
    }

    public void setCondition(List<FindingCondition> condition) {
        this.condition = condition;
    }

    public FindingSummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 生成访问分析结果的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public FindingSummary withFindingType(FindingType findingType) {
        this.findingType = findingType;
        return this;
    }

    /**
     * Get findingType
     * @return findingType
     */
    public FindingType getFindingType() {
        return findingType;
    }

    public void setFindingType(FindingType findingType) {
        this.findingType = findingType;
    }

    public FindingSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 访问分析结果的唯一标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FindingSummary withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 表示生成访问分析结果的策略是否允许公共访问资源。
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public FindingSummary withPrincipal(FindingPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public FindingSummary withPrincipal(Consumer<FindingPrincipal> principalSetter) {
        if (this.principal == null) {
            this.principal = new FindingPrincipal();
            principalSetter.accept(this.principal);
        }

        return this;
    }

    /**
     * Get principal
     * @return principal
     */
    public FindingPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(FindingPrincipal principal) {
        this.principal = principal;
    }

    public FindingSummary withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 资源的唯一资源标识符。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public FindingSummary withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源的唯一标识符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FindingSummary withResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }

    /**
     * 拥有资源的账号ID。
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public FindingSummary withResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
        return this;
    }

    /**
     * 资源所属的项目标识符
     * @return resourceProjectId
     */
    public String getResourceProjectId() {
        return resourceProjectId;
    }

    public void setResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
    }

    public FindingSummary withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public FindingSummary withSources(List<FindingSourceType> sources) {
        this.sources = sources;
        return this;
    }

    public FindingSummary addSourcesItem(FindingSourceType sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public FindingSummary withSources(Consumer<List<FindingSourceType>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 访问分析结果的来源，这指示如何授予生成访问分析结果的访问权限。
     * @return sources
     */
    public List<FindingSourceType> getSources() {
        return sources;
    }

    public void setSources(List<FindingSourceType> sources) {
        this.sources = sources;
    }

    public FindingSummary withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 访问分析结果当前状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public FindingSummary withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新访问分析结果的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindingSummary that = (FindingSummary) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.analyzedAt, that.analyzedAt)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.findingType, that.findingType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isPublic, that.isPublic) && Objects.equals(this.principal, that.principal)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceOwnerAccount, that.resourceOwnerAccount)
            && Objects.equals(this.resourceProjectId, that.resourceProjectId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.status, that.status) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            analyzedAt,
            condition,
            createdAt,
            findingType,
            id,
            isPublic,
            principal,
            resource,
            resourceId,
            resourceOwnerAccount,
            resourceProjectId,
            resourceType,
            sources,
            status,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FindingSummary {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    analyzedAt: ").append(toIndentedString(analyzedAt)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    findingType: ").append(toIndentedString(findingType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceOwnerAccount: ").append(toIndentedString(resourceOwnerAccount)).append("\n");
        sb.append("    resourceProjectId: ").append(toIndentedString(resourceProjectId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
