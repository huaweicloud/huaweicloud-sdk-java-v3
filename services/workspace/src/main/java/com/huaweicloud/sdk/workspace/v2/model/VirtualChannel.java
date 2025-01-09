package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VirtualChannel
 */
public class VirtualChannel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_control_enable")

    private Boolean virtualChannelControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private VirtualChannelOptions options;

    public VirtualChannel withVirtualChannelControlEnable(Boolean virtualChannelControlEnable) {
        this.virtualChannelControlEnable = virtualChannelControlEnable;
        return this;
    }

    /**
     * 是否开启虚拟通道策略设置。取值为：false：表示关闭。true：表示开启。
     * @return virtualChannelControlEnable
     */
    public Boolean getVirtualChannelControlEnable() {
        return virtualChannelControlEnable;
    }

    public void setVirtualChannelControlEnable(Boolean virtualChannelControlEnable) {
        this.virtualChannelControlEnable = virtualChannelControlEnable;
    }

    public VirtualChannel withOptions(VirtualChannelOptions options) {
        this.options = options;
        return this;
    }

    public VirtualChannel withOptions(Consumer<VirtualChannelOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new VirtualChannelOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public VirtualChannelOptions getOptions() {
        return options;
    }

    public void setOptions(VirtualChannelOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualChannel that = (VirtualChannel) obj;
        return Objects.equals(this.virtualChannelControlEnable, that.virtualChannelControlEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualChannelControlEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualChannel {\n");
        sb.append("    virtualChannelControlEnable: ")
            .append(toIndentedString(virtualChannelControlEnable))
            .append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
