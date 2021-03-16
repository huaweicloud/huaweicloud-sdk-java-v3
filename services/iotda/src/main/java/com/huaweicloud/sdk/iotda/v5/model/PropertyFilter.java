package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Strategy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 设备属性过滤信息，自定义结构。
 */
public class PropertyFilter  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operator")
    
    private String operator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy")
    
    private Strategy strategy;

    public PropertyFilter withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 设备属性的路径信息，格式：service_id/DataProperty，例如门磁状态为“DoorWindow/status”。多个属性路径之间以逗号分隔。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public PropertyFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    


    /**
     * 数据比较的操作符，当前支持的操作符有：>，<，>=，<=，=和between:表示数值区间，geo.circle.in:表示圆形区域范围内，geo.circle.out:表示圆形区域范围外。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    

    public PropertyFilter withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 数据比较表达式的右值。与数据比较操作符between联用时，右值表示最小值和最大值，用逗号隔开，如“20,30”表示大于等于20小于30。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public PropertyFilter withStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public PropertyFilter withStrategy(Consumer<Strategy> strategySetter) {
        if(this.strategy == null ){
            this.strategy = new Strategy();
            strategySetter.accept(this.strategy);
        }
        
        return this;
    }


    /**
     * Get strategy
     * @return strategy
     */
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyFilter propertyFilter = (PropertyFilter) o;
        return Objects.equals(this.path, propertyFilter.path) &&
            Objects.equals(this.operator, propertyFilter.operator) &&
            Objects.equals(this.value, propertyFilter.value) &&
            Objects.equals(this.strategy, propertyFilter.strategy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, operator, value, strategy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyFilter {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

