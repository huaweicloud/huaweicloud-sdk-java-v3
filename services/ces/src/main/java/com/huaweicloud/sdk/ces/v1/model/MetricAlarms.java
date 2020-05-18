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
import com.huaweicloud.sdk.ces.v1.model.MetricInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * MetricAlarms
 */
public class MetricAlarms  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_name")
    
    private String alarmName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_description")
    
    private String alarmDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric")
    
    private MetricInfo metric = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    
    private Condition condition = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_enabled")
    
    private Boolean alarmEnabled;


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
    @JsonProperty(value="alarm_action_enabled")
    
    private Boolean alarmActionEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_actions")
    
    private List<AlarmActions> alarmActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ok_actions")
    
    private List<AlarmActions> okActions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_id")
    
    private String alarmId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private Long updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_state")
    
    private String alarmState;

    public MetricAlarms withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    


    /**
     * 告警名称。
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public MetricAlarms withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    


    /**
     * 告警描述。
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public MetricAlarms withMetric(MetricInfo metric) {
        this.metric = metric;
        return this;
    }

    public MetricAlarms withMetric(Consumer<MetricInfo> metricSetter) {
        if(this.metric == null ){
            this.metric = new MetricInfo();
        }
        metricSetter.accept(this.metric);
        return this;
    }


    /**
     * Get metric
     * @return metric
     */
    public MetricInfo getMetric() {
        return metric;
    }

    public void setMetric(MetricInfo metric) {
        this.metric = metric;
    }

    public MetricAlarms withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public MetricAlarms withCondition(Consumer<Condition> conditionSetter) {
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

    public MetricAlarms withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    


    /**
     * 是否启用该条告警。
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public MetricAlarms withAlarmLevel(Integer alarmLevel) {
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

    public MetricAlarms withAlarmType(AlarmTypeEnum alarmType) {
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

    public MetricAlarms withAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
        return this;
    }

    


    /**
     * 是否启用该条告警触发的动作。
     * @return alarmActionEnabled
     */
    public Boolean getAlarmActionEnabled() {
        return alarmActionEnabled;
    }

    public void setAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
    }

    public MetricAlarms withAlarmActions(List<AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    
    public MetricAlarms addAlarmActionsItem(AlarmActions alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public MetricAlarms withAlarmActions(Consumer<List<AlarmActions>> alarmActionsSetter) {
        if(this.alarmActions == null ){
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * 告警触发的动作。  结构如下：  {  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  }  type取值： notification：通知。 autoscaling：弹性伸缩。 notificationList：告警状态发生变化时，被通知对象的列表。
     * @return alarmActions
     */
    public List<AlarmActions> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public MetricAlarms withOkActions(List<AlarmActions> okActions) {
        this.okActions = okActions;
        return this;
    }

    
    public MetricAlarms addOkActionsItem(AlarmActions okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public MetricAlarms withOkActions(Consumer<List<AlarmActions>> okActionsSetter) {
        if(this.okActions == null ){
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * 告警恢复触发的动作。  结构如下：  {  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  }  type取值：  notification：通知。  notificationList：告警状态发生变化时，被通知对象的列表。
     * @return okActions
     */
    public List<AlarmActions> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<AlarmActions> okActions) {
        this.okActions = okActions;
    }

    public MetricAlarms withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    


    /**
     * 告警规则的ID。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public MetricAlarms withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 告警状态变更的时间，UNIX时间戳，单位毫秒。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public MetricAlarms withAlarmState(String alarmState) {
        this.alarmState = alarmState;
        return this;
    }

    


    /**
     * 告警状态，取值说明：  ok，正常 alarm，告警 insufficient_data，数据不足
     * @return alarmState
     */
    public String getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(String alarmState) {
        this.alarmState = alarmState;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricAlarms metricAlarms = (MetricAlarms) o;
        return Objects.equals(this.alarmName, metricAlarms.alarmName) &&
            Objects.equals(this.alarmDescription, metricAlarms.alarmDescription) &&
            Objects.equals(this.metric, metricAlarms.metric) &&
            Objects.equals(this.condition, metricAlarms.condition) &&
            Objects.equals(this.alarmEnabled, metricAlarms.alarmEnabled) &&
            Objects.equals(this.alarmLevel, metricAlarms.alarmLevel) &&
            Objects.equals(this.alarmType, metricAlarms.alarmType) &&
            Objects.equals(this.alarmActionEnabled, metricAlarms.alarmActionEnabled) &&
            Objects.equals(this.alarmActions, metricAlarms.alarmActions) &&
            Objects.equals(this.okActions, metricAlarms.okActions) &&
            Objects.equals(this.alarmId, metricAlarms.alarmId) &&
            Objects.equals(this.updateTime, metricAlarms.updateTime) &&
            Objects.equals(this.alarmState, metricAlarms.alarmState);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alarmName, alarmDescription, metric, condition, alarmEnabled, alarmLevel, alarmType, alarmActionEnabled, alarmActions, okActions, alarmId, updateTime, alarmState);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricAlarms {\n");
            sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
            sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
            sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
            sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
            sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
            sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
            sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
            sb.append("    alarmActionEnabled: ").append(toIndentedString(alarmActionEnabled)).append("\n");
            sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
            sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
            sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
            sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
            sb.append("    alarmState: ").append(toIndentedString(alarmState)).append("\n");
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

