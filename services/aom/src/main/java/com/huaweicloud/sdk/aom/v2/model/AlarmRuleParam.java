package com.huaweicloud.sdk.aom.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 阈值规则实体
 */
public class AlarmRuleParam  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action_enabled")
    

    private Boolean actionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_actions")
    
    private List<String> alarmActions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_advice")
    

    private String alarmAdvice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_description")
    

    private String alarmDescription;
    /**
     * 告警级别。1：紧急，2：重要，3：一般，4：提示。
     */
    public static final class AlarmLevelEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AlarmLevelEnum NUMBER_1 = new AlarmLevelEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AlarmLevelEnum NUMBER_2 = new AlarmLevelEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final AlarmLevelEnum NUMBER_3 = new AlarmLevelEnum(3);
        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final AlarmLevelEnum NUMBER_4 = new AlarmLevelEnum(4);
        

        private static final Map<Integer, AlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AlarmLevelEnum> createStaticFields() {
            Map<Integer, AlarmLevelEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AlarmLevelEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AlarmLevelEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            AlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AlarmLevelEnum(value);
            }
            return result;
        }

        public static AlarmLevelEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            AlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmLevelEnum) {
                return this.value.equals(((AlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_level")
    

    private AlarmLevelEnum alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_rule_name")
    

    private String alarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comparison_operator")
    

    private String comparisonOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<Dimension> dimensions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="evaluation_periods")
    

    private Integer evaluationPeriods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id_turn_on")
    

    private Boolean idTurnOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="insufficient_data_actions")
    
    private List<String> insufficientDataActions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ok_actions")
    
    private List<String> okActions = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    

    private Integer period;
    /**
     * 统计方式。
     */
    public static final class StatisticEnum {

        
        /**
         * Enum MAXIMUM for value: "maximum"
         */
        public static final StatisticEnum MAXIMUM = new StatisticEnum("maximum");
        
        /**
         * Enum MINIMUM for value: "minimum"
         */
        public static final StatisticEnum MINIMUM = new StatisticEnum("minimum");
        
        /**
         * Enum AVERAGE for value: "average"
         */
        public static final StatisticEnum AVERAGE = new StatisticEnum("average");
        
        /**
         * Enum SUM for value: "sum"
         */
        public static final StatisticEnum SUM = new StatisticEnum("sum");
        
        /**
         * Enum SAMPLECOUNT for value: "sampleCount"
         */
        public static final StatisticEnum SAMPLECOUNT = new StatisticEnum("sampleCount");
        

        private static final Map<String, StatisticEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatisticEnum> createStaticFields() {
            Map<String, StatisticEnum> map = new HashMap<>();
            map.put("maximum", MAXIMUM);
            map.put("minimum", MINIMUM);
            map.put("average", AVERAGE);
            map.put("sum", SUM);
            map.put("sampleCount", SAMPLECOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatisticEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatisticEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatisticEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatisticEnum(value);
            }
            return result;
        }

        public static StatisticEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatisticEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatisticEnum) {
                return this.value.equals(((StatisticEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistic")
    

    private StatisticEnum statistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    

    private String threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    

    private String unit;

    public AlarmRuleParam withActionEnabled(Boolean actionEnabled) {
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

    

    public AlarmRuleParam withAlarmActions(List<String> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    
    public AlarmRuleParam addAlarmActionsItem(String alarmActionsItem) {
        if(this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public AlarmRuleParam withAlarmActions(Consumer<List<String>> alarmActionsSetter) {
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

    

    public AlarmRuleParam withAlarmAdvice(String alarmAdvice) {
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

    

    public AlarmRuleParam withAlarmDescription(String alarmDescription) {
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

    

    public AlarmRuleParam withAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    


    /**
     * 告警级别。1：紧急，2：重要，3：一般，4：提示。
     * @return alarmLevel
     */
    public AlarmLevelEnum getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(AlarmLevelEnum alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    

    public AlarmRuleParam withAlarmRuleName(String alarmRuleName) {
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

    

    public AlarmRuleParam withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    


    /**
     * 超限条件。
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    

    public AlarmRuleParam withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public AlarmRuleParam addDimensionsItem(Dimension dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public AlarmRuleParam withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
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

    

    public AlarmRuleParam withEvaluationPeriods(Integer evaluationPeriods) {
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

    

    public AlarmRuleParam withIdTurnOn(Boolean idTurnOn) {
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

    

    public AlarmRuleParam withInsufficientDataActions(List<String> insufficientDataActions) {
        this.insufficientDataActions = insufficientDataActions;
        return this;
    }

    
    public AlarmRuleParam addInsufficientDataActionsItem(String insufficientDataActionsItem) {
        if(this.insufficientDataActions == null) {
            this.insufficientDataActions = new ArrayList<>();
        }
        this.insufficientDataActions.add(insufficientDataActionsItem);
        return this;
    }

    public AlarmRuleParam withInsufficientDataActions(Consumer<List<String>> insufficientDataActionsSetter) {
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

    

    public AlarmRuleParam withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 时间序列名称。名称长度取值范围为1~255个字符。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public AlarmRuleParam withNamespace(String namespace) {
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

    

    public AlarmRuleParam withOkActions(List<String> okActions) {
        this.okActions = okActions;
        return this;
    }

    
    public AlarmRuleParam addOkActionsItem(String okActionsItem) {
        if(this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public AlarmRuleParam withOkActions(Consumer<List<String>> okActionsSetter) {
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

    

    public AlarmRuleParam withPeriod(Integer period) {
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

    

    public AlarmRuleParam withStatistic(StatisticEnum statistic) {
        this.statistic = statistic;
        return this;
    }

    


    /**
     * 统计方式。
     * @return statistic
     */
    public StatisticEnum getStatistic() {
        return statistic;
    }

    public void setStatistic(StatisticEnum statistic) {
        this.statistic = statistic;
    }

    

    public AlarmRuleParam withThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 超限值。
     * @return threshold
     */
    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    

    public AlarmRuleParam withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 时间序列单位
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
        AlarmRuleParam alarmRuleParam = (AlarmRuleParam) o;
        return Objects.equals(this.actionEnabled, alarmRuleParam.actionEnabled) &&
            Objects.equals(this.alarmActions, alarmRuleParam.alarmActions) &&
            Objects.equals(this.alarmAdvice, alarmRuleParam.alarmAdvice) &&
            Objects.equals(this.alarmDescription, alarmRuleParam.alarmDescription) &&
            Objects.equals(this.alarmLevel, alarmRuleParam.alarmLevel) &&
            Objects.equals(this.alarmRuleName, alarmRuleParam.alarmRuleName) &&
            Objects.equals(this.comparisonOperator, alarmRuleParam.comparisonOperator) &&
            Objects.equals(this.dimensions, alarmRuleParam.dimensions) &&
            Objects.equals(this.evaluationPeriods, alarmRuleParam.evaluationPeriods) &&
            Objects.equals(this.idTurnOn, alarmRuleParam.idTurnOn) &&
            Objects.equals(this.insufficientDataActions, alarmRuleParam.insufficientDataActions) &&
            Objects.equals(this.metricName, alarmRuleParam.metricName) &&
            Objects.equals(this.namespace, alarmRuleParam.namespace) &&
            Objects.equals(this.okActions, alarmRuleParam.okActions) &&
            Objects.equals(this.period, alarmRuleParam.period) &&
            Objects.equals(this.statistic, alarmRuleParam.statistic) &&
            Objects.equals(this.threshold, alarmRuleParam.threshold) &&
            Objects.equals(this.unit, alarmRuleParam.unit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actionEnabled, alarmActions, alarmAdvice, alarmDescription, alarmLevel, alarmRuleName, comparisonOperator, dimensions, evaluationPeriods, idTurnOn, insufficientDataActions, metricName, namespace, okActions, period, statistic, threshold, unit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmRuleParam {\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    alarmAdvice: ").append(toIndentedString(alarmAdvice)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
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
        sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

