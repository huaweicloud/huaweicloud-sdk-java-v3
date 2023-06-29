package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackPoolMemVO
 */
public class BackPoolMemVO {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_status")

    private Integer simStatus;

    public BackPoolMemVO withId(Long id) {
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

    public BackPoolMemVO withCid(String cid) {
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

    public BackPoolMemVO withSimPricePlanId(Long simPricePlanId) {
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

    public BackPoolMemVO withFlowUsed(Double flowUsed) {
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

    public BackPoolMemVO withSimStatus(Integer simStatus) {
        this.simStatus = simStatus;
        return this;
    }

    /**
     * 卡当前状态：11-未激活，13-可激活，14-已停用，20-在用，30-已拆机
     * @return simStatus
     */
    public Integer getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(Integer simStatus) {
        this.simStatus = simStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackPoolMemVO that = (BackPoolMemVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cid, that.cid)
            && Objects.equals(this.simPricePlanId, that.simPricePlanId) && Objects.equals(this.flowUsed, that.flowUsed)
            && Objects.equals(this.simStatus, that.simStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cid, simPricePlanId, flowUsed, simStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackPoolMemVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    simPricePlanId: ").append(toIndentedString(simPricePlanId)).append("\n");
        sb.append("    flowUsed: ").append(toIndentedString(flowUsed)).append("\n");
        sb.append("    simStatus: ").append(toIndentedString(simStatus)).append("\n");
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
