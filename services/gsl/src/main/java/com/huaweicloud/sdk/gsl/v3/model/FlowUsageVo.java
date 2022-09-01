package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * FlowUsageVo
 */
public class FlowUsageVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_cycle")

    @JacksonXmlProperty(localName = "billing_cycle")

    private String billingCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_used")

    @JacksonXmlProperty(localName = "flow_used")

    private Double flowUsed;

    public FlowUsageVo withBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * 账期
     * @return billingCycle
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public FlowUsageVo withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /**
     * 已用流量
     * @return flowUsed
     */
    public Double getFlowUsed() {
        return flowUsed;
    }

    public void setFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowUsageVo flowUsageVo = (FlowUsageVo) o;
        return Objects.equals(this.billingCycle, flowUsageVo.billingCycle)
            && Objects.equals(this.flowUsed, flowUsageVo.flowUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingCycle, flowUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowUsageVo {\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
        sb.append("    flowUsed: ").append(toIndentedString(flowUsed)).append("\n");
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
