package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 函数通知目标参数配置。
 */
public class FuncDestinationConfig {

    /**
     * 目标类型。  - OBS：通知到OBS服务。 - SMN：通知到SMN服务。 - DIS：通知到DIS服务。 - FunctionGraph： 通知到函数服务。
     */
    public static final class DestinationEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final DestinationEnum OBS = new DestinationEnum("OBS");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final DestinationEnum SMN = new DestinationEnum("SMN");

        /**
         * Enum DIS for value: "DIS"
         */
        public static final DestinationEnum DIS = new DestinationEnum("DIS");

        /**
         * Enum FUNCTIONGRAPH for value: "FunctionGraph"
         */
        public static final DestinationEnum FUNCTIONGRAPH = new DestinationEnum("FunctionGraph");

        private static final Map<String, DestinationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DestinationEnum> createStaticFields() {
            Map<String, DestinationEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("SMN", SMN);
            map.put("DIS", DIS);
            map.put("FunctionGraph", FUNCTIONGRAPH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DestinationEnum(String value) {
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
        public static DestinationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DestinationEnum(value));
        }

        public static DestinationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DestinationEnum) {
                return this.value.equals(((DestinationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private DestinationEnum destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    private String param;

    public FuncDestinationConfig withDestination(DestinationEnum destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 目标类型。  - OBS：通知到OBS服务。 - SMN：通知到SMN服务。 - DIS：通知到DIS服务。 - FunctionGraph： 通知到函数服务。
     * @return destination
     */
    public DestinationEnum getDestination() {
        return destination;
    }

    public void setDestination(DestinationEnum destination) {
        this.destination = destination;
    }

    public FuncDestinationConfig withParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * 通知目标服务对应参数,json字符串。  - OBS：包含bucket桶，对象目录前缀prefix，对象默认expires过期时间[0~365]天，0默认不过期。 - SMN：包含smn 主题topic_urn。 - DIS：包含DIS 通道名stream_name。 - FunctionGraph：包含func_urn，函数urn
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuncDestinationConfig that = (FuncDestinationConfig) obj;
        return Objects.equals(this.destination, that.destination) && Objects.equals(this.param, that.param);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, param);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuncDestinationConfig {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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
