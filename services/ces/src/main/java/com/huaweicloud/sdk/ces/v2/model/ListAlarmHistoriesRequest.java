package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAlarmHistoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private List<String> alarmId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * Gets or Sets status
     */
    public static final class StatusEnum {

        /**
         * Enum OK for value: "ok"
         */
        public static final StatusEnum OK = new StatusEnum("ok");

        /**
         * Enum ALARM for value: "alarm"
         */
        public static final StatusEnum ALARM = new StatusEnum("alarm");

        /**
         * Enum INVALID for value: "invalid"
         */
        public static final StatusEnum INVALID = new StatusEnum("invalid");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ok", OK);
            map.put("alarm", ALARM);
            map.put("invalid", INVALID);
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

    private List<StatusEnum> status = null;

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

    /**
     * **参数解释**： 告警类型。 **约束限制**： 不涉及。 **取值范围**： 枚举值 - event: 查询事件类型告警 - metric: 查询指标类型告警。 **默认取值**： 不涉及。 
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
    @JsonProperty(value = "create_time_from")

    private String createTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_to")

    private String createTimeTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释**： 按关键字排序。 **约束限制**： 不涉及。 **取值范围**： 枚举值。 - first_alarm_time: 告警产生时间 - update_time: 更新时间 - alarm_level: 告警级别 - record_id: 表记录主键 **默认取值**： update_time 
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

    public ListAlarmHistoriesRequest withAlarmId(List<String> alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    public ListAlarmHistoriesRequest addAlarmIdItem(String alarmIdItem) {
        if (this.alarmId == null) {
            this.alarmId = new ArrayList<>();
        }
        this.alarmId.add(alarmIdItem);
        return this;
    }

    public ListAlarmHistoriesRequest withAlarmId(Consumer<List<String>> alarmIdSetter) {
        if (this.alarmId == null) {
            this.alarmId = new ArrayList<>();
        }
        alarmIdSetter.accept(this.alarmId);
        return this;
    }

    /**
     * **参数解释**： 告警ID列表。告警ID：以al开头，后跟22位由字母或数字组成的字符串。 **约束限制**： 列表最大长度为50。 
     * @return alarmId
     */
    public List<String> getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(List<String> alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmHistoriesRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * **参数解释**： 告警记录ID。 **约束限制**： 不涉及。 **取值范围**： 以ah开头，后跟22位由字母或数字组成的字符串，字符串长度为24。 **默认取值**： 不涉及。 
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
     * **参数解释**： 告警规则名称。 **约束限制**： 不涉及。 **取值范围**： 最大128字符长度。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlarmHistoriesRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListAlarmHistoriesRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListAlarmHistoriesRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * **参数解释**： 告警规则状态列表。告警规则状态：枚举值，ok为正常，alarm为告警，invalid为已失效。 **约束限制**： 列表长度最大为3。 
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ListAlarmHistoriesRequest withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 告警级别。 **约束限制**： 不涉及。 **取值范围**： 枚举值。 - 1：紧急 - 2：重要 - 3：次要 - 4：提示 **默认取值**： 不涉及。 
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
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 **默认取值**： 不涉及。 
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
     * **参数解释**： 告警资源ID。 **约束限制**： 不涉及。 **取值范围**： 多维度情况按字母升序排列并使用逗号分隔。长度为[0,2048]个字符。 **默认取值**： 不涉及。 
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
     * **参数解释**： 查询告警记录的起始更新时间，例如：2022-02-10T10:05:46+08:00。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。 **默认取值**： 不涉及。 
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
     * **参数解释**： 查询告警记录的截止更新时间，例如：2022-02-10T10:05:47+08:00。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。 **默认取值**： 不涉及。 
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListAlarmHistoriesRequest withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * **参数解释**： 告警类型。 **约束限制**： 不涉及。 **取值范围**： 枚举值 - event: 查询事件类型告警 - metric: 查询指标类型告警。 **默认取值**： 不涉及。 
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    public ListAlarmHistoriesRequest withCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }

    /**
     * **参数解释**： 查询告警记录的起始创建时间，例如：2022-02-10T10:05:46+08:00。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。 **默认取值**： 不涉及。 
     * @return createTimeFrom
     */
    public String getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    public ListAlarmHistoriesRequest withCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }

    /**
     * **参数解释**： 查询告警记录的截止创建时间，例如：2022-02-10T10:05:47+08:00。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,64]个字符。 **默认取值**： 不涉及。 
     * @return createTimeTo
     */
    public String getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
    }

    public ListAlarmHistoriesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页偏移量。 **约束限制**： 不涉及。 **取值范围**： 整数，最小值为0，最大值为1000000000 **默认取值**： 0 
     * minimum: 0
     * maximum: 1000000000
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
     * **参数解释**： 分页偏移量。 **约束限制**： 不涉及。 **取值范围**： 整数，最小值为1，最大值为100 **默认取值**： 100 
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
     * **参数解释**： 按关键字排序。 **约束限制**： 不涉及。 **取值范围**： 枚举值。 - first_alarm_time: 告警产生时间 - update_time: 更新时间 - alarm_level: 告警级别 - record_id: 表记录主键 **默认取值**： update_time 
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
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.level, that.level) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.alarmType, that.alarmType)
            && Objects.equals(this.createTimeFrom, that.createTimeFrom)
            && Objects.equals(this.createTimeTo, that.createTimeTo) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId,
            recordId,
            name,
            status,
            level,
            namespace,
            resourceId,
            from,
            to,
            alarmType,
            createTimeFrom,
            createTimeTo,
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
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    createTimeFrom: ").append(toIndentedString(createTimeFrom)).append("\n");
        sb.append("    createTimeTo: ").append(toIndentedString(createTimeTo)).append("\n");
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
