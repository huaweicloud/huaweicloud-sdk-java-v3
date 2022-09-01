package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDetailOfSubscriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    /**
     * 事件订阅类型
     */
    public static final class TypeEnum {

        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final TypeEnum EVENT = new TypeEnum("EVENT");

        /**
         * Enum SCHEDULED for value: "SCHEDULED"
         */
        public static final TypeEnum SCHEDULED = new TypeEnum("SCHEDULED");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EVENT", EVENT);
            map.put("SCHEDULED", SCHEDULED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    /**
     * 事件订阅状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StatusEnum CREATED = new StatusEnum("CREATED");

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StatusEnum DISABLED = new StatusEnum("DISABLED");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATED", CREATED);
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            map.put("FROZEN", FROZEN);
            map.put("ERROR", ERROR);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    @JacksonXmlProperty(localName = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    @JacksonXmlProperty(localName = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    @JacksonXmlProperty(localName = "sources")

    private List<SubscriptionSourceInfo> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    @JacksonXmlProperty(localName = "targets")

    private List<SubscriptionTargetInfo> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    @JacksonXmlProperty(localName = "updated_time")

    private String updatedTime;

    public ShowDetailOfSubscriptionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件订阅ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDetailOfSubscriptionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件订阅名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDetailOfSubscriptionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件订阅描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowDetailOfSubscriptionResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 事件订阅类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowDetailOfSubscriptionResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 事件订阅状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowDetailOfSubscriptionResponse withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ShowDetailOfSubscriptionResponse withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 通道名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ShowDetailOfSubscriptionResponse withSources(List<SubscriptionSourceInfo> sources) {
        this.sources = sources;
        return this;
    }

    public ShowDetailOfSubscriptionResponse addSourcesItem(SubscriptionSourceInfo sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ShowDetailOfSubscriptionResponse withSources(Consumer<List<SubscriptionSourceInfo>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 订阅源列表
     * @return sources
     */
    public List<SubscriptionSourceInfo> getSources() {
        return sources;
    }

    public void setSources(List<SubscriptionSourceInfo> sources) {
        this.sources = sources;
    }

    public ShowDetailOfSubscriptionResponse withTargets(List<SubscriptionTargetInfo> targets) {
        this.targets = targets;
        return this;
    }

    public ShowDetailOfSubscriptionResponse addTargetsItem(SubscriptionTargetInfo targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public ShowDetailOfSubscriptionResponse withTargets(Consumer<List<SubscriptionTargetInfo>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 订阅目标列表
     * @return targets
     */
    public List<SubscriptionTargetInfo> getTargets() {
        return targets;
    }

    public void setTargets(List<SubscriptionTargetInfo> targets) {
        this.targets = targets;
    }

    public ShowDetailOfSubscriptionResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowDetailOfSubscriptionResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailOfSubscriptionResponse showDetailOfSubscriptionResponse = (ShowDetailOfSubscriptionResponse) o;
        return Objects.equals(this.id, showDetailOfSubscriptionResponse.id)
            && Objects.equals(this.name, showDetailOfSubscriptionResponse.name)
            && Objects.equals(this.description, showDetailOfSubscriptionResponse.description)
            && Objects.equals(this.type, showDetailOfSubscriptionResponse.type)
            && Objects.equals(this.status, showDetailOfSubscriptionResponse.status)
            && Objects.equals(this.channelId, showDetailOfSubscriptionResponse.channelId)
            && Objects.equals(this.channelName, showDetailOfSubscriptionResponse.channelName)
            && Objects.equals(this.sources, showDetailOfSubscriptionResponse.sources)
            && Objects.equals(this.targets, showDetailOfSubscriptionResponse.targets)
            && Objects.equals(this.createdTime, showDetailOfSubscriptionResponse.createdTime)
            && Objects.equals(this.updatedTime, showDetailOfSubscriptionResponse.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            type,
            status,
            channelId,
            channelName,
            sources,
            targets,
            createdTime,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailOfSubscriptionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
