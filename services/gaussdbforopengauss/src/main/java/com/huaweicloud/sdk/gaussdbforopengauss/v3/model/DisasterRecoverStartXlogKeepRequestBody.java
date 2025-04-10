package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DisasterRecoverStartXlogKeepRequestBody
 */
public class DisasterRecoverStartXlogKeepRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xlog_keep_ratio")

    private Integer xlogKeepRatio;

    /**
     * 容灾类型。
     */
    public static final class DisasterTypeEnum {

        /**
         * Enum STREAM for value: "stream"
         */
        public static final DisasterTypeEnum STREAM = new DisasterTypeEnum("stream");

        private static final Map<String, DisasterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisasterTypeEnum> createStaticFields() {
            Map<String, DisasterTypeEnum> map = new HashMap<>();
            map.put("stream", STREAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisasterTypeEnum(String value) {
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
        public static DisasterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisasterTypeEnum(value));
        }

        public static DisasterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisasterTypeEnum) {
                return this.value.equals(((DisasterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_type")

    private DisasterTypeEnum disasterType;

    public DisasterRecoverStartXlogKeepRequestBody withXlogKeepRatio(Integer xlogKeepRatio) {
        this.xlogKeepRatio = xlogKeepRatio;
        return this;
    }

    /**
     * 日志保留空间占可使用剩余磁盘容量的比例, 可设置范围为1-100。 properties:
     * @return xlogKeepRatio
     */
    public Integer getXlogKeepRatio() {
        return xlogKeepRatio;
    }

    public void setXlogKeepRatio(Integer xlogKeepRatio) {
        this.xlogKeepRatio = xlogKeepRatio;
    }

    public DisasterRecoverStartXlogKeepRequestBody withDisasterType(DisasterTypeEnum disasterType) {
        this.disasterType = disasterType;
        return this;
    }

    /**
     * 容灾类型。
     * @return disasterType
     */
    public DisasterTypeEnum getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(DisasterTypeEnum disasterType) {
        this.disasterType = disasterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisasterRecoverStartXlogKeepRequestBody that = (DisasterRecoverStartXlogKeepRequestBody) obj;
        return Objects.equals(this.xlogKeepRatio, that.xlogKeepRatio)
            && Objects.equals(this.disasterType, that.disasterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xlogKeepRatio, disasterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisasterRecoverStartXlogKeepRequestBody {\n");
        sb.append("    xlogKeepRatio: ").append(toIndentedString(xlogKeepRatio)).append("\n");
        sb.append("    disasterType: ").append(toIndentedString(disasterType)).append("\n");
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
