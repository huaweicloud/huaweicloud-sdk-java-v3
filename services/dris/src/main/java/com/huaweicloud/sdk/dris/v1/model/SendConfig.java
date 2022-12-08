package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数说明**：分发通道及目标设备。
 */
public class SendConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private Channel channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_list")

    private TargetList targetList;

    public SendConfig withChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public SendConfig withChannel(Consumer<Channel> channelSetter) {
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

    public SendConfig withTargetList(TargetList targetList) {
        this.targetList = targetList;
        return this;
    }

    public SendConfig withTargetList(Consumer<TargetList> targetListSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendConfig sendConfig = (SendConfig) o;
        return Objects.equals(this.channel, sendConfig.channel)
            && Objects.equals(this.targetList, sendConfig.targetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, targetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendConfig {\n");
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
