package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SetSubCustomerDiscountV2
 */
public class SetSubCustomerDiscountV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount")
    
    private BigDecimal discount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;

    public SetSubCustomerDiscountV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID| |参数约束及描述：客户ID|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public SetSubCustomerDiscountV2 withDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    


    /**
     * |参数名称：折扣率，最高精确到4位小数。折扣范围：0.8~1。如果折扣率是85%，则折扣率写成0.85。注意：折扣为1表示不打折，相当于删除伙伴折扣。| |参数的约束及描述：折扣率，最高精确到4位小数。折扣范围：0.8~1。如果折扣率是85%，则折扣率写成0.85。注意：折扣为1表示不打折，相当于删除伙伴折扣。|
     * @return discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public SetSubCustomerDiscountV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    


    /**
     * |参数名称：生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ| |参数约束及描述：生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ|
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public SetSubCustomerDiscountV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：失效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ| |参数约束及描述：失效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ|
     * @return expireTime
     */
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
        SetSubCustomerDiscountV2 setSubCustomerDiscountV2 = (SetSubCustomerDiscountV2) o;
        return Objects.equals(this.customerId, setSubCustomerDiscountV2.customerId) &&
            Objects.equals(this.discount, setSubCustomerDiscountV2.discount) &&
            Objects.equals(this.effectiveTime, setSubCustomerDiscountV2.effectiveTime) &&
            Objects.equals(this.expireTime, setSubCustomerDiscountV2.expireTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, discount, effectiveTime, expireTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSubCustomerDiscountV2 {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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

