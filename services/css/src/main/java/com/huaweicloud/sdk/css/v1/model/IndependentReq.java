package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IndependentReq
 */
public class IndependentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private IndependentBodyReq type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Integer isAutoPay;

    public IndependentReq withType(IndependentBodyReq type) {
        this.type = type;
        return this;
    }

    public IndependentReq withType(Consumer<IndependentBodyReq> typeSetter) {
        if (this.type == null) {
            this.type = new IndependentBodyReq();
            typeSetter.accept(this.type);
        }

        return this;
    }

    /**
     * Get type
     * @return type
     */
    public IndependentBodyReq getType() {
        return type;
    }

    public void setType(IndependentBodyReq type) {
        this.type = type;
    }

    public IndependentReq withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付。下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndependentReq that = (IndependentReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndependentReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
