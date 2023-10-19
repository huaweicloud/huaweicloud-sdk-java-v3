package com.huaweicloud.sdk.dcs.v2.model;

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
public class CreateRedislogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 日期偏移量，表示从过去的n天开始查询，例如：传入0则表示查询今天的日志，传入7则表示查询过去7天的日志。当前支持0，1，3，7。
     */
    public static final class QueryTimeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final QueryTimeEnum NUMBER_0 = new QueryTimeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final QueryTimeEnum NUMBER_1 = new QueryTimeEnum(1);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final QueryTimeEnum NUMBER_3 = new QueryTimeEnum(3);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final QueryTimeEnum NUMBER_7 = new QueryTimeEnum(7);

        private static final Map<Integer, QueryTimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, QueryTimeEnum> createStaticFields() {
            Map<Integer, QueryTimeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(3, NUMBER_3);
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        QueryTimeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static QueryTimeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryTimeEnum(value));
        }

        public static QueryTimeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTimeEnum) {
                return this.value.equals(((QueryTimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    private QueryTimeEnum queryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    private String replicationId;

    public CreateRedislogRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateRedislogRequest withQueryTime(QueryTimeEnum queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * 日期偏移量，表示从过去的n天开始查询，例如：传入0则表示查询今天的日志，传入7则表示查询过去7天的日志。当前支持0，1，3，7。
     * @return queryTime
     */
    public QueryTimeEnum getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(QueryTimeEnum queryTime) {
        this.queryTime = queryTime;
    }

    public CreateRedislogRequest withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 返回日志的类型，当前仅支持Redis运行日志，类型为run
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public CreateRedislogRequest withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * 副本ID，可以从分片与副本中查询对应节点的副本ID
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRedislogRequest that = (CreateRedislogRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.queryTime, that.queryTime)
            && Objects.equals(this.logType, that.logType) && Objects.equals(this.replicationId, that.replicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, queryTime, logType, replicationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRedislogRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
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
