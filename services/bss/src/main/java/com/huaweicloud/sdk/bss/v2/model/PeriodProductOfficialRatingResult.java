package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * PeriodProductOfficialRatingResult
 */
public class PeriodProductOfficialRatingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    private BigDecimal officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_official_website_amount")

    private String installmentOfficialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_period_type")

    private Integer installmentPeriodType;

    public PeriodProductOfficialRatingResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID标识，来源于请求中的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PeriodProductOfficialRatingResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 包年/包月产品的ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public PeriodProductOfficialRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * 包年/包月产品的官网价。
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public PeriodProductOfficialRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 价格度量单位标识。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public PeriodProductOfficialRatingResult withInstallmentOfficialWebsiteAmount(
        String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
        return this;
    }

    /**
     * 分期金额的官网价。  说明： 暂只支持CloudPond产品。
     * @return installmentOfficialWebsiteAmount
     */
    public String getInstallmentOfficialWebsiteAmount() {
        return installmentOfficialWebsiteAmount;
    }

    public void setInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
    }

    public PeriodProductOfficialRatingResult withInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
        return this;
    }

    /**
     * 分期付款的周期类型。 2：月 3：年 说明： 暂只支持CloudPond产品。
     * @return installmentPeriodType
     */
    public Integer getInstallmentPeriodType() {
        return installmentPeriodType;
    }

    public void setInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeriodProductOfficialRatingResult that = (PeriodProductOfficialRatingResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.officialWebsiteAmount, that.officialWebsiteAmount)
            && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.installmentOfficialWebsiteAmount, that.installmentOfficialWebsiteAmount)
            && Objects.equals(this.installmentPeriodType, that.installmentPeriodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            productId,
            officialWebsiteAmount,
            measureId,
            installmentOfficialWebsiteAmount,
            installmentPeriodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodProductOfficialRatingResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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
