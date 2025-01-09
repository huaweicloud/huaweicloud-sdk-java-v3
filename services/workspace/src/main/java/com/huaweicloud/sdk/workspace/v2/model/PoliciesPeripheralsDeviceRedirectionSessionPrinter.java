package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 会话打印机。
 */
public class PoliciesPeripheralsDeviceRedirectionSessionPrinter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_printer_enable")

    private Boolean sessionPrinterEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions options;

    public PoliciesPeripheralsDeviceRedirectionSessionPrinter withSessionPrinterEnable(Boolean sessionPrinterEnable) {
        this.sessionPrinterEnable = sessionPrinterEnable;
        return this;
    }

    /**
     * 是否开启会话打印机。取值为： false：表示关闭。 true：表示开启。
     * @return sessionPrinterEnable
     */
    public Boolean getSessionPrinterEnable() {
        return sessionPrinterEnable;
    }

    public void setSessionPrinterEnable(Boolean sessionPrinterEnable) {
        this.sessionPrinterEnable = sessionPrinterEnable;
    }

    public PoliciesPeripheralsDeviceRedirectionSessionPrinter withOptions(
        PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirectionSessionPrinter withOptions(
        Consumer<PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions options) {
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
        PoliciesPeripheralsDeviceRedirectionSessionPrinter that =
            (PoliciesPeripheralsDeviceRedirectionSessionPrinter) obj;
        return Objects.equals(this.sessionPrinterEnable, that.sessionPrinterEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionPrinterEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionSessionPrinter {\n");
        sb.append("    sessionPrinterEnable: ").append(toIndentedString(sessionPrinterEnable)).append("\n");
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
