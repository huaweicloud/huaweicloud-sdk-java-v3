package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomAnswersItem
 */
public class CustomAnswersItem {

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
    @JsonProperty(value = "answers")

    private List<String> answers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referenced_rules")

    private List<ReferencedRule> referencedRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public CustomAnswersItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 代答库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomAnswersItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 代答库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomAnswersItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 代答库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomAnswersItem withAnswers(List<String> answers) {
        this.answers = answers;
        return this;
    }

    public CustomAnswersItem addAnswersItem(String answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public CustomAnswersItem withAnswers(Consumer<List<String>> answersSetter) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 答案列表（按seq排序）
     * @return answers
     */
    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public CustomAnswersItem withReferencedRules(List<ReferencedRule> referencedRules) {
        this.referencedRules = referencedRules;
        return this;
    }

    public CustomAnswersItem addReferencedRulesItem(ReferencedRule referencedRulesItem) {
        if (this.referencedRules == null) {
            this.referencedRules = new ArrayList<>();
        }
        this.referencedRules.add(referencedRulesItem);
        return this;
    }

    public CustomAnswersItem withReferencedRules(Consumer<List<ReferencedRule>> referencedRulesSetter) {
        if (this.referencedRules == null) {
            this.referencedRules = new ArrayList<>();
        }
        referencedRulesSetter.accept(this.referencedRules);
        return this;
    }

    /**
     * 引用的策略列表
     * @return referencedRules
     */
    public List<ReferencedRule> getReferencedRules() {
        return referencedRules;
    }

    public void setReferencedRules(List<ReferencedRule> referencedRules) {
        this.referencedRules = referencedRules;
    }

    public CustomAnswersItem withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CustomAnswersItem withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
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
        CustomAnswersItem that = (CustomAnswersItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.answers, that.answers)
            && Objects.equals(this.referencedRules, that.referencedRules)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, answers, referencedRules, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomAnswersItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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
