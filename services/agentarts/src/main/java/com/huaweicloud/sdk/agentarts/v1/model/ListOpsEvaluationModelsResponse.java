package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpsEvaluationModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ListOpsEvaluatorModelsResponseBodyModels> models = null;

    public ListOpsEvaluationModelsResponse withModels(List<ListOpsEvaluatorModelsResponseBodyModels> models) {
        this.models = models;
        return this;
    }

    public ListOpsEvaluationModelsResponse addModelsItem(ListOpsEvaluatorModelsResponseBodyModels modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ListOpsEvaluationModelsResponse withModels(
        Consumer<List<ListOpsEvaluatorModelsResponseBodyModels>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * **参数解释：** 模型信息的列表，包含多个模型的配置参数、阈值范围以及支持的业务场景。 **取值范围：** 符合模型定义的对象数组。 
     * @return models
     */
    public List<ListOpsEvaluatorModelsResponseBodyModels> getModels() {
        return models;
    }

    public void setModels(List<ListOpsEvaluatorModelsResponseBodyModels> models) {
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
        ListOpsEvaluationModelsResponse that = (ListOpsEvaluationModelsResponse) obj;
        return Objects.equals(this.models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationModelsResponse {\n");
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
