package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 串口重定向控制的选项。
 */
public class PoliciesPeripheralsSerialPortRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_connect_enable")

    private Boolean autoConnectEnable;

    public PoliciesPeripheralsSerialPortRedirectionOptions withAutoConnectEnable(Boolean autoConnectEnable) {
        this.autoConnectEnable = autoConnectEnable;
        return this;
    }

    /**
     * 是否自动连接客户端串口。取值为： false：表示关闭。 true：表示开启。
     * @return autoConnectEnable
     */
    public Boolean getAutoConnectEnable() {
        return autoConnectEnable;
    }

    public void setAutoConnectEnable(Boolean autoConnectEnable) {
        this.autoConnectEnable = autoConnectEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsSerialPortRedirectionOptions that = (PoliciesPeripheralsSerialPortRedirectionOptions) obj;
        return Objects.equals(this.autoConnectEnable, that.autoConnectEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoConnectEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsSerialPortRedirectionOptions {\n");
        sb.append("    autoConnectEnable: ").append(toIndentedString(autoConnectEnable)).append("\n");
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
