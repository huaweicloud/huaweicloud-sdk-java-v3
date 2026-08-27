package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListImChannelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "im_channels")

    private List<ImChannelItem> imChannels = null;

    public ListImChannelsResponse withImChannels(List<ImChannelItem> imChannels) {
        this.imChannels = imChannels;
        return this;
    }

    public ListImChannelsResponse addImChannelsItem(ImChannelItem imChannelsItem) {
        if (this.imChannels == null) {
            this.imChannels = new ArrayList<>();
        }
        this.imChannels.add(imChannelsItem);
        return this;
    }

    public ListImChannelsResponse withImChannels(Consumer<List<ImChannelItem>> imChannelsSetter) {
        if (this.imChannels == null) {
            this.imChannels = new ArrayList<>();
        }
        imChannelsSetter.accept(this.imChannels);
        return this;
    }

    /**
     * IM 通道配置列表
     * @return imChannels
     */
    public List<ImChannelItem> getImChannels() {
        return imChannels;
    }

    public void setImChannels(List<ImChannelItem> imChannels) {
        this.imChannels = imChannels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImChannelsResponse that = (ListImChannelsResponse) obj;
        return Objects.equals(this.imChannels, that.imChannels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imChannels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImChannelsResponse {\n");
        sb.append("    imChannels: ").append(toIndentedString(imChannels)).append("\n");
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
