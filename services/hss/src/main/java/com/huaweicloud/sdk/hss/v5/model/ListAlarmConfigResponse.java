package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAlarmConfigResponse extends SdkResponse {

    /**
     * 告警类型
     */
    public static final class AlarmTypeEnum {

        /**
         * Enum SMS for value: "sms"
         */
        public static final AlarmTypeEnum SMS = new AlarmTypeEnum("sms");

        /**
         * Enum RSS for value: "rss"
         */
        public static final AlarmTypeEnum RSS = new AlarmTypeEnum("rss");

        private static final Map<String, AlarmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmTypeEnum> createStaticFields() {
            Map<String, AlarmTypeEnum> map = new HashMap<>();
            map.put("sms", SMS);
            map.put("rss", RSS);
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
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_alarm")

    private Boolean dailyAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "realtime_alarm")

    private Boolean realtimeAlarm;

    /**
     * Gets or Sets alarmLevel
     */
    public static final class AlarmLevelEnum {

        /**
         * Enum INFO for value: "info"
         */
        public static final AlarmLevelEnum INFO = new AlarmLevelEnum("info");

        /**
         * Enum LOW for value: "low"
         */
        public static final AlarmLevelEnum LOW = new AlarmLevelEnum("low");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final AlarmLevelEnum MEDIUM = new AlarmLevelEnum("medium");

        /**
         * Enum HIGH for value: "high"
         */
        public static final AlarmLevelEnum HIGH = new AlarmLevelEnum("high");

        /**
         * Enum CRITICAL for value: "critical"
         */
        public static final AlarmLevelEnum CRITICAL = new AlarmLevelEnum("critical");

        private static final Map<String, AlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmLevelEnum> createStaticFields() {
            Map<String, AlarmLevelEnum> map = new HashMap<>();
            map.put("info", INFO);
            map.put("low", LOW);
            map.put("medium", MEDIUM);
            map.put("high", HIGH);
            map.put("critical", CRITICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmLevelEnum(String value) {
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
        public static AlarmLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmLevelEnum(value));
        }

        public static AlarmLevelEnum valueOf(String value) {
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

    private List<AlarmLevelEnum> alarmLevel = null;

    /**
     * Gets or Sets ignoredEventClassList
     */
    public static final class IgnoredEventClassListEnum {

        /**
         * Enum DANGEROUS_PORTS for value: "dangerous_ports"
         */
        public static final IgnoredEventClassListEnum DANGEROUS_PORTS =
            new IgnoredEventClassListEnum("dangerous_ports");

        /**
         * Enum CRITICAL_VULNERABILITIES for value: "critical_vulnerabilities"
         */
        public static final IgnoredEventClassListEnum CRITICAL_VULNERABILITIES =
            new IgnoredEventClassListEnum("critical_vulnerabilities");

        /**
         * Enum WEAK_PASSWORDS for value: "weak_passwords"
         */
        public static final IgnoredEventClassListEnum WEAK_PASSWORDS = new IgnoredEventClassListEnum("weak_passwords");

        /**
         * Enum UNSAFE_CONFIGURATIONS for value: "unsafe_configurations"
         */
        public static final IgnoredEventClassListEnum UNSAFE_CONFIGURATIONS =
            new IgnoredEventClassListEnum("unsafe_configurations");

        /**
         * Enum RASP for value: "RASP"
         */
        public static final IgnoredEventClassListEnum RASP = new IgnoredEventClassListEnum("RASP");

        /**
         * Enum SECRASP for value: "SECRASP"
         */
        public static final IgnoredEventClassListEnum SECRASP = new IgnoredEventClassListEnum("SECRASP");

        /**
         * Enum _8002 for value: "8002"
         */
        public static final IgnoredEventClassListEnum _8002 = new IgnoredEventClassListEnum("8002");

        /**
         * Enum _8003 for value: "8003"
         */
        public static final IgnoredEventClassListEnum _8003 = new IgnoredEventClassListEnum("8003");

        /**
         * Enum _1001 for value: "1001"
         */
        public static final IgnoredEventClassListEnum _1001 = new IgnoredEventClassListEnum("1001");

        /**
         * Enum _1010 for value: "1010"
         */
        public static final IgnoredEventClassListEnum _1010 = new IgnoredEventClassListEnum("1010");

        /**
         * Enum _1011 for value: "1011"
         */
        public static final IgnoredEventClassListEnum _1011 = new IgnoredEventClassListEnum("1011");

        /**
         * Enum _1015 for value: "1015"
         */
        public static final IgnoredEventClassListEnum _1015 = new IgnoredEventClassListEnum("1015");

        /**
         * Enum _1017 for value: "1017"
         */
        public static final IgnoredEventClassListEnum _1017 = new IgnoredEventClassListEnum("1017");

        /**
         * Enum _2047 for value: "2047"
         */
        public static final IgnoredEventClassListEnum _2047 = new IgnoredEventClassListEnum("2047");

        /**
         * Enum _2048 for value: "2048"
         */
        public static final IgnoredEventClassListEnum _2048 = new IgnoredEventClassListEnum("2048");

        /**
         * Enum _2049 for value: "2049"
         */
        public static final IgnoredEventClassListEnum _2049 = new IgnoredEventClassListEnum("2049");

        /**
         * Enum _3002 for value: "3002"
         */
        public static final IgnoredEventClassListEnum _3002 = new IgnoredEventClassListEnum("3002");

        /**
         * Enum _3003 for value: "3003"
         */
        public static final IgnoredEventClassListEnum _3003 = new IgnoredEventClassListEnum("3003");

        /**
         * Enum _3004 for value: "3004"
         */
        public static final IgnoredEventClassListEnum _3004 = new IgnoredEventClassListEnum("3004");

        /**
         * Enum _3005 for value: "3005"
         */
        public static final IgnoredEventClassListEnum _3005 = new IgnoredEventClassListEnum("3005");

        /**
         * Enum _3007 for value: "3007"
         */
        public static final IgnoredEventClassListEnum _3007 = new IgnoredEventClassListEnum("3007");

        /**
         * Enum _3015 for value: "3015"
         */
        public static final IgnoredEventClassListEnum _3015 = new IgnoredEventClassListEnum("3015");

        /**
         * Enum _3018 for value: "3018"
         */
        public static final IgnoredEventClassListEnum _3018 = new IgnoredEventClassListEnum("3018");

        /**
         * Enum _3027 for value: "3027"
         */
        public static final IgnoredEventClassListEnum _3027 = new IgnoredEventClassListEnum("3027");

        /**
         * Enum _4002 for value: "4002"
         */
        public static final IgnoredEventClassListEnum _4002 = new IgnoredEventClassListEnum("4002");

        /**
         * Enum _4007 for value: "4007"
         */
        public static final IgnoredEventClassListEnum _4007 = new IgnoredEventClassListEnum("4007");

        /**
         * Enum _4004 for value: "4004"
         */
        public static final IgnoredEventClassListEnum _4004 = new IgnoredEventClassListEnum("4004");

        /**
         * Enum _4006 for value: "4006"
         */
        public static final IgnoredEventClassListEnum _4006 = new IgnoredEventClassListEnum("4006");

        /**
         * Enum _2042 for value: "2042"
         */
        public static final IgnoredEventClassListEnum _2042 = new IgnoredEventClassListEnum("2042");

        /**
         * Enum _2044 for value: "2044"
         */
        public static final IgnoredEventClassListEnum _2044 = new IgnoredEventClassListEnum("2044");

        /**
         * Enum _3008 for value: "3008"
         */
        public static final IgnoredEventClassListEnum _3008 = new IgnoredEventClassListEnum("3008");

        /**
         * Enum _3009 for value: "3009"
         */
        public static final IgnoredEventClassListEnum _3009 = new IgnoredEventClassListEnum("3009");

        /**
         * Enum _3016 for value: "3016"
         */
        public static final IgnoredEventClassListEnum _3016 = new IgnoredEventClassListEnum("3016");

        /**
         * Enum _3021 for value: "3021"
         */
        public static final IgnoredEventClassListEnum _3021 = new IgnoredEventClassListEnum("3021");

        private static final Map<String, IgnoredEventClassListEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IgnoredEventClassListEnum> createStaticFields() {
            Map<String, IgnoredEventClassListEnum> map = new HashMap<>();
            map.put("dangerous_ports", DANGEROUS_PORTS);
            map.put("critical_vulnerabilities", CRITICAL_VULNERABILITIES);
            map.put("weak_passwords", WEAK_PASSWORDS);
            map.put("unsafe_configurations", UNSAFE_CONFIGURATIONS);
            map.put("RASP", RASP);
            map.put("SECRASP", SECRASP);
            map.put("8002", _8002);
            map.put("8003", _8003);
            map.put("1001", _1001);
            map.put("1010", _1010);
            map.put("1011", _1011);
            map.put("1015", _1015);
            map.put("1017", _1017);
            map.put("2047", _2047);
            map.put("2048", _2048);
            map.put("2049", _2049);
            map.put("3002", _3002);
            map.put("3003", _3003);
            map.put("3004", _3004);
            map.put("3005", _3005);
            map.put("3007", _3007);
            map.put("3015", _3015);
            map.put("3018", _3018);
            map.put("3027", _3027);
            map.put("4002", _4002);
            map.put("4007", _4007);
            map.put("4004", _4004);
            map.put("4006", _4006);
            map.put("2042", _2042);
            map.put("2044", _2044);
            map.put("3008", _3008);
            map.put("3009", _3009);
            map.put("3016", _3016);
            map.put("3021", _3021);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IgnoredEventClassListEnum(String value) {
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
        public static IgnoredEventClassListEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IgnoredEventClassListEnum(value));
        }

        public static IgnoredEventClassListEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IgnoredEventClassListEnum) {
                return this.value.equals(((IgnoredEventClassListEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignored_event_class_list")

    private List<IgnoredEventClassListEnum> ignoredEventClassList = null;

    public ListAlarmConfigResponse withAlarmType(AlarmTypeEnum alarmType) {
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

    public ListAlarmConfigResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ListAlarmConfigResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 是否发送短信
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ListAlarmConfigResponse withDailyAlarm(Boolean dailyAlarm) {
        this.dailyAlarm = dailyAlarm;
        return this;
    }

    /**
     * 是否开启每日告警
     * @return dailyAlarm
     */
    public Boolean getDailyAlarm() {
        return dailyAlarm;
    }

    public void setDailyAlarm(Boolean dailyAlarm) {
        this.dailyAlarm = dailyAlarm;
    }

    public ListAlarmConfigResponse withRealtimeAlarm(Boolean realtimeAlarm) {
        this.realtimeAlarm = realtimeAlarm;
        return this;
    }

    /**
     * 是否开启实时告警
     * @return realtimeAlarm
     */
    public Boolean getRealtimeAlarm() {
        return realtimeAlarm;
    }

    public void setRealtimeAlarm(Boolean realtimeAlarm) {
        this.realtimeAlarm = realtimeAlarm;
    }

    public ListAlarmConfigResponse withAlarmLevel(List<AlarmLevelEnum> alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    public ListAlarmConfigResponse addAlarmLevelItem(AlarmLevelEnum alarmLevelItem) {
        if (this.alarmLevel == null) {
            this.alarmLevel = new ArrayList<>();
        }
        this.alarmLevel.add(alarmLevelItem);
        return this;
    }

    public ListAlarmConfigResponse withAlarmLevel(Consumer<List<AlarmLevelEnum>> alarmLevelSetter) {
        if (this.alarmLevel == null) {
            this.alarmLevel = new ArrayList<>();
        }
        alarmLevelSetter.accept(this.alarmLevel);
        return this;
    }

    /**
     * 告警等级
     * @return alarmLevel
     */
    public List<AlarmLevelEnum> getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(List<AlarmLevelEnum> alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public ListAlarmConfigResponse withIgnoredEventClassList(List<IgnoredEventClassListEnum> ignoredEventClassList) {
        this.ignoredEventClassList = ignoredEventClassList;
        return this;
    }

    public ListAlarmConfigResponse addIgnoredEventClassListItem(IgnoredEventClassListEnum ignoredEventClassListItem) {
        if (this.ignoredEventClassList == null) {
            this.ignoredEventClassList = new ArrayList<>();
        }
        this.ignoredEventClassList.add(ignoredEventClassListItem);
        return this;
    }

    public ListAlarmConfigResponse withIgnoredEventClassList(
        Consumer<List<IgnoredEventClassListEnum>> ignoredEventClassListSetter) {
        if (this.ignoredEventClassList == null) {
            this.ignoredEventClassList = new ArrayList<>();
        }
        ignoredEventClassListSetter.accept(this.ignoredEventClassList);
        return this;
    }

    /**
     * 忽略的事件列表
     * @return ignoredEventClassList
     */
    public List<IgnoredEventClassListEnum> getIgnoredEventClassList() {
        return ignoredEventClassList;
    }

    public void setIgnoredEventClassList(List<IgnoredEventClassListEnum> ignoredEventClassList) {
        this.ignoredEventClassList = ignoredEventClassList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmConfigResponse that = (ListAlarmConfigResponse) obj;
        return Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.dailyAlarm, that.dailyAlarm)
            && Objects.equals(this.realtimeAlarm, that.realtimeAlarm)
            && Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.ignoredEventClassList, that.ignoredEventClassList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alarmType, displayName, topicUrn, dailyAlarm, realtimeAlarm, alarmLevel, ignoredEventClassList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmConfigResponse {\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    dailyAlarm: ").append(toIndentedString(dailyAlarm)).append("\n");
        sb.append("    realtimeAlarm: ").append(toIndentedString(realtimeAlarm)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    ignoredEventClassList: ").append(toIndentedString(ignoredEventClassList)).append("\n");
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
