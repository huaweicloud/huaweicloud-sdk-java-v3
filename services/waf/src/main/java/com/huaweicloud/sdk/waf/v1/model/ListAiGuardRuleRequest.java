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
 * Request Object
 */
public class ListAiGuardRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_opt")

    private String detectOpt;

    /**
     * **参数解释：** 检测类型 **约束限制：** 不涉及 **取值范围：** text(文本检测), image(图片检测) **默认取值：** 不涉及
     */
    public static final class DetectTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final DetectTypeEnum TEXT = new DetectTypeEnum("text");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final DetectTypeEnum IMAGE = new DetectTypeEnum("image");

        private static final Map<String, DetectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DetectTypeEnum> createStaticFields() {
            Map<String, DetectTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("image", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DetectTypeEnum(String value) {
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
        public static DetectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DetectTypeEnum(value));
        }

        public static DetectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DetectTypeEnum) {
                return this.value.equals(((DetectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private DetectTypeEnum detectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_template")

    private Boolean withTemplate;

    public ListAiGuardRuleRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 策略ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListAiGuardRuleRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 最大数量 **约束限制：** 不涉及 **取值范围：** 1-1000 **默认取值：** 10
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAiGuardRuleRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量 **约束限制：** 不涉及 **取值范围：** 0-10000 **默认取值：** 0
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAiGuardRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAiGuardRuleRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 规则状态 **约束限制：** 不涉及 **取值范围：** enable, disable **默认取值：** 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAiGuardRuleRequest withDetectOpt(String detectOpt) {
        this.detectOpt = detectOpt;
        return this;
    }

    /**
     * **参数解释：** 检测选项类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return detectOpt
     */
    public String getDetectOpt() {
        return detectOpt;
    }

    public void setDetectOpt(String detectOpt) {
        this.detectOpt = detectOpt;
    }

    public ListAiGuardRuleRequest withDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * **参数解释：** 检测类型 **约束限制：** 不涉及 **取值范围：** text(文本检测), image(图片检测) **默认取值：** 不涉及
     * @return detectType
     */
    public DetectTypeEnum getDetectType() {
        return detectType;
    }

    public void setDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
    }

    public ListAiGuardRuleRequest withWithTemplate(Boolean withTemplate) {
        this.withTemplate = withTemplate;
        return this;
    }

    /**
     * **参数解释：** 是否查询模板规则 **约束限制：** 不涉及 **取值范围：** true, false **默认取值：** 不涉及
     * @return withTemplate
     */
    public Boolean getWithTemplate() {
        return withTemplate;
    }

    public void setWithTemplate(Boolean withTemplate) {
        this.withTemplate = withTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiGuardRuleRequest that = (ListAiGuardRuleRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.detectOpt, that.detectOpt)
            && Objects.equals(this.detectType, that.detectType) && Objects.equals(this.withTemplate, that.withTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, limit, offset, name, status, detectOpt, detectType, withTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiGuardRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detectOpt: ").append(toIndentedString(detectOpt)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
        sb.append("    withTemplate: ").append(toIndentedString(withTemplate)).append("\n");
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
