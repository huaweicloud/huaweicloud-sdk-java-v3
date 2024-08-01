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
public class Finding {

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
    @JsonProperty(value = "finding_details")

    private List<FindingDetails> findingDetails = null;

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

    public Finding withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public Finding addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public Finding withAction(Consumer<List<String>> actionSetter) {
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

    public Finding withAnalyzedAt(OffsetDateTime analyzedAt) {
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

    public Finding withCondition(List<FindingCondition> condition) {
        this.condition = condition;
        return this;
    }

    public Finding addConditionItem(FindingCondition conditionItem) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        this.condition.add(conditionItem);
        return this;
    }

    public Finding withCondition(Consumer<List<FindingCondition>> conditionSetter) {
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

    public Finding withCreatedAt(OffsetDateTime createdAt) {
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

    public Finding withFindingDetails(List<FindingDetails> findingDetails) {
        this.findingDetails = findingDetails;
        return this;
    }

    public Finding addFindingDetailsItem(FindingDetails findingDetailsItem) {
        if (this.findingDetails == null) {
            this.findingDetails = new ArrayList<>();
        }
        this.findingDetails.add(findingDetailsItem);
        return this;
    }

    public Finding withFindingDetails(Consumer<List<FindingDetails>> findingDetailsSetter) {
        if (this.findingDetails == null) {
            this.findingDetails = new ArrayList<>();
        }
        findingDetailsSetter.accept(this.findingDetails);
        return this;
    }

    /**
     * 访问分析结果的详细信息。
     * @return findingDetails
     */
    public List<FindingDetails> getFindingDetails() {
        return findingDetails;
    }

    public void setFindingDetails(List<FindingDetails> findingDetails) {
        this.findingDetails = findingDetails;
    }

    public Finding withFindingType(FindingType findingType) {
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

    public Finding withId(String id) {
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

    public Finding withIsPublic(Boolean isPublic) {
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

    public Finding withPrincipal(FindingPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public Finding withPrincipal(Consumer<FindingPrincipal> principalSetter) {
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

    public Finding withResource(String resource) {
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

    public Finding withResourceId(String resourceId) {
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

    public Finding withResourceOwnerAccount(String resourceOwnerAccount) {
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

    public Finding withResourceProjectId(String resourceProjectId) {
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

    public Finding withResourceType(ResourceType resourceType) {
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

    public Finding withSources(List<FindingSourceType> sources) {
        this.sources = sources;
        return this;
    }

    public Finding addSourcesItem(FindingSourceType sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public Finding withSources(Consumer<List<FindingSourceType>> sourcesSetter) {
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

    public Finding withStatus(StatusEnum status) {
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

    public Finding withUpdatedAt(OffsetDateTime updatedAt) {
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
        Finding that = (Finding) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.analyzedAt, that.analyzedAt)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.findingDetails, that.findingDetails)
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
            findingDetails,
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
        sb.append("class Finding {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    analyzedAt: ").append(toIndentedString(analyzedAt)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    findingDetails: ").append(toIndentedString(findingDetails)).append("\n");
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
