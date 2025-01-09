package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HID（人体学设备）重定向。
 */
public class PoliciesPeripheralsDeviceRedirectionHidRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hid_redirection_enable")

    private Boolean hidRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions options;

    public PoliciesPeripheralsDeviceRedirectionHidRedirection withHidRedirectionEnable(Boolean hidRedirectionEnable) {
        this.hidRedirectionEnable = hidRedirectionEnable;
        return this;
    }

    /**
     * 是否开启HID（人体学设备）重定向。取值为： false：表示关闭。 true：表示开启。
     * @return hidRedirectionEnable
     */
    public Boolean getHidRedirectionEnable() {
        return hidRedirectionEnable;
    }

    public void setHidRedirectionEnable(Boolean hidRedirectionEnable) {
        this.hidRedirectionEnable = hidRedirectionEnable;
    }

    public PoliciesPeripheralsDeviceRedirectionHidRedirection withOptions(
        PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirectionHidRedirection withOptions(
        Consumer<PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions options) {
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
        PoliciesPeripheralsDeviceRedirectionHidRedirection that =
            (PoliciesPeripheralsDeviceRedirectionHidRedirection) obj;
        return Objects.equals(this.hidRedirectionEnable, that.hidRedirectionEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hidRedirectionEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionHidRedirection {\n");
        sb.append("    hidRedirectionEnable: ").append(toIndentedString(hidRedirectionEnable)).append("\n");
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
