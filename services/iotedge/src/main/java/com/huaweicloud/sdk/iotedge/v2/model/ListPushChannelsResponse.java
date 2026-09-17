package com.huaweicloud.sdk.iotedge.v2.model;

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
public class ListPushChannelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private List<ChannelDTO> channels = null;

    public ListPushChannelsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListPushChannelsResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPushChannelsResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDTO();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListPushChannelsResponse withChannels(List<ChannelDTO> channels) {
        this.channels = channels;
        return this;
    }

    public ListPushChannelsResponse addChannelsItem(ChannelDTO channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public ListPushChannelsResponse withChannels(Consumer<List<ChannelDTO>> channelsSetter) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /**
     * 通道信息
     * @return channels
     */
    public List<ChannelDTO> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelDTO> channels) {
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
        ListPushChannelsResponse that = (ListPushChannelsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.channels, that.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, channels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPushChannelsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
