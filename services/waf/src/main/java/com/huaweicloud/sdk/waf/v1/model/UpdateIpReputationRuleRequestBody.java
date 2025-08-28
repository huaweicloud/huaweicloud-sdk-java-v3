package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateIpReputationRuleRequestBody
 */
public class UpdateIpReputationRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyname")

    private String policyname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private UpdateIpReputationRuleRequestBodyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public UpdateIpReputationRuleRequestBody withName(String name) {
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

    public UpdateIpReputationRuleRequestBody withPolicyname(String policyname) {
        this.policyname = policyname;
        return this;
    }

    /**
     * **参数解释：** 策略名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyname
     */
    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public UpdateIpReputationRuleRequestBody withDescription(String description) {
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

    public UpdateIpReputationRuleRequestBody withAction(UpdateIpReputationRuleRequestBodyAction action) {
        this.action = action;
        return this;
    }

    public UpdateIpReputationRuleRequestBody withAction(
        Consumer<UpdateIpReputationRuleRequestBodyAction> actionSetter) {
        if (this.action == null) {
            this.action = new UpdateIpReputationRuleRequestBodyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public UpdateIpReputationRuleRequestBodyAction getAction() {
        return action;
    }

    public void setAction(UpdateIpReputationRuleRequestBodyAction action) {
        this.action = action;
    }

    public UpdateIpReputationRuleRequestBody withType(String type) {
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

    public UpdateIpReputationRuleRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateIpReputationRuleRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateIpReputationRuleRequestBody withTags(Consumer<List<String>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpReputationRuleRequestBody that = (UpdateIpReputationRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.policyname, that.policyname)
            && Objects.equals(this.description, that.description) && Objects.equals(this.action, that.action)
            && Objects.equals(this.type, that.type) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, policyname, description, action, type, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpReputationRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyname: ").append(toIndentedString(policyname)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
