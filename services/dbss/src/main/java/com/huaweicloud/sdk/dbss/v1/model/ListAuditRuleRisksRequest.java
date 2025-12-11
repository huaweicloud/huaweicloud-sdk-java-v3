package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAuditRuleRisksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 风险级别 - LOW：低 - MEDIUM：中 - HIGH：高 - NO_RISK：无风险
     */
    public static final class RiskLevelsEnum {

        /**
         * Enum LOW for value: "LOW"
         */
        public static final RiskLevelsEnum LOW = new RiskLevelsEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final RiskLevelsEnum MEDIUM = new RiskLevelsEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final RiskLevelsEnum HIGH = new RiskLevelsEnum("HIGH");

        /**
         * Enum NO_RISK for value: "NO_RISK"
         */
        public static final RiskLevelsEnum NO_RISK = new RiskLevelsEnum("NO_RISK");

        private static final Map<String, RiskLevelsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskLevelsEnum> createStaticFields() {
            Map<String, RiskLevelsEnum> map = new HashMap<>();
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            map.put("NO_RISK", NO_RISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskLevelsEnum(String value) {
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
        public static RiskLevelsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskLevelsEnum(value));
        }

        public static RiskLevelsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskLevelsEnum) {
                return this.value.equals(((RiskLevelsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_levels")

    private RiskLevelsEnum riskLevels;

    public ListAuditRuleRisksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。可通过查询实例列表接口ID字段获取 **约束限制**： 不涉及 **取值范围**： 以查询实例列表接口值为准，字符长度32-64。 **默认取值**： 不涉及 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListAuditRuleRisksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 风险名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAuditRuleRisksRequest withRiskLevels(RiskLevelsEnum riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }

    /**
     * 风险级别 - LOW：低 - MEDIUM：中 - HIGH：高 - NO_RISK：无风险
     * @return riskLevels
     */
    public RiskLevelsEnum getRiskLevels() {
        return riskLevels;
    }

    public void setRiskLevels(RiskLevelsEnum riskLevels) {
        this.riskLevels = riskLevels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditRuleRisksRequest that = (ListAuditRuleRisksRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.riskLevels, that.riskLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, riskLevels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditRuleRisksRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    riskLevels: ").append(toIndentedString(riskLevels)).append("\n");
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
