package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 需要设置SMN的任务信息。
 */
public class SelectedSetAlarmTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    public SelectedSetAlarmTaskReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SelectedSetAlarmTaskReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态 CREATING:创建中 - CREATE_FAILED:创建失败 - CONFIGURATION:配置中 - STARTJOBING:启动中 - WAITING_FOR_START:等待启动中 - START_JOB_FAILED:启动失败 - PAUSING:已暂停 - FULL_TRANSFER_STARTED:全量开始,灾备场景下为初始化 - FULL_TRANSFER_FAILED:全量失败,灾备场景下为初始化失败 - FULL_TRANSFER_COMPLETE:全量完成,灾备场景下为初始化完成 - INCRE_TRANSFER_STARTED:增量开始,灾备场景下为灾备中 - INCRE_TRANSFER_FAILED:增量失败,灾备场景下为灾备异常 - RELEASE_RESOURCE_STARTED:结束任务中 - RELEASE_RESOURCE_FAILED:结束任务失败 - RELEASE_RESOURCE_COMPLETE:已结束 - REBUILD_NODE_STARTED:故障恢复中 - REBUILD_NODE_FAILED:故障恢复失败 - CHANGE_JOB_STARTED:任务变更中 - CHANGE_JOB_FAILED:任务变更失败 - DELETED:已删除 - CHILD_TRANSFER_STARTING:再编辑子任务启动中 - CHILD_TRANSFER_STARTED:再编辑子任务迁移中 - CHILD_TRANSFER_COMPLETE:再编辑子任务迁移完成 - CHILD_TRANSFER_FAILED:再编辑子任务迁移失败 - RELEASE_CHILD_TRANSFER_STARTED:再编辑子任务结束中 - RELEASE_CHILD_TRANSFER_COMPLETE:再编辑子任务已结束 - NODE_UPGRADE_START:升级开始 - NODE_UPGRADE_COMPLETE:升级完成 - NODE_UPGRADE_FAILED:升级失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SelectedSetAlarmTaskReq withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectedSetAlarmTaskReq that = (SelectedSetAlarmTaskReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.engineType, that.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, engineType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelectedSetAlarmTaskReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
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
