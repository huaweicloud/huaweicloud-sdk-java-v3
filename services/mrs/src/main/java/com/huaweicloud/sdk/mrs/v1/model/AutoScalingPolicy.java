package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.ResourcesPlan;
import com.huaweicloud.sdk.mrs.v1.model.Rule;
import com.huaweicloud.sdk.mrs.v1.model.ScaleScript;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AutoScalingPolicy
 */
public class AutoScalingPolicy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_scaling_enable")
    
    
    private Boolean autoScalingEnable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_capacity")
    
    
    private Integer minCapacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_capacity")
    
    
    private Integer maxCapacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources_plans")
    
    
    private List<ResourcesPlan> resourcesPlans = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    
    private List<Rule> rules = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exec_scripts")
    
    
    private List<ScaleScript> execScripts = null;
    
    public AutoScalingPolicy withAutoScalingEnable(Boolean autoScalingEnable) {
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

    

    public AutoScalingPolicy withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    


    /**
     * 指定该节点组的最小保留节点数。  取值范围：[0～500]
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

    

    public AutoScalingPolicy withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    


    /**
     * 指定该节点组的最大节点数。  取值范围：[0～500]
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

    

    public AutoScalingPolicy withResourcesPlans(List<ResourcesPlan> resourcesPlans) {
        this.resourcesPlans = resourcesPlans;
        return this;
    }

    
    public AutoScalingPolicy addResourcesPlansItem(ResourcesPlan resourcesPlansItem) {
        if(this.resourcesPlans == null) {
            this.resourcesPlans = new ArrayList<>();
        }
        this.resourcesPlans.add(resourcesPlansItem);
        return this;
    }

    public AutoScalingPolicy withResourcesPlans(Consumer<List<ResourcesPlan>> resourcesPlansSetter) {
        if(this.resourcesPlans == null) {
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

    

    public AutoScalingPolicy withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    
    public AutoScalingPolicy addRulesItem(Rule rulesItem) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public AutoScalingPolicy withRules(Consumer<List<Rule>> rulesSetter) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 自动伸缩的规则列表。  当启用弹性伸缩时，资源计划与自动伸缩规则需至少配置其中一种。
     * @return rules
     */
    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    

    public AutoScalingPolicy withExecScripts(List<ScaleScript> execScripts) {
        this.execScripts = execScripts;
        return this;
    }

    
    public AutoScalingPolicy addExecScriptsItem(ScaleScript execScriptsItem) {
        if(this.execScripts == null) {
            this.execScripts = new ArrayList<>();
        }
        this.execScripts.add(execScriptsItem);
        return this;
    }

    public AutoScalingPolicy withExecScripts(Consumer<List<ScaleScript>> execScriptsSetter) {
        if(this.execScripts == null) {
            this.execScripts = new ArrayList<>();
        }
        execScriptsSetter.accept(this.execScripts);
        return this;
    }

    /**
     * 弹性伸缩自定义自动化脚本列表。若该参数为空表示不启用自动化脚本。
     * @return execScripts
     */
    public List<ScaleScript> getExecScripts() {
        return execScripts;
    }

    public void setExecScripts(List<ScaleScript> execScripts) {
        this.execScripts = execScripts;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoScalingPolicy autoScalingPolicy = (AutoScalingPolicy) o;
        return Objects.equals(this.autoScalingEnable, autoScalingPolicy.autoScalingEnable) &&
            Objects.equals(this.minCapacity, autoScalingPolicy.minCapacity) &&
            Objects.equals(this.maxCapacity, autoScalingPolicy.maxCapacity) &&
            Objects.equals(this.resourcesPlans, autoScalingPolicy.resourcesPlans) &&
            Objects.equals(this.rules, autoScalingPolicy.rules) &&
            Objects.equals(this.execScripts, autoScalingPolicy.execScripts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(autoScalingEnable, minCapacity, maxCapacity, resourcesPlans, rules, execScripts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingPolicy {\n");
        sb.append("    autoScalingEnable: ").append(toIndentedString(autoScalingEnable)).append("\n");
        sb.append("    minCapacity: ").append(toIndentedString(minCapacity)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
        sb.append("    resourcesPlans: ").append(toIndentedString(resourcesPlans)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    execScripts: ").append(toIndentedString(execScripts)).append("\n");
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

