package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomRegexSetItem
 */
public class CustomRegexSetItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_count")

    private Integer regexCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referenced_rules")

    private List<ReferencedRule> referencedRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public CustomRegexSetItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 正则库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomRegexSetItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 正则库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomRegexSetItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 正则库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomRegexSetItem withRegexCount(Integer regexCount) {
        this.regexCount = regexCount;
        return this;
    }

    /**
     * 正则条目数量
     * @return regexCount
     */
    public Integer getRegexCount() {
        return regexCount;
    }

    public void setRegexCount(Integer regexCount) {
        this.regexCount = regexCount;
    }

    public CustomRegexSetItem withReferencedRules(List<ReferencedRule> referencedRules) {
        this.referencedRules = referencedRules;
        return this;
    }

    public CustomRegexSetItem addReferencedRulesItem(ReferencedRule referencedRulesItem) {
        if (this.referencedRules == null) {
            this.referencedRules = new ArrayList<>();
        }
        this.referencedRules.add(referencedRulesItem);
        return this;
    }

    public CustomRegexSetItem withReferencedRules(Consumer<List<ReferencedRule>> referencedRulesSetter) {
        if (this.referencedRules == null) {
            this.referencedRules = new ArrayList<>();
        }
        referencedRulesSetter.accept(this.referencedRules);
        return this;
    }

    /**
     * 引用此正则库的规则列表
     * @return referencedRules
     */
    public List<ReferencedRule> getReferencedRules() {
        return referencedRules;
    }

    public void setReferencedRules(List<ReferencedRule> referencedRules) {
        this.referencedRules = referencedRules;
    }

    public CustomRegexSetItem withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（毫秒时间戳）
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CustomRegexSetItem withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（毫秒时间戳）
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
        CustomRegexSetItem that = (CustomRegexSetItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.regexCount, that.regexCount)
            && Objects.equals(this.referencedRules, that.referencedRules)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, regexCount, referencedRules, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRegexSetItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regexCount: ").append(toIndentedString(regexCount)).append("\n");
        sb.append("    referencedRules: ").append(toIndentedString(referencedRules)).append("\n");
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
