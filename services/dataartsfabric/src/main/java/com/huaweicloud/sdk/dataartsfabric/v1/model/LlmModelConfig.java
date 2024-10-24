package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LlmModelConfig
 */
public class LlmModelConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_model_type")

    private String baseModelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_path")

    private String modelPath;

    public LlmModelConfig withBaseModelType(String baseModelType) {
        this.baseModelType = baseModelType;
        return this;
    }

    /**
     * 类型请从ListBaseModels列举基模型接口响应中获取
     * @return baseModelType
     */
    public String getBaseModelType() {
        return baseModelType;
    }

    public void setBaseModelType(String baseModelType) {
        this.baseModelType = baseModelType;
    }

    public LlmModelConfig withModelPath(String modelPath) {
        this.modelPath = modelPath;
        return this;
    }

    /**
     * 模型文件路径
     * @return modelPath
     */
    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LlmModelConfig that = (LlmModelConfig) obj;
        return Objects.equals(this.baseModelType, that.baseModelType) && Objects.equals(this.modelPath, that.modelPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseModelType, modelPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LlmModelConfig {\n");
        sb.append("    baseModelType: ").append(toIndentedString(baseModelType)).append("\n");
        sb.append("    modelPath: ").append(toIndentedString(modelPath)).append("\n");
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
