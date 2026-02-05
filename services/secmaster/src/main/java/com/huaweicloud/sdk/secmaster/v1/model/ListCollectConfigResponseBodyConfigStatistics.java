package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 统计数据
 */
public class ListCollectConfigResponseBodyConfigStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_num")

    private BigDecimal accountNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_traffic")

    private BigDecimal dailyTraffic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_num")

    private BigDecimal logNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_all_num")

    private BigDecimal productAllNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_in_num")

    private BigDecimal productInNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_num")

    private BigDecimal vendorNum;

    public ListCollectConfigResponseBodyConfigStatistics withAccountNum(BigDecimal accountNum) {
        this.accountNum = accountNum;
        return this;
    }

    /**
     * 账号接入数量
     * minimum: 0
     * maximum: 1E+4
     * @return accountNum
     */
    public BigDecimal getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(BigDecimal accountNum) {
        this.accountNum = accountNum;
    }

    public ListCollectConfigResponseBodyConfigStatistics withDailyTraffic(BigDecimal dailyTraffic) {
        this.dailyTraffic = dailyTraffic;
        return this;
    }

    /**
     * 每日流量，单位：Byte
     * minimum: 0
     * maximum: 9223372036854775807
     * @return dailyTraffic
     */
    public BigDecimal getDailyTraffic() {
        return dailyTraffic;
    }

    public void setDailyTraffic(BigDecimal dailyTraffic) {
        this.dailyTraffic = dailyTraffic;
    }

    public ListCollectConfigResponseBodyConfigStatistics withLogNum(BigDecimal logNum) {
        this.logNum = logNum;
        return this;
    }

    /**
     * 已接入日志数量
     * minimum: 0
     * maximum: 1E+4
     * @return logNum
     */
    public BigDecimal getLogNum() {
        return logNum;
    }

    public void setLogNum(BigDecimal logNum) {
        this.logNum = logNum;
    }

    public ListCollectConfigResponseBodyConfigStatistics withProductAllNum(BigDecimal productAllNum) {
        this.productAllNum = productAllNum;
        return this;
    }

    /**
     * 云产品总数量
     * minimum: 0
     * maximum: 1E+4
     * @return productAllNum
     */
    public BigDecimal getProductAllNum() {
        return productAllNum;
    }

    public void setProductAllNum(BigDecimal productAllNum) {
        this.productAllNum = productAllNum;
    }

    public ListCollectConfigResponseBodyConfigStatistics withProductInNum(BigDecimal productInNum) {
        this.productInNum = productInNum;
        return this;
    }

    /**
     * 接入云产品数量
     * minimum: 0
     * maximum: 1E+4
     * @return productInNum
     */
    public BigDecimal getProductInNum() {
        return productInNum;
    }

    public void setProductInNum(BigDecimal productInNum) {
        this.productInNum = productInNum;
    }

    public ListCollectConfigResponseBodyConfigStatistics withVendorNum(BigDecimal vendorNum) {
        this.vendorNum = vendorNum;
        return this;
    }

    /**
     * 云厂商数量
     * minimum: 0
     * maximum: 1E+4
     * @return vendorNum
     */
    public BigDecimal getVendorNum() {
        return vendorNum;
    }

    public void setVendorNum(BigDecimal vendorNum) {
        this.vendorNum = vendorNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyConfigStatistics that = (ListCollectConfigResponseBodyConfigStatistics) obj;
        return Objects.equals(this.accountNum, that.accountNum) && Objects.equals(this.dailyTraffic, that.dailyTraffic)
            && Objects.equals(this.logNum, that.logNum) && Objects.equals(this.productAllNum, that.productAllNum)
            && Objects.equals(this.productInNum, that.productInNum) && Objects.equals(this.vendorNum, that.vendorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNum, dailyTraffic, logNum, productAllNum, productInNum, vendorNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyConfigStatistics {\n");
        sb.append("    accountNum: ").append(toIndentedString(accountNum)).append("\n");
        sb.append("    dailyTraffic: ").append(toIndentedString(dailyTraffic)).append("\n");
        sb.append("    logNum: ").append(toIndentedString(logNum)).append("\n");
        sb.append("    productAllNum: ").append(toIndentedString(productAllNum)).append("\n");
        sb.append("    productInNum: ").append(toIndentedString(productInNum)).append("\n");
        sb.append("    vendorNum: ").append(toIndentedString(vendorNum)).append("\n");
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
