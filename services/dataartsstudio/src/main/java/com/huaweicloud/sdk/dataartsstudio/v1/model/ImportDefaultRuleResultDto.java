package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportDefaultRuleResultDto
 */
public class ImportDefaultRuleResultDto {

    /**
     * 导入状态 * success 导入成功 * failed 导入失败
     */
    public static final class ImportStatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ImportStatusEnum SUCCESS = new ImportStatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ImportStatusEnum FAILED = new ImportStatusEnum("failed");

        private static final Map<String, ImportStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImportStatusEnum> createStaticFields() {
            Map<String, ImportStatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImportStatusEnum(String value) {
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
        public static ImportStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImportStatusEnum(value));
        }

        public static ImportStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImportStatusEnum) {
                return this.value.equals(((ImportStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_status")

    private ImportStatusEnum importStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_error_message")

    private String importErrorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_data_classification_rule")

    private ImportDataClassificationRuleDto importDataClassificationRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    /**
     * 数据识别规则类型 * REGEX 正则表达式 * KEYWORD 关键字
     */
    public static final class RuleTypeEnum {

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final RuleTypeEnum REGEX = new RuleTypeEnum("REGEX");

        /**
         * Enum KEYWORD for value: "KEYWORD"
         */
        public static final RuleTypeEnum KEYWORD = new RuleTypeEnum("KEYWORD");

        private static final Map<String, RuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleTypeEnum> createStaticFields() {
            Map<String, RuleTypeEnum> map = new HashMap<>();
            map.put("REGEX", REGEX);
            map.put("KEYWORD", KEYWORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleTypeEnum(String value) {
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
        public static RuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleTypeEnum(value));
        }

        public static RuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleTypeEnum) {
                return this.value.equals(((RuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private RuleTypeEnum ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_desc")

    private String ruleDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name_en")

    private String ruleNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_desc_en")

    private String ruleDescEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    public ImportDefaultRuleResultDto withImportStatus(ImportStatusEnum importStatus) {
        this.importStatus = importStatus;
        return this;
    }

    /**
     * 导入状态 * success 导入成功 * failed 导入失败
     * @return importStatus
     */
    public ImportStatusEnum getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(ImportStatusEnum importStatus) {
        this.importStatus = importStatus;
    }

    public ImportDefaultRuleResultDto withImportErrorMessage(String importErrorMessage) {
        this.importErrorMessage = importErrorMessage;
        return this;
    }

    /**
     * 导入错误原因。
     * @return importErrorMessage
     */
    public String getImportErrorMessage() {
        return importErrorMessage;
    }

    public void setImportErrorMessage(String importErrorMessage) {
        this.importErrorMessage = importErrorMessage;
    }

    public ImportDefaultRuleResultDto withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 内置规则模板id。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ImportDefaultRuleResultDto withImportDataClassificationRule(
        ImportDataClassificationRuleDto importDataClassificationRule) {
        this.importDataClassificationRule = importDataClassificationRule;
        return this;
    }

    public ImportDefaultRuleResultDto withImportDataClassificationRule(
        Consumer<ImportDataClassificationRuleDto> importDataClassificationRuleSetter) {
        if (this.importDataClassificationRule == null) {
            this.importDataClassificationRule = new ImportDataClassificationRuleDto();
            importDataClassificationRuleSetter.accept(this.importDataClassificationRule);
        }

        return this;
    }

    /**
     * Get importDataClassificationRule
     * @return importDataClassificationRule
     */
    public ImportDataClassificationRuleDto getImportDataClassificationRule() {
        return importDataClassificationRule;
    }

    public void setImportDataClassificationRule(ImportDataClassificationRuleDto importDataClassificationRule) {
        this.importDataClassificationRule = importDataClassificationRule;
    }

    public ImportDefaultRuleResultDto withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 数据识别规则名称。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ImportDefaultRuleResultDto withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 数据识别规则类型 * REGEX 正则表达式 * KEYWORD 关键字
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public ImportDefaultRuleResultDto withRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }

    /**
     * 规则描述。
     * @return ruleDesc
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public ImportDefaultRuleResultDto withRuleNameEn(String ruleNameEn) {
        this.ruleNameEn = ruleNameEn;
        return this;
    }

    /**
     * 英文名称。
     * @return ruleNameEn
     */
    public String getRuleNameEn() {
        return ruleNameEn;
    }

    public void setRuleNameEn(String ruleNameEn) {
        this.ruleNameEn = ruleNameEn;
    }

    public ImportDefaultRuleResultDto withRuleDescEn(String ruleDescEn) {
        this.ruleDescEn = ruleDescEn;
        return this;
    }

    /**
     * 英文描述。
     * @return ruleDescEn
     */
    public String getRuleDescEn() {
        return ruleDescEn;
    }

    public void setRuleDescEn(String ruleDescEn) {
        this.ruleDescEn = ruleDescEn;
    }

    public ImportDefaultRuleResultDto withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 规则所属地区。
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportDefaultRuleResultDto that = (ImportDefaultRuleResultDto) obj;
        return Objects.equals(this.importStatus, that.importStatus)
            && Objects.equals(this.importErrorMessage, that.importErrorMessage) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.importDataClassificationRule, that.importDataClassificationRule)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.ruleDesc, that.ruleDesc) && Objects.equals(this.ruleNameEn, that.ruleNameEn)
            && Objects.equals(this.ruleDescEn, that.ruleDescEn) && Objects.equals(this.country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importStatus,
            importErrorMessage,
            uuid,
            importDataClassificationRule,
            ruleName,
            ruleType,
            ruleDesc,
            ruleNameEn,
            ruleDescEn,
            country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDefaultRuleResultDto {\n");
        sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
        sb.append("    importErrorMessage: ").append(toIndentedString(importErrorMessage)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    importDataClassificationRule: ")
            .append(toIndentedString(importDataClassificationRule))
            .append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    ruleDesc: ").append(toIndentedString(ruleDesc)).append("\n");
        sb.append("    ruleNameEn: ").append(toIndentedString(ruleNameEn)).append("\n");
        sb.append("    ruleDescEn: ").append(toIndentedString(ruleDescEn)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
