package com.huaweicloud.sdk.roma.v2.model;

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
public class ListStatisticsApiRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 查询模式，默认为INSTANCE * ALL：实例下所有调用应用，要求主帐号权限 * APP：指定集成应用 * API：指定API * INSTANCE：实例，默认值  注意：mode = APP或ALL时，接口响应中不返回cycle，api_id，group_id，provider，register_time，status字段
     */
    public static final class ModeEnum {

        /**
         * Enum INSTANCE for value: "INSTANCE"
         */
        public static final ModeEnum INSTANCE = new ModeEnum("INSTANCE");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final ModeEnum ALL = new ModeEnum("ALL");

        /**
         * Enum APP for value: "APP"
         */
        public static final ModeEnum APP = new ModeEnum("APP");

        /**
         * Enum API for value: "API"
         */
        public static final ModeEnum API = new ModeEnum("API");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("INSTANCE", INSTANCE);
            map.put("ALL", ALL);
            map.put("APP", APP);
            map.put("API", API);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    /**
     * 查询统计周期 * minute：分钟 * hour：小时 * day：天
     */
    public static final class CycleEnum {

        /**
         * Enum MINUTE for value: "minute"
         */
        public static final CycleEnum MINUTE = new CycleEnum("minute");

        /**
         * Enum HOUR for value: "hour"
         */
        public static final CycleEnum HOUR = new CycleEnum("hour");

        /**
         * Enum DAY for value: "day"
         */
        public static final CycleEnum DAY = new CycleEnum("day");

        private static final Map<String, CycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CycleEnum> createStaticFields() {
            Map<String, CycleEnum> map = new HashMap<>();
            map.put("minute", MINUTE);
            map.put("hour", HOUR);
            map.put("day", DAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CycleEnum(String value) {
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
        public static CycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CycleEnum(value));
        }

        public static CycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CycleEnum) {
                return this.value.equals(((CycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private CycleEnum cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    public ListStatisticsApiRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListStatisticsApiRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 查询模式，默认为INSTANCE * ALL：实例下所有调用应用，要求主帐号权限 * APP：指定集成应用 * API：指定API * INSTANCE：实例，默认值  注意：mode = APP或ALL时，接口响应中不返回cycle，api_id，group_id，provider，register_time，status字段
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ListStatisticsApiRequest withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * 集成应用编号，查询模式为APP时必填
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public ListStatisticsApiRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API编号，查询模式为API时必填
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ListStatisticsApiRequest withCycle(CycleEnum cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 查询统计周期 * minute：分钟 * hour：小时 * day：天
     * @return cycle
     */
    public CycleEnum getCycle() {
        return cycle;
    }

    public void setCycle(CycleEnum cycle) {
        this.cycle = cycle;
    }

    public ListStatisticsApiRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，格式：2020-06-18 10:00:01
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListStatisticsApiRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式：2020-06-18 23:00:00
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListStatisticsApiRequest withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 统计时长格式：整数+单位（m、h），m：分钟，h：小时，可支持小时与分钟的组合。例如：1h或2h45m * 同时给定start_time和end_time优先查询[start_time, end_time] * start_time不存在，end_time和duration存在且合法，则查询区间为[end_time - duration, end_time] * start_time和end_time不存在，duration存在且合法，令end_time=now，则查询区间为[end_time - duration, end_time] * start_time，end_time和duration都不存在，报错missing time range parameters。 * duration最长查询范围：小时最长支持72小时，分钟最长支持90分钟。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStatisticsApiRequest that = (ListStatisticsApiRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.romaAppId, that.romaAppId) && Objects.equals(this.apiId, that.apiId)
            && Objects.equals(this.cycle, that.cycle) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, mode, romaAppId, apiId, cycle, startTime, endTime, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsApiRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
