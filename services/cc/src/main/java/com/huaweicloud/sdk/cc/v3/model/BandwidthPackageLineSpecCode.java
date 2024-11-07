package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带宽包线路产品
 */
public class BandwidthPackageLineSpecCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth")

    private Integer maxBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_bandwidth")

    private Integer minBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_billing_modes")

    private List<BillingModeEnum> supportBillingModes = null;

    public BandwidthPackageLineSpecCode withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 带宽包等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BandwidthPackageLineSpecCode withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 实例名字。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public BandwidthPackageLineSpecCode withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 实例名字。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public BandwidthPackageLineSpecCode withSpecCode(String specCode) {
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

    public BandwidthPackageLineSpecCode withMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * 最大带宽。
     * minimum: 0
     * maximum: 200000
     * @return maxBandwidth
     */
    public Integer getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public BandwidthPackageLineSpecCode withMinBandwidth(Integer minBandwidth) {
        this.minBandwidth = minBandwidth;
        return this;
    }

    /**
     * 最小带宽。
     * minimum: 0
     * maximum: 200000
     * @return minBandwidth
     */
    public Integer getMinBandwidth() {
        return minBandwidth;
    }

    public void setMinBandwidth(Integer minBandwidth) {
        this.minBandwidth = minBandwidth;
    }

    public BandwidthPackageLineSpecCode withSupportBillingModes(List<BillingModeEnum> supportBillingModes) {
        this.supportBillingModes = supportBillingModes;
        return this;
    }

    public BandwidthPackageLineSpecCode addSupportBillingModesItem(BillingModeEnum supportBillingModesItem) {
        if (this.supportBillingModes == null) {
            this.supportBillingModes = new ArrayList<>();
        }
        this.supportBillingModes.add(supportBillingModesItem);
        return this;
    }

    public BandwidthPackageLineSpecCode withSupportBillingModes(
        Consumer<List<BillingModeEnum>> supportBillingModesSetter) {
        if (this.supportBillingModes == null) {
            this.supportBillingModes = new ArrayList<>();
        }
        supportBillingModesSetter.accept(this.supportBillingModes);
        return this;
    }

    /**
     * 支持的计费模式。
     * @return supportBillingModes
     */
    public List<BillingModeEnum> getSupportBillingModes() {
        return supportBillingModes;
    }

    public void setSupportBillingModes(List<BillingModeEnum> supportBillingModes) {
        this.supportBillingModes = supportBillingModes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BandwidthPackageLineSpecCode that = (BandwidthPackageLineSpecCode) obj;
        return Objects.equals(this.level, that.level) && Objects.equals(this.nameCn, that.nameCn)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.maxBandwidth, that.maxBandwidth)
            && Objects.equals(this.minBandwidth, that.minBandwidth)
            && Objects.equals(this.supportBillingModes, that.supportBillingModes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, nameCn, nameEn, specCode, maxBandwidth, minBandwidth, supportBillingModes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthPackageLineSpecCode {\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    minBandwidth: ").append(toIndentedString(minBandwidth)).append("\n");
        sb.append("    supportBillingModes: ").append(toIndentedString(supportBillingModes)).append("\n");
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
