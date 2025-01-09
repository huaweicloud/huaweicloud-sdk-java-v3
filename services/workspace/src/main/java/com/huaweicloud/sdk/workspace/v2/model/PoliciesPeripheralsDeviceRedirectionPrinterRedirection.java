package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 打印机重定向。
 */
public class PoliciesPeripheralsDeviceRedirectionPrinterRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_enable")

    private Boolean printerEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions options;

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirection withPrinterEnable(Boolean printerEnable) {
        this.printerEnable = printerEnable;
        return this;
    }

    /**
     * 是否开启打印机设备重定向。取值为： false：表示关闭。 true：表示开启。
     * @return printerEnable
     */
    public Boolean getPrinterEnable() {
        return printerEnable;
    }

    public void setPrinterEnable(Boolean printerEnable) {
        this.printerEnable = printerEnable;
    }

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirection withOptions(
        PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirection withOptions(
        Consumer<PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions options) {
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
        PoliciesPeripheralsDeviceRedirectionPrinterRedirection that =
            (PoliciesPeripheralsDeviceRedirectionPrinterRedirection) obj;
        return Objects.equals(this.printerEnable, that.printerEnable) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(printerEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionPrinterRedirection {\n");
        sb.append("    printerEnable: ").append(toIndentedString(printerEnable)).append("\n");
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
