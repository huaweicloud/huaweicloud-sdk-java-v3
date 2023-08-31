package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkOrdersRequest {

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
    @JsonProperty(value = "work_order_type")

    private Integer workOrderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ListWorkOrdersRequest withMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
        return this;
    }

    /**
     * 业务受理ID
     * @return mainSearchKey
     */
    public String getMainSearchKey() {
        return mainSearchKey;
    }

    public void setMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
    }

    public ListWorkOrdersRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数
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

    public ListWorkOrdersRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数
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

    public ListWorkOrdersRequest withSimType(Integer simType) {
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

    public ListWorkOrdersRequest withWorkOrderType(Integer workOrderType) {
        this.workOrderType = workOrderType;
        return this;
    }

    /**
     * 业务受理类型：1.批量激活实体卡 2.批量转移实体卡 3.创建流量池 4.实体卡复机 5.实体卡停机 6.批量启用或复机 7.批量停用或停机 8.批量订购 9.批量退订 10.实体卡激活 11.申请断网 12.达量断网 13.机卡重绑 14.实名制信息清除 15.实体卡限速 16.批量补卡 17.批量机卡重绑 18.重启已废弃后向流量池 19.批量达量断网 20断网恢复 21取消达量断网 22批量取消达量断网 23批量拆机
     * minimum: 1
     * maximum: 99
     * @return workOrderType
     */
    public Integer getWorkOrderType() {
        return workOrderType;
    }

    public void setWorkOrderType(Integer workOrderType) {
        this.workOrderType = workOrderType;
    }

    public ListWorkOrdersRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 业务受理状态:：1审核中、2已审核、3处理中、4已完成、5已取消、6失败、7 审核不通过
     * minimum: 1
     * maximum: 7
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
        ListWorkOrdersRequest that = (ListWorkOrdersRequest) obj;
        return Objects.equals(this.mainSearchKey, that.mainSearchKey) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.simType, that.simType)
            && Objects.equals(this.workOrderType, that.workOrderType) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainSearchKey, limit, offset, simType, workOrderType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkOrdersRequest {\n");
        sb.append("    mainSearchKey: ").append(toIndentedString(mainSearchKey)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    workOrderType: ").append(toIndentedString(workOrderType)).append("\n");
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
