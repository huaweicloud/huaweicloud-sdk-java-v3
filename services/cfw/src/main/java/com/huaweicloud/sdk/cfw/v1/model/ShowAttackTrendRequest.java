package com.huaweicloud.sdk.cfw.v1.model;

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
public class ShowAttackTrendRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    /**
     * **参数解释**： 时间范围  **约束限制**： 不涉及 **取值范围**： 0为近一时 1近一天 2近七天   **默认取值**： 不涉及 
     */
    public static final class RangeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RangeEnum NUMBER_0 = new RangeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RangeEnum NUMBER_1 = new RangeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final RangeEnum NUMBER_2 = new RangeEnum(2);

        private static final Map<Integer, RangeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RangeEnum> createStaticFields() {
            Map<Integer, RangeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RangeEnum(Integer value) {
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
        public static RangeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RangeEnum(value));
        }

        public static RangeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RangeEnum) {
                return this.value.equals(((RangeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range")

    private RangeEnum range;

    /**
     * **参数解释**： 日志类型 **约束限制**： 不涉及 **取值范围**： internet为南北向日志、nat为nat场景日志，vpc为东西向日志，vgw为vgw场景日志 **默认取值**： 不涉及 
     */
    public static final class LogTypeEnum {

        /**
         * Enum INTERNET for value: "internet"
         */
        public static final LogTypeEnum INTERNET = new LogTypeEnum("internet");

        /**
         * Enum NAT for value: "nat"
         */
        public static final LogTypeEnum NAT = new LogTypeEnum("nat");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final LogTypeEnum VPC = new LogTypeEnum("vpc");

        /**
         * Enum VGW for value: "vgw"
         */
        public static final LogTypeEnum VGW = new LogTypeEnum("vgw");

        private static final Map<String, LogTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTypeEnum> createStaticFields() {
            Map<String, LogTypeEnum> map = new HashMap<>();
            map.put("internet", INTERNET);
            map.put("nat", NAT);
            map.put("vpc", VPC);
            map.put("vgw", VGW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTypeEnum(String value) {
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
        public static LogTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogTypeEnum(value));
        }

        public static LogTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTypeEnum) {
                return this.value.equals(((LogTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private LogTypeEnum logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private List<String> vgwId = null;

    public ShowAttackTrendRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及 
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ShowAttackTrendRequest withRange(RangeEnum range) {
        this.range = range;
        return this;
    }

    /**
     * **参数解释**： 时间范围  **约束限制**： 不涉及 **取值范围**： 0为近一时 1近一天 2近七天   **默认取值**： 不涉及 
     * @return range
     */
    public RangeEnum getRange() {
        return range;
    }

    public void setRange(RangeEnum range) {
        this.range = range;
    }

    public ShowAttackTrendRequest withLogType(LogTypeEnum logType) {
        this.logType = logType;
        return this;
    }

    /**
     * **参数解释**： 日志类型 **约束限制**： 不涉及 **取值范围**： internet为南北向日志、nat为nat场景日志，vpc为东西向日志，vgw为vgw场景日志 **默认取值**： 不涉及 
     * @return logType
     */
    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(LogTypeEnum logType) {
        this.logType = logType;
    }

    public ShowAttackTrendRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间 **约束限制**： 不涉及 **取值范围**： 毫秒级时间戳 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 4294967295000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowAttackTrendRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间 **约束限制**： 不涉及 **取值范围**： 毫秒级时间戳 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 4294967295000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowAttackTrendRequest withVgwId(List<String> vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    public ShowAttackTrendRequest addVgwIdItem(String vgwIdItem) {
        if (this.vgwId == null) {
            this.vgwId = new ArrayList<>();
        }
        this.vgwId.add(vgwIdItem);
        return this;
    }

    public ShowAttackTrendRequest withVgwId(Consumer<List<String>> vgwIdSetter) {
        if (this.vgwId == null) {
            this.vgwId = new ArrayList<>();
        }
        vgwIdSetter.accept(this.vgwId);
        return this;
    }

    /**
     * **参数解释**： VGW ID **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及 
     * @return vgwId
     */
    public List<String> getVgwId() {
        return vgwId;
    }

    public void setVgwId(List<String> vgwId) {
        this.vgwId = vgwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAttackTrendRequest that = (ShowAttackTrendRequest) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.range, that.range)
            && Objects.equals(this.logType, that.logType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.vgwId, that.vgwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, range, logType, startTime, endTime, vgwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAttackTrendRequest {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
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
