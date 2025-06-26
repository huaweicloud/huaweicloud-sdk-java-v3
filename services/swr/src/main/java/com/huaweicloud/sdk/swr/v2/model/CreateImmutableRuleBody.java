package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateImmutableRuleBody
 */
public class CreateImmutableRuleBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_selectors")

    private List<RuleSelector> tagSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_selectors")

    private Map<String, List<RuleSelector>> scopeSelectors = null;

    public CreateImmutableRuleBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，默认值为0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateImmutableRuleBody withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 不可变规则是否生效，默认值为false
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public CreateImmutableRuleBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 预留字段，支持填immutable
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateImmutableRuleBody withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 预留字段，支持填immutable_template
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public CreateImmutableRuleBody withTagSelectors(List<RuleSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
        return this;
    }

    public CreateImmutableRuleBody addTagSelectorsItem(RuleSelector tagSelectorsItem) {
        if (this.tagSelectors == null) {
            this.tagSelectors = new ArrayList<>();
        }
        this.tagSelectors.add(tagSelectorsItem);
        return this;
    }

    public CreateImmutableRuleBody withTagSelectors(Consumer<List<RuleSelector>> tagSelectorsSetter) {
        if (this.tagSelectors == null) {
            this.tagSelectors = new ArrayList<>();
        }
        tagSelectorsSetter.accept(this.tagSelectors);
        return this;
    }

    /**
     * 制品版本选择器，目前只支持长度为1
     * @return tagSelectors
     */
    public List<RuleSelector> getTagSelectors() {
        return tagSelectors;
    }

    public void setTagSelectors(List<RuleSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
    }

    public CreateImmutableRuleBody withScopeSelectors(Map<String, List<RuleSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
        return this;
    }

    public CreateImmutableRuleBody putScopeSelectorsItem(String key, List<RuleSelector> scopeSelectorsItem) {
        if (this.scopeSelectors == null) {
            this.scopeSelectors = new HashMap<>();
        }
        this.scopeSelectors.put(key, scopeSelectorsItem);
        return this;
    }

    public CreateImmutableRuleBody withScopeSelectors(Consumer<Map<String, List<RuleSelector>>> scopeSelectorsSetter) {
        if (this.scopeSelectors == null) {
            this.scopeSelectors = new HashMap<>();
        }
        scopeSelectorsSetter.accept(this.scopeSelectors);
        return this;
    }

    /**
     * 制品仓库选择器，目前只支持repository且长度为1
     * @return scopeSelectors
     */
    public Map<String, List<RuleSelector>> getScopeSelectors() {
        return scopeSelectors;
    }

    public void setScopeSelectors(Map<String, List<RuleSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateImmutableRuleBody that = (CreateImmutableRuleBody) obj;
        return Objects.equals(this.priority, that.priority) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.action, that.action) && Objects.equals(this.template, that.template)
            && Objects.equals(this.tagSelectors, that.tagSelectors)
            && Objects.equals(this.scopeSelectors, that.scopeSelectors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, disabled, action, template, tagSelectors, scopeSelectors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImmutableRuleBody {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    tagSelectors: ").append(toIndentedString(tagSelectors)).append("\n");
        sb.append("    scopeSelectors: ").append(toIndentedString(scopeSelectors)).append("\n");
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
