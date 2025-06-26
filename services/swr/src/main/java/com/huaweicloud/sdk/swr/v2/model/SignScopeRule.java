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
 * SignScopeRule
 */
public class SignScopeRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_selectors")

    private List<SignRuleSelector> tagSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_selectors")

    private Map<String, List<SignRuleSelector>> scopeSelectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_scope_mode")

    private String repoScopeMode;

    public SignScopeRule withTagSelectors(List<SignRuleSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
        return this;
    }

    public SignScopeRule addTagSelectorsItem(SignRuleSelector tagSelectorsItem) {
        if (this.tagSelectors == null) {
            this.tagSelectors = new ArrayList<>();
        }
        this.tagSelectors.add(tagSelectorsItem);
        return this;
    }

    public SignScopeRule withTagSelectors(Consumer<List<SignRuleSelector>> tagSelectorsSetter) {
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
    public List<SignRuleSelector> getTagSelectors() {
        return tagSelectors;
    }

    public void setTagSelectors(List<SignRuleSelector> tagSelectors) {
        this.tagSelectors = tagSelectors;
    }

    public SignScopeRule withScopeSelectors(Map<String, List<SignRuleSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
        return this;
    }

    public SignScopeRule putScopeSelectorsItem(String key, List<SignRuleSelector> scopeSelectorsItem) {
        if (this.scopeSelectors == null) {
            this.scopeSelectors = new HashMap<>();
        }
        this.scopeSelectors.put(key, scopeSelectorsItem);
        return this;
    }

    public SignScopeRule withScopeSelectors(Consumer<Map<String, List<SignRuleSelector>>> scopeSelectorsSetter) {
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
    public Map<String, List<SignRuleSelector>> getScopeSelectors() {
        return scopeSelectors;
    }

    public void setScopeSelectors(Map<String, List<SignRuleSelector>> scopeSelectors) {
        this.scopeSelectors = scopeSelectors;
    }

    public SignScopeRule withRepoScopeMode(String repoScopeMode) {
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
        SignScopeRule that = (SignScopeRule) obj;
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
        sb.append("class SignScopeRule {\n");
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
