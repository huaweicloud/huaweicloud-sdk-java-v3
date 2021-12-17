package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateAssetModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssetModelModRequest body;

    public UpdateAssetModelRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /** 模型ID
     * 
     * @return modelId */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public UpdateAssetModelRequest withBody(AssetModelModRequest body) {
        this.body = body;
        return this;
    }

    public UpdateAssetModelRequest withBody(Consumer<AssetModelModRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AssetModelModRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public AssetModelModRequest getBody() {
        return body;
    }

    public void setBody(AssetModelModRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetModelRequest updateAssetModelRequest = (UpdateAssetModelRequest) o;
        return Objects.equals(this.modelId, updateAssetModelRequest.modelId)
            && Objects.equals(this.body, updateAssetModelRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetModelRequest {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
