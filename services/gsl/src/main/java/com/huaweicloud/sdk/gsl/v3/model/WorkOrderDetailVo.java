package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * WorkOrderDetailVo
 */
public class WorkOrderDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_type")

    private Integer simType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private OffsetDateTime finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public WorkOrderDetailVo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 业务受理ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WorkOrderDetailVo withSimType(Integer simType) {
        this.simType = simType;
        return this;
    }

    /**
     * SIM卡类型:3.实体卡
     * @return simType
     */
    public Integer getSimType() {
        return simType;
    }

    public void setSimType(Integer simType) {
        this.simType = simType;
    }

    public WorkOrderDetailVo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 业务受理明细状态：1成功、2处理中、3失败
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public WorkOrderDetailVo withCid(String cid) {
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

    public WorkOrderDetailVo withSimCardId(Long simCardId) {
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

    public WorkOrderDetailVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public WorkOrderDetailVo withFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 完成时间
     * @return finishTime
     */
    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public WorkOrderDetailVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkOrderDetailVo that = (WorkOrderDetailVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.simType, that.simType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.cid, that.cid)
            && Objects.equals(this.simCardId, that.simCardId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, simType, status, cid, simCardId, createTime, finishTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkOrderDetailVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
