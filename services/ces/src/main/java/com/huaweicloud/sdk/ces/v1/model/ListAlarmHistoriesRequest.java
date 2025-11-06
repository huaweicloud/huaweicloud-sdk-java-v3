package com.huaweicloud.sdk.ces.v1.model;

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
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    /**
     * **参数解释**： 告警状态。 **约束限制**： 不涉及 **取值范围**： 枚举值： - ok：正常 - alarm：告警 - insufficient_data：数据不足 - invalid：已失效 **默认取值**： 不涉及 
     */
    public static final class AlarmStatusEnum {

        /**
         * Enum OK for value: "ok"
         */
        public static final AlarmStatusEnum OK = new AlarmStatusEnum("ok");

        /**
         * Enum ALARM for value: "alarm"
         */
        public static final AlarmStatusEnum ALARM = new AlarmStatusEnum("alarm");

        /**
         * Enum INSUFFICIENT_DATA for value: "insufficient_data"
         */
        public static final AlarmStatusEnum INSUFFICIENT_DATA = new AlarmStatusEnum("insufficient_data");

        /**
         * Enum INVALID for value: "invalid"
         */
        public static final AlarmStatusEnum INVALID = new AlarmStatusEnum("invalid");

        private static final Map<String, AlarmStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmStatusEnum> createStaticFields() {
            Map<String, AlarmStatusEnum> map = new HashMap<>();
            map.put("ok", OK);
            map.put("alarm", ALARM);
            map.put("insufficient_data", INSUFFICIENT_DATA);
            map.put("invalid", INVALID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmStatusEnum(String value) {
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
        public static AlarmStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmStatusEnum(value));
        }

        public static AlarmStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmStatusEnum) {
                return this.value.equals(((AlarmStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private AlarmStatusEnum alarmStatus;

    /**
     * **参数解释**： 告警历史的告警级别，值为1,2,3,4 **约束限制**： 不涉及 **取值范围**： 枚举值： - 1：紧急 - 2：重要 - 3：次要 - 4：提示 **默认取值**： 不涉及 
     */
    public static final class AlarmLevelEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AlarmLevelEnum NUMBER_1 = new AlarmLevelEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AlarmLevelEnum NUMBER_2 = new AlarmLevelEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final AlarmLevelEnum NUMBER_3 = new AlarmLevelEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final AlarmLevelEnum NUMBER_4 = new AlarmLevelEnum(4);

        private static final Map<Integer, AlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AlarmLevelEnum> createStaticFields() {
            Map<Integer, AlarmLevelEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AlarmLevelEnum(Integer value) {
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
        public static AlarmLevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmLevelEnum(value));
        }

        public static AlarmLevelEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmLevelEnum) {
                return this.value.equals(((AlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private AlarmLevelEnum alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListAlarmHistoriesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 当前资源所在分组信息 **约束限制**： 不涉及。 **取值范围**： 以rg开头，后跟22位由字母或数字组成的字符串，字符长度为24 **默认取值**： 不涉及 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListAlarmHistoriesRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则ID **约束限制**： 不涉及 **取值范围**： 以al开头，后跟22位由字母或数字组成的字符串，字符长度为24 **默认取值**： 不涉及 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmHistoriesRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * **参数解释**： 告警规则名称 **约束限制**： 不涉及 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度[1, 128]个字符 **默认取值**： 不涉及 
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public ListAlarmHistoriesRequest withAlarmStatus(AlarmStatusEnum alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * **参数解释**： 告警状态。 **约束限制**： 不涉及 **取值范围**： 枚举值： - ok：正常 - alarm：告警 - insufficient_data：数据不足 - invalid：已失效 **默认取值**： 不涉及 
     * @return alarmStatus
     */
    public AlarmStatusEnum getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(AlarmStatusEnum alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public ListAlarmHistoriesRequest withAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警历史的告警级别，值为1,2,3,4 **约束限制**： 不涉及 **取值范围**： 枚举值： - 1：紧急 - 2：重要 - 3：次要 - 4：提示 **默认取值**： 不涉及 
     * @return alarmLevel
     */
    public AlarmLevelEnum getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public ListAlarmHistoriesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)” **约束限制**： 不涉及 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间 **默认取值**： 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmHistoriesRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释**： 通过时间筛选traces的起始时间(包括传入时间)，为timestamp **约束限制**： 不涉及 **取值范围**： 长度为[1,13]个字符 **默认取值**： 不涉及 
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
     * **参数解释**： 通过时间筛选traces的终止时间(包括传入时间)，为timestamp **约束限制**： 不涉及 **取值范围**： 长度为[1,13]个字符 **默认取值**： 不涉及 
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListAlarmHistoriesRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * **参数解释**： 分页查询时查询的起始位置，表示从第几条数据开始 **约束限制**： 不涉及。 **取值范围**： 大于等于0的整数 **默认取值**： 0 
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ListAlarmHistoriesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 本次查询的最大条目数 **约束限制**： 不涉及。 **取值范围**： 取值范围[1,100] **默认取值**： 100 
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
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
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.alarmName, that.alarmName) && Objects.equals(this.alarmStatus, that.alarmStatus)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.start, that.start) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, alarmId, alarmName, alarmStatus, alarmLevel, namespace, from, to, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmHistoriesRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
