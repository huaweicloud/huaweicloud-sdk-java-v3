package com.huaweicloud.sdk.waf.v1.model;

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
 * 批量更新规则状态请求
 */
public class BatchUpdateAiGuardRuleStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private List<String> ruleIds = null;

    /**
     * 规则状态，可选：enable(启用), disable(禁用)，当disable时，只有rule_ids，而enable时至少有rule_ids或者temlate_ids
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLE for value: "enable"
         */
        public static final StatusEnum ENABLE = new StatusEnum("enable");

        /**
         * Enum DISABLE for value: "disable"
         */
        public static final StatusEnum DISABLE = new StatusEnum("disable");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_ids")

    private List<String> templateIds = null;

    public BatchUpdateAiGuardRuleStatusRequestBody withRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public BatchUpdateAiGuardRuleStatusRequestBody addRuleIdsItem(String ruleIdsItem) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleIdsItem);
        return this;
    }

    public BatchUpdateAiGuardRuleStatusRequestBody withRuleIds(Consumer<List<String>> ruleIdsSetter) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        ruleIdsSetter.accept(this.ruleIds);
        return this;
    }

    /**
     * 规则ID列表
     * @return ruleIds
     */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
    }

    public BatchUpdateAiGuardRuleStatusRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 规则状态，可选：enable(启用), disable(禁用)，当disable时，只有rule_ids，而enable时至少有rule_ids或者temlate_ids
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BatchUpdateAiGuardRuleStatusRequestBody withTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }

    public BatchUpdateAiGuardRuleStatusRequestBody addTemplateIdsItem(String templateIdsItem) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        this.templateIds.add(templateIdsItem);
        return this;
    }

    public BatchUpdateAiGuardRuleStatusRequestBody withTemplateIds(Consumer<List<String>> templateIdsSetter) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        templateIdsSetter.accept(this.templateIds);
        return this;
    }

    /**
     * 系统规则的id
     * @return templateIds
     */
    public List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateAiGuardRuleStatusRequestBody that = (BatchUpdateAiGuardRuleStatusRequestBody) obj;
        return Objects.equals(this.ruleIds, that.ruleIds) && Objects.equals(this.status, that.status)
            && Objects.equals(this.templateIds, that.templateIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIds, status, templateIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateAiGuardRuleStatusRequestBody {\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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
