package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiscountSimpleInfoV3
 */
public class DiscountSimpleInfoV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public DiscountSimpleInfoV3 withId(String id) {
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

    public DiscountSimpleInfoV3 withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 折扣类型： 0：促销折扣2：商务优惠3：合作伙伴授予折扣 说明： 订单支付时，如果包含609折扣（订单调价折扣），则必须使用，不能再更换折扣类型。
     * minimum: 0
     * maximum: 609
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
        DiscountSimpleInfoV3 discountSimpleInfoV3 = (DiscountSimpleInfoV3) o;
        return Objects.equals(this.id, discountSimpleInfoV3.id) && Objects.equals(this.type, discountSimpleInfoV3.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscountSimpleInfoV3 {\n");
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
