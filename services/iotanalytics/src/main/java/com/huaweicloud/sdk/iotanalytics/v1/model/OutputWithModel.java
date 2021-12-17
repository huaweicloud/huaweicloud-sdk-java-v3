package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 输出映射 */
public class OutputWithModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_asset_model_id")

    private String outputAssetModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_asset_model_name")

    private String outputAssetModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_property")

    private String outputProperty;

    public OutputWithModel withName(String name) {
        this.name = name;
        return this;
    }

    /** 输出参数名称,formulas中定义的name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OutputWithModel withOutputAssetModelId(String outputAssetModelId) {
        this.outputAssetModelId = outputAssetModelId;
        return this;
    }

    /** 输出模型ID，如果输出到本模型可以不携带；使用导入模型和导出模型接口时，该字段无效
     * 
     * @return outputAssetModelId */
    public String getOutputAssetModelId() {
        return outputAssetModelId;
    }

    public void setOutputAssetModelId(String outputAssetModelId) {
        this.outputAssetModelId = outputAssetModelId;
    }

    public OutputWithModel withOutputAssetModelName(String outputAssetModelName) {
        this.outputAssetModelName = outputAssetModelName;
        return this;
    }

    /** 输出模型名称，请求中携带该字段时可以不携带output_asset_model_id
     * 
     * @return outputAssetModelName */
    public String getOutputAssetModelName() {
        return outputAssetModelName;
    }

    public void setOutputAssetModelName(String outputAssetModelName) {
        this.outputAssetModelName = outputAssetModelName;
    }

    public OutputWithModel withOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
        return this;
    }

    /** 输出属性名
     * 
     * @return outputProperty */
    public String getOutputProperty() {
        return outputProperty;
    }

    public void setOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputWithModel outputWithModel = (OutputWithModel) o;
        return Objects.equals(this.name, outputWithModel.name)
            && Objects.equals(this.outputAssetModelId, outputWithModel.outputAssetModelId)
            && Objects.equals(this.outputAssetModelName, outputWithModel.outputAssetModelName)
            && Objects.equals(this.outputProperty, outputWithModel.outputProperty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, outputAssetModelId, outputAssetModelName, outputProperty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputWithModel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    outputAssetModelId: ").append(toIndentedString(outputAssetModelId)).append("\n");
        sb.append("    outputAssetModelName: ").append(toIndentedString(outputAssetModelName)).append("\n");
        sb.append("    outputProperty: ").append(toIndentedString(outputProperty)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
