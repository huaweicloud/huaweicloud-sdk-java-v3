package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 节点加入通道 */
public class BatchAddPeersToChannelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_peers")

    private List<BatchAddPeersToChannelRequestBodyChannelPeers> channelPeers = null;

    public BatchAddPeersToChannelRequestBody withChannelPeers(
        List<BatchAddPeersToChannelRequestBodyChannelPeers> channelPeers) {
        this.channelPeers = channelPeers;
        return this;
    }

    public BatchAddPeersToChannelRequestBody addChannelPeersItem(
        BatchAddPeersToChannelRequestBodyChannelPeers channelPeersItem) {
        if (this.channelPeers == null) {
            this.channelPeers = new ArrayList<>();
        }
        this.channelPeers.add(channelPeersItem);
        return this;
    }

    public BatchAddPeersToChannelRequestBody withChannelPeers(
        Consumer<List<BatchAddPeersToChannelRequestBodyChannelPeers>> channelPeersSetter) {
        if (this.channelPeers == null) {
            this.channelPeers = new ArrayList<>();
        }
        channelPeersSetter.accept(this.channelPeers);
        return this;
    }

    /** 加入某个通道的节点信息
     * 
     * @return channelPeers */
    public List<BatchAddPeersToChannelRequestBodyChannelPeers> getChannelPeers() {
        return channelPeers;
    }

    public void setChannelPeers(List<BatchAddPeersToChannelRequestBodyChannelPeers> channelPeers) {
        this.channelPeers = channelPeers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddPeersToChannelRequestBody batchAddPeersToChannelRequestBody = (BatchAddPeersToChannelRequestBody) o;
        return Objects.equals(this.channelPeers, batchAddPeersToChannelRequestBody.channelPeers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelPeers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddPeersToChannelRequestBody {\n");
        sb.append("    channelPeers: ").append(toIndentedString(channelPeers)).append("\n");
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
