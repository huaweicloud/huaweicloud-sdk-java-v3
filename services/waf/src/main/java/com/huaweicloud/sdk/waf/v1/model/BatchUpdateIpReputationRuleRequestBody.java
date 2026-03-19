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
 * BatchUpdateIpReputationRuleRequestBody
 */
public class BatchUpdateIpReputationRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private CreateIpReputationRuleRequestBodyAction action;

    /**
     * **参数解释：** 信誉类型（目前只支持idc） **约束限制：** 不涉及 **取值范围：** - idc  **默认取值：** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum IDC for value: "idc"
         */
        public static final TypeEnum IDC = new TypeEnum("idc");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("idc", IDC);
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
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rule_ids")

    private List<BatchUpdateIpReputationRuleRequestBodyPolicyRuleIds> policyRuleIds = null;

    public BatchUpdateIpReputationRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称 **约束限制：** 长度范围：[1, 256] **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchUpdateIpReputationRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 规则描述 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchUpdateIpReputationRuleRequestBody withAction(CreateIpReputationRuleRequestBodyAction action) {
        this.action = action;
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody withAction(
        Consumer<CreateIpReputationRuleRequestBodyAction> actionSetter) {
        if (this.action == null) {
            this.action = new CreateIpReputationRuleRequestBodyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public CreateIpReputationRuleRequestBodyAction getAction() {
        return action;
    }

    public void setAction(CreateIpReputationRuleRequestBodyAction action) {
        this.action = action;
    }

    public BatchUpdateIpReputationRuleRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 信誉类型（目前只支持idc） **约束限制：** 不涉及 **取值范围：** - idc  **默认取值：** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BatchUpdateIpReputationRuleRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 标签列表，用于指定关联的情报标识，可通过ConfirmPolicyIpReputationMap接口查询；多个标识之间使用逗号\",\"分隔 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public BatchUpdateIpReputationRuleRequestBody withPolicyRuleIds(
        List<BatchUpdateIpReputationRuleRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody addPolicyRuleIdsItem(
        BatchUpdateIpReputationRuleRequestBodyPolicyRuleIds policyRuleIdsItem) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        this.policyRuleIds.add(policyRuleIdsItem);
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody withPolicyRuleIds(
        Consumer<List<BatchUpdateIpReputationRuleRequestBodyPolicyRuleIds>> policyRuleIdsSetter) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        policyRuleIdsSetter.accept(this.policyRuleIds);
        return this;
    }

    /**
     * **参数解释：** 策略和规则id数组，关联防护策略与对应的规则集合 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyRuleIds
     */
    public List<BatchUpdateIpReputationRuleRequestBodyPolicyRuleIds> getPolicyRuleIds() {
        return policyRuleIds;
    }

    public void setPolicyRuleIds(List<BatchUpdateIpReputationRuleRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateIpReputationRuleRequestBody that = (BatchUpdateIpReputationRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.action, that.action) && Objects.equals(this.type, that.type)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.policyRuleIds, that.policyRuleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, action, type, tags, policyRuleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateIpReputationRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    policyRuleIds: ").append(toIndentedString(policyRuleIds)).append("\n");
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
