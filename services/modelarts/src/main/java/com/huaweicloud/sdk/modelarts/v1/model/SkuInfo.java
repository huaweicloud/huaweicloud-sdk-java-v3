package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 计费信息。
 */
public class SkuInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queries_limit")

    private Long queriesLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price")

    private Float price;

    public SkuInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 计费码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SkuInfo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 计费时期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public SkuInfo withQueriesLimit(Long queriesLimit) {
        this.queriesLimit = queriesLimit;
        return this;
    }

    /**
     * 查询次数。
     * @return queriesLimit
     */
    public Long getQueriesLimit() {
        return queriesLimit;
    }

    public void setQueriesLimit(Long queriesLimit) {
        this.queriesLimit = queriesLimit;
    }

    public SkuInfo withPrice(Float price) {
        this.price = price;
        return this;
    }

    /**
     * 价格。
     * @return price
     */
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuInfo that = (SkuInfo) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.period, that.period)
            && Objects.equals(this.queriesLimit, that.queriesLimit) && Objects.equals(this.price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, period, queriesLimit, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuInfo {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    queriesLimit: ").append(toIndentedString(queriesLimit)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
