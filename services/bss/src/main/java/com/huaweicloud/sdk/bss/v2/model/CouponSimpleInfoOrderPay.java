package com.huaweicloud.sdk.bss.v2.model;





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
     * 折扣ID。
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
     * 折扣类型： 1：合同折扣2：商务优惠3：合作伙伴授予折扣609：订单调价折扣
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

