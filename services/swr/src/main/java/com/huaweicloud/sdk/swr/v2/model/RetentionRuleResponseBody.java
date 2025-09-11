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
 * RetentionRuleResponseBody
 */
public class RetentionRuleResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

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
    @JsonProperty(value = "params")

    private Map<String, Object> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_selectors")

    private List<RetentionSelector> tagSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_selectors")

    private Map<String, List<RetentionSelector>> scopeSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_scope_mode")

    private String repoScopeMode;

    public RetentionRuleResponseBody withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像老化策略ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RetentionRuleResponseBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 预留字段，目前只支持0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public RetentionRuleResponseBody withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 是否关闭此条规则
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public RetentionRuleResponseBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 预留字段，目前只支持retain
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RetentionRuleResponseBody withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 规则模板类型，值为：latestPulledN，latestPushedK，nDaysSinceLastPush，nDaysSinceLastPull
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public RetentionRuleResponseBody withParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public RetentionRuleResponseBody putParamsItem(String key, Object paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public RetentionRuleResponseBody withParams(Consumer<Map<String, Object>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 保留方式的参数，配套template使用，可参考请求示例
     * @return params
     */
    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public RetentionRuleResponseBody withTagSelectors(List<RetentionSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
        return this;
    }

    public RetentionRuleResponseBody addTagSelectorsItem(RetentionSelector tagSelectorsItem) {
        if (this.tagSelectors == null) {
            this.tagSelectors = new ArrayList<>();
        }
        this.tagSelectors.add(tagSelectorsItem);
        return this;
    }

    public RetentionRuleResponseBody withTagSelectors(Consumer<List<RetentionSelector>> tagSelectorsSetter) {
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
    public List<RetentionSelector> getTagSelectors() {
        return tagSelectors;
    }

    public void setTagSelectors(List<RetentionSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
    }

    public RetentionRuleResponseBody withScopeSelectors(Map<String, List<RetentionSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
        return this;
    }

    public RetentionRuleResponseBody putScopeSelectorsItem(String key, List<RetentionSelector> scopeSelectorsItem) {
        if (this.scopeSelectors == null) {
            this.scopeSelectors = new HashMap<>();
        }
        this.scopeSelectors.put(key, scopeSelectorsItem);
        return this;
    }

    public RetentionRuleResponseBody withScopeSelectors(
        Consumer<Map<String, List<RetentionSelector>>> scopeSelectorsSetter) {
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
    public Map<String, List<RetentionSelector>> getScopeSelectors() {
        return scopeSelectors;
    }

    public void setScopeSelectors(Map<String, List<RetentionSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
    }

    public RetentionRuleResponseBody withRepoScopeMode(String repoScopeMode) {
        this.repoScopeMode = repoScopeMode;
        return this;
    }

    /**
     * repo选择模式，前端使用，可选regular、selection
     * @return repoScopeMode
     */
    public String getRepoScopeMode() {
        return repoScopeMode;
    }

    public void setRepoScopeMode(String repoScopeMode) {
        this.repoScopeMode = repoScopeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetentionRuleResponseBody that = (RetentionRuleResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.disabled, that.disabled) && Objects.equals(this.action, that.action)
            && Objects.equals(this.template, that.template) && Objects.equals(this.params, that.params)
            && Objects.equals(this.tagSelectors, that.tagSelectors)
            && Objects.equals(this.scopeSelectors, that.scopeSelectors)
            && Objects.equals(this.repoScopeMode, that.repoScopeMode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, priority, disabled, action, template, params, tagSelectors, scopeSelectors, repoScopeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetentionRuleResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    tagSelectors: ").append(toIndentedString(tagSelectors)).append("\n");
        sb.append("    scopeSelectors: ").append(toIndentedString(scopeSelectors)).append("\n");
        sb.append("    repoScopeMode: ").append(toIndentedString(repoScopeMode)).append("\n");
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
