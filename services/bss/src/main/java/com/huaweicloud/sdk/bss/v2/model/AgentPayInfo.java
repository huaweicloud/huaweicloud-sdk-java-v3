package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AgentPayInfo
 */
public class AgentPayInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_agent_pay")
    
    private Integer isAgentPay;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paying_agent_id")
    
    private String payingAgentId;

    public AgentPayInfo withIsAgentPay(Integer isAgentPay) {
        this.isAgentPay = isAgentPay;
        return this;
    }

    


    /**
     * |参数名称：是否代付. 0, 租户自己支付;1，合作伙伴代付。如果是待支付状态，这个地方是表明是否申请了代付人支付，如果是已支付状态，是表明是不是由代付人支付。| |参数的约束及描述：支付类型. 0, 租户自己支付;1，合作伙伴代付。|
     * @return isAgentPay
     */
    public Integer getIsAgentPay() {
        return isAgentPay;
    }

    public void setIsAgentPay(Integer isAgentPay) {
        this.isAgentPay = isAgentPay;
    }

    public AgentPayInfo withPayingAgentId(String payingAgentId) {
        this.payingAgentId = payingAgentId;
        return this;
    }

    


    /**
     * |参数名称：代付人，当payingType=1的时候有值| |参数约束及描述：代付人，当payingType=1的时候有值|
     * @return payingAgentId
     */
    public String getPayingAgentId() {
        return payingAgentId;
    }

    public void setPayingAgentId(String payingAgentId) {
        this.payingAgentId = payingAgentId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentPayInfo agentPayInfo = (AgentPayInfo) o;
        return Objects.equals(this.isAgentPay, agentPayInfo.isAgentPay) &&
            Objects.equals(this.payingAgentId, agentPayInfo.payingAgentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isAgentPay, payingAgentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentPayInfo {\n");
        sb.append("    isAgentPay: ").append(toIndentedString(isAgentPay)).append("\n");
        sb.append("    payingAgentId: ").append(toIndentedString(payingAgentId)).append("\n");
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

