package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 外部访问分析详细结果。
 */
public class ExternalAccessDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private List<String> action = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private List<FindingCondition> condition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private FindingPrincipal principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<FindingSourceType> sources = null;

    public ExternalAccessDetails withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public ExternalAccessDetails addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public ExternalAccessDetails withAction(Consumer<List<String>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 允许外部主体使用的操作。
     * @return action
     */
    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public ExternalAccessDetails withCondition(List<FindingCondition> condition) {
        this.condition = condition;
        return this;
    }

    public ExternalAccessDetails addConditionItem(FindingCondition conditionItem) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        this.condition.add(conditionItem);
        return this;
    }

    public ExternalAccessDetails withCondition(Consumer<List<FindingCondition>> conditionSetter) {
        if (this.condition == null) {
            this.condition = new ArrayList<>();
        }
        conditionSetter.accept(this.condition);
        return this;
    }

    /**
     * 分析的策略语句中导致访问分析结果的条件。
     * @return condition
     */
    public List<FindingCondition> getCondition() {
        return condition;
    }

    public void setCondition(List<FindingCondition> condition) {
        this.condition = condition;
    }

    public ExternalAccessDetails withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 表示生成访问分析结果的策略是否允许公共访问资源。
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public ExternalAccessDetails withPrincipal(FindingPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public ExternalAccessDetails withPrincipal(Consumer<FindingPrincipal> principalSetter) {
        if (this.principal == null) {
            this.principal = new FindingPrincipal();
            principalSetter.accept(this.principal);
        }

        return this;
    }

    /**
     * Get principal
     * @return principal
     */
    public FindingPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(FindingPrincipal principal) {
        this.principal = principal;
    }

    public ExternalAccessDetails withSources(List<FindingSourceType> sources) {
        this.sources = sources;
        return this;
    }

    public ExternalAccessDetails addSourcesItem(FindingSourceType sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ExternalAccessDetails withSources(Consumer<List<FindingSourceType>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 访问分析结果的来源，这指示如何授予生成访问分析结果的访问权限。
     * @return sources
     */
    public List<FindingSourceType> getSources() {
        return sources;
    }

    public void setSources(List<FindingSourceType> sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalAccessDetails that = (ExternalAccessDetails) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.isPublic, that.isPublic) && Objects.equals(this.principal, that.principal)
            && Objects.equals(this.sources, that.sources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, condition, isPublic, principal, sources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalAccessDetails {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
