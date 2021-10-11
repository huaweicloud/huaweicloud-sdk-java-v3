package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListEntityMetricRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListEntityMetricRequestBody body;

    public ListEntityMetricRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /** 区块链服务id [目前不支持IEF实例](tag:hasief)
     * 
     * @return blockchainId */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public ListEntityMetricRequest withBody(ListEntityMetricRequestBody body) {
        this.body = body;
        return this;
    }

    public ListEntityMetricRequest withBody(Consumer<ListEntityMetricRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListEntityMetricRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ListEntityMetricRequestBody getBody() {
        return body;
    }

    public void setBody(ListEntityMetricRequestBody body) {
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
        ListEntityMetricRequest listEntityMetricRequest = (ListEntityMetricRequest) o;
        return Objects.equals(this.blockchainId, listEntityMetricRequest.blockchainId)
            && Objects.equals(this.body, listEntityMetricRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntityMetricRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
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
