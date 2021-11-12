package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchRemoveOrgsFromChannelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchRemoveOrgsFromChannelRequestBody body;

    public BatchRemoveOrgsFromChannelRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /** 区块链服务id。
     * 
     * @return blockchainId */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public BatchRemoveOrgsFromChannelRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /** 区块链通道名称。
     * 
     * @return channelId */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public BatchRemoveOrgsFromChannelRequest withBody(BatchRemoveOrgsFromChannelRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchRemoveOrgsFromChannelRequest withBody(Consumer<BatchRemoveOrgsFromChannelRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchRemoveOrgsFromChannelRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchRemoveOrgsFromChannelRequestBody getBody() {
        return body;
    }

    public void setBody(BatchRemoveOrgsFromChannelRequestBody body) {
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
        BatchRemoveOrgsFromChannelRequest batchRemoveOrgsFromChannelRequest = (BatchRemoveOrgsFromChannelRequest) o;
        return Objects.equals(this.blockchainId, batchRemoveOrgsFromChannelRequest.blockchainId)
            && Objects.equals(this.channelId, batchRemoveOrgsFromChannelRequest.channelId)
            && Objects.equals(this.body, batchRemoveOrgsFromChannelRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, channelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemoveOrgsFromChannelRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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
