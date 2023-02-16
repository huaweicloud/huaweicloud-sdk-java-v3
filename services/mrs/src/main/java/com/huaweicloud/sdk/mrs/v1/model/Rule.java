package com.huaweicloud.sdk.mrs.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.Trigger;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Rule
 */
public class Rule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;
    /**
     * 弹性伸缩规则的调整类型，只允许以下类型：  枚举值： - scale_out：扩容 - scale_in：缩容
     */
    public static final class AdjustmentTypeEnum {

        
        /**
         * Enum SCALE_OUT for value: "scale_out"
         */
        public static final AdjustmentTypeEnum SCALE_OUT = new AdjustmentTypeEnum("scale_out");
        
        /**
         * Enum SCALE_IN for value: "scale_in"
         */
        public static final AdjustmentTypeEnum SCALE_IN = new AdjustmentTypeEnum("scale_in");
        

        private static final Map<String, AdjustmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdjustmentTypeEnum> createStaticFields() {
            Map<String, AdjustmentTypeEnum> map = new HashMap<>();
            map.put("scale_out", SCALE_OUT);
            map.put("scale_in", SCALE_IN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdjustmentTypeEnum(String value) {
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
        public static AdjustmentTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AdjustmentTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AdjustmentTypeEnum(value);
            }
            return result;
        }

        public static AdjustmentTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AdjustmentTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdjustmentTypeEnum) {
                return this.value.equals(((AdjustmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjustment_type")
    
    
    private AdjustmentTypeEnum adjustmentType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cool_down_minutes")
    
    
    private Integer coolDownMinutes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_adjustment")
    
    
    private Integer scalingAdjustment;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger")
    
    
    private Trigger trigger;

    public Rule withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 弹性伸缩规则的名称。  只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。  在一个节点组范围内，不允许重名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Rule withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 弹性伸缩规则的说明。  最大长度为1024字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Rule withAdjustmentType(AdjustmentTypeEnum adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    


    /**
     * 弹性伸缩规则的调整类型，只允许以下类型：  枚举值： - scale_out：扩容 - scale_in：缩容
     * @return adjustmentType
     */
    public AdjustmentTypeEnum getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(AdjustmentTypeEnum adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    

    public Rule withCoolDownMinutes(Integer coolDownMinutes) {
        this.coolDownMinutes = coolDownMinutes;
        return this;
    }

    


    /**
     * 触发弹性伸缩规则后，该集群处于冷却状态（不再执行弹性伸缩操作）的时长，单位为分钟。  取值范围[0～10080]，10080为一周的分钟数。
     * minimum: 0
     * maximum: 10080
     * @return coolDownMinutes
     */
    public Integer getCoolDownMinutes() {
        return coolDownMinutes;
    }

    public void setCoolDownMinutes(Integer coolDownMinutes) {
        this.coolDownMinutes = coolDownMinutes;
    }

    

    public Rule withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    


    /**
     * 单次调整集群节点的个数。  取值范围[1～100]
     * minimum: 1
     * maximum: 100
     * @return scalingAdjustment
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }

    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    

    public Rule withTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public Rule withTrigger(Consumer<Trigger> triggerSetter) {
        if(this.trigger == null ){
            this.trigger = new Trigger();
            triggerSetter.accept(this.trigger);
        }
        
        return this;
    }


    /**
     * Get trigger
     * @return trigger
     */
    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rule rule = (Rule) o;
        return Objects.equals(this.name, rule.name) &&
            Objects.equals(this.description, rule.description) &&
            Objects.equals(this.adjustmentType, rule.adjustmentType) &&
            Objects.equals(this.coolDownMinutes, rule.coolDownMinutes) &&
            Objects.equals(this.scalingAdjustment, rule.scalingAdjustment) &&
            Objects.equals(this.trigger, rule.trigger);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, adjustmentType, coolDownMinutes, scalingAdjustment, trigger);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adjustmentType: ").append(toIndentedString(adjustmentType)).append("\n");
        sb.append("    coolDownMinutes: ").append(toIndentedString(coolDownMinutes)).append("\n");
        sb.append("    scalingAdjustment: ").append(toIndentedString(scalingAdjustment)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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

