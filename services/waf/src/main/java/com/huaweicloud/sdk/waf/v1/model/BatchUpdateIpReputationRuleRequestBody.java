package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    private BatchUpdateIpReputationRuleRequestBodyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rule_ids")

    private List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds = null;

    public BatchUpdateIpReputationRuleRequestBody withName(String name) {
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

    public BatchUpdateIpReputationRuleRequestBody withAction(BatchUpdateIpReputationRuleRequestBodyAction action) {
        this.action = action;
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody withAction(
        Consumer<BatchUpdateIpReputationRuleRequestBodyAction> actionSetter) {
        if (this.action == null) {
            this.action = new BatchUpdateIpReputationRuleRequestBodyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public BatchUpdateIpReputationRuleRequestBodyAction getAction() {
        return action;
    }

    public void setAction(BatchUpdateIpReputationRuleRequestBodyAction action) {
        this.action = action;
    }

    public BatchUpdateIpReputationRuleRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 规则类型（如idc表示机房IP情报类型） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
     * **参数解释：** 标签列表，关联的情报标识 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public BatchUpdateIpReputationRuleRequestBody withPolicyRuleIds(
        List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody addPolicyRuleIdsItem(
        PolicyRuleIdRequestBodyPolicyRuleIds policyRuleIdsItem) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        this.policyRuleIds.add(policyRuleIdsItem);
        return this;
    }

    public BatchUpdateIpReputationRuleRequestBody withPolicyRuleIds(
        Consumer<List<PolicyRuleIdRequestBodyPolicyRuleIds>> policyRuleIdsSetter) {
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
    public List<PolicyRuleIdRequestBodyPolicyRuleIds> getPolicyRuleIds() {
        return policyRuleIds;
    }

    public void setPolicyRuleIds(List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds) {
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
