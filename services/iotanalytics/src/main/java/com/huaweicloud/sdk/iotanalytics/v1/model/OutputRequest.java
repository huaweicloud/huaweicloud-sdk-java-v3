package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 输出配置请求
 */
public class OutputRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_static_asset_id")

    private String outputStaticAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dynamic_asset_id")

    private String outputDynamicAssetId;

    public OutputRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 输出参数名称,formulas中定义的name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OutputRequest withOutputStaticAssetId(String outputStaticAssetId) {
        this.outputStaticAssetId = outputStaticAssetId;
        return this;
    }

    /**
     * 输出资产ID，填写模型中定义的输出模型对应的某资产ID；创建资产时，如果是输出到本资产的模型，且output_static_asset_id和output_dynamic_asset_id都未配置，则后台自动配置output_static_asset_id为本资产ID；修改资产时，如果output_static_asset_id为null则表示置空
     * @return outputStaticAssetId
     */
    public String getOutputStaticAssetId() {
        return outputStaticAssetId;
    }

    public void setOutputStaticAssetId(String outputStaticAssetId) {
        this.outputStaticAssetId = outputStaticAssetId;
    }

    public OutputRequest withOutputDynamicAssetId(String outputDynamicAssetId) {
        this.outputDynamicAssetId = outputDynamicAssetId;
        return this;
    }

    /**
     * 输出资产ID，填写公式动态生成资产ID，可根据入参获取资产ID，如：GetAssetId(\"assetmodelName1\",\"staticPropertyName1\",paramA)；修改资产时，如果output_static_asset_id为null则表示置空
     * @return outputDynamicAssetId
     */
    public String getOutputDynamicAssetId() {
        return outputDynamicAssetId;
    }

    public void setOutputDynamicAssetId(String outputDynamicAssetId) {
        this.outputDynamicAssetId = outputDynamicAssetId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputRequest outputRequest = (OutputRequest) o;
        return Objects.equals(this.name, outputRequest.name)
            && Objects.equals(this.outputStaticAssetId, outputRequest.outputStaticAssetId)
            && Objects.equals(this.outputDynamicAssetId, outputRequest.outputDynamicAssetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, outputStaticAssetId, outputDynamicAssetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    outputStaticAssetId: ").append(toIndentedString(outputStaticAssetId)).append("\n");
        sb.append("    outputDynamicAssetId: ").append(toIndentedString(outputDynamicAssetId)).append("\n");
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
