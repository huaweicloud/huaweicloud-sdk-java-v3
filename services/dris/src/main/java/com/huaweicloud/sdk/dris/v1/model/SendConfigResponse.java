package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：分发通道选择及目标推送设备的配置。
 */
public class SendConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private Channel channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_list")

    private TargetList targetList;

    public SendConfigResponse withChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public SendConfigResponse withChannel(Consumer<Channel> channelSetter) {
        if (this.channel == null) {
            this.channel = new Channel();
            channelSetter.accept(this.channel);
        }

        return this;
    }

    /**
     * Get channel
     * @return channel
     */
    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public SendConfigResponse withTargetList(TargetList targetList) {
        this.targetList = targetList;
        return this;
    }

    public SendConfigResponse withTargetList(Consumer<TargetList> targetListSetter) {
        if (this.targetList == null) {
            this.targetList = new TargetList();
            targetListSetter.accept(this.targetList);
        }

        return this;
    }

    /**
     * Get targetList
     * @return targetList
     */
    public TargetList getTargetList() {
        return targetList;
    }

    public void setTargetList(TargetList targetList) {
        this.targetList = targetList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendConfigResponse that = (SendConfigResponse) obj;
        return Objects.equals(this.channel, that.channel) && Objects.equals(this.targetList, that.targetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, targetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendConfigResponse {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    targetList: ").append(toIndentedString(targetList)).append("\n");
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
