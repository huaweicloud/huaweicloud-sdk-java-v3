package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IncentiveAndDiscountPolicy
 */
public class IncentiveAndDiscountPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incentive_policy")

    private String incentivePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_discount")

    private String allowDiscount;

    public IncentiveAndDiscountPolicy withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型列表。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public IncentiveAndDiscountPolicy withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * 云服务类型名称。例如ECS的云服务类型名称为“弹性云服务器”。
     * @return serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public IncentiveAndDiscountPolicy withIncentivePolicy(String incentivePolicy) {
        this.incentivePolicy = incentivePolicy;
        return this;
    }

    /**
     * 激励策略。 0：非特定产品1：特定产品2：无业绩无返点13：有业绩无返点
     * @return incentivePolicy
     */
    public String getIncentivePolicy() {
        return incentivePolicy;
    }

    public void setIncentivePolicy(String incentivePolicy) {
        this.incentivePolicy = incentivePolicy;
    }

    public IncentiveAndDiscountPolicy withAllowDiscount(String allowDiscount) {
        this.allowDiscount = allowDiscount;
        return this;
    }

    /**
     * 是否允许应用伙伴授予折扣。 YES：允许应用NO：不许应用
     * @return allowDiscount
     */
    public String getAllowDiscount() {
        return allowDiscount;
    }

    public void setAllowDiscount(String allowDiscount) {
        this.allowDiscount = allowDiscount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncentiveAndDiscountPolicy that = (IncentiveAndDiscountPolicy) obj;
        return Objects.equals(this.serviceTypeCode, that.serviceTypeCode)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName)
            && Objects.equals(this.incentivePolicy, that.incentivePolicy)
            && Objects.equals(this.allowDiscount, that.allowDiscount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceTypeCode, serviceTypeName, incentivePolicy, allowDiscount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncentiveAndDiscountPolicy {\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    incentivePolicy: ").append(toIndentedString(incentivePolicy)).append("\n");
        sb.append("    allowDiscount: ").append(toIndentedString(allowDiscount)).append("\n");
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
