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
public class ShowAccessTopRequest {

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
     * **参数解释**： 会话方向 **约束限制**： 不涉及 **取值范围**： in2out为出云方向 out2in为入云方向 **默认取值**： 不涉及
     */
    public static final class DirectionEnum {

        /**
         * Enum IN2OUT for value: "in2out"
         */
        public static final DirectionEnum IN2OUT = new DirectionEnum("in2out");

        /**
         * Enum OUT2IN for value: "out2in"
         */
        public static final DirectionEnum OUT2IN = new DirectionEnum("out2in");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("in2out", IN2OUT);
            map.put("out2in", OUT2IN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private List<String> vgwId = null;

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

    /**
     * **参数解释**： 聚合类型 **约束限制**： 不涉及 **取值范围**： strategy_hit_info 策略的命中趋势 strategy_dashboard 策略命中概览 top_deny_rule TOP命中拦截策略 dst_ip TOP拦截目的IP src_ip TOP拦截源IP dst_port TOP拦截端口 dst_region TOP拦截目的地区 src_region TOP拦截源地区 **默认取值**： 不涉及
     */
    public static final class ItemEnum {

        /**
         * Enum STRATEGY_DASHBOARD for value: "strategy_dashboard"
         */
        public static final ItemEnum STRATEGY_DASHBOARD = new ItemEnum("strategy_dashboard");

        /**
         * Enum STRATEGY_HIT_INFO for value: "strategy_hit_info"
         */
        public static final ItemEnum STRATEGY_HIT_INFO = new ItemEnum("strategy_hit_info");

        /**
         * Enum TOP_DENY_RULE for value: "top_deny_rule"
         */
        public static final ItemEnum TOP_DENY_RULE = new ItemEnum("top_deny_rule");

        /**
         * Enum SRC_IP for value: "src_ip"
         */
        public static final ItemEnum SRC_IP = new ItemEnum("src_ip");

        /**
         * Enum DST_IP for value: "dst_ip"
         */
        public static final ItemEnum DST_IP = new ItemEnum("dst_ip");

        /**
         * Enum SRC_REGION for value: "src_region"
         */
        public static final ItemEnum SRC_REGION = new ItemEnum("src_region");

        /**
         * Enum DST_REGION for value: "dst_region"
         */
        public static final ItemEnum DST_REGION = new ItemEnum("dst_region");

        /**
         * Enum DST_PORT for value: "dst_port"
         */
        public static final ItemEnum DST_PORT = new ItemEnum("dst_port");

        private static final Map<String, ItemEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ItemEnum> createStaticFields() {
            Map<String, ItemEnum> map = new HashMap<>();
            map.put("strategy_dashboard", STRATEGY_DASHBOARD);
            map.put("strategy_hit_info", STRATEGY_HIT_INFO);
            map.put("top_deny_rule", TOP_DENY_RULE);
            map.put("src_ip", SRC_IP);
            map.put("dst_ip", DST_IP);
            map.put("src_region", SRC_REGION);
            map.put("dst_region", DST_REGION);
            map.put("dst_port", DST_PORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ItemEnum(String value) {
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
        public static ItemEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ItemEnum(value));
        }

        public static ItemEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ItemEnum) {
                return this.value.equals(((ItemEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private ItemEnum item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private List<String> ruleId = null;

    public ShowAccessTopRequest withFwInstanceId(String fwInstanceId) {
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

    public ShowAccessTopRequest withRange(RangeEnum range) {
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

    public ShowAccessTopRequest withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 会话方向 **约束限制**： 不涉及 **取值范围**： in2out为出云方向 out2in为入云方向 **默认取值**： 不涉及
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public ShowAccessTopRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间 **约束限制**： 不涉及 **取值范围**： 毫秒级时间戳 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowAccessTopRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间 **约束限制**： 不涉及 **取值范围**： 毫秒级时间戳 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowAccessTopRequest withVgwId(List<String> vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    public ShowAccessTopRequest addVgwIdItem(String vgwIdItem) {
        if (this.vgwId == null) {
            this.vgwId = new ArrayList<>();
        }
        this.vgwId.add(vgwIdItem);
        return this;
    }

    public ShowAccessTopRequest withVgwId(Consumer<List<String>> vgwIdSetter) {
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

    public ShowAccessTopRequest withLogType(LogTypeEnum logType) {
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

    public ShowAccessTopRequest withItem(ItemEnum item) {
        this.item = item;
        return this;
    }

    /**
     * **参数解释**： 聚合类型 **约束限制**： 不涉及 **取值范围**： strategy_hit_info 策略的命中趋势 strategy_dashboard 策略命中概览 top_deny_rule TOP命中拦截策略 dst_ip TOP拦截目的IP src_ip TOP拦截源IP dst_port TOP拦截端口 dst_region TOP拦截目的地区 src_region TOP拦截源地区 **默认取值**： 不涉及
     * @return item
     */
    public ItemEnum getItem() {
        return item;
    }

    public void setItem(ItemEnum item) {
        this.item = item;
    }

    public ShowAccessTopRequest withRuleId(List<String> ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public ShowAccessTopRequest addRuleIdItem(String ruleIdItem) {
        if (this.ruleId == null) {
            this.ruleId = new ArrayList<>();
        }
        this.ruleId.add(ruleIdItem);
        return this;
    }

    public ShowAccessTopRequest withRuleId(Consumer<List<String>> ruleIdSetter) {
        if (this.ruleId == null) {
            this.ruleId = new ArrayList<>();
        }
        ruleIdSetter.accept(this.ruleId);
        return this;
    }

    /**
     * **参数解释**： 规则ID列表 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return ruleId
     */
    public List<String> getRuleId() {
        return ruleId;
    }

    public void setRuleId(List<String> ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAccessTopRequest that = (ShowAccessTopRequest) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.range, that.range)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.vgwId, that.vgwId)
            && Objects.equals(this.logType, that.logType) && Objects.equals(this.item, that.item)
            && Objects.equals(this.ruleId, that.ruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, range, direction, startTime, endTime, vgwId, logType, item, ruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessTopRequest {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
