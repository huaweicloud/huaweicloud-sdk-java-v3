package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowWebProtectionRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_number")

    private String cveNumber;

    /**
     * **参数解释：** 危险等级 - 1：高危 - 2：中危 - 3：低危  **取值范围：** - 1 - 2 - 3
     */
    public static final class RiskLevelEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RiskLevelEnum NUMBER_1 = new RiskLevelEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final RiskLevelEnum NUMBER_2 = new RiskLevelEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final RiskLevelEnum NUMBER_3 = new RiskLevelEnum(3);

        private static final Map<Integer, RiskLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RiskLevelEnum> createStaticFields() {
            Map<Integer, RiskLevelEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RiskLevelEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RiskLevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskLevelEnum(value));
        }

        public static RiskLevelEnum valueOf(Integer value) {
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
    @JsonProperty(value = "application_type")

    private String applicationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private String protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public ShowWebProtectionRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 规则id，唯一标识一条Web防护规则 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWebProtectionRuleResponse withCveNumber(String cveNumber) {
        this.cveNumber = cveNumber;
        return this;
    }

    /**
     * **参数解释：** 关联的CVE编号，对应规则防护的漏洞的CVE标准编号（如CVE-2021-41773） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cveNumber
     */
    public String getCveNumber() {
        return cveNumber;
    }

    public void setCveNumber(String cveNumber) {
        this.cveNumber = cveNumber;
    }

    public ShowWebProtectionRuleResponse withRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * **参数解释：** 危险等级 - 1：高危 - 2：中危 - 3：低危  **取值范围：** - 1 - 2 - 3
     * @return riskLevel
     */
    public RiskLevelEnum getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ShowWebProtectionRuleResponse withApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * **参数解释：** 应用类型，指定规则适用的应用场景（如Web应用、API接口） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return applicationType
     */
    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public ShowWebProtectionRuleResponse withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * **参数解释：** 防护类型，区分规则的防护类别（如SQL注入防护、XSS防护、命令注入防护） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public ShowWebProtectionRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述，对Web防护规则的功能、适用场景等补充说明 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowWebProtectionRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 规则上线时间，Web防护规则正式启用的时间（时间戳格式） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWebProtectionRuleResponse that = (ShowWebProtectionRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cveNumber, that.cveNumber)
            && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.applicationType, that.applicationType)
            && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cveNumber, riskLevel, applicationType, protectionType, description, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWebProtectionRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cveNumber: ").append(toIndentedString(cveNumber)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
