package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataClassificationGroupCreateDTO
 */
public class DataClassificationGroupCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private List<String> ruleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_rules")

    private List<DataClassificationGroupCombineRuleDTO> createRules = null;

    public DataClassificationGroupCreateDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataClassificationGroupCreateDTO withRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public DataClassificationGroupCreateDTO addRuleIdsItem(String ruleIdsItem) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleIdsItem);
        return this;
    }

    public DataClassificationGroupCreateDTO withRuleIds(Consumer<List<String>> ruleIdsSetter) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        ruleIdsSetter.accept(this.ruleIds);
        return this;
    }

    /**
     * 规则id列表
     * @return ruleIds
     */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
    }

    public DataClassificationGroupCreateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataClassificationGroupCreateDTO withCreateRules(List<DataClassificationGroupCombineRuleDTO> createRules) {
        this.createRules = createRules;
        return this;
    }

    public DataClassificationGroupCreateDTO addCreateRulesItem(DataClassificationGroupCombineRuleDTO createRulesItem) {
        if (this.createRules == null) {
            this.createRules = new ArrayList<>();
        }
        this.createRules.add(createRulesItem);
        return this;
    }

    public DataClassificationGroupCreateDTO withCreateRules(
        Consumer<List<DataClassificationGroupCombineRuleDTO>> createRulesSetter) {
        if (this.createRules == null) {
            this.createRules = new ArrayList<>();
        }
        createRulesSetter.accept(this.createRules);
        return this;
    }

    /**
     * 需要创建的规则
     * @return createRules
     */
    public List<DataClassificationGroupCombineRuleDTO> getCreateRules() {
        return createRules;
    }

    public void setCreateRules(List<DataClassificationGroupCombineRuleDTO> createRules) {
        this.createRules = createRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataClassificationGroupCreateDTO that = (DataClassificationGroupCreateDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ruleIds, that.ruleIds)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createRules, that.createRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ruleIds, description, createRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationGroupCreateDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createRules: ").append(toIndentedString(createRules)).append("\n");
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
