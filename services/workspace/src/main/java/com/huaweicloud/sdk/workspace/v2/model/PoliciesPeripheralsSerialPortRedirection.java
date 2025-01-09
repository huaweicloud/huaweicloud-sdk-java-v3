package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 串口重定向。
 */
public class PoliciesPeripheralsSerialPortRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_port_enable")

    private Boolean serialPortEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesPeripheralsSerialPortRedirectionOptions options;

    public PoliciesPeripheralsSerialPortRedirection withSerialPortEnable(Boolean serialPortEnable) {
        this.serialPortEnable = serialPortEnable;
        return this;
    }

    /**
     * 是否开启串口重定向。取值为： false：表示关闭。 true：表示开启。
     * @return serialPortEnable
     */
    public Boolean getSerialPortEnable() {
        return serialPortEnable;
    }

    public void setSerialPortEnable(Boolean serialPortEnable) {
        this.serialPortEnable = serialPortEnable;
    }

    public PoliciesPeripheralsSerialPortRedirection withOptions(
        PoliciesPeripheralsSerialPortRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesPeripheralsSerialPortRedirection withOptions(
        Consumer<PoliciesPeripheralsSerialPortRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesPeripheralsSerialPortRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesPeripheralsSerialPortRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesPeripheralsSerialPortRedirectionOptions options) {
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
        PoliciesPeripheralsSerialPortRedirection that = (PoliciesPeripheralsSerialPortRedirection) obj;
        return Objects.equals(this.serialPortEnable, that.serialPortEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialPortEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsSerialPortRedirection {\n");
        sb.append("    serialPortEnable: ").append(toIndentedString(serialPortEnable)).append("\n");
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
