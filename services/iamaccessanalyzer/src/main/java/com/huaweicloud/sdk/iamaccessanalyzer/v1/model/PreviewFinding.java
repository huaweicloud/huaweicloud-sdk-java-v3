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
 * PreviewFinding
 */
public class PreviewFinding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private List<String> action = null;

    /**
     * 结果状态的变化。
     */
    public static final class ChangeTypeEnum {

        /**
         * Enum UNCHANGED for value: "unchanged"
         */
        public static final ChangeTypeEnum UNCHANGED = new ChangeTypeEnum("unchanged");

        /**
         * Enum NEW for value: "new"
         */
        public static final ChangeTypeEnum NEW = new ChangeTypeEnum("new");

        /**
         * Enum CHANGED for value: "changed"
         */
        public static final ChangeTypeEnum CHANGED = new ChangeTypeEnum("changed");

        private static final Map<String, ChangeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChangeTypeEnum> createStaticFields() {
            Map<String, ChangeTypeEnum> map = new HashMap<>();
            map.put("unchanged", UNCHANGED);
            map.put("new", NEW);
            map.put("changed", CHANGED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChangeTypeEnum(String value) {
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
        public static ChangeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChangeTypeEnum(value));
        }

        public static ChangeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChangeTypeEnum) {
                return this.value.equals(((ChangeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private ChangeTypeEnum changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private List<FindingCondition> condition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_finding_id")

    private String existingFindingId;

    /**
     * 结果的当前状态。
     */
    public static final class ExistingFindingStatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final ExistingFindingStatusEnum ACTIVE = new ExistingFindingStatusEnum("active");

        /**
         * Enum ARCHIVED for value: "archived"
         */
        public static final ExistingFindingStatusEnum ARCHIVED = new ExistingFindingStatusEnum("archived");

        /**
         * Enum RESOLVED for value: "resolved"
         */
        public static final ExistingFindingStatusEnum RESOLVED = new ExistingFindingStatusEnum("resolved");

        private static final Map<String, ExistingFindingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExistingFindingStatusEnum> createStaticFields() {
            Map<String, ExistingFindingStatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("archived", ARCHIVED);
            map.put("resolved", RESOLVED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExistingFindingStatusEnum(String value) {
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
        public static ExistingFindingStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExistingFindingStatusEnum(value));
        }

        public static ExistingFindingStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExistingFindingStatusEnum) {
                return this.value.equals(((ExistingFindingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_finding_status")

    private ExistingFindingStatusEnum existingFindingStatus;

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
    @JsonProperty(value = "resource_owner_account")

    private String resourceOwnerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<FindingSourceType> sources = null;

    /**
     * 变化后的状态。
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

    public PreviewFinding withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public PreviewFinding addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public PreviewFinding withAction(Consumer<List<String>> actionSetter) {
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

    public PreviewFinding withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 结果状态的变化。
     * @return changeType
     */
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    public PreviewFinding withCondition(List<FindingCondition> condition) {
        this.condition = condition;
        return this;
    }

    public PreviewFinding addConditionItem(FindingCondition conditionItem) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        this.condition.add(conditionItem);
        return this;
    }

    public PreviewFinding withCondition(Consumer<List<FindingCondition>> conditionSetter) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        conditionSetter.accept(this.condition);
        return this;
    }

    /**
     * 分析的策略语句中导致访问预览分析结果的条件。
     * @return condition
     */
    public List<FindingCondition> getCondition() {
        return condition;
    }

    public void setCondition(List<FindingCondition> condition) {
        this.condition = condition;
    }

    public PreviewFinding withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 生成预览访问分析结果的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PreviewFinding withExistingFindingId(String existingFindingId) {
        this.existingFindingId = existingFindingId;
        return this;
    }

    /**
     * 访问分析结果的唯一标识符。
     * @return existingFindingId
     */
    public String getExistingFindingId() {
        return existingFindingId;
    }

    public void setExistingFindingId(String existingFindingId) {
        this.existingFindingId = existingFindingId;
    }

    public PreviewFinding withExistingFindingStatus(ExistingFindingStatusEnum existingFindingStatus) {
        this.existingFindingStatus = existingFindingStatus;
        return this;
    }

    /**
     * 结果的当前状态。
     * @return existingFindingStatus
     */
    public ExistingFindingStatusEnum getExistingFindingStatus() {
        return existingFindingStatus;
    }

    public void setExistingFindingStatus(ExistingFindingStatusEnum existingFindingStatus) {
        this.existingFindingStatus = existingFindingStatus;
    }

    public PreviewFinding withId(String id) {
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

    public PreviewFinding withIsPublic(Boolean isPublic) {
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

    public PreviewFinding withPrincipal(FindingPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public PreviewFinding withPrincipal(Consumer<FindingPrincipal> principalSetter) {
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

    public PreviewFinding withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 访问分析的唯一资源标识。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public PreviewFinding withResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }

    /**
     * 拥有资源的账户ID。
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public PreviewFinding withResourceType(ResourceType resourceType) {
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

    public PreviewFinding withSources(List<FindingSourceType> sources) {
        this.sources = sources;
        return this;
    }

    public PreviewFinding addSourcesItem(FindingSourceType sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public PreviewFinding withSources(Consumer<List<FindingSourceType>> sourcesSetter) {
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

    public PreviewFinding withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 变化后的状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewFinding that = (PreviewFinding) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.existingFindingId, that.existingFindingId)
            && Objects.equals(this.existingFindingStatus, that.existingFindingStatus)
            && Objects.equals(this.id, that.id) && Objects.equals(this.isPublic, that.isPublic)
            && Objects.equals(this.principal, that.principal) && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.resourceOwnerAccount, that.resourceOwnerAccount)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            changeType,
            condition,
            createdAt,
            existingFindingId,
            existingFindingStatus,
            id,
            isPublic,
            principal,
            resource,
            resourceOwnerAccount,
            resourceType,
            sources,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewFinding {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    existingFindingId: ").append(toIndentedString(existingFindingId)).append("\n");
        sb.append("    existingFindingStatus: ").append(toIndentedString(existingFindingStatus)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    resourceOwnerAccount: ").append(toIndentedString(resourceOwnerAccount)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
