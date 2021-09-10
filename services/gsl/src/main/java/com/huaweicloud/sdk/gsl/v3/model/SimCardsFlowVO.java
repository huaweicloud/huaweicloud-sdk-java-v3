package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SimCardsFlowVO */
public class SimCardsFlowVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_id")

    private String pricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_name")

    private String pricePlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccid")

    private String iccid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_total")

    private Double flowTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_used")

    private Double flowUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_left")

    private Double flowLeft;

    public SimCardsFlowVO withId(Long id) {
        this.id = id;
        return this;
    }

    /** 套餐实例ID minimum: 0
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimCardsFlowVO withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** 账户ID
     * 
     * @return accountId */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SimCardsFlowVO withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /** sim卡ID minimum: 0
     * 
     * @return simCardId */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public SimCardsFlowVO withPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }

    /** 套餐ID
     * 
     * @return pricePlanId */
    public String getPricePlanId() {
        return pricePlanId;
    }

    public void setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
    }

    public SimCardsFlowVO withPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }

    /** 套餐名称
     * 
     * @return pricePlanName */
    public String getPricePlanName() {
        return pricePlanName;
    }

    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }

    public SimCardsFlowVO withIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }

    /** ICCID
     * 
     * @return iccid */
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public SimCardsFlowVO withFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
        return this;
    }

    /** 总流量(MB),两位小数 minimum: 0
     * 
     * @return flowTotal */
    public Double getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
    }

    public SimCardsFlowVO withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /** 已使用流量(MB),两位小数 minimum: 0
     * 
     * @return flowUsed */
    public Double getFlowUsed() {
        return flowUsed;
    }

    public void setFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
    }

    public SimCardsFlowVO withFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
        return this;
    }

    /** 剩余流量(MB),两位小数
     * 
     * @return flowLeft */
    public Double getFlowLeft() {
        return flowLeft;
    }

    public void setFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimCardsFlowVO simCardsFlowVO = (SimCardsFlowVO) o;
        return Objects.equals(this.id, simCardsFlowVO.id) && Objects.equals(this.accountId, simCardsFlowVO.accountId)
            && Objects.equals(this.simCardId, simCardsFlowVO.simCardId)
            && Objects.equals(this.pricePlanId, simCardsFlowVO.pricePlanId)
            && Objects.equals(this.pricePlanName, simCardsFlowVO.pricePlanName)
            && Objects.equals(this.iccid, simCardsFlowVO.iccid)
            && Objects.equals(this.flowTotal, simCardsFlowVO.flowTotal)
            && Objects.equals(this.flowUsed, simCardsFlowVO.flowUsed)
            && Objects.equals(this.flowLeft, simCardsFlowVO.flowLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, simCardId, pricePlanId, pricePlanName, iccid, flowTotal, flowUsed, flowLeft);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimCardsFlowVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
        sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
        sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
        sb.append("    flowTotal: ").append(toIndentedString(flowTotal)).append("\n");
        sb.append("    flowUsed: ").append(toIndentedString(flowUsed)).append("\n");
        sb.append("    flowLeft: ").append(toIndentedString(flowLeft)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
