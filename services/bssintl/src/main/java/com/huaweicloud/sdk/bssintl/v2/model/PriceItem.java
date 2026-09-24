package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PriceItem
 */
public class PriceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offering_id")

    private String offeringId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_price")

    private String officialPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_nums")

    private List<Integer> periodNums = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_usage_factor")

    private String billingUsageFactor;

    public PriceItem withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * 商品Id
     * @return offeringId
     */
    public String getOfferingId() {
        return offeringId;
    }

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    public PriceItem withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种，USD
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public PriceItem withOfficialPrice(String officialPrice) {
        this.officialPrice = officialPrice;
        return this;
    }

    /**
     * 官网价
     * @return officialPrice
     */
    public String getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(String officialPrice) {
        this.officialPrice = officialPrice;
    }

    public PriceItem withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，PERIOD：包年/包月、ON_DEMAND：按需、ONE_TIME：一次性、ON_DEMAND_PKG：按需套餐包
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PriceItem withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 销售周期类型，0：天 2：月 3：年 4：小时
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public PriceItem withPeriodNums(List<Integer> periodNums) {
        this.periodNums = periodNums;
        return this;
    }

    public PriceItem addPeriodNumsItem(Integer periodNumsItem) {
        if (this.periodNums == null) {
            this.periodNums = new ArrayList<>();
        }
        this.periodNums.add(periodNumsItem);
        return this;
    }

    public PriceItem withPeriodNums(Consumer<List<Integer>> periodNumsSetter) {
        if (this.periodNums == null) {
            this.periodNums = new ArrayList<>();
        }
        periodNumsSetter.accept(this.periodNums);
        return this;
    }

    /**
     * 销售周期数列表
     * @return periodNums
     */
    public List<Integer> getPeriodNums() {
        return periodNums;
    }

    public void setPeriodNums(List<Integer> periodNums) {
        this.periodNums = periodNums;
    }

    public PriceItem withBillingUsageFactor(String billingUsageFactor) {
        this.billingUsageFactor = billingUsageFactor;
        return this;
    }

    /**
     * 计费因子编码
     * @return billingUsageFactor
     */
    public String getBillingUsageFactor() {
        return billingUsageFactor;
    }

    public void setBillingUsageFactor(String billingUsageFactor) {
        this.billingUsageFactor = billingUsageFactor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PriceItem that = (PriceItem) obj;
        return Objects.equals(this.offeringId, that.offeringId) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.officialPrice, that.officialPrice)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNums, that.periodNums)
            && Objects.equals(this.billingUsageFactor, that.billingUsageFactor);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(offeringId, currency, officialPrice, chargingMode, periodType, periodNums, billingUsageFactor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceItem {\n");
        sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    officialPrice: ").append(toIndentedString(officialPrice)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNums: ").append(toIndentedString(periodNums)).append("\n");
        sb.append("    billingUsageFactor: ").append(toIndentedString(billingUsageFactor)).append("\n");
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
