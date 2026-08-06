package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDasCloudDbaPriceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_price")

    private Double basePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_base_price")

    private Double originalBasePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_price")

    private Double storagePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_storage_price")

    private Double originalStoragePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dump_price")

    private Double dumpPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_dump_price")

    private Double originalDumpPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configure_price")

    private Double configurePrice;

    public ShowDasCloudDbaPriceResponse withBasePrice(Double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    /**
     * 基础费用
     * @return basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public ShowDasCloudDbaPriceResponse withOriginalBasePrice(Double originalBasePrice) {
        this.originalBasePrice = originalBasePrice;
        return this;
    }

    /**
     * 基础费用-原价
     * @return originalBasePrice
     */
    public Double getOriginalBasePrice() {
        return originalBasePrice;
    }

    public void setOriginalBasePrice(Double originalBasePrice) {
        this.originalBasePrice = originalBasePrice;
    }

    public ShowDasCloudDbaPriceResponse withStoragePrice(Double storagePrice) {
        this.storagePrice = storagePrice;
        return this;
    }

    /**
     * 存储费用
     * @return storagePrice
     */
    public Double getStoragePrice() {
        return storagePrice;
    }

    public void setStoragePrice(Double storagePrice) {
        this.storagePrice = storagePrice;
    }

    public ShowDasCloudDbaPriceResponse withOriginalStoragePrice(Double originalStoragePrice) {
        this.originalStoragePrice = originalStoragePrice;
        return this;
    }

    /**
     * 存储费用-原价
     * @return originalStoragePrice
     */
    public Double getOriginalStoragePrice() {
        return originalStoragePrice;
    }

    public void setOriginalStoragePrice(Double originalStoragePrice) {
        this.originalStoragePrice = originalStoragePrice;
    }

    public ShowDasCloudDbaPriceResponse withDumpPrice(Double dumpPrice) {
        this.dumpPrice = dumpPrice;
        return this;
    }

    /**
     * 转储费用
     * @return dumpPrice
     */
    public Double getDumpPrice() {
        return dumpPrice;
    }

    public void setDumpPrice(Double dumpPrice) {
        this.dumpPrice = dumpPrice;
    }

    public ShowDasCloudDbaPriceResponse withOriginalDumpPrice(Double originalDumpPrice) {
        this.originalDumpPrice = originalDumpPrice;
        return this;
    }

    /**
     * 转储费用-原价
     * @return originalDumpPrice
     */
    public Double getOriginalDumpPrice() {
        return originalDumpPrice;
    }

    public void setOriginalDumpPrice(Double originalDumpPrice) {
        this.originalDumpPrice = originalDumpPrice;
    }

    public ShowDasCloudDbaPriceResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位标识,1:元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowDasCloudDbaPriceResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种，比如CNY
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ShowDasCloudDbaPriceResponse withConfigurePrice(Double configurePrice) {
        this.configurePrice = configurePrice;
        return this;
    }

    /**
     * 配置费用-当前为0
     * @return configurePrice
     */
    public Double getConfigurePrice() {
        return configurePrice;
    }

    public void setConfigurePrice(Double configurePrice) {
        this.configurePrice = configurePrice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDasCloudDbaPriceResponse that = (ShowDasCloudDbaPriceResponse) obj;
        return Objects.equals(this.basePrice, that.basePrice)
            && Objects.equals(this.originalBasePrice, that.originalBasePrice)
            && Objects.equals(this.storagePrice, that.storagePrice)
            && Objects.equals(this.originalStoragePrice, that.originalStoragePrice)
            && Objects.equals(this.dumpPrice, that.dumpPrice)
            && Objects.equals(this.originalDumpPrice, that.originalDumpPrice)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.configurePrice, that.configurePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basePrice,
            originalBasePrice,
            storagePrice,
            originalStoragePrice,
            dumpPrice,
            originalDumpPrice,
            measureId,
            currency,
            configurePrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDasCloudDbaPriceResponse {\n");
        sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
        sb.append("    originalBasePrice: ").append(toIndentedString(originalBasePrice)).append("\n");
        sb.append("    storagePrice: ").append(toIndentedString(storagePrice)).append("\n");
        sb.append("    originalStoragePrice: ").append(toIndentedString(originalStoragePrice)).append("\n");
        sb.append("    dumpPrice: ").append(toIndentedString(dumpPrice)).append("\n");
        sb.append("    originalDumpPrice: ").append(toIndentedString(originalDumpPrice)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    configurePrice: ").append(toIndentedString(configurePrice)).append("\n");
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
