package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.Dimension;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 阈值规则查询参数。
 */
public class QueryAlarmResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_enabled")
    
    @JacksonXmlProperty(localName = "action_enabled")
    
    private Boolean actionEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_actions")
    
    @JacksonXmlProperty(localName = "alarm_actions")
    
    private List<String> alarmActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_advice")
    
    @JacksonXmlProperty(localName = "alarm_advice")
    
    private String alarmAdvice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_description")
    
    @JacksonXmlProperty(localName = "alarm_description")
    
    private String alarmDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_level")
    
    @JacksonXmlProperty(localName = "alarm_level")
    
    private String alarmLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_rule_id")
    
    @JacksonXmlProperty(localName = "alarm_rule_id")
    
    private String alarmRuleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_rule_name")
    
    @JacksonXmlProperty(localName = "alarm_rule_name")
    
    private String alarmRuleName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comparison_operator")
    
    @JacksonXmlProperty(localName = "comparison_operator")
    
    private String comparisonOperator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    @JacksonXmlProperty(localName = "dimensions")
    
    private List<Dimension> dimensions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="evaluation_periods")
    
    @JacksonXmlProperty(localName = "evaluation_periods")
    
    private Integer evaluationPeriods;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id_turn_on")
    
    @JacksonXmlProperty(localName = "id_turn_on")
    
    private Boolean idTurnOn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="insufficient_data_actions")
    
    @JacksonXmlProperty(localName = "insufficient_data_actions")
    
    private List<String> insufficientDataActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    @JacksonXmlProperty(localName = "metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    @JacksonXmlProperty(localName = "namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ok_actions")
    
    @JacksonXmlProperty(localName = "ok_actions")
    
    private List<String> okActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    @JacksonXmlProperty(localName = "period")
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_name")
    
    @JacksonXmlProperty(localName = "policy_name")
    
    private String policyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    @JacksonXmlProperty(localName = "resources")
    
    private List<String> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state_reason")
    
    @JacksonXmlProperty(localName = "state_reason")
    
    private String stateReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state_updated_timestamp")
    
    @JacksonXmlProperty(localName = "state_updated_timestamp")
    
    private String stateUpdatedTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state_value")
    
    @JacksonXmlProperty(localName = "state_value")
    
    private String stateValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistic")
    
    @JacksonXmlProperty(localName = "statistic")
    
    private String statistic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    
    @JacksonXmlProperty(localName = "threshold")
    
    private String threshold;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    @JacksonXmlProperty(localName = "unit")
    
    private String unit;

    public QueryAlarmResult withActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
        return this;
    }

    


    /**
     * 是否启用通知。
     * @return actionEnabled
     */
    public Boolean getActionEnabled() {
        return actionEnabled;
    }

    public void setActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
    }

    

    public QueryAlarmResult withAlarmActions(List<String> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    
    public QueryAlarmResult addAlarmActionsItem(String alarmActionsItem) {
        if(this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public QueryAlarmResult withAlarmActions(Consumer<List<String>> alarmActionsSetter) {
        if(this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * 告警状态通知列表。
     * @return alarmActions
     */
    public List<String> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<String> alarmActions) {
        this.alarmActions = alarmActions;
    }

    

    public QueryAlarmResult withAlarmAdvice(String alarmAdvice) {
        this.alarmAdvice = alarmAdvice;
        return this;
    }

    


    /**
     * 告警清除建议。
     * @return alarmAdvice
     */
    public String getAlarmAdvice() {
        return alarmAdvice;
    }

    public void setAlarmAdvice(String alarmAdvice) {
        this.alarmAdvice = alarmAdvice;
    }

    

    public QueryAlarmResult withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    


    /**
     * 阈值规则描述。
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    

    public QueryAlarmResult withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    


    /**
     * 告警级别。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    

    public QueryAlarmResult withAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    


    /**
     * 阈值规则ID。
     * @return alarmRuleId
     */
    public String getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    

    public QueryAlarmResult withAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }

    


    /**
     * 阈值规则名称。
     * @return alarmRuleName
     */
    public String getAlarmRuleName() {
        return alarmRuleName;
    }

    public void setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
    }

    

    public QueryAlarmResult withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    


    /**
     * 极限条件。
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    

    public QueryAlarmResult withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public QueryAlarmResult addDimensionsItem(Dimension dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public QueryAlarmResult withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 时间序列维度。
     * @return dimensions
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    

    public QueryAlarmResult withEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
        return this;
    }

    


    /**
     * 间隔周期。
     * @return evaluationPeriods
     */
    public Integer getEvaluationPeriods() {
        return evaluationPeriods;
    }

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    

    public QueryAlarmResult withIdTurnOn(Boolean idTurnOn) {
        this.idTurnOn = idTurnOn;
        return this;
    }

    


    /**
     * 阈值规则是否启用。
     * @return idTurnOn
     */
    public Boolean getIdTurnOn() {
        return idTurnOn;
    }

    public void setIdTurnOn(Boolean idTurnOn) {
        this.idTurnOn = idTurnOn;
    }

    

    public QueryAlarmResult withInsufficientDataActions(List<String> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
        return this;
    }

    
    public QueryAlarmResult addInsufficientDataActionsItem(String insufficientDataActionsItem) {
        if(this.insufficientDataActions == null) {
            this.insufficientDataActions = new ArrayList<>();
        }
        this.insufficientDataActions.add(insufficientDataActionsItem);
        return this;
    }

    public QueryAlarmResult withInsufficientDataActions(Consumer<List<String>> insufficientDataActionsSetter) {
        if(this.insufficientDataActions == null) {
            this.insufficientDataActions = new ArrayList<>();
        }
        insufficientDataActionsSetter.accept(this.insufficientDataActions);
        return this;
    }

    /**
     * 数据不足通知列表。
     * @return insufficientDataActions
     */
    public List<String> getInsufficientDataActions() {
        return insufficientDataActions;
    }

    public void setInsufficientDataActions(List<String> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
    }

    

    public QueryAlarmResult withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 时间序列名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public QueryAlarmResult withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 时间序列命名空间。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public QueryAlarmResult withOkActions(List<String> okActions) {
        this.okActions = okActions;
        return this;
    }

    
    public QueryAlarmResult addOkActionsItem(String okActionsItem) {
        if(this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public QueryAlarmResult withOkActions(Consumer<List<String>> okActionsSetter) {
        if(this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * 正常状态通知列表。
     * @return okActions
     */
    public List<String> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<String> okActions) {
        this.okActions = okActions;
    }

    

    public QueryAlarmResult withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    


    /**
     * 统计周期。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    

    public QueryAlarmResult withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    


    /**
     * 阈值规则模板名称。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    

    public QueryAlarmResult withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    
    public QueryAlarmResult addResourcesItem(String resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public QueryAlarmResult withResources(Consumer<List<String>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源信息(已废弃)。
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    

    public QueryAlarmResult withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    


    /**
     * 原因描述。
     * @return stateReason
     */
    public String getStateReason() {
        return stateReason;
    }

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    

    public QueryAlarmResult withStateUpdatedTimestamp(String stateUpdatedTimestamp) {
        this.stateUpdatedTimestamp = stateUpdatedTimestamp;
        return this;
    }

    


    /**
     * 状态更新时间戳。
     * @return stateUpdatedTimestamp
     */
    public String getStateUpdatedTimestamp() {
        return stateUpdatedTimestamp;
    }

    public void setStateUpdatedTimestamp(String stateUpdatedTimestamp) {
        this.stateUpdatedTimestamp = stateUpdatedTimestamp;
    }

    

    public QueryAlarmResult withStateValue(String stateValue) {
        this.stateValue = stateValue;
        return this;
    }

    


    /**
     * 服务状态。
     * @return stateValue
     */
    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    

    public QueryAlarmResult withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    


    /**
     * 统计方式。
     * @return statistic
     */
    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    

    public QueryAlarmResult withThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 临界值。
     * @return threshold
     */
    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    

    public QueryAlarmResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 阈值规则类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public QueryAlarmResult withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 阈值单元。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryAlarmResult queryAlarmResult = (QueryAlarmResult) o;
        return Objects.equals(this.actionEnabled, queryAlarmResult.actionEnabled) &&
            Objects.equals(this.alarmActions, queryAlarmResult.alarmActions) &&
            Objects.equals(this.alarmAdvice, queryAlarmResult.alarmAdvice) &&
            Objects.equals(this.alarmDescription, queryAlarmResult.alarmDescription) &&
            Objects.equals(this.alarmLevel, queryAlarmResult.alarmLevel) &&
            Objects.equals(this.alarmRuleId, queryAlarmResult.alarmRuleId) &&
            Objects.equals(this.alarmRuleName, queryAlarmResult.alarmRuleName) &&
            Objects.equals(this.comparisonOperator, queryAlarmResult.comparisonOperator) &&
            Objects.equals(this.dimensions, queryAlarmResult.dimensions) &&
            Objects.equals(this.evaluationPeriods, queryAlarmResult.evaluationPeriods) &&
            Objects.equals(this.idTurnOn, queryAlarmResult.idTurnOn) &&
            Objects.equals(this.insufficientDataActions, queryAlarmResult.insufficientDataActions) &&
            Objects.equals(this.metricName, queryAlarmResult.metricName) &&
            Objects.equals(this.namespace, queryAlarmResult.namespace) &&
            Objects.equals(this.okActions, queryAlarmResult.okActions) &&
            Objects.equals(this.period, queryAlarmResult.period) &&
            Objects.equals(this.policyName, queryAlarmResult.policyName) &&
            Objects.equals(this.resources, queryAlarmResult.resources) &&
            Objects.equals(this.stateReason, queryAlarmResult.stateReason) &&
            Objects.equals(this.stateUpdatedTimestamp, queryAlarmResult.stateUpdatedTimestamp) &&
            Objects.equals(this.stateValue, queryAlarmResult.stateValue) &&
            Objects.equals(this.statistic, queryAlarmResult.statistic) &&
            Objects.equals(this.threshold, queryAlarmResult.threshold) &&
            Objects.equals(this.type, queryAlarmResult.type) &&
            Objects.equals(this.unit, queryAlarmResult.unit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionEnabled, alarmActions, alarmAdvice, alarmDescription, alarmLevel, alarmRuleId, alarmRuleName, comparisonOperator, dimensions, evaluationPeriods, idTurnOn, insufficientDataActions, metricName, namespace, okActions, period, policyName, resources, stateReason, stateUpdatedTimestamp, stateValue, statistic, threshold, type, unit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAlarmResult {\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    alarmAdvice: ").append(toIndentedString(alarmAdvice)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    evaluationPeriods: ").append(toIndentedString(evaluationPeriods)).append("\n");
        sb.append("    idTurnOn: ").append(toIndentedString(idTurnOn)).append("\n");
        sb.append("    insufficientDataActions: ").append(toIndentedString(insufficientDataActions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
        sb.append("    stateUpdatedTimestamp: ").append(toIndentedString(stateUpdatedTimestamp)).append("\n");
        sb.append("    stateValue: ").append(toIndentedString(stateValue)).append("\n");
        sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

