package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 倒换测试记录信息
 */
public class SwitchoverTestRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 倒换测试的资源对象类型
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum VIRTUAL_INTERFACE for value: "virtual_interface"
         */
        public static final ResourceTypeEnum VIRTUAL_INTERFACE = new ResourceTypeEnum("virtual_interface");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("virtual_interface", VIRTUAL_INTERFACE);
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

    /**
     * shutdown, undo_shutdown表示倒换测试操作类型
     */
    public static final class OperationEnum {

        /**
         * Enum SHUTDOWN for value: "shutdown"
         */
        public static final OperationEnum SHUTDOWN = new OperationEnum("shutdown");

        /**
         * Enum UNDO_SHUTDOWN for value: "undo_shutdown"
         */
        public static final OperationEnum UNDO_SHUTDOWN = new OperationEnum("undo_shutdown");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("shutdown", SHUTDOWN);
            map.put("undo_shutdown", UNDO_SHUTDOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationEnum(value));
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private OperationEnum operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    /**
     * 倒换测试状态记录 STARTING: 初始状态 INPROGRESS: 配置下发中 COMPLETE: 配置下发完成 ERROR: 配置下发失败
     */
    public static final class OperateStatusEnum {

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final OperateStatusEnum STARTING = new OperateStatusEnum("STARTING");

        /**
         * Enum INPROGRESS for value: "INPROGRESS"
         */
        public static final OperateStatusEnum INPROGRESS = new OperateStatusEnum("INPROGRESS");

        /**
         * Enum COMPLETE for value: "COMPLETE"
         */
        public static final OperateStatusEnum COMPLETE = new OperateStatusEnum("COMPLETE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final OperateStatusEnum ERROR = new OperateStatusEnum("ERROR");

        private static final Map<String, OperateStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateStatusEnum> createStaticFields() {
            Map<String, OperateStatusEnum> map = new HashMap<>();
            map.put("STARTING", STARTING);
            map.put("INPROGRESS", INPROGRESS);
            map.put("COMPLETE", COMPLETE);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateStatusEnum(String value) {
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
        public static OperateStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateStatusEnum(value));
        }

        public static OperateStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateStatusEnum) {
                return this.value.equals(((OperateStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_status")

    private OperateStatusEnum operateStatus;

    public SwitchoverTestRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 倒换测试记录的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SwitchoverTestRecord withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public SwitchoverTestRecord withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 倒换测试的资源对象ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SwitchoverTestRecord withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 倒换测试的资源对象类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public SwitchoverTestRecord withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * shutdown, undo_shutdown表示倒换测试操作类型
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public SwitchoverTestRecord withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 倒换测试操作的开始时间
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public SwitchoverTestRecord withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 倒换测试操作的结束时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public SwitchoverTestRecord withOperateStatus(OperateStatusEnum operateStatus) {
        this.operateStatus = operateStatus;
        return this;
    }

    /**
     * 倒换测试状态记录 STARTING: 初始状态 INPROGRESS: 配置下发中 COMPLETE: 配置下发完成 ERROR: 配置下发失败
     * @return operateStatus
     */
    public OperateStatusEnum getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(OperateStatusEnum operateStatus) {
        this.operateStatus = operateStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchoverTestRecord that = (SwitchoverTestRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.operateStatus, that.operateStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenantId, resourceId, resourceType, operation, startTime, endTime, operateStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchoverTestRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    operateStatus: ").append(toIndentedString(operateStatus)).append("\n");
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
