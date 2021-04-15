package com.huaweicloud.sdk.ces.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.AlarmActions;
import com.huaweicloud.sdk.ces.v1.model.Condition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateAlarmRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_name")
    
    private String alarmName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_description")
    
    private String alarmDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    
    private Condition condition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_action_enabled")
    
    private Boolean alarmActionEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_level")
    
    private Integer alarmLevel;
    /**
     * 告警类型，支持的枚举类型：EVENT.SYS：针对系统事件的告警规则；EVENT.CUSTOM：针对自定义事件的告警规则；RESOURCE_GROUP：针对资源分组的告警规则。
     */
    public static final class AlarmTypeEnum {

        
        /**
         * Enum EVENT_SYS for value: "EVENT.SYS"
         */
        public static final AlarmTypeEnum EVENT_SYS = new AlarmTypeEnum("EVENT.SYS");
        
        /**
         * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
         */
        public static final AlarmTypeEnum EVENT_CUSTOM = new AlarmTypeEnum("EVENT.CUSTOM");
        
        /**
         * Enum RESOURCE_GROUP for value: "RESOURCE_GROUP"
         */
        public static final AlarmTypeEnum RESOURCE_GROUP = new AlarmTypeEnum("RESOURCE_GROUP");
        

        private static final Map<String, AlarmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmTypeEnum> createStaticFields() {
            Map<String, AlarmTypeEnum> map = new HashMap<>();
            map.put("EVENT.SYS", EVENT_SYS);
            map.put("EVENT.CUSTOM", EVENT_CUSTOM);
            map.put("RESOURCE_GROUP", RESOURCE_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AlarmTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AlarmTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AlarmTypeEnum(value);
            }
            return result;
        }

        public static AlarmTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AlarmTypeEnum result = STATIC_FIELDS.get(value);
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
    
    public UpdateAlarmRequestBody withAlarmName(String alarmName) {
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

    

    public UpdateAlarmRequestBody withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    


    /**
     * 告警描述，长度0-256。
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    

    public UpdateAlarmRequestBody withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public UpdateAlarmRequestBody withCondition(Consumer<Condition> conditionSetter) {
        if(this.condition == null ){
            this.condition = new Condition();
            conditionSetter.accept(this.condition);
        }
        
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

    

    public UpdateAlarmRequestBody withAlarmActionEnabled(Boolean alarmActionEnabled) {
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

    

    public UpdateAlarmRequestBody withAlarmLevel(Integer alarmLevel) {
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

    

    public UpdateAlarmRequestBody withAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    


    /**
     * 告警类型，支持的枚举类型：EVENT.SYS：针对系统事件的告警规则；EVENT.CUSTOM：针对自定义事件的告警规则；RESOURCE_GROUP：针对资源分组的告警规则。
     * @return alarmType
     */
    public AlarmTypeEnum getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(AlarmTypeEnum alarmType) {
        this.alarmType = alarmType;
    }

    

    public UpdateAlarmRequestBody withAlarmActions(List<AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    
    public UpdateAlarmRequestBody addAlarmActionsItem(AlarmActions alarmActionsItem) {
        if(this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public UpdateAlarmRequestBody withAlarmActions(Consumer<List<AlarmActions>> alarmActionsSetter) {
        if(this.alarmActions == null) {
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

    

    public UpdateAlarmRequestBody withInsufficientdataActions(List<AlarmActions> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
        return this;
    }

    
    public UpdateAlarmRequestBody addInsufficientdataActionsItem(AlarmActions insufficientdataActionsItem) {
        if(this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        this.insufficientdataActions.add(insufficientdataActionsItem);
        return this;
    }

    public UpdateAlarmRequestBody withInsufficientdataActions(Consumer<List<AlarmActions>> insufficientdataActionsSetter) {
        if(this.insufficientdataActions == null) {
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

    

    public UpdateAlarmRequestBody withOkActions(List<AlarmActions> okActions) {
        this.okActions = okActions;
        return this;
    }

    
    public UpdateAlarmRequestBody addOkActionsItem(AlarmActions okActionsItem) {
        if(this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public UpdateAlarmRequestBody withOkActions(Consumer<List<AlarmActions>> okActionsSetter) {
        if(this.okActions == null) {
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
        UpdateAlarmRequestBody updateAlarmRequestBody = (UpdateAlarmRequestBody) o;
        return Objects.equals(this.alarmName, updateAlarmRequestBody.alarmName) &&
            Objects.equals(this.alarmDescription, updateAlarmRequestBody.alarmDescription) &&
            Objects.equals(this.condition, updateAlarmRequestBody.condition) &&
            Objects.equals(this.alarmActionEnabled, updateAlarmRequestBody.alarmActionEnabled) &&
            Objects.equals(this.alarmLevel, updateAlarmRequestBody.alarmLevel) &&
            Objects.equals(this.alarmType, updateAlarmRequestBody.alarmType) &&
            Objects.equals(this.alarmActions, updateAlarmRequestBody.alarmActions) &&
            Objects.equals(this.insufficientdataActions, updateAlarmRequestBody.insufficientdataActions) &&
            Objects.equals(this.okActions, updateAlarmRequestBody.okActions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alarmName, alarmDescription, condition, alarmActionEnabled, alarmLevel, alarmType, alarmActions, insufficientdataActions, okActions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmRequestBody {\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

