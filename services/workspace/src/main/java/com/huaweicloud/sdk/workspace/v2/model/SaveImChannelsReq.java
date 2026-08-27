package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IM 通道配置请求
 */
public class SaveImChannelsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "im_channels")

    private List<ImChannelConfig> imChannels = null;

    public SaveImChannelsReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Agent 实例主键 ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SaveImChannelsReq withImChannels(List<ImChannelConfig> imChannels) {
        this.imChannels = imChannels;
        return this;
    }

    public SaveImChannelsReq addImChannelsItem(ImChannelConfig imChannelsItem) {
        if (this.imChannels == null) {
            this.imChannels = new ArrayList<>();
        }
        this.imChannels.add(imChannelsItem);
        return this;
    }

    public SaveImChannelsReq withImChannels(Consumer<List<ImChannelConfig>> imChannelsSetter) {
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
    public List<ImChannelConfig> getImChannels() {
        return imChannels;
    }

    public void setImChannels(List<ImChannelConfig> imChannels) {
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
        SaveImChannelsReq that = (SaveImChannelsReq) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.imChannels, that.imChannels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imChannels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveImChannelsReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
