package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通道信息
 */
public class ChannelCreateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_description")

    private String channelDescription;

    public ChannelCreateInfo withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 通道名称，字符串长度4-24，必须包含a-z，0-9，以小写字母开头，以小写字母或者数字结尾
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ChannelCreateInfo withChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
        return this;
    }

    /**
     * 通道描述
     * @return channelDescription
     */
    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelCreateInfo channelCreateInfo = (ChannelCreateInfo) o;
        return Objects.equals(this.channelName, channelCreateInfo.channelName)
            && Objects.equals(this.channelDescription, channelCreateInfo.channelDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelName, channelDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelCreateInfo {\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    channelDescription: ").append(toIndentedString(channelDescription)).append("\n");
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
