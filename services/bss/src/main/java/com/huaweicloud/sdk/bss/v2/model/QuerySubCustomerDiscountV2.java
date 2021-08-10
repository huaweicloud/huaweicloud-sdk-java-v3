package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** QuerySubCustomerDiscountV2 */
public class QuerySubCustomerDiscountV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_id")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount")

    private Double discount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public QuerySubCustomerDiscountV2 withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /** 折扣ID，唯一表示一条折扣信息。
     * 
     * @return discountId */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public QuerySubCustomerDiscountV2 withDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    /** 折扣率，精确到2位小数。 如果折扣率是85%，则折扣率写成0.85。
     * 
     * @return discount */
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public QuerySubCustomerDiscountV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /** 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * 
     * @return effectiveTime */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public QuerySubCustomerDiscountV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * 
     * @return expireTime */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySubCustomerDiscountV2 querySubCustomerDiscountV2 = (QuerySubCustomerDiscountV2) o;
        return Objects.equals(this.discountId, querySubCustomerDiscountV2.discountId)
            && Objects.equals(this.discount, querySubCustomerDiscountV2.discount)
            && Objects.equals(this.effectiveTime, querySubCustomerDiscountV2.effectiveTime)
            && Objects.equals(this.expireTime, querySubCustomerDiscountV2.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, discount, effectiveTime, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySubCustomerDiscountV2 {\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
