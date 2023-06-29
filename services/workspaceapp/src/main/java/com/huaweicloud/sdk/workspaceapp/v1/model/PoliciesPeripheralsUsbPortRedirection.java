package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * USB端口重定向。
 */
public class PoliciesPeripheralsUsbPortRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_enable")

    private Boolean usbEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesPeripheralsUsbPortRedirectionOptions options;

    public PoliciesPeripheralsUsbPortRedirection withUsbEnable(Boolean usbEnable) {
        this.usbEnable = usbEnable;
        return this;
    }

    /**
     * 是否开启USB端口重定向。 - false：表示关闭。 - true：表示开启。
     * @return usbEnable
     */
    public Boolean getUsbEnable() {
        return usbEnable;
    }

    public void setUsbEnable(Boolean usbEnable) {
        this.usbEnable = usbEnable;
    }

    public PoliciesPeripheralsUsbPortRedirection withOptions(PoliciesPeripheralsUsbPortRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesPeripheralsUsbPortRedirection withOptions(
        Consumer<PoliciesPeripheralsUsbPortRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesPeripheralsUsbPortRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesPeripheralsUsbPortRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesPeripheralsUsbPortRedirectionOptions options) {
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
        PoliciesPeripheralsUsbPortRedirection that = (PoliciesPeripheralsUsbPortRedirection) obj;
        return Objects.equals(this.usbEnable, that.usbEnable) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usbEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsUsbPortRedirection {\n");
        sb.append("    usbEnable: ").append(toIndentedString(usbEnable)).append("\n");
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
