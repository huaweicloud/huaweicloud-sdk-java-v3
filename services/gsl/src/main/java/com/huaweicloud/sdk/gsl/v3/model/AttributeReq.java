package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttributeReq
 */
public class AttributeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute1")

    private String customerAttribute1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute2")

    private String customerAttribute2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute3")

    private String customerAttribute3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute4")

    private String customerAttribute4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute5")

    private String customerAttribute5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute6")

    private String customerAttribute6;

    public AttributeReq withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * SIM卡标识
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public AttributeReq withCustomerAttribute1(String customerAttribute1) {
        this.customerAttribute1 = customerAttribute1;
        return this;
    }

    /**
     * 自定义属性一
     * @return customerAttribute1
     */
    public String getCustomerAttribute1() {
        return customerAttribute1;
    }

    public void setCustomerAttribute1(String customerAttribute1) {
        this.customerAttribute1 = customerAttribute1;
    }

    public AttributeReq withCustomerAttribute2(String customerAttribute2) {
        this.customerAttribute2 = customerAttribute2;
        return this;
    }

    /**
     * 自定义属性二
     * @return customerAttribute2
     */
    public String getCustomerAttribute2() {
        return customerAttribute2;
    }

    public void setCustomerAttribute2(String customerAttribute2) {
        this.customerAttribute2 = customerAttribute2;
    }

    public AttributeReq withCustomerAttribute3(String customerAttribute3) {
        this.customerAttribute3 = customerAttribute3;
        return this;
    }

    /**
     * 自定义属性三
     * @return customerAttribute3
     */
    public String getCustomerAttribute3() {
        return customerAttribute3;
    }

    public void setCustomerAttribute3(String customerAttribute3) {
        this.customerAttribute3 = customerAttribute3;
    }

    public AttributeReq withCustomerAttribute4(String customerAttribute4) {
        this.customerAttribute4 = customerAttribute4;
        return this;
    }

    /**
     * 自定义属性四
     * @return customerAttribute4
     */
    public String getCustomerAttribute4() {
        return customerAttribute4;
    }

    public void setCustomerAttribute4(String customerAttribute4) {
        this.customerAttribute4 = customerAttribute4;
    }

    public AttributeReq withCustomerAttribute5(String customerAttribute5) {
        this.customerAttribute5 = customerAttribute5;
        return this;
    }

    /**
     * 自定义属性五
     * @return customerAttribute5
     */
    public String getCustomerAttribute5() {
        return customerAttribute5;
    }

    public void setCustomerAttribute5(String customerAttribute5) {
        this.customerAttribute5 = customerAttribute5;
    }

    public AttributeReq withCustomerAttribute6(String customerAttribute6) {
        this.customerAttribute6 = customerAttribute6;
        return this;
    }

    /**
     * 自定义属性六
     * @return customerAttribute6
     */
    public String getCustomerAttribute6() {
        return customerAttribute6;
    }

    public void setCustomerAttribute6(String customerAttribute6) {
        this.customerAttribute6 = customerAttribute6;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttributeReq attributeReq = (AttributeReq) o;
        return Objects.equals(this.simCardId, attributeReq.simCardId)
            && Objects.equals(this.customerAttribute1, attributeReq.customerAttribute1)
            && Objects.equals(this.customerAttribute2, attributeReq.customerAttribute2)
            && Objects.equals(this.customerAttribute3, attributeReq.customerAttribute3)
            && Objects.equals(this.customerAttribute4, attributeReq.customerAttribute4)
            && Objects.equals(this.customerAttribute5, attributeReq.customerAttribute5)
            && Objects.equals(this.customerAttribute6, attributeReq.customerAttribute6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId,
            customerAttribute1,
            customerAttribute2,
            customerAttribute3,
            customerAttribute4,
            customerAttribute5,
            customerAttribute6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributeReq {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    customerAttribute1: ").append(toIndentedString(customerAttribute1)).append("\n");
        sb.append("    customerAttribute2: ").append(toIndentedString(customerAttribute2)).append("\n");
        sb.append("    customerAttribute3: ").append(toIndentedString(customerAttribute3)).append("\n");
        sb.append("    customerAttribute4: ").append(toIndentedString(customerAttribute4)).append("\n");
        sb.append("    customerAttribute5: ").append(toIndentedString(customerAttribute5)).append("\n");
        sb.append("    customerAttribute6: ").append(toIndentedString(customerAttribute6)).append("\n");
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
