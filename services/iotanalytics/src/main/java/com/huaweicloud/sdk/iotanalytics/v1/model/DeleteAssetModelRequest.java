package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAssetModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    @JacksonXmlProperty(localName = "model_id")

    private String modelId;

    public DeleteAssetModelRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 模型ID
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAssetModelRequest deleteAssetModelRequest = (DeleteAssetModelRequest) o;
        return Objects.equals(this.modelId, deleteAssetModelRequest.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAssetModelRequest {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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
