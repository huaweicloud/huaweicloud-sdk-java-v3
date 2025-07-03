package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络接口，网卡
 */
public class TemplateNetworkInterfaceAttachmentOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_index")

    private Integer deviceIndex;

    public TemplateNetworkInterfaceAttachmentOption withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * 加载顺序, 0代表主网卡
     * @return deviceIndex
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateNetworkInterfaceAttachmentOption that = (TemplateNetworkInterfaceAttachmentOption) obj;
        return Objects.equals(this.deviceIndex, that.deviceIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateNetworkInterfaceAttachmentOption {\n");
        sb.append("    deviceIndex: ").append(toIndentedString(deviceIndex)).append("\n");
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
