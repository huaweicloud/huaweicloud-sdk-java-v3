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
 * ScopeRule
 */
public class ScopeRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_selectors")

    private List<RuleSelector> tagSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_selectors")

    private Map<String, List<RuleSelector>> scopeSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_scope_mode")

    private String repoScopeMode;

    public ScopeRule withTagSelectors(List<RuleSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
        return this;
    }

    public ScopeRule addTagSelectorsItem(RuleSelector tagSelectorsItem) {
        if (this.tagSelectors == null) {
            this.tagSelectors = new ArrayList<>();
        }
        this.tagSelectors.add(tagSelectorsItem);
        return this;
    }

    public ScopeRule withTagSelectors(Consumer<List<RuleSelector>> tagSelectorsSetter) {
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

    public ScopeRule withScopeSelectors(Map<String, List<RuleSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
        return this;
    }

    public ScopeRule putScopeSelectorsItem(String key, List<RuleSelector> scopeSelectorsItem) {
        if (this.scopeSelectors == null) {
            this.scopeSelectors = new HashMap<>();
        }
        this.scopeSelectors.put(key, scopeSelectorsItem);
        return this;
    }

    public ScopeRule withScopeSelectors(Consumer<Map<String, List<RuleSelector>>> scopeSelectorsSetter) {
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

    public ScopeRule withRepoScopeMode(String repoScopeMode) {
        this.repoScopeMode = repoScopeMode;
        return this;
    }

    /**
     * repository选择方式。可选regular、selection，前端显示需要，api调用时可选regular
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
        ScopeRule that = (ScopeRule) obj;
        return Objects.equals(this.tagSelectors, that.tagSelectors)
            && Objects.equals(this.scopeSelectors, that.scopeSelectors)
            && Objects.equals(this.repoScopeMode, that.repoScopeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagSelectors, scopeSelectors, repoScopeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScopeRule {\n");
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
