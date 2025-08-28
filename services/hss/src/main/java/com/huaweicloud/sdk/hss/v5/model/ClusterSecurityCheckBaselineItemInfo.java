package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 配置检查项信息
 */
public class ClusterSecurityCheckBaselineItemInfo {

    /**
     * **参数解释**： 检查项风险等级 **取值范围**： - High：高危 - Medium：中危 - Low：低危 
     */
    public static final class SeverityEnum {

        /**
         * Enum HIGH for value: "High"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("High");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("Medium");

        /**
         * Enum LOW for value: "Low"
         */
        public static final SeverityEnum LOW = new SeverityEnum("Low");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("High", HIGH);
            map.put("Medium", MEDIUM);
            map.put("Low", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item")

    private String checkItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_description")

    private String checkDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_remediation")

    private String checkRemediation;

    public ClusterSecurityCheckBaselineItemInfo withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 检查项风险等级 **取值范围**： - High：高危 - Medium：中危 - Low：低危 
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ClusterSecurityCheckBaselineItemInfo withCheckItem(String checkItem) {
        this.checkItem = checkItem;
        return this;
    }

    /**
     * **参数解释**： 检查项 **取值范围**： 不涉及 
     * @return checkItem
     */
    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public ClusterSecurityCheckBaselineItemInfo withCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
        return this;
    }

    /**
     * **参数解释**： 检查描述 **取值范围**： 不涉及 
     * @return checkDescription
     */
    public String getCheckDescription() {
        return checkDescription;
    }

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    public ClusterSecurityCheckBaselineItemInfo withCheckRemediation(String checkRemediation) {
        this.checkRemediation = checkRemediation;
        return this;
    }

    /**
     * **参数解释**： 修复建议 **取值范围**： 不涉及 
     * @return checkRemediation
     */
    public String getCheckRemediation() {
        return checkRemediation;
    }

    public void setCheckRemediation(String checkRemediation) {
        this.checkRemediation = checkRemediation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckBaselineItemInfo that = (ClusterSecurityCheckBaselineItemInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkItem, that.checkItem)
            && Objects.equals(this.checkDescription, that.checkDescription)
            && Objects.equals(this.checkRemediation, that.checkRemediation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, checkItem, checkDescription, checkRemediation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckBaselineItemInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkItem: ").append(toIndentedString(checkItem)).append("\n");
        sb.append("    checkDescription: ").append(toIndentedString(checkDescription)).append("\n");
        sb.append("    checkRemediation: ").append(toIndentedString(checkRemediation)).append("\n");
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
