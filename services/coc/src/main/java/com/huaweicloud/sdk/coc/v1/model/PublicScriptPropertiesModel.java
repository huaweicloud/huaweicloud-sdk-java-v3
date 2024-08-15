package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 公共脚本附加属性
 */
public class PublicScriptPropertiesModel {

    /**
     * 风险等级 LOW:低风险 MEDIUM:中风险 HIGH:高风险
     */
    public static final class RiskLevelEnum {

        /**
         * Enum LOW for value: "LOW"
         */
        public static final RiskLevelEnum LOW = new RiskLevelEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final RiskLevelEnum MEDIUM = new RiskLevelEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final RiskLevelEnum HIGH = new RiskLevelEnum("HIGH");

        private static final Map<String, RiskLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskLevelEnum> createStaticFields() {
            Map<String, RiskLevelEnum> map = new HashMap<>();
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskLevelEnum(String value) {
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
        public static RiskLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskLevelEnum(value));
        }

        public static RiskLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskLevelEnum) {
                return this.value.equals(((RiskLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private RiskLevelEnum riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public PublicScriptPropertiesModel withRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级 LOW:低风险 MEDIUM:中风险 HIGH:高风险
     * @return riskLevel
     */
    public RiskLevelEnum getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
    }

    public PublicScriptPropertiesModel withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 脚本版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicScriptPropertiesModel that = (PublicScriptPropertiesModel) obj;
        return Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskLevel, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicScriptPropertiesModel {\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
