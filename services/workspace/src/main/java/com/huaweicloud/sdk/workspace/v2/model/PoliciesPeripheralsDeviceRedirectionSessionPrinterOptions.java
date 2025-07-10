package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会话打印机控制选项。
 */
public class PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_printer_customization_policy")

    private String sessionPrinterCustomizationPolicy;

    public PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions withSessionPrinterCustomizationPolicy(
        String sessionPrinterCustomizationPolicy) {
        this.sessionPrinterCustomizationPolicy = sessionPrinterCustomizationPolicy;
        return this;
    }

    /**
     * 会话打印机自定义策略。长度不能超过1000个字符。
     * @return sessionPrinterCustomizationPolicy
     */
    public String getSessionPrinterCustomizationPolicy() {
        return sessionPrinterCustomizationPolicy;
    }

    public void setSessionPrinterCustomizationPolicy(String sessionPrinterCustomizationPolicy) {
        this.sessionPrinterCustomizationPolicy = sessionPrinterCustomizationPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions that =
            (PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions) obj;
        return Objects.equals(this.sessionPrinterCustomizationPolicy, that.sessionPrinterCustomizationPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionPrinterCustomizationPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionSessionPrinterOptions {\n");
        sb.append("    sessionPrinterCustomizationPolicy: ")
            .append(toIndentedString(sessionPrinterCustomizationPolicy))
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
