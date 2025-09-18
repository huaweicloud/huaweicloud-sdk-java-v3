package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SpecificationCodeInfo
 */
public class SpecificationCodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private BillingModeEnum billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth")

    private Long maxBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mim_bandwidth")

    private Long mimBandwidth;

    public SpecificationCodeInfo withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 带宽包实例的规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public SpecificationCodeInfo withBillingMode(BillingModeEnum billingMode) {
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

    public SpecificationCodeInfo withMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * 最大带宽。
     * minimum: 0
     * maximum: 200000
     * @return maxBandwidth
     */
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public SpecificationCodeInfo withMimBandwidth(Long mimBandwidth) {
        this.mimBandwidth = mimBandwidth;
        return this;
    }

    /**
     * 最小带宽。
     * minimum: 0
     * maximum: 200000
     * @return mimBandwidth
     */
    public Long getMimBandwidth() {
        return mimBandwidth;
    }

    public void setMimBandwidth(Long mimBandwidth) {
        this.mimBandwidth = mimBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecificationCodeInfo that = (SpecificationCodeInfo) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.billingMode, that.billingMode)
            && Objects.equals(this.maxBandwidth, that.maxBandwidth)
            && Objects.equals(this.mimBandwidth, that.mimBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, billingMode, maxBandwidth, mimBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecificationCodeInfo {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    mimBandwidth: ").append(toIndentedString(mimBandwidth)).append("\n");
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
