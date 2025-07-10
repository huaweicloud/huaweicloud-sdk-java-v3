package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VirtualChannelOptions
 */
public class VirtualChannelOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_virtual_channel_name")

    private String customVirtualChannelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_plugin_details")

    private String virtualChannelPluginDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_party_plugin_name")

    private String thirdPartyPluginName;

    public VirtualChannelOptions withCustomVirtualChannelName(String customVirtualChannelName) {
        this.customVirtualChannelName = customVirtualChannelName;
        return this;
    }

    /**
     * 自定义虚拟通道注册名。目前仅支持ASCII码字符，长度不能超过65535个字符。
     * @return customVirtualChannelName
     */
    public String getCustomVirtualChannelName() {
        return customVirtualChannelName;
    }

    public void setCustomVirtualChannelName(String customVirtualChannelName) {
        this.customVirtualChannelName = customVirtualChannelName;
    }

    public VirtualChannelOptions withVirtualChannelPluginDetails(String virtualChannelPluginDetails) {
        this.virtualChannelPluginDetails = virtualChannelPluginDetails;
        return this;
    }

    /**
     * 虚拟通道下载配置信息，需Base64加密。加密前目前仅支持ASCII码字符，长度不能超过65535个字符。
     * @return virtualChannelPluginDetails
     */
    public String getVirtualChannelPluginDetails() {
        return virtualChannelPluginDetails;
    }

    public void setVirtualChannelPluginDetails(String virtualChannelPluginDetails) {
        this.virtualChannelPluginDetails = virtualChannelPluginDetails;
    }

    public VirtualChannelOptions withThirdPartyPluginName(String thirdPartyPluginName) {
        this.thirdPartyPluginName = thirdPartyPluginName;
        return this;
    }

    /**
     * 第三方插件名称，长度不能超过65535个字符。
     * @return thirdPartyPluginName
     */
    public String getThirdPartyPluginName() {
        return thirdPartyPluginName;
    }

    public void setThirdPartyPluginName(String thirdPartyPluginName) {
        this.thirdPartyPluginName = thirdPartyPluginName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualChannelOptions that = (VirtualChannelOptions) obj;
        return Objects.equals(this.customVirtualChannelName, that.customVirtualChannelName)
            && Objects.equals(this.virtualChannelPluginDetails, that.virtualChannelPluginDetails)
            && Objects.equals(this.thirdPartyPluginName, that.thirdPartyPluginName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customVirtualChannelName, virtualChannelPluginDetails, thirdPartyPluginName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualChannelOptions {\n");
        sb.append("    customVirtualChannelName: ").append(toIndentedString(customVirtualChannelName)).append("\n");
        sb.append("    virtualChannelPluginDetails: ")
            .append(toIndentedString(virtualChannelPluginDetails))
            .append("\n");
        sb.append("    thirdPartyPluginName: ").append(toIndentedString(thirdPartyPluginName)).append("\n");
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
