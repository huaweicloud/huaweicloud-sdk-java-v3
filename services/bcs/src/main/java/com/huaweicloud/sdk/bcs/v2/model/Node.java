package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Node */
public class Node {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_port")

    private String ipPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private List<String> channels = null;

    public Node withIpPort(String ipPort) {
        this.ipPort = ipPort;
        return this;
    }

    /** 节点EIP信息
     * 
     * @return ipPort */
    public String getIpPort() {
        return ipPort;
    }

    public void setIpPort(String ipPort) {
        this.ipPort = ipPort;
    }

    public Node withChannels(List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Node addChannelsItem(String channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    public Node withChannels(Consumer<List<String>> channelsSetter) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        channelsSetter.accept(this.channels);
        return this;
    }

    /** 节点所在通道数组
     * 
     * @return channels */
    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
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
        Node node = (Node) o;
        return Objects.equals(this.ipPort, node.ipPort) && Objects.equals(this.channels, node.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipPort, channels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Node {\n");
        sb.append("    ipPort: ").append(toIndentedString(ipPort)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
