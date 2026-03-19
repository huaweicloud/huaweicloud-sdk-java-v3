package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建黑白名单规则body
 */
public class CreateWhiteBlackIpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group_id")

    private String ipGroupId;

    /**
     * **参数解释：** 生效模式 **约束限制：** 不涉及 **取值范围：** - permanent 立即生效 - customize 自定义生效 **默认取值：** permanent
     */
    public static final class TimeModeEnum {

        /**
         * Enum PERMANENT for value: "permanent"
         */
        public static final TimeModeEnum PERMANENT = new TimeModeEnum("permanent");

        /**
         * Enum CUSTOMIZE for value: "customize"
         */
        public static final TimeModeEnum CUSTOMIZE = new TimeModeEnum("customize");

        private static final Map<String, TimeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeModeEnum> createStaticFields() {
            Map<String, TimeModeEnum> map = new HashMap<>();
            map.put("permanent", PERMANENT);
            map.put("customize", CUSTOMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeModeEnum(String value) {
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
        public static TimeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeModeEnum(value));
        }

        public static TimeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeModeEnum) {
                return this.value.equals(((TimeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_mode")

    private TimeModeEnum timeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Integer terminal;

    public CreateWhiteBlackIpRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称 **约束限制：** 长度范围：[1, 256] **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWhiteBlackIpRuleRequestBody withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * **参数解释：** ip地址，需要输入标准的ip地址或地址段，例如：42.123.120.66或42.123.120.0/16 **约束限制：** 参数“addr”和“ip_group_id”必须存在一个，同时存在时以参数“addr”为准 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public CreateWhiteBlackIpRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 黑白名单规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWhiteBlackIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * **参数解释：** 防护动作 **约束限制：** 不涉及 **取值范围：**  - 0 拦截  - 1 放行   - 2 仅记录 **默认取值：** 不涉及
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public CreateWhiteBlackIpRuleRequestBody withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * **参数解释：** Ip地址组id，可在控制台中对象管理->地址组管理中添加 **约束限制：** 参数“addr”和“ip_group_id”必须存在一个，同时存在时以参数“addr”为准 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    public CreateWhiteBlackIpRuleRequestBody withTimeMode(TimeModeEnum timeMode) {
        this.timeMode = timeMode;
        return this;
    }

    /**
     * **参数解释：** 生效模式 **约束限制：** 不涉及 **取值范围：** - permanent 立即生效 - customize 自定义生效 **默认取值：** permanent
     * @return timeMode
     */
    public TimeModeEnum getTimeMode() {
        return timeMode;
    }

    public void setTimeMode(TimeModeEnum timeMode) {
        this.timeMode = timeMode;
    }

    public CreateWhiteBlackIpRuleRequestBody withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 规则生效开始时间，生效模式为自定义时，此字段才有效，请输入时间戳
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public CreateWhiteBlackIpRuleRequestBody withTerminal(Integer terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 规则生效结束时间，生效模式为自定义时，此字段才有效，请输入时间戳
     * @return terminal
     */
    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWhiteBlackIpRuleRequestBody that = (CreateWhiteBlackIpRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.description, that.description) && Objects.equals(this.white, that.white)
            && Objects.equals(this.ipGroupId, that.ipGroupId) && Objects.equals(this.timeMode, that.timeMode)
            && Objects.equals(this.start, that.start) && Objects.equals(this.terminal, that.terminal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr, description, white, ipGroupId, timeMode, start, terminal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWhiteBlackIpRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
        sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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
