package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class CreateFlowLogReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 功能说明：流日志所属资源类型 取值范围：支持port、network、vpc 类型。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum PORT for value: "port"
         */
        public static final ResourceTypeEnum PORT = new ResourceTypeEnum("port");

        /**
         * Enum NETWORK for value: "network"
         */
        public static final ResourceTypeEnum NETWORK = new ResourceTypeEnum("network");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final ResourceTypeEnum VPC = new ResourceTypeEnum("vpc");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("port", PORT);
            map.put("network", NETWORK);
            map.put("vpc", VPC);
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
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /**
     * 功能说明：流日志采集类型 取值范围：     1）all：采集指定资源的全部流量。     2）accept：采集指定资源允许传入、传出的流量。     3）reject：采集指定资源拒绝传入、传出的流量。
     */
    public static final class TrafficTypeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final TrafficTypeEnum ALL = new TrafficTypeEnum("all");

        /**
         * Enum ACCEPT for value: "accept"
         */
        public static final TrafficTypeEnum ACCEPT = new TrafficTypeEnum("accept");

        /**
         * Enum REJECT for value: "reject"
         */
        public static final TrafficTypeEnum REJECT = new TrafficTypeEnum("reject");

        private static final Map<String, TrafficTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrafficTypeEnum> createStaticFields() {
            Map<String, TrafficTypeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("accept", ACCEPT);
            map.put("reject", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrafficTypeEnum(String value) {
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
        public static TrafficTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TrafficTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TrafficTypeEnum(value);
            }
            return result;
        }

        public static TrafficTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TrafficTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrafficTypeEnum) {
                return this.value.equals(((TrafficTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_type")

    private TrafficTypeEnum trafficType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_enabled")

    private Boolean indexEnabled;

    public CreateFlowLogReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：流日志名称 取值范围：0-64个字符，支持数字、字母、中文、_（下划线）、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateFlowLogReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：流日志描述 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateFlowLogReq withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 功能说明：流日志所属资源类型 取值范围：支持port、network、vpc 类型。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public CreateFlowLogReq withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * resource_type对应资源的唯一ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CreateFlowLogReq withTrafficType(TrafficTypeEnum trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * 功能说明：流日志采集类型 取值范围：     1）all：采集指定资源的全部流量。     2）accept：采集指定资源允许传入、传出的流量。     3）reject：采集指定资源拒绝传入、传出的流量。
     * @return trafficType
     */
    public TrafficTypeEnum getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(TrafficTypeEnum trafficType) {
        this.trafficType = trafficType;
    }

    public CreateFlowLogReq withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID 请在云日志服务中获取，详情请参见《云日志服务用户指南》。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreateFlowLogReq withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * 日志主题ID 请在云日志服务中获取，详情请参见《云日志服务用户指南》。
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    public CreateFlowLogReq withIndexEnabled(Boolean indexEnabled) {
        this.indexEnabled = indexEnabled;
        return this;
    }

    /**
     * 功能说明：是否开启日志索引 取值范围：true，false
     * @return indexEnabled
     */
    public Boolean getIndexEnabled() {
        return indexEnabled;
    }

    public void setIndexEnabled(Boolean indexEnabled) {
        this.indexEnabled = indexEnabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFlowLogReq createFlowLogReq = (CreateFlowLogReq) o;
        return Objects.equals(this.name, createFlowLogReq.name)
            && Objects.equals(this.description, createFlowLogReq.description)
            && Objects.equals(this.resourceType, createFlowLogReq.resourceType)
            && Objects.equals(this.resourceId, createFlowLogReq.resourceId)
            && Objects.equals(this.trafficType, createFlowLogReq.trafficType)
            && Objects.equals(this.logGroupId, createFlowLogReq.logGroupId)
            && Objects.equals(this.logTopicId, createFlowLogReq.logTopicId)
            && Objects.equals(this.indexEnabled, createFlowLogReq.indexEnabled);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, resourceType, resourceId, trafficType, logGroupId, logTopicId, indexEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowLogReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
        sb.append("    indexEnabled: ").append(toIndentedString(indexEnabled)).append("\n");
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
