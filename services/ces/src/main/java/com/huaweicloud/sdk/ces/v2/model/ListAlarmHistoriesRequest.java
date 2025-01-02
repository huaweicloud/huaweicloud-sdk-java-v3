package com.huaweicloud.sdk.ces.v2.model;

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
public class ListAlarmHistoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 告警类型，event：查询事件类型告警，metric：查询指标类型告警
     */
    public static final class AlarmTypeEnum {

        /**
         * Enum EVENT for value: "event"
         */
        public static final AlarmTypeEnum EVENT = new AlarmTypeEnum("event");

        /**
         * Enum METRIC for value: "metric"
         */
        public static final AlarmTypeEnum METRIC = new AlarmTypeEnum("metric");

        private static final Map<String, AlarmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmTypeEnum> createStaticFields() {
            Map<String, AlarmTypeEnum> map = new HashMap<>();
            map.put("event", EVENT);
            map.put("metric", METRIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmTypeEnum(String value) {
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
        public static AlarmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmTypeEnum(value));
        }

        public static AlarmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmTypeEnum) {
                return this.value.equals(((AlarmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private AlarmTypeEnum alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 按关键字排序, 默认为update_time, {first_alarm_time: 告警产生时间, update_time: 更新时间, alarm_level: 告警级别, record_id：表记录主键} 
     */
    public static final class OrderByEnum {

        /**
         * Enum FIRST_ALARM_TIME for value: "first_alarm_time"
         */
        public static final OrderByEnum FIRST_ALARM_TIME = new OrderByEnum("first_alarm_time");

        /**
         * Enum UPDATE_TIME for value: "update_time"
         */
        public static final OrderByEnum UPDATE_TIME = new OrderByEnum("update_time");

        /**
         * Enum ALARM_LEVEL for value: "alarm_level"
         */
        public static final OrderByEnum ALARM_LEVEL = new OrderByEnum("alarm_level");

        /**
         * Enum RECORD_ID for value: "record_id"
         */
        public static final OrderByEnum RECORD_ID = new OrderByEnum("record_id");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("first_alarm_time", FIRST_ALARM_TIME);
            map.put("update_time", UPDATE_TIME);
            map.put("alarm_level", ALARM_LEVEL);
            map.put("record_id", RECORD_ID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    public ListAlarmHistoriesRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警ID,以al开头，后跟22位由字母或数字组成的字符串
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmHistoriesRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 告警记录ID,以ah开头，后跟22位由字母或数字组成的字符串
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public ListAlarmHistoriesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlarmHistoriesRequest withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * 告警类型，event：查询事件类型告警，metric：查询指标类型告警
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    public ListAlarmHistoriesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 告警规则状态, ok为正常，alarm为告警，invalid为已失效
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAlarmHistoriesRequest withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 告警级别, 1为紧急，2为重要，3为次要，4为提示
     * minimum: 1
     * maximum: 4
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ListAlarmHistoriesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmHistoriesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 告警资源ID，多维度情况按字母升序排列并使用逗号分隔
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListAlarmHistoriesRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 查询告警记录的起始时间，例如：2022-02-10T10:05:46+08:00
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListAlarmHistoriesRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 查询告警记录的截止时间，例如：2022-02-10T10:05:47+08:00
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListAlarmHistoriesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页偏移量
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlarmHistoriesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlarmHistoriesRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 按关键字排序, 默认为update_time, {first_alarm_time: 告警产生时间, update_time: 更新时间, alarm_level: 告警级别, record_id：表记录主键} 
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmHistoriesRequest that = (ListAlarmHistoriesRequest) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.recordId, that.recordId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.alarmType, that.alarmType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.level, that.level)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId,
            recordId,
            name,
            alarmType,
            status,
            level,
            namespace,
            resourceId,
            from,
            to,
            offset,
            limit,
            orderBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmHistoriesRequest {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
