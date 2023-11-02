package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDrugModelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDrugModelReq body;

    public UpdateDrugModelRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 模型id
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public UpdateDrugModelRequest withBody(UpdateDrugModelReq body) {
        this.body = body;
        return this;
    }

    public UpdateDrugModelRequest withBody(Consumer<UpdateDrugModelReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDrugModelReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateDrugModelReq getBody() {
        return body;
    }

    public void setBody(UpdateDrugModelReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDrugModelRequest that = (UpdateDrugModelRequest) obj;
        return Objects.equals(this.modelId, that.modelId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDrugModelRequest {\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
