package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * web基础防护内置规则
 */
public class WebBasicProtectionRulesItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "effective_time")

    private Long effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public WebBasicProtectionRulesItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 规则的ID，规则的唯一标识 **取值范围：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WebBasicProtectionRulesItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 规则描述 **取值范围：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebBasicProtectionRulesItem withCveNumber(String cveNumber) {
        this.cveNumber = cveNumber;
        return this;
    }

    /**
     * **参数解释：** CVE编号 **取值范围：** 不涉及
     * @return cveNumber
     */
    public String getCveNumber() {
        return cveNumber;
    }

    public void setCveNumber(String cveNumber) {
        this.cveNumber = cveNumber;
    }

    public WebBasicProtectionRulesItem withRiskLevel(RiskLevelEnum riskLevel) {
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

    public WebBasicProtectionRulesItem withApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * **参数解释：** 应用类型 **取值范围：** 不涉及
     * @return applicationType
     */
    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public WebBasicProtectionRulesItem withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * **参数解释：** 防护类型 **取值范围：** 不涉及
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public WebBasicProtectionRulesItem withEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * **参数解释：** 生效时间 **取值范围：** 不涉及
     * @return effectiveTime
     */
    public Long getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Long effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public WebBasicProtectionRulesItem withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间 **取值范围：** 不涉及
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public WebBasicProtectionRulesItem withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释：** 更新时间 **取值范围：** 不涉及
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebBasicProtectionRulesItem that = (WebBasicProtectionRulesItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.cveNumber, that.cveNumber) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.applicationType, that.applicationType)
            && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            cveNumber,
            riskLevel,
            applicationType,
            protectionType,
            effectiveTime,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebBasicProtectionRulesItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cveNumber: ").append(toIndentedString(cveNumber)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
