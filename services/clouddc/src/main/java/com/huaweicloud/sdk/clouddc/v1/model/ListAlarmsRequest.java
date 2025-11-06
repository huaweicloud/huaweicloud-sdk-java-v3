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
public class ListAlarmsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_record_id")

    private String alarmRecordId;

    /**
     * 告警状态，ok为正常，alarm为告警，invalid为已失效
     */
    public static final class AlarmStatusEnum {

        /**
         * Enum OK for value: "ok"
         */
        public static final AlarmStatusEnum OK = new AlarmStatusEnum("ok");

        /**
         * Enum ALRAM for value: "alram"
         */
        public static final AlarmStatusEnum ALRAM = new AlarmStatusEnum("alram");

        /**
         * Enum INVALID for value: "invalid"
         */
        public static final AlarmStatusEnum INVALID = new AlarmStatusEnum("invalid");

        private static final Map<String, AlarmStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmStatusEnum> createStaticFields() {
            Map<String, AlarmStatusEnum> map = new HashMap<>();
            map.put("ok", OK);
            map.put("alram", ALRAM);
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
     * 告警类型
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
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 告警级别，1为紧急，2为重要，3为次要，4为提示
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

    public ListAlarmsRequest withAlarmRecordId(String alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
        return this;
    }

    /**
     * 告警记录ID,以ah开头，后跟22位由字母或数字组成的字符串
     * @return alarmRecordId
     */
    public String getAlarmRecordId() {
        return alarmRecordId;
    }

    public void setAlarmRecordId(String alarmRecordId) {
        this.alarmRecordId = alarmRecordId;
    }

    public ListAlarmsRequest withAlarmStatus(AlarmStatusEnum alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * 告警状态，ok为正常，alarm为告警，invalid为已失效
     * @return alarmStatus
     */
    public AlarmStatusEnum getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(AlarmStatusEnum alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public ListAlarmsRequest withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * 告警类型
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    public ListAlarmsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 告警资源ID,多值可以以逗号分割,
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListAlarmsRequest withAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别，1为紧急，2为重要，3为次要，4为提示
     * @return alarmLevel
     */
    public AlarmLevelEnum getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public ListAlarmsRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 产生告警开始时间，from 必须小于 to。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListAlarmsRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 产生告警结束时间，from 必须小于 to。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListAlarmsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页游标
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlarmsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
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
        ListAlarmsRequest that = (ListAlarmsRequest) obj;
        return Objects.equals(this.alarmRecordId, that.alarmRecordId)
            && Objects.equals(this.alarmStatus, that.alarmStatus) && Objects.equals(this.alarmType, that.alarmType)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRecordId, alarmStatus, alarmType, resourceId, alarmLevel, from, to, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsRequest {\n");
        sb.append("    alarmRecordId: ").append(toIndentedString(alarmRecordId)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
