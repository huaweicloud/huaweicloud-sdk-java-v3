package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置检测信息
 */
public class ClusterSecurityCheckBaseLineDetectionInfo {

    /**
     * **参数解释**： 基线风险级别 **取值范围**： - High：高危基线 - Medium：中危基线 - Low：低危基线 
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
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_rule_num")

    private Integer failedRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_desc")

    private String checkTypeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_item_list")

    private List<ClusterSecurityCheckBaselineItemInfo> baselineItemList = null;

    public ClusterSecurityCheckBaseLineDetectionInfo withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 基线风险级别 **取值范围**： - High：高危基线 - Medium：中危基线 - Low：低危基线 
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**： 基线名称 **取值范围**： 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释**： 基线类型 **取值范围**： 不涉及 
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**： 标准类型 **取值范围**： - hw_standard：云安全实践 - cn_standard：等保合规 - cis_standard：通用安全标准 
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * **参数解释**： 检查项数量 **取值范围**： 不涉及 
     * @return checkRuleNum
     */
    public Integer getCheckRuleNum() {
        return checkRuleNum;
    }

    public void setCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
        return this;
    }

    /**
     * **参数解释**： 风险项数量 **取值范围**： 不涉及 
     * @return failedRuleNum
     */
    public Integer getFailedRuleNum() {
        return failedRuleNum;
    }

    public void setFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
        return this;
    }

    /**
     * **参数解释**： 基线描述信息 **取值范围**： 不涉及 
     * @return checkTypeDesc
     */
    public String getCheckTypeDesc() {
        return checkTypeDesc;
    }

    public void setCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withBaselineItemList(
        List<ClusterSecurityCheckBaselineItemInfo> baselineItemList) {
        this.baselineItemList = baselineItemList;
        return this;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo addBaselineItemListItem(
        ClusterSecurityCheckBaselineItemInfo baselineItemListItem) {
        if (this.baselineItemList == null) {
            this.baselineItemList = new ArrayList<>();
        }
        this.baselineItemList.add(baselineItemListItem);
        return this;
    }

    public ClusterSecurityCheckBaseLineDetectionInfo withBaselineItemList(
        Consumer<List<ClusterSecurityCheckBaselineItemInfo>> baselineItemListSetter) {
        if (this.baselineItemList == null) {
            this.baselineItemList = new ArrayList<>();
        }
        baselineItemListSetter.accept(this.baselineItemList);
        return this;
    }

    /**
     * **参数解释**： 基线检测列表 **取值范围**： 不涉及 
     * @return baselineItemList
     */
    public List<ClusterSecurityCheckBaselineItemInfo> getBaselineItemList() {
        return baselineItemList;
    }

    public void setBaselineItemList(List<ClusterSecurityCheckBaselineItemInfo> baselineItemList) {
        this.baselineItemList = baselineItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckBaseLineDetectionInfo that = (ClusterSecurityCheckBaseLineDetectionInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum)
            && Objects.equals(this.failedRuleNum, that.failedRuleNum)
            && Objects.equals(this.checkTypeDesc, that.checkTypeDesc)
            && Objects.equals(this.baselineItemList, that.baselineItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity,
            checkName,
            checkType,
            standard,
            checkRuleNum,
            failedRuleNum,
            checkTypeDesc,
            baselineItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckBaseLineDetectionInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    failedRuleNum: ").append(toIndentedString(failedRuleNum)).append("\n");
        sb.append("    checkTypeDesc: ").append(toIndentedString(checkTypeDesc)).append("\n");
        sb.append("    baselineItemList: ").append(toIndentedString(baselineItemList)).append("\n");
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
