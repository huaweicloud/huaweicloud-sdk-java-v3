package com.huaweicloud.sdk.bcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBlockchainChannelsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channels")
    
    private List<Channel> channels = null;
    
    public ListBlockchainChannelsResponse withChannels(List<Channel> channels) {
        this.channels = channels;
        return this;
    }

    
    public ListBlockchainChannelsResponse addChannelsItem(Channel channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public ListBlockchainChannelsResponse withChannels(Consumer<List<Channel>> channelsSetter) {
        if(this.channels == null ){
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /**
     * 通道信息列表
     * @return channels
     */
    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBlockchainChannelsResponse listBlockchainChannelsResponse = (ListBlockchainChannelsResponse) o;
        return Objects.equals(this.channels, listBlockchainChannelsResponse.channels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(channels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBlockchainChannelsResponse {\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

