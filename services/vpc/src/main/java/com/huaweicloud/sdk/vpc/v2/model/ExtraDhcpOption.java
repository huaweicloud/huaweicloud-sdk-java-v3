package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 子网配置的NTP地址或租约时间对象
 */
public class ExtraDhcpOption {

    /**
     * 功能说明：子网配置的NTP地址名称或子网配置的租约到期名称。 约束：目前只支持字段“ntp”或“addresstime”
     */
    public static final class OptNameEnum {

        /**
         * Enum NTP for value: "ntp"
         */
        public static final OptNameEnum NTP = new OptNameEnum("ntp");

        /**
         * Enum ADDRESSTIME for value: "addresstime"
         */
        public static final OptNameEnum ADDRESSTIME = new OptNameEnum("addresstime");

        private static final Map<String, OptNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptNameEnum> createStaticFields() {
            Map<String, OptNameEnum> map = new HashMap<>();
            map.put("ntp", NTP);
            map.put("addresstime", ADDRESSTIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptNameEnum(String value) {
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
        public static OptNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OptNameEnum(value));
        }

        public static OptNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OptNameEnum) {
                return this.value.equals(((OptNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_name")

    private OptNameEnum optName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt_value")

    private String optValue;

    public ExtraDhcpOption withOptName(OptNameEnum optName) {
        this.optName = optName;
        return this;
    }

    /**
     * 功能说明：子网配置的NTP地址名称或子网配置的租约到期名称。 约束：目前只支持字段“ntp”或“addresstime”
     * @return optName
     */
    public OptNameEnum getOptName() {
        return optName;
    }

    public void setOptName(OptNameEnum optName) {
        this.optName = optName;
    }

    public ExtraDhcpOption withOptValue(String optValue) {
        this.optValue = optValue;
        return this;
    }

    /**
     * 功能说明：子网配置的NTP地址或子网配置的租约到期时间。 约束：opt_name配置为“ntp”，则表示是子网ntp地址，目前只支持IPv4地址，每个IP地址以逗号隔开，IP地址个数不能超过4个，不能存在相同地址。 该字段为null表示取消该子网NTP的设置，不能为””(空字符串)。 opt_name配置为“addresstime”，则该值表示是子网租约到期时间，取值格式有两种，取-1，表示无限租约；数字+h，数字范围是1~30000，比如5h。
     * @return optValue
     */
    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtraDhcpOption that = (ExtraDhcpOption) obj;
        return Objects.equals(this.optName, that.optName) && Objects.equals(this.optValue, that.optValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optName, optValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraDhcpOption {\n");
        sb.append("    optName: ").append(toIndentedString(optName)).append("\n");
        sb.append("    optValue: ").append(toIndentedString(optValue)).append("\n");
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
