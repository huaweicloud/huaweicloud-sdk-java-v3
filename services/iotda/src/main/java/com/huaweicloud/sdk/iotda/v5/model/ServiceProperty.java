package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 属性服务对象。
 */
public class ServiceProperty  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property_name")
    
    private String propertyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    
    private Boolean required = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_type")
    
    private String dataType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enum_list")
    
    private List<String> enumList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min")
    
    private String min;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max")
    
    private String max;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_length")
    
    private Integer maxLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    
    private Double step;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="method")
    
    private String method;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_value")
    
    private Object defaultValue = null;

    public ServiceProperty withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    


    /**
     * 设备属性名称。
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public ServiceProperty withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    


    /**
     * 设备属性是否必选。默认为false。
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ServiceProperty withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    


    /**
     * 设备属性的数据类型。取值范围：int，long，decimal，string，DateTime，jsonObject，enum，boolean，string list。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ServiceProperty withEnumList(List<String> enumList) {
        this.enumList = enumList;
        return this;
    }

    
    public ServiceProperty addEnumListItem(String enumListItem) {
        if (this.enumList == null) {
            this.enumList = new ArrayList<>();
        }
        this.enumList.add(enumListItem);
        return this;
    }

    public ServiceProperty withEnumList(Consumer<List<String>> enumListSetter) {
        if(this.enumList == null ){
            this.enumList = new ArrayList<>();
        }
        enumListSetter.accept(this.enumList);
        return this;
    }

    /**
     * 设备属性的枚举值列表。
     * @return enumList
     */
    public List<String> getEnumList() {
        return enumList;
    }

    public void setEnumList(List<String> enumList) {
        this.enumList = enumList;
    }

    public ServiceProperty withMin(String min) {
        this.min = min;
        return this;
    }

    


    /**
     * 设备属性的最小值。
     * @return min
     */
    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public ServiceProperty withMax(String max) {
        this.max = max;
        return this;
    }

    


    /**
     * 设备属性的最大值。
     * @return max
     */
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public ServiceProperty withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    


    /**
     * 设备属性的最大长度。
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public ServiceProperty withStep(Double step) {
        this.step = step;
        return this;
    }

    


    /**
     * 设备属性的步长。
     * @return step
     */
    public Double getStep() {
        return step;
    }

    public void setStep(Double step) {
        this.step = step;
    }

    public ServiceProperty withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 设备属性的单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ServiceProperty withMethod(String method) {
        this.method = method;
        return this;
    }

    


    /**
     * 设备属性的访问模式。取值范围：RWE，RW，RE，WE，E，W，R。 - R：属性值可读 - W：属性值可写 - E：属性值可订阅，即属性值变化时上报事件 
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ServiceProperty withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 设备属性的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceProperty withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    


    /**
     * 设备属性的默认值。如果设置了默认值，使用该产品创建设备时，会将该属性的默认值写入到该设备的设备影子预期数据中，待设备上线时将该属性默认值下发给设备。
     * @return defaultValue
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceProperty serviceProperty = (ServiceProperty) o;
        return Objects.equals(this.propertyName, serviceProperty.propertyName) &&
            Objects.equals(this.required, serviceProperty.required) &&
            Objects.equals(this.dataType, serviceProperty.dataType) &&
            Objects.equals(this.enumList, serviceProperty.enumList) &&
            Objects.equals(this.min, serviceProperty.min) &&
            Objects.equals(this.max, serviceProperty.max) &&
            Objects.equals(this.maxLength, serviceProperty.maxLength) &&
            Objects.equals(this.step, serviceProperty.step) &&
            Objects.equals(this.unit, serviceProperty.unit) &&
            Objects.equals(this.method, serviceProperty.method) &&
            Objects.equals(this.description, serviceProperty.description) &&
            Objects.equals(this.defaultValue, serviceProperty.defaultValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(propertyName, required, dataType, enumList, min, max, maxLength, step, unit, method, description, defaultValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceProperty {\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    enumList: ").append(toIndentedString(enumList)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

