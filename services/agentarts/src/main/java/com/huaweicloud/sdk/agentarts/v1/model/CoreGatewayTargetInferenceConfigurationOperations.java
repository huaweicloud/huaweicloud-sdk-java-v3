package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CoreGatewayTargetInferenceConfigurationOperations
 */
public class CoreGatewayTargetInferenceConfigurationOperations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<String> models = null;

    public CoreGatewayTargetInferenceConfigurationOperations withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 推理操作的请求路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CoreGatewayTargetInferenceConfigurationOperations withModels(List<String> models) {
        this.models = models;
        return this;
    }

    public CoreGatewayTargetInferenceConfigurationOperations addModelsItem(String modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public CoreGatewayTargetInferenceConfigurationOperations withModels(Consumer<List<String>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 该操作支持的模型列表。
     * @return models
     */
    public List<String> getModels() {
        return models;
    }

    public void setModels(List<String> models) {
        this.models = models;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayTargetInferenceConfigurationOperations that =
            (CoreGatewayTargetInferenceConfigurationOperations) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayTargetInferenceConfigurationOperations {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
