package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据加工信息
 */
public class TransformationInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transformation_type")
    
    private String transformationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public TransformationInfo withTransformationType(String transformationType) {
        this.transformationType = transformationType;
        return this;
    }

    


    /**
     * - 生成加工规则值为contentConditionalFilter - 生成配置规则值为configConditionalFilter
     * @return transformationType
     */
    public String getTransformationType() {
        return transformationType;
    }

    public void setTransformationType(String transformationType) {
        this.transformationType = transformationType;
    }

    public TransformationInfo withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 过滤条件，生成加工规则值为sql条件语句，生成配置规则值为config。长度限制256。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransformationInfo transformationInfo = (TransformationInfo) o;
        return Objects.equals(this.transformationType, transformationInfo.transformationType) &&
            Objects.equals(this.value, transformationInfo.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(transformationType, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransformationInfo {\n");
        sb.append("    transformationType: ").append(toIndentedString(transformationType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

