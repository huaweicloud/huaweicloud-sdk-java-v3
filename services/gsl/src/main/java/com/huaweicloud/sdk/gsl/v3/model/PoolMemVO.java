package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PoolMemVO
 */
public class PoolMemVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_price_plan_id")

    private Long simPricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_used")

    private Double flowUsed;

    public PoolMemVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 流量池标识
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PoolMemVO withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
     * 容器ID
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public PoolMemVO withSimPricePlanId(Long simPricePlanId) {
        this.simPricePlanId = simPricePlanId;
        return this;
    }

    /**
     * 套餐订购实例ID
     * @return simPricePlanId
     */
    public Long getSimPricePlanId() {
        return simPricePlanId;
    }

    public void setSimPricePlanId(Long simPricePlanId) {
        this.simPricePlanId = simPricePlanId;
    }

    public PoolMemVO withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /**
     * 已用流量(查询账期所在月份), 单位MB
     * minimum: 0
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
        PoolMemVO poolMemVO = (PoolMemVO) o;
        return Objects.equals(this.id, poolMemVO.id) && Objects.equals(this.cid, poolMemVO.cid)
            && Objects.equals(this.simPricePlanId, poolMemVO.simPricePlanId)
            && Objects.equals(this.flowUsed, poolMemVO.flowUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, simPricePlanId, flowUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMemVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    simPricePlanId: ").append(toIndentedString(simPricePlanId)).append("\n");
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
