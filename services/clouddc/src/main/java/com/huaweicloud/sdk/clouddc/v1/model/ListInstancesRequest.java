package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    /**
     * 实例状态
     */
    public static final class InstanceStateEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final InstanceStateEnum PENDING = new InstanceStateEnum("pending");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final InstanceStateEnum RUNNING = new InstanceStateEnum("running");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final InstanceStateEnum STOPPING = new InstanceStateEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final InstanceStateEnum STOPPED = new InstanceStateEnum("stopped");

        /**
         * Enum REINSTALLING for value: "reinstalling"
         */
        public static final InstanceStateEnum REINSTALLING = new InstanceStateEnum("reinstalling");

        /**
         * Enum SHUTTING_DOWN for value: "shutting-down"
         */
        public static final InstanceStateEnum SHUTTING_DOWN = new InstanceStateEnum("shutting-down");

        /**
         * Enum TERMINATED for value: "terminated"
         */
        public static final InstanceStateEnum TERMINATED = new InstanceStateEnum("terminated");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final InstanceStateEnum FAILED = new InstanceStateEnum("failed");

        private static final Map<String, InstanceStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceStateEnum> createStaticFields() {
            Map<String, InstanceStateEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("running", RUNNING);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            map.put("reinstalling", REINSTALLING);
            map.put("shutting-down", SHUTTING_DOWN);
            map.put("terminated", TERMINATED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceStateEnum(String value) {
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
        public static InstanceStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceStateEnum(value));
        }

        public static InstanceStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceStateEnum) {
                return this.value.equals(((InstanceStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_state")

    private InstanceStateEnum instanceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public ListInstancesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页行数。最大值为 1000。  默认值： 当不设置值或设置的值小于 10 时，默认值为 10。 当设置的值大于 1000 时，默认值为 1000。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListInstancesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页游标
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListInstancesRequest withInstanceState(InstanceStateEnum instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    /**
     * 实例状态
     * @return instanceState
     */
    public InstanceStateEnum getInstanceState() {
        return instanceState;
    }

    public void setInstanceState(InstanceStateEnum instanceState) {
        this.instanceState = instanceState;
    }

    public ListInstancesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例 ID。取值可以由多个实例 ID 组成数组，最多支持 100 个 ID，ID 之间用半角逗号（,）隔开，示例：uuid1,uuid2,uuid3。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 实例 ID。取值可以由多个服务器 ID 组成数组，最多支持 100 个 ID，ID 之间用半角逗号（,）隔开，示例：uuid1,uuid2,uuid3。与instance_id_set查询条件互斥。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesRequest that = (ListInstancesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.instanceState, that.instanceState)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.serverId, that.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, instanceState, instanceId, serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    instanceState: ").append(toIndentedString(instanceState)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
