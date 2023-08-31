package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * WorkOrderVo
 */
public class WorkOrderVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_type")

    private Integer simType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_type")

    private Integer workOrderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_detail")

    private String reqDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_count")

    private Integer failCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_count")

    private Integer processCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private OffsetDateTime finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_source")

    private Integer workOrderSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_source_desc")

    private String workOrderSourceDesc;

    public WorkOrderVo withId(Long id) {
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

    public WorkOrderVo withSimType(Integer simType) {
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

    public WorkOrderVo withWorkOrderType(Integer workOrderType) {
        this.workOrderType = workOrderType;
        return this;
    }

    /**
     * 业务受理类型：1.批量激活实体卡 2.批量转移实体卡 3.创建流量池 4.实体卡复机 5.实体卡停机 6.批量启用或复机 7.批量停用或停机 8.批量订购 9.批量退订 10.实体卡激活 11.申请断网 12.达量断网 13.机卡重绑 14.实名制信息清除 15.实体卡限速 16.批量补卡 17.批量机卡重绑 18.重启已废弃后向流量池 19.批量达量断网 20断网恢复 21取消达量断网 22批量取消达量断网 23批量拆机
     * @return workOrderType
     */
    public Integer getWorkOrderType() {
        return workOrderType;
    }

    public void setWorkOrderType(Integer workOrderType) {
        this.workOrderType = workOrderType;
    }

    public WorkOrderVo withReqDetail(String reqDetail) {
        this.reqDetail = reqDetail;
        return this;
    }

    /**
     * 请求详情
     * @return reqDetail
     */
    public String getReqDetail() {
        return reqDetail;
    }

    public void setReqDetail(String reqDetail) {
        this.reqDetail = reqDetail;
    }

    public WorkOrderVo withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 业务受理明细总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public WorkOrderVo withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 业务受理明细成功数
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public WorkOrderVo withFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    /**
     * 业务受理明细失败数
     * @return failCount
     */
    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public WorkOrderVo withProcessCount(Integer processCount) {
        this.processCount = processCount;
        return this;
    }

    /**
     * 业务受理明细处理中数
     * @return processCount
     */
    public Integer getProcessCount() {
        return processCount;
    }

    public void setProcessCount(Integer processCount) {
        this.processCount = processCount;
    }

    public WorkOrderVo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 业务受理状态：1审核中、2已审核、3处理中、4已完成、5已取消、6失败、7 审核不通过
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public WorkOrderVo withCreateTime(OffsetDateTime createTime) {
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

    public WorkOrderVo withFinishTime(OffsetDateTime finishTime) {
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

    public WorkOrderVo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public WorkOrderVo withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * 响应内容
     * @return response
     */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public WorkOrderVo withWorkOrderSource(Integer workOrderSource) {
        this.workOrderSource = workOrderSource;
        return this;
    }

    /**
     * 业务受理单来源,1:运营人员生成,2:用户操作生成(console),3:自动化规则生成,4:后向流量池超阈值停用次月自动复机任务,5:单卡没流量停机定时任务,6:SIM卡到期自动停机定时任务,7:流量池停机定时任务,8:用户操作生成(api)
     * @return workOrderSource
     */
    public Integer getWorkOrderSource() {
        return workOrderSource;
    }

    public void setWorkOrderSource(Integer workOrderSource) {
        this.workOrderSource = workOrderSource;
    }

    public WorkOrderVo withWorkOrderSourceDesc(String workOrderSourceDesc) {
        this.workOrderSourceDesc = workOrderSourceDesc;
        return this;
    }

    /**
     * 业务受理单来源描述
     * @return workOrderSourceDesc
     */
    public String getWorkOrderSourceDesc() {
        return workOrderSourceDesc;
    }

    public void setWorkOrderSourceDesc(String workOrderSourceDesc) {
        this.workOrderSourceDesc = workOrderSourceDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkOrderVo that = (WorkOrderVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.simType, that.simType)
            && Objects.equals(this.workOrderType, that.workOrderType) && Objects.equals(this.reqDetail, that.reqDetail)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failCount, that.failCount) && Objects.equals(this.processCount, that.processCount)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.response, that.response)
            && Objects.equals(this.workOrderSource, that.workOrderSource)
            && Objects.equals(this.workOrderSourceDesc, that.workOrderSourceDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            simType,
            workOrderType,
            reqDetail,
            totalCount,
            successCount,
            failCount,
            processCount,
            status,
            createTime,
            finishTime,
            failReason,
            response,
            workOrderSource,
            workOrderSourceDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkOrderVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    workOrderType: ").append(toIndentedString(workOrderType)).append("\n");
        sb.append("    reqDetail: ").append(toIndentedString(reqDetail)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    processCount: ").append(toIndentedString(processCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    workOrderSource: ").append(toIndentedString(workOrderSource)).append("\n");
        sb.append("    workOrderSourceDesc: ").append(toIndentedString(workOrderSourceDesc)).append("\n");
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
