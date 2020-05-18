package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.AlarmActions;
import com.huaweicloud.sdk.ces.v1.model.Condition;
import com.huaweicloud.sdk.ces.v1.model.MetricInfoExt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateAlarmRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_name")
    
    private String alarmName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_description")
    
    private String alarmDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric")
    
    private MetricInfoExt metric = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    
    private Condition condition = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_enabled")
    
    private Boolean alarmEnabled = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_action_enabled")
    
    private Boolean alarmActionEnabled = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_level")
    
    private Integer alarmLevel;
    /**
     * 告警类型。 仅针对事件告警的参数，枚举类型：EVENT.SYS或者EVENT.CUSTOM
     */
    public static class AlarmTypeEnum {

        
        /**
         * Enum EVENT_SYS for value: "EVENT.SYS"
         */
        public static final AlarmTypeEnum EVENT_SYS = new AlarmTypeEnum("EVENT.SYS");

        
        /**
         * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
         */
        public static final AlarmTypeEnum EVENT_CUSTOM = new AlarmTypeEnum("EVENT.CUSTOM");

        

        public static Map<String, AlarmTypeEnum> staticFields =
                new HashMap<String, AlarmTypeEnum>() {
                    { 
                        put("EVENT.SYS", EVENT_SYS);
                        put("EVENT.CUSTOM", EVENT_CUSTOM);
                    }
                };

        private String value;

        AlarmTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AlarmTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            AlarmTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new AlarmTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static AlarmTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AlarmTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AlarmTypeEnum) {
                return this.value.equals(((AlarmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_type")
    
    private AlarmTypeEnum alarmType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_actions")
    
    private List<AlarmActions> alarmActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="insufficientdata_actions")
    
    private List<AlarmActions> insufficientdataActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ok_actions")
    
    private List<AlarmActions> okActions = null;
    
    public CreateAlarmRequestBody withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    


    /**
     * 告警名称，只能包含0-9/a-z/A-Z/_/-或汉字。
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public CreateAlarmRequestBody withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    


    /**
     * 
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public CreateAlarmRequestBody withMetric(MetricInfoExt metric) {
        this.metric = metric;
        return this;
    }

    public CreateAlarmRequestBody withMetric(Consumer<MetricInfoExt> metricSetter) {
        if(this.metric == null ){
            this.metric = new MetricInfoExt();
        }
        metricSetter.accept(this.metric);
        return this;
    }


    /**
     * Get metric
     * @return metric
     */
    public MetricInfoExt getMetric() {
        return metric;
    }

    public void setMetric(MetricInfoExt metric) {
        this.metric = metric;
    }

    public CreateAlarmRequestBody withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public CreateAlarmRequestBody withCondition(Consumer<Condition> conditionSetter) {
        if(this.condition == null ){
            this.condition = new Condition();
        }
        conditionSetter.accept(this.condition);
        return this;
    }


    /**
     * Get condition
     * @return condition
     */
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public CreateAlarmRequestBody withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    


    /**
     * 是否启用该条告警，默认为true。
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public CreateAlarmRequestBody withAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
        return this;
    }

    


    /**
     * 是否启用该条告警触发的动作，默认为true。注：若alarm_action_enabled为true，对应的alarm_actions、ok_actions至少有一个不能为空。若alarm_actions、ok_actions同时存在时，notificationList值保持一致。
     * @return alarmActionEnabled
     */
    public Boolean getAlarmActionEnabled() {
        return alarmActionEnabled;
    }

    public void setAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
    }

    public CreateAlarmRequestBody withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    


    /**
     * 告警级别，默认为2，级别为1、2、3、4。分别对应紧急、重要、次要、提示。
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public CreateAlarmRequestBody withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    


    /**
     * 告警类型。 仅针对事件告警的参数，枚举类型：EVENT.SYS或者EVENT.CUSTOM
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    public CreateAlarmRequestBody withAlarmActions(List<AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    
    public CreateAlarmRequestBody addAlarmActionsItem(AlarmActions alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public CreateAlarmRequestBody withAlarmActions(Consumer<List<AlarmActions>> alarmActionsSetter) {
        if(this.alarmActions == null ){
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * 告警触发的动作。 结构样例如下： { \"type\": \"notification\",\"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"] } type取值： notification：通知。 autoscaling：弹性伸缩。
     * @return alarmActions
     */
    public List<AlarmActions> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public CreateAlarmRequestBody withInsufficientdataActions(List<AlarmActions> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
        return this;
    }

    
    public CreateAlarmRequestBody addInsufficientdataActionsItem(AlarmActions insufficientdataActionsItem) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        this.insufficientdataActions.add(insufficientdataActionsItem);
        return this;
    }

    public CreateAlarmRequestBody withInsufficientdataActions(Consumer<List<AlarmActions>> insufficientdataActionsSetter) {
        if(this.insufficientdataActions == null ){
            this.insufficientdataActions = new ArrayList<>();
        }
        insufficientdataActionsSetter.accept(this.insufficientdataActions);
        return this;
    }

    /**
     * 数据不足触发的动作（该参数已废弃，建议无需配置）。
     * @return insufficientdataActions
     */
    public List<AlarmActions> getInsufficientdataActions() {
        return insufficientdataActions;
    }

    public void setInsufficientdataActions(List<AlarmActions> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
    }

    public CreateAlarmRequestBody withOkActions(List<AlarmActions> okActions) {
        this.okActions = okActions;
        return this;
    }

    
    public CreateAlarmRequestBody addOkActionsItem(AlarmActions okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public CreateAlarmRequestBody withOkActions(Consumer<List<AlarmActions>> okActionsSetter) {
        if(this.okActions == null ){
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * 告警恢复触发的动作
     * @return okActions
     */
    public List<AlarmActions> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<AlarmActions> okActions) {
        this.okActions = okActions;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAlarmRequestBody createAlarmRequestBody = (CreateAlarmRequestBody) o;
        return Objects.equals(this.alarmName, createAlarmRequestBody.alarmName) &&
            Objects.equals(this.alarmDescription, createAlarmRequestBody.alarmDescription) &&
            Objects.equals(this.metric, createAlarmRequestBody.metric) &&
            Objects.equals(this.condition, createAlarmRequestBody.condition) &&
            Objects.equals(this.alarmEnabled, createAlarmRequestBody.alarmEnabled) &&
            Objects.equals(this.alarmActionEnabled, createAlarmRequestBody.alarmActionEnabled) &&
            Objects.equals(this.alarmLevel, createAlarmRequestBody.alarmLevel) &&
            Objects.equals(this.alarmType, createAlarmRequestBody.alarmType) &&
            Objects.equals(this.alarmActions, createAlarmRequestBody.alarmActions) &&
            Objects.equals(this.insufficientdataActions, createAlarmRequestBody.insufficientdataActions) &&
            Objects.equals(this.okActions, createAlarmRequestBody.okActions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alarmName, alarmDescription, metric, condition, alarmEnabled, alarmActionEnabled, alarmLevel, alarmType, alarmActions, insufficientdataActions, okActions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlarmRequestBody {\n");
            sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
            sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
            sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
            sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
            sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
            sb.append("    alarmActionEnabled: ").append(toIndentedString(alarmActionEnabled)).append("\n");
            sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
            sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
            sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
            sb.append("    insufficientdataActions: ").append(toIndentedString(insufficientdataActions)).append("\n");
            sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
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

