package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchRemovePeersFromChannelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchRemovePeersFromChannelRequestBody body;

    public BatchRemovePeersFromChannelRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * 区块链服务id。可调用“查询服务实例列表”接口获取ID
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public BatchRemovePeersFromChannelRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 区块链通道名称。可调用“查询实例信息”接口获取，接口返回的“channels”中的name字段值
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public BatchRemovePeersFromChannelRequest withBody(BatchRemovePeersFromChannelRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchRemovePeersFromChannelRequest withBody(Consumer<BatchRemovePeersFromChannelRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchRemovePeersFromChannelRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchRemovePeersFromChannelRequestBody getBody() {
        return body;
    }

    public void setBody(BatchRemovePeersFromChannelRequestBody body) {
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
        BatchRemovePeersFromChannelRequest batchRemovePeersFromChannelRequest = (BatchRemovePeersFromChannelRequest) o;
        return Objects.equals(this.blockchainId, batchRemovePeersFromChannelRequest.blockchainId)
            && Objects.equals(this.channelId, batchRemovePeersFromChannelRequest.channelId)
            && Objects.equals(this.body, batchRemovePeersFromChannelRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, channelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemovePeersFromChannelRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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
