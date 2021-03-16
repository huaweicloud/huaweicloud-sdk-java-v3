package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.AlarmTemplateCondition;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建自定义告警模板添加的告警规则。
 */
public class TemplateItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    
    private AlarmTemplateCondition condition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_level")
    
    private Integer alarmLevel;

    public TemplateItem withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 告警模板添加的监控指标，如弹性云服务器可添加的监控指标为cpu_util等；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public TemplateItem withCondition(AlarmTemplateCondition condition) {
        this.condition = condition;
        return this;
    }

    public TemplateItem withCondition(Consumer<AlarmTemplateCondition> conditionSetter) {
        if(this.condition == null ){
            this.condition = new AlarmTemplateCondition();
            conditionSetter.accept(this.condition);
        }
        
        return this;
    }


    /**
     * Get condition
     * @return condition
     */
    public AlarmTemplateCondition getCondition() {
        return condition;
    }

    public void setCondition(AlarmTemplateCondition condition) {
        this.condition = condition;
    }

    

    public TemplateItem withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    


    /**
     * 设置告警级别，值为1,2,3,4；1为紧急，2为重要，3为次要，4为提示。
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateItem templateItem = (TemplateItem) o;
        return Objects.equals(this.metricName, templateItem.metricName) &&
            Objects.equals(this.condition, templateItem.condition) &&
            Objects.equals(this.alarmLevel, templateItem.alarmLevel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metricName, condition, alarmLevel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateItem {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
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

