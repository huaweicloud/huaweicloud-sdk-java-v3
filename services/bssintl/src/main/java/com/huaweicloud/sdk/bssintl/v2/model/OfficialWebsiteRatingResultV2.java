package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OfficialWebsiteRatingResultV2
 */
public class OfficialWebsiteRatingResultV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    private String officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_official_website_amount")

    private String installmentOfficialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_period_type")

    private Integer installmentPeriodType;

    public OfficialWebsiteRatingResultV2 withOfficialWebsiteAmount(String officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * |参数名称：官网价格。单位为元| |参数约束及描述：官网价格。单位为元|
     * @return officialWebsiteAmount
     */
    public String getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(String officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public OfficialWebsiteRatingResultV2 withInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
        return this;
    }

    /**
     * |参数名称：分期金额的官网价。单位为元| |参数约束及描述：分期金额的官网价。单位为元|
     * @return installmentOfficialWebsiteAmount
     */
    public String getInstallmentOfficialWebsiteAmount() {
        return installmentOfficialWebsiteAmount;
    }

    public void setInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
    }

    public OfficialWebsiteRatingResultV2 withInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
        return this;
    }

    /**
     * |参数名称：分期付款的周期类型。2：月| |参数的约束及描述：分期付款的周期类型。2：月|
     * @return installmentPeriodType
     */
    public Integer getInstallmentPeriodType() {
        return installmentPeriodType;
    }

    public void setInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfficialWebsiteRatingResultV2 officialWebsiteRatingResultV2 = (OfficialWebsiteRatingResultV2) o;
        return Objects.equals(this.officialWebsiteAmount, officialWebsiteRatingResultV2.officialWebsiteAmount)
            && Objects.equals(this.installmentOfficialWebsiteAmount,
                officialWebsiteRatingResultV2.installmentOfficialWebsiteAmount)
            && Objects.equals(this.installmentPeriodType, officialWebsiteRatingResultV2.installmentPeriodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officialWebsiteAmount, installmentOfficialWebsiteAmount, installmentPeriodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfficialWebsiteRatingResultV2 {\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    installmentOfficialWebsiteAmount: ")
            .append(toIndentedString(installmentOfficialWebsiteAmount))
            .append("\n");
        sb.append("    installmentPeriodType: ").append(toIndentedString(installmentPeriodType)).append("\n");
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
