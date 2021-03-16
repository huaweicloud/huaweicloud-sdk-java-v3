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
 * 参数服务对象。
 */
public class ServiceCommandPara  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="para_name")
    
    private String paraName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_type")
    
    private String dataType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    
    private Boolean required;


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
    @JsonProperty(value="description")
    
    private String description;

    public ServiceCommandPara withParaName(String paraName) {
        this.paraName = paraName;
        return this;
    }

    


    /**
     * 参数的名称。
     * @return paraName
     */
    public String getParaName() {
        return paraName;
    }

    public void setParaName(String paraName) {
        this.paraName = paraName;
    }

    

    public ServiceCommandPara withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    


    /**
     * 参数的数据类型。取值范围：int，long，decimal，string，DateTime，jsonObject，enum，boolean，string list。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    

    public ServiceCommandPara withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    


    /**
     * 参数是否必选。默认为false。
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    

    public ServiceCommandPara withEnumList(List<String> enumList) {
        this.enumList = enumList;
        return this;
    }

    
    public ServiceCommandPara addEnumListItem(String enumListItem) {
        this.enumList.add(enumListItem);
        return this;
    }

    public ServiceCommandPara withEnumList(Consumer<List<String>> enumListSetter) {
        if(this.enumList == null ){
            this.enumList = new ArrayList<>();
        }
        enumListSetter.accept(this.enumList);
        return this;
    }

    /**
     * 参数的枚举值列表。
     * @return enumList
     */
    public List<String> getEnumList() {
        return enumList;
    }

    public void setEnumList(List<String> enumList) {
        this.enumList = enumList;
    }

    

    public ServiceCommandPara withMin(String min) {
        this.min = min;
        return this;
    }

    


    /**
     * 参数的最小值。
     * @return min
     */
    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    

    public ServiceCommandPara withMax(String max) {
        this.max = max;
        return this;
    }

    


    /**
     * 参数的最大值。
     * @return max
     */
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    

    public ServiceCommandPara withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    


    /**
     * 参数的最大长度。
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    

    public ServiceCommandPara withStep(Double step) {
        this.step = step;
        return this;
    }

    


    /**
     * 参数的步长。
     * @return step
     */
    public Double getStep() {
        return step;
    }

    public void setStep(Double step) {
        this.step = step;
    }

    

    public ServiceCommandPara withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 参数的单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    public ServiceCommandPara withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceCommandPara serviceCommandPara = (ServiceCommandPara) o;
        return Objects.equals(this.paraName, serviceCommandPara.paraName) &&
            Objects.equals(this.dataType, serviceCommandPara.dataType) &&
            Objects.equals(this.required, serviceCommandPara.required) &&
            Objects.equals(this.enumList, serviceCommandPara.enumList) &&
            Objects.equals(this.min, serviceCommandPara.min) &&
            Objects.equals(this.max, serviceCommandPara.max) &&
            Objects.equals(this.maxLength, serviceCommandPara.maxLength) &&
            Objects.equals(this.step, serviceCommandPara.step) &&
            Objects.equals(this.unit, serviceCommandPara.unit) &&
            Objects.equals(this.description, serviceCommandPara.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(paraName, dataType, required, enumList, min, max, maxLength, step, unit, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceCommandPara {\n");
        sb.append("    paraName: ").append(toIndentedString(paraName)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    enumList: ").append(toIndentedString(enumList)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

