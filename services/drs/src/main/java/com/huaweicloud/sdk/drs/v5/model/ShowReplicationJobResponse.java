package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReplicationJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_info")

    private BackupInfoResp backupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private BackupJobBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_info")

    private BackupJobEndpointInfo targetDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private BackupRestoreOptionInfo options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_db_names")

    private String newDbNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_log")

    private String errorLog;

    public ShowReplicationJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowReplicationJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。取值：success，failed
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowReplicationJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowReplicationJobResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 任务完成时间。
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ShowReplicationJobResponse withBackupInfo(BackupInfoResp backupInfo) {
        this.backupInfo = backupInfo;
        return this;
    }

    public ShowReplicationJobResponse withBackupInfo(Consumer<BackupInfoResp> backupInfoSetter) {
        if (this.backupInfo == null) {
            this.backupInfo = new BackupInfoResp();
            backupInfoSetter.accept(this.backupInfo);
        }

        return this;
    }

    /**
     * Get backupInfo
     * @return backupInfo
     */
    public BackupInfoResp getBackupInfo() {
        return backupInfo;
    }

    public void setBackupInfo(BackupInfoResp backupInfo) {
        this.backupInfo = backupInfo;
    }

    public ShowReplicationJobResponse withBaseInfo(BackupJobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ShowReplicationJobResponse withBaseInfo(Consumer<BackupJobBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new BackupJobBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public BackupJobBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BackupJobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public ShowReplicationJobResponse withTargetDbInfo(BackupJobEndpointInfo targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
        return this;
    }

    public ShowReplicationJobResponse withTargetDbInfo(Consumer<BackupJobEndpointInfo> targetDbInfoSetter) {
        if (this.targetDbInfo == null) {
            this.targetDbInfo = new BackupJobEndpointInfo();
            targetDbInfoSetter.accept(this.targetDbInfo);
        }

        return this;
    }

    /**
     * Get targetDbInfo
     * @return targetDbInfo
     */
    public BackupJobEndpointInfo getTargetDbInfo() {
        return targetDbInfo;
    }

    public void setTargetDbInfo(BackupJobEndpointInfo targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
    }

    public ShowReplicationJobResponse withOptions(BackupRestoreOptionInfo options) {
        this.options = options;
        return this;
    }

    public ShowReplicationJobResponse withOptions(Consumer<BackupRestoreOptionInfo> optionsSetter) {
        if (this.options == null) {
            this.options = new BackupRestoreOptionInfo();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public BackupRestoreOptionInfo getOptions() {
        return options;
    }

    public void setOptions(BackupRestoreOptionInfo options) {
        this.options = options;
    }

    public ShowReplicationJobResponse withNewDbNames(String newDbNames) {
        this.newDbNames = newDbNames;
        return this;
    }

    /**
     * 备份恢复数据库映射新名称。
     * @return newDbNames
     */
    public String getNewDbNames() {
        return newDbNames;
    }

    public void setNewDbNames(String newDbNames) {
        this.newDbNames = newDbNames;
    }

    public ShowReplicationJobResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * RDS实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowReplicationJobResponse withErrorLog(String errorLog) {
        this.errorLog = errorLog;
        return this;
    }

    /**
     * 迁移过程中失败原因。
     * @return errorLog
     */
    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReplicationJobResponse that = (ShowReplicationJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.backupInfo, that.backupInfo) && Objects.equals(this.baseInfo, that.baseInfo)
            && Objects.equals(this.targetDbInfo, that.targetDbInfo) && Objects.equals(this.options, that.options)
            && Objects.equals(this.newDbNames, that.newDbNames) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.errorLog, that.errorLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            createTime,
            finishTime,
            backupInfo,
            baseInfo,
            targetDbInfo,
            options,
            newDbNames,
            instanceName,
            errorLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplicationJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    backupInfo: ").append(toIndentedString(backupInfo)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    targetDbInfo: ").append(toIndentedString(targetDbInfo)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    newDbNames: ").append(toIndentedString(newDbNames)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
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
