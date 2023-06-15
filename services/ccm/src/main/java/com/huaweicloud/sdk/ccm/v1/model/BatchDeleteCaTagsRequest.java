package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteCaTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchOperateTagRequestBody body;

    public BatchDeleteCaTagsRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所需要批量删除标签的CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public BatchDeleteCaTagsRequest withBody(BatchOperateTagRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteCaTagsRequest withBody(Consumer<BatchOperateTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchOperateTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchOperateTagRequestBody getBody() {
        return body;
    }

    public void setBody(BatchOperateTagRequestBody body) {
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
        BatchDeleteCaTagsRequest batchDeleteCaTagsRequest = (BatchDeleteCaTagsRequest) o;
        return Objects.equals(this.caId, batchDeleteCaTagsRequest.caId)
            && Objects.equals(this.body, batchDeleteCaTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteCaTagsRequest {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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
