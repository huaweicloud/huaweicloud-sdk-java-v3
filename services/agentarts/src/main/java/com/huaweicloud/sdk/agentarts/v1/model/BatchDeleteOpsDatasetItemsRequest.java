package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteOpsDatasetItemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteOpsDatasetItemsRequestBody body;

    public BatchDeleteOpsDatasetItemsRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：** 评测集的唯一标识符（ID） **约束限制：** 由英文、数字、“-”、“_”组成，长度为1到64个字符。 **取值范围：** 由英文、数字、连字符(-)、下划线(_)组成的1-64位字符串。 **默认取值：** 无。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public BatchDeleteOpsDatasetItemsRequest withBody(BatchDeleteOpsDatasetItemsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteOpsDatasetItemsRequest withBody(Consumer<BatchDeleteOpsDatasetItemsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteOpsDatasetItemsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteOpsDatasetItemsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteOpsDatasetItemsRequestBody body) {
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
        BatchDeleteOpsDatasetItemsRequest that = (BatchDeleteOpsDatasetItemsRequest) obj;
        return Objects.equals(this.datasetId, that.datasetId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteOpsDatasetItemsRequest {\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
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
