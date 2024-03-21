package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOttChannelInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private List<CreateOttChannelInfoReq> channels = null;

    public ListOttChannelInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总频道数
     * minimum: 1
     * maximum: 1024
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOttChannelInfoResponse withChannels(List<CreateOttChannelInfoReq> channels) {
        this.channels = channels;
        return this;
    }

    public ListOttChannelInfoResponse addChannelsItem(CreateOttChannelInfoReq channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public ListOttChannelInfoResponse withChannels(Consumer<List<CreateOttChannelInfoReq>> channelsSetter) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /**
     * 频道信息
     * @return channels
     */
    public List<CreateOttChannelInfoReq> getChannels() {
        return channels;
    }

    public void setChannels(List<CreateOttChannelInfoReq> channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOttChannelInfoResponse that = (ListOttChannelInfoResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.channels, that.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, channels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOttChannelInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
