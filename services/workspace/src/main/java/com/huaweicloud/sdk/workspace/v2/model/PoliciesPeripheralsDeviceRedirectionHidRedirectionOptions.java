package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HID控制选项。
 */
public class PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hid_redirection_customization_policy")

    private String hidRedirectionCustomizationPolicy;

    public PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions withHidRedirectionCustomizationPolicy(
        String hidRedirectionCustomizationPolicy) {
        this.hidRedirectionCustomizationPolicy = hidRedirectionCustomizationPolicy;
        return this;
    }

    /**
     * HID重定向自定义策略。
     * @return hidRedirectionCustomizationPolicy
     */
    public String getHidRedirectionCustomizationPolicy() {
        return hidRedirectionCustomizationPolicy;
    }

    public void setHidRedirectionCustomizationPolicy(String hidRedirectionCustomizationPolicy) {
        this.hidRedirectionCustomizationPolicy = hidRedirectionCustomizationPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions that =
            (PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions) obj;
        return Objects.equals(this.hidRedirectionCustomizationPolicy, that.hidRedirectionCustomizationPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hidRedirectionCustomizationPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionHidRedirectionOptions {\n");
        sb.append("    hidRedirectionCustomizationPolicy: ")
            .append(toIndentedString(hidRedirectionCustomizationPolicy))
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
