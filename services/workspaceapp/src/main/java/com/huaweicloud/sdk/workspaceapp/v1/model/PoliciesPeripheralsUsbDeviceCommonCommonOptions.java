package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * USB和设备智能卡共同控制的选项。
 */
public class PoliciesPeripheralsUsbDeviceCommonCommonOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_smart_card_disconnect_enable")

    private Boolean removeSmartCardDisconnectEnable;

    public PoliciesPeripheralsUsbDeviceCommonCommonOptions withRemoveSmartCardDisconnectEnable(
        Boolean removeSmartCardDisconnectEnable) {
        this.removeSmartCardDisconnectEnable = removeSmartCardDisconnectEnable;
        return this;
    }

    /**
     * 是否移除智能卡断开用户会话。取值为： false：表示关闭。 true：表示开启。
     * @return removeSmartCardDisconnectEnable
     */
    public Boolean getRemoveSmartCardDisconnectEnable() {
        return removeSmartCardDisconnectEnable;
    }

    public void setRemoveSmartCardDisconnectEnable(Boolean removeSmartCardDisconnectEnable) {
        this.removeSmartCardDisconnectEnable = removeSmartCardDisconnectEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsUsbDeviceCommonCommonOptions that = (PoliciesPeripheralsUsbDeviceCommonCommonOptions) obj;
        return Objects.equals(this.removeSmartCardDisconnectEnable, that.removeSmartCardDisconnectEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeSmartCardDisconnectEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsUsbDeviceCommonCommonOptions {\n");
        sb.append("    removeSmartCardDisconnectEnable: ")
            .append(toIndentedString(removeSmartCardDisconnectEnable))
            .append("\n");
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
