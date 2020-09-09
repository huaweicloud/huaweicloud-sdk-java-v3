package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CouponSimpleInfoOrderPay
 */
public class CouponSimpleInfoOrderPay  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;

    public CouponSimpleInfoOrderPay withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：优惠券ID，同种类型的优惠券，列表前面会优先使用| |参数约束及描述：优惠券ID，同种类型的优惠券，列表前面会优先使用|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CouponSimpleInfoOrderPay withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * |参数名称：折扣类型：取值为300-折扣卷 301-促销代金券302-促销现金券303-促销储值卡| |参数的约束及描述：折扣类型：取值为300-折扣卷 301-促销代金券302-促销现金券303-促销储值卡|
     * minimum: 300
     * maximum: 303
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponSimpleInfoOrderPay couponSimpleInfoOrderPay = (CouponSimpleInfoOrderPay) o;
        return Objects.equals(this.id, couponSimpleInfoOrderPay.id) &&
            Objects.equals(this.type, couponSimpleInfoOrderPay.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponSimpleInfoOrderPay {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

