package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数配置模板差异列表
 */
public class ListDiffDetailsResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_value")
    
    
    private String sourceValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_value")
    
    
    private String targetValue;

    public ListDiffDetailsResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListDiffDetailsResult withSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
        return this;
    }

    


    /**
     * 比较参数组的参数值。
     * @return sourceValue
     */
    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }

    

    public ListDiffDetailsResult withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    


    /**
     * 目标参数组的参数值。
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDiffDetailsResult listDiffDetailsResult = (ListDiffDetailsResult) o;
        return Objects.equals(this.name, listDiffDetailsResult.name) &&
            Objects.equals(this.sourceValue, listDiffDetailsResult.sourceValue) &&
            Objects.equals(this.targetValue, listDiffDetailsResult.targetValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, sourceValue, targetValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiffDetailsResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceValue: ").append(toIndentedString(sourceValue)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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

