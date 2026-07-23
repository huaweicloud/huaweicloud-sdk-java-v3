package com.huaweicloud.sdk.agentarts.v1.model;

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
import java.util.UUID;
import java.util.function.Consumer;

/**
 * **参数解释：** Space 摘要信息（用于列表接口）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreSpaceSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：** 记忆库状态。 **取值范围：** - creating: 创建中 - running: 运行中 - deleted: 已删除 - create_failed: 创建失败 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        /**
         * Enum CREATE_FAILED for value: "create_failed"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("create_failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("creating", CREATING);
            map.put("running", RUNNING);
            map.put("deleted", DELETED);
            map.put("create_failed", CREATE_FAILED);
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
    @JsonProperty(value = "memory_strategy_count")

    private Integer memoryStrategyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_ttl_days")

    private Integer messageTtlDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreSpaceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public CoreSpaceSummary withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记忆库 ID，唯一标识一个记忆库，可通过\"创建Space\"接口获取。 **取值范围：** 不涉及。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CoreSpaceSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** Space 名称。 **取值范围：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoreSpaceSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** Space 描述。 **取值范围：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoreSpaceSummary withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 记忆库状态。 **取值范围：** - creating: 创建中 - running: 运行中 - deleted: 已删除 - create_failed: 创建失败 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CoreSpaceSummary withMemoryStrategyCount(Integer memoryStrategyCount) {
        this.memoryStrategyCount = memoryStrategyCount;
        return this;
    }

    /**
     * **参数解释：** 关联的记忆策略数目（个）。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 100
     * @return memoryStrategyCount
     */
    public Integer getMemoryStrategyCount() {
        return memoryStrategyCount;
    }

    public void setMemoryStrategyCount(Integer memoryStrategyCount) {
        this.memoryStrategyCount = memoryStrategyCount;
    }

    public CoreSpaceSummary withMessageTtlDays(Integer messageTtlDays) {
        this.messageTtlDays = messageTtlDays;
        return this;
    }

    /**
     * **参数解释：** 短期记忆过期时间（天），由 message_ttl_hours 换算。 **取值范围：** 不涉及。 
     * minimum: 0
     * maximum: 365
     * @return messageTtlDays
     */
    public Integer getMessageTtlDays() {
        return messageTtlDays;
    }

    public void setMessageTtlDays(Integer messageTtlDays) {
        this.messageTtlDays = messageTtlDays;
    }

    public CoreSpaceSummary withTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
        return this;
    }

    public CoreSpaceSummary addTagsItem(CoreSpaceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CoreSpaceSummary withTags(Consumer<List<CoreSpaceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 库标签列表。 **取值范围：** 不涉及。 
     * @return tags
     */
    public List<CoreSpaceTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreSpaceTag> tags) {
        this.tags = tags;
    }

    public CoreSpaceSummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 记录的创建时间，由系统自动生成，格式为 ISO 8601（YYYY-MM-DDTHH:mm:ssZ）。 **取值范围：** 不涉及。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CoreSpaceSummary withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 记录的最近更新时间，由系统自动更新，格式为 ISO 8601（YYYY-MM-DDTHH:mm:ssZ）。 **取值范围：** 不涉及。 
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
        CoreSpaceSummary that = (CoreSpaceSummary) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.memoryStrategyCount, that.memoryStrategyCount)
            && Objects.equals(this.messageTtlDays, that.messageTtlDays) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, description, status, memoryStrategyCount, messageTtlDays, tags, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreSpaceSummary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    memoryStrategyCount: ").append(toIndentedString(memoryStrategyCount)).append("\n");
        sb.append("    messageTtlDays: ").append(toIndentedString(messageTtlDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
