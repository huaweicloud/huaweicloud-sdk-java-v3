package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAuditTaskStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "busi_type")

    private String busiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_num")

    private Integer completedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_begin_time")

    private Long queryBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private Long queryEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_switch")

    private String taskSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ShowAuditTaskStatusResponse withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 开始时间
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public ShowAuditTaskStatusResponse withBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }

    /**
     * 业务类型  - audit：审计  - risk：风险
     * @return busiType
     */
    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public ShowAuditTaskStatusResponse withCompletedNum(Integer completedNum) {
        this.completedNum = completedNum;
        return this;
    }

    /**
     * 已统计实例数
     * @return completedNum
     */
    public Integer getCompletedNum() {
        return completedNum;
    }

    public void setCompletedNum(Integer completedNum) {
        this.completedNum = completedNum;
    }

    public ShowAuditTaskStatusResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowAuditTaskStatusResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Task任务ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowAuditTaskStatusResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowAuditTaskStatusResponse withQueryBeginTime(Long queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
        return this;
    }

    /**
     * 查询条件：开始时间
     * @return queryBeginTime
     */
    public Long getQueryBeginTime() {
        return queryBeginTime;
    }

    public void setQueryBeginTime(Long queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
    }

    public ShowAuditTaskStatusResponse withQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * 查询条件：结束时间
     * @return queryEndTime
     */
    public Long getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public ShowAuditTaskStatusResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态  - 0：已就绪  - 1：运行中  - 2：成功  - 3：失败
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowAuditTaskStatusResponse withTaskSwitch(String taskSwitch) {
        this.taskSwitch = taskSwitch;
        return this;
    }

    /**
     * 任务开关
     * @return taskSwitch
     */
    public String getTaskSwitch() {
        return taskSwitch;
    }

    public void setTaskSwitch(String taskSwitch) {
        this.taskSwitch = taskSwitch;
    }

    public ShowAuditTaskStatusResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总实例数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditTaskStatusResponse that = (ShowAuditTaskStatusResponse) obj;
        return Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.busiType, that.busiType)
            && Objects.equals(this.completedNum, that.completedNum) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.queryBeginTime, that.queryBeginTime)
            && Objects.equals(this.queryEndTime, that.queryEndTime) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.taskSwitch, that.taskSwitch) && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime,
            busiType,
            completedNum,
            endTime,
            id,
            projectId,
            queryBeginTime,
            queryEndTime,
            taskStatus,
            taskSwitch,
            totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditTaskStatusResponse {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    busiType: ").append(toIndentedString(busiType)).append("\n");
        sb.append("    completedNum: ").append(toIndentedString(completedNum)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    queryBeginTime: ").append(toIndentedString(queryBeginTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskSwitch: ").append(toIndentedString(taskSwitch)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
