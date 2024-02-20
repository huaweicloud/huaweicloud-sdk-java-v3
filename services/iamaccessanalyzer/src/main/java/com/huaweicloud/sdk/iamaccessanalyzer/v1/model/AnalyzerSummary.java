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
 * 包含有关分析器的信息。
 */
public class AnalyzerSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_analyzed_resource")

    private String lastAnalyzedResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_resource_analyzed_at")

    private OffsetDateTime lastResourceAnalyzedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 分析器的状态
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("creating", CREATING);
            map.put("failed", FAILED);
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
    @JsonProperty(value = "status_reason")

    private StatusReason statusReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private AnalyzerType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    public AnalyzerSummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 分析器创建的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AnalyzerSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分析器的唯一标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AnalyzerSummary withLastAnalyzedResource(String lastAnalyzedResource) {
        this.lastAnalyzedResource = lastAnalyzedResource;
        return this;
    }

    /**
     * 唯一的资源名称。
     * @return lastAnalyzedResource
     */
    public String getLastAnalyzedResource() {
        return lastAnalyzedResource;
    }

    public void setLastAnalyzedResource(String lastAnalyzedResource) {
        this.lastAnalyzedResource = lastAnalyzedResource;
    }

    public AnalyzerSummary withLastResourceAnalyzedAt(OffsetDateTime lastResourceAnalyzedAt) {
        this.lastResourceAnalyzedAt = lastResourceAnalyzedAt;
        return this;
    }

    /**
     * 分析最近分析的资源的时间。
     * @return lastResourceAnalyzedAt
     */
    public OffsetDateTime getLastResourceAnalyzedAt() {
        return lastResourceAnalyzedAt;
    }

    public void setLastResourceAnalyzedAt(OffsetDateTime lastResourceAnalyzedAt) {
        this.lastResourceAnalyzedAt = lastResourceAnalyzedAt;
    }

    public AnalyzerSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分析器的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnalyzerSummary withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 分析器的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AnalyzerSummary withStatusReason(StatusReason statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    public AnalyzerSummary withStatusReason(Consumer<StatusReason> statusReasonSetter) {
        if (this.statusReason == null) {
            this.statusReason = new StatusReason();
            statusReasonSetter.accept(this.statusReason);
        }

        return this;
    }

    /**
     * Get statusReason
     * @return statusReason
     */
    public StatusReason getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(StatusReason statusReason) {
        this.statusReason = statusReason;
    }

    public AnalyzerSummary withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public AnalyzerSummary addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AnalyzerSummary withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public AnalyzerSummary withType(AnalyzerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public AnalyzerType getType() {
        return type;
    }

    public void setType(AnalyzerType type) {
        this.type = type;
    }

    public AnalyzerSummary withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 唯一的资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyzerSummary that = (AnalyzerSummary) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.id, that.id)
            && Objects.equals(this.lastAnalyzedResource, that.lastAnalyzedResource)
            && Objects.equals(this.lastResourceAnalyzedAt, that.lastResourceAnalyzedAt)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusReason, that.statusReason) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.type, that.type) && Objects.equals(this.urn, that.urn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            id,
            lastAnalyzedResource,
            lastResourceAnalyzedAt,
            name,
            status,
            statusReason,
            tags,
            type,
            urn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzerSummary {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastAnalyzedResource: ").append(toIndentedString(lastAnalyzedResource)).append("\n");
        sb.append("    lastResourceAnalyzedAt: ").append(toIndentedString(lastResourceAnalyzedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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
