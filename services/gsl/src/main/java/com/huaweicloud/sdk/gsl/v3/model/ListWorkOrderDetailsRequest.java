package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkOrderDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_id")

    private Long workOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_search_key")

    private String mainSearchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_type")

    private Integer simType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ListWorkOrderDetailsRequest withWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }

    /**
     * 业务受理ID
     * minimum: 0
     * @return workOrderId
     */
    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public ListWorkOrderDetailsRequest withMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
        return this;
    }

    /**
     * 容器ID
     * @return mainSearchKey
     */
    public String getMainSearchKey() {
        return mainSearchKey;
    }

    public void setMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
    }

    public ListWorkOrderDetailsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的记录数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListWorkOrderDetailsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码，最小值是1，最大值为1000000。默认值是1
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListWorkOrderDetailsRequest withSimType(Integer simType) {
        this.simType = simType;
        return this;
    }

    /**
     * SIM卡类型:3.实体卡
     * minimum: 1
     * maximum: 10
     * @return simType
     */
    public Integer getSimType() {
        return simType;
    }

    public void setSimType(Integer simType) {
        this.simType = simType;
    }

    public ListWorkOrderDetailsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 业务受理明细状态：1成功、2处理中、3失败
     * minimum: 1
     * maximum: 3
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkOrderDetailsRequest that = (ListWorkOrderDetailsRequest) obj;
        return Objects.equals(this.workOrderId, that.workOrderId)
            && Objects.equals(this.mainSearchKey, that.mainSearchKey) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.simType, that.simType)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workOrderId, mainSearchKey, limit, offset, simType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkOrderDetailsRequest {\n");
        sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
        sb.append("    mainSearchKey: ").append(toIndentedString(mainSearchKey)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
