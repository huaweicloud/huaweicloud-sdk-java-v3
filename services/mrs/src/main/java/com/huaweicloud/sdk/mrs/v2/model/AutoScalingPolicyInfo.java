package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AutoScalingPolicyInfo
 */
public class AutoScalingPolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scaling_enable")

    private Boolean autoScalingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_capacity")

    private Integer minCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_capacity")

    private Integer maxCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_plans")

    private List<ResourcesPlan> resourcesPlans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<Rule> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public AutoScalingPolicyInfo withAutoScalingEnable(Boolean autoScalingEnable) {
        this.autoScalingEnable = autoScalingEnable;
        return this;
    }

    /**
     * 当前自动伸缩规则是否开启。
     * @return autoScalingEnable
     */
    public Boolean getAutoScalingEnable() {
        return autoScalingEnable;
    }

    public void setAutoScalingEnable(Boolean autoScalingEnable) {
        this.autoScalingEnable = autoScalingEnable;
    }

    public AutoScalingPolicyInfo withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * 指定该节点组的最小保留节点数。 取值范围：[0～500]
     * minimum: 0
     * maximum: 500
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public AutoScalingPolicyInfo withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * 指定该节点组的最大节点数。 取值范围：[0～500]
     * minimum: 0
     * maximum: 500
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public AutoScalingPolicyInfo withResourcesPlans(List<ResourcesPlan> resourcesPlans) {
        this.resourcesPlans = resourcesPlans;
        return this;
    }

    public AutoScalingPolicyInfo addResourcesPlansItem(ResourcesPlan resourcesPlansItem) {
        if (this.resourcesPlans == null) {
            this.resourcesPlans = new ArrayList<>();
        }
        this.resourcesPlans.add(resourcesPlansItem);
        return this;
    }

    public AutoScalingPolicyInfo withResourcesPlans(Consumer<List<ResourcesPlan>> resourcesPlansSetter) {
        if (this.resourcesPlans == null) {
            this.resourcesPlans = new ArrayList<>();
        }
        resourcesPlansSetter.accept(this.resourcesPlans);
        return this;
    }

    /**
     * 资源计划列表。若该参数为空表示不启用资源计划。  当启用弹性伸缩时，资源计划与自动伸缩规则需至少配置其中一种。
     * @return resourcesPlans
     */
    public List<ResourcesPlan> getResourcesPlans() {
        return resourcesPlans;
    }

    public void setResourcesPlans(List<ResourcesPlan> resourcesPlans) {
        this.resourcesPlans = resourcesPlans;
    }

    public AutoScalingPolicyInfo withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    public AutoScalingPolicyInfo addRulesItem(Rule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public AutoScalingPolicyInfo withRules(Consumer<List<Rule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 自动伸缩的规则列表。 当启用弹性伸缩时，资源计划与自动伸缩规则需至少配置其中一种。
     * @return rules
     */
    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public AutoScalingPolicyInfo withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public AutoScalingPolicyInfo addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AutoScalingPolicyInfo withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 弹性伸缩标签列表
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
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
        AutoScalingPolicyInfo that = (AutoScalingPolicyInfo) obj;
        return Objects.equals(this.autoScalingEnable, that.autoScalingEnable)
            && Objects.equals(this.minCapacity, that.minCapacity) && Objects.equals(this.maxCapacity, that.maxCapacity)
            && Objects.equals(this.resourcesPlans, that.resourcesPlans) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoScalingEnable, minCapacity, maxCapacity, resourcesPlans, rules, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingPolicyInfo {\n");
        sb.append("    autoScalingEnable: ").append(toIndentedString(autoScalingEnable)).append("\n");
        sb.append("    minCapacity: ").append(toIndentedString(minCapacity)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
        sb.append("    resourcesPlans: ").append(toIndentedString(resourcesPlans)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
