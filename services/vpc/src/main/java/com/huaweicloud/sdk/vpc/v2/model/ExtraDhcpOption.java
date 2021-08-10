package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 子网配置的NTP地址对象 */
public class ExtraDhcpOption {

    /** 功能说明：子网配置的NTP地址名称 约束：目前只支持字段“ntp” */
    public static final class OptNameEnum {

        /** Enum NTP for value: "ntp" */
        public static final OptNameEnum NTP = new OptNameEnum("ntp");

        private static final Map<String, OptNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptNameEnum> createStaticFields() {
            Map<String, OptNameEnum> map = new HashMap<>();
            map.put("ntp", NTP);
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
            OptNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OptNameEnum(value);
            }
            return result;
        }

        public static OptNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OptNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 功能说明：子网配置的NTP地址名称 约束：目前只支持字段“ntp”
     * 
     * @return optName */
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

    /** 功能说明：子网配置的NTP地址 约束：目前只支持IPv4地址，每个IP地址以逗号隔开，IP地址个数不能超过4个，不能存在相同地址。该字段为null表示取消该子网NTP的设置，不能为””(空字符串)。
     * 
     * @return optValue */
    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtraDhcpOption extraDhcpOption = (ExtraDhcpOption) o;
        return Objects.equals(this.optName, extraDhcpOption.optName)
            && Objects.equals(this.optValue, extraDhcpOption.optValue);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
