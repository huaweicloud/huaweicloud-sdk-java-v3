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
public class FlowLogResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 功能说明：流日志所属资源类型 取值范围：支持Port、Network、VPC 类型。 约束：当resource_type为Port时，Port资源必须是C3、S3、M3三种虚拟机的网卡。
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

    /**
     * 功能说明：流日志存储类型 取值范围：     lts：存储类型为云日志服务（LTS）。
     */
    public static final class LogStoreTypeEnum {

        /**
         * Enum LTS for value: "lts"
         */
        public static final LogStoreTypeEnum LTS = new LogStoreTypeEnum("lts");

        private static final Map<String, LogStoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogStoreTypeEnum> createStaticFields() {
            Map<String, LogStoreTypeEnum> map = new HashMap<>();
            map.put("lts", LTS);
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
            LogStoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogStoreTypeEnum(value);
            }
            return result;
        }

        public static LogStoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogStoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private Boolean adminState;

    /**
     * 功能说明：流日志状态 取值范围：ACTIVE、DOWN、ERROR
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DOWN", DOWN);
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

    private StatusEnum status;

    public FlowLogResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流日志资源唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowLogResp withName(String name) {
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

    public FlowLogResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public FlowLogResp withDescription(String description) {
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

    public FlowLogResp withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 功能说明：流日志所属资源类型 取值范围：支持Port、Network、VPC 类型。 约束：当resource_type为Port时，Port资源必须是C3、S3、M3三种虚拟机的网卡。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public FlowLogResp withResourceId(String resourceId) {
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

    public FlowLogResp withTrafficType(TrafficTypeEnum trafficType) {
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

    public FlowLogResp withLogGroupId(String logGroupId) {
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

    public FlowLogResp withLogTopicId(String logTopicId) {
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

    public FlowLogResp withLogStoreType(LogStoreTypeEnum logStoreType) {
        this.logStoreType = logStoreType;
        return this;
    }

    /**
     * 功能说明：流日志存储类型 取值范围：     lts：存储类型为云日志服务（LTS）。
     * @return logStoreType
     */
    public LogStoreTypeEnum getLogStoreType() {
        return logStoreType;
    }

    public void setLogStoreType(LogStoreTypeEnum logStoreType) {
        this.logStoreType = logStoreType;
    }

    public FlowLogResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 资源创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public FlowLogResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最近一次更新资源的时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public FlowLogResp withAdminState(Boolean adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * 功能说明：流日志管理 取值范围：若为true，表明开启流日志。若为false，则关闭流日志
     * @return adminState
     */
    public Boolean getAdminState() {
        return adminState;
    }

    public void setAdminState(Boolean adminState) {
        this.adminState = adminState;
    }

    public FlowLogResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 功能说明：流日志状态 取值范围：ACTIVE、DOWN、ERROR
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowLogResp flowLogResp = (FlowLogResp) o;
        return Objects.equals(this.id, flowLogResp.id) && Objects.equals(this.name, flowLogResp.name)
            && Objects.equals(this.tenantId, flowLogResp.tenantId)
            && Objects.equals(this.description, flowLogResp.description)
            && Objects.equals(this.resourceType, flowLogResp.resourceType)
            && Objects.equals(this.resourceId, flowLogResp.resourceId)
            && Objects.equals(this.trafficType, flowLogResp.trafficType)
            && Objects.equals(this.logGroupId, flowLogResp.logGroupId)
            && Objects.equals(this.logTopicId, flowLogResp.logTopicId)
            && Objects.equals(this.logStoreType, flowLogResp.logStoreType)
            && Objects.equals(this.createdAt, flowLogResp.createdAt)
            && Objects.equals(this.updatedAt, flowLogResp.updatedAt)
            && Objects.equals(this.adminState, flowLogResp.adminState)
            && Objects.equals(this.status, flowLogResp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            tenantId,
            description,
            resourceType,
            resourceId,
            trafficType,
            logGroupId,
            logTopicId,
            logStoreType,
            createdAt,
            updatedAt,
            adminState,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowLogResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
        sb.append("    logStoreType: ").append(toIndentedString(logStoreType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
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
