package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.ChannelCreateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建通道的配置
 */
public class BatchCreateChannelsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channels")
    
    private List<ChannelCreateInfo> channels = null;
    
    public BatchCreateChannelsRequestBody withChannels(List<ChannelCreateInfo> channels) {
        this.channels = channels;
        return this;
    }

    
    public BatchCreateChannelsRequestBody addChannelsItem(ChannelCreateInfo channelsItem) {
        if(this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public BatchCreateChannelsRequestBody withChannels(Consumer<List<ChannelCreateInfo>> channelsSetter) {
        if(this.channels == null) {
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /**
     * 通道列表
     * @return channels
     */
    public List<ChannelCreateInfo> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelCreateInfo> channels) {
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
        BatchCreateChannelsRequestBody batchCreateChannelsRequestBody = (BatchCreateChannelsRequestBody) o;
        return Objects.equals(this.channels, batchCreateChannelsRequestBody.channels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(channels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateChannelsRequestBody {\n");
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

