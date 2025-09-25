package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentPayInfoV2
 */
public class AgentPayInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paying_agent_id")

    private String payingAgentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_agent_pay")

    private Boolean isAgentPay;

    public AgentPayInfoV2 withPayingAgentId(String payingAgentId) {
        this.payingAgentId = payingAgentId;
        return this;
    }

    /**
     * |参数名称：订单代理支付人的客户账号ID。| |参数的约束及描述：订单代理支付人的客户账号ID|
     * @return payingAgentId
     */
    public String getPayingAgentId() {
        return payingAgentId;
    }

    public void setPayingAgentId(String payingAgentId) {
        this.payingAgentId = payingAgentId;
    }

    public AgentPayInfoV2 withIsAgentPay(Boolean isAgentPay) {
        this.isAgentPay = isAgentPay;
        return this;
    }

    /**
     * |参数名称：是否代理支付。| |参数的约束及描述：是否代理支付。true：代理支付，不为ture时为非代理支付订单|
     * @return isAgentPay
     */
    public Boolean getIsAgentPay() {
        return isAgentPay;
    }

    public void setIsAgentPay(Boolean isAgentPay) {
        this.isAgentPay = isAgentPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentPayInfoV2 that = (AgentPayInfoV2) obj;
        return Objects.equals(this.payingAgentId, that.payingAgentId)
            && Objects.equals(this.isAgentPay, that.isAgentPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payingAgentId, isAgentPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentPayInfoV2 {\n");
        sb.append("    payingAgentId: ").append(toIndentedString(payingAgentId)).append("\n");
        sb.append("    isAgentPay: ").append(toIndentedString(isAgentPay)).append("\n");
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
