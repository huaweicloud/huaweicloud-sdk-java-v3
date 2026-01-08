package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 证书crl配置。
 */
public class CrlConfigurationData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    /**
     * 系统生成SYSTEM, 用户自定义CUSTOMIZE。
     */
    public static final class TypeEnum {

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final TypeEnum SYSTEM = new TypeEnum("SYSTEM");

        /**
         * Enum CUSTOMIZE for value: "CUSTOMIZE"
         */
        public static final TypeEnum CUSTOMIZE = new TypeEnum("CUSTOMIZE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SYSTEM", SYSTEM);
            map.put("CUSTOMIZE", CUSTOMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_url")

    private String crlUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_day")

    private Integer validDay;

    public CrlConfigurationData withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启crl配置。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CrlConfigurationData withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 系统生成SYSTEM, 用户自定义CUSTOMIZE。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CrlConfigurationData withCrlUrl(String crlUrl) {
        this.crlUrl = crlUrl;
        return this;
    }

    /**
     * 当用户自定义时手动输入。
     * @return crlUrl
     */
    public String getCrlUrl() {
        return crlUrl;
    }

    public void setCrlUrl(String crlUrl) {
        this.crlUrl = crlUrl;
    }

    public CrlConfigurationData withValidDay(Integer validDay) {
        this.validDay = validDay;
        return this;
    }

    /**
     * 更新周期。
     * minimum: 3650
     * maximum: 99999999
     * @return validDay
     */
    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrlConfigurationData that = (CrlConfigurationData) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.type, that.type)
            && Objects.equals(this.crlUrl, that.crlUrl) && Objects.equals(this.validDay, that.validDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, type, crlUrl, validDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrlConfigurationData {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    crlUrl: ").append(toIndentedString(crlUrl)).append("\n");
        sb.append("    validDay: ").append(toIndentedString(validDay)).append("\n");
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
