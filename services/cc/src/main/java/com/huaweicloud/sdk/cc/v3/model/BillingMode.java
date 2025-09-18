package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 计费方式。
 */
public class BillingMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private BillingModeEnum billingMode;

    public BillingMode withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * Get billingMode
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingMode that = (BillingMode) obj;
        return Objects.equals(this.billingMode, that.billingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingMode {\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
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
