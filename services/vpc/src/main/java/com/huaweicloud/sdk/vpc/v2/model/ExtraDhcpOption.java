package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 子网配置的NTP地址对象
 */
public class ExtraDhcpOption  {

    /**
     * 功能说明：子网配置的NTP地址名称 约束：目前只支持字段“ntp”
     */
    public static class OptNameEnum {

        
        /**
         * Enum NTP for value: "ntp"
         */
        public static final OptNameEnum NTP = new OptNameEnum("ntp");

        

        public static Map<String, OptNameEnum> staticFields =
                new HashMap<String, OptNameEnum>() {
                    { 
                        put("ntp", NTP);
                    }
                };

        private String value;

        OptNameEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OptNameEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OptNameEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OptNameEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OptNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OptNameEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OptNameEnum) {
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
    @JsonProperty(value="opt_name")
    
    private OptNameEnum optName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="opt_value")
    
    private String optValue;

    public ExtraDhcpOption withOptName(OptNameEnum optName) {
        this.optName = optName;
        return this;
    }

    


    /**
     * 功能说明：子网配置的NTP地址名称 约束：目前只支持字段“ntp”
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
     * 功能说明：子网配置的NTP地址 约束：目前只支持IPv4地址，每个IP地址以逗号隔开，IP地址个数不能超过4个，不能存在相同地址。该字段为null表示取消该子网NTP的设置，不能为””(空字符串)。
     * @return optValue
     */
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
        return Objects.equals(this.optName, extraDhcpOption.optName) &&
            Objects.equals(this.optValue, extraDhcpOption.optValue);
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

