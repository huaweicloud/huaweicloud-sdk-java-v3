package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SimCardFlowItem
 */
public class SimCardFlowItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid")

    private String iccid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private Double flow;

    public SimCardFlowItem withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * sim卡标识
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public SimCardFlowItem withIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /**
     * 容器ID
     * @return iccid
     */
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public SimCardFlowItem withFlow(Double flow) {
        this.flow = flow;
        return this;
    }

    /**
     * 流量
     * @return flow
     */
    public Double getFlow() {
        return flow;
    }

    public void setFlow(Double flow) {
        this.flow = flow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimCardFlowItem that = (SimCardFlowItem) obj;
        return Objects.equals(this.simCardId, that.simCardId) && Objects.equals(this.iccid, that.iccid)
            && Objects.equals(this.flow, that.flow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId, iccid, flow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimCardFlowItem {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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
