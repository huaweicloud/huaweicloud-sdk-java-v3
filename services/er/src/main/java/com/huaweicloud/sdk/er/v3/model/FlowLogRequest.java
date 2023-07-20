package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建流日志请求体
 */
public class FlowLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 流日志采集的资源类型:   - VPC连接   - 虚拟网关连接   - 对等连接
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum ATTACHMENT for value: "attachment"
         */
        public static final ResourceTypeEnum ATTACHMENT = new ResourceTypeEnum("attachment");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("attachment", ATTACHMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    /**
     * 流日志的存储类型: - LTS: 云日志服务器存储
     */
    public static final class LogStoreTypeEnum {

        /**
         * Enum LTS for value: "LTS"
         */
        public static final LogStoreTypeEnum LTS = new LogStoreTypeEnum("LTS");

        private static final Map<String, LogStoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogStoreTypeEnum> createStaticFields() {
            Map<String, LogStoreTypeEnum> map = new HashMap<>();
            map.put("LTS", LTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogStoreTypeEnum(String value) {
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
        public static LogStoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogStoreTypeEnum(value));
        }

        public static LogStoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogStoreTypeEnum) {
                return this.value.equals(((LogStoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_store_type")

    private LogStoreTypeEnum logStoreType;

    public FlowLogRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流日志名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowLogRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流日志描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlowLogRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 流日志采集的资源类型:   - VPC连接   - 虚拟网关连接   - 对等连接
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public FlowLogRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 要采集的资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FlowLogRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID。请在云日志服务中获取，详情请参见《云日志服务用户指南》。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public FlowLogRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志主题ID。请在云日志服务中获取，详情请参见《云日志服务用户指南》。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public FlowLogRequest withLogStoreType(LogStoreTypeEnum logStoreType) {
        this.logStoreType = logStoreType;
        return this;
    }

    /**
     * 流日志的存储类型: - LTS: 云日志服务器存储
     * @return logStoreType
     */
    public LogStoreTypeEnum getLogStoreType() {
        return logStoreType;
    }

    public void setLogStoreType(LogStoreTypeEnum logStoreType) {
        this.logStoreType = logStoreType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowLogRequest that = (FlowLogRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStoreType, that.logStoreType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, resourceType, resourceId, logGroupId, logStreamId, logStoreType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowLogRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStoreType: ").append(toIndentedString(logStoreType)).append("\n");
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
