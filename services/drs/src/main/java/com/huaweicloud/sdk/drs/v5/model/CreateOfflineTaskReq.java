package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建备份迁移任务请求。
 */
public class CreateOfflineTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private BackupJobBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_info")

    private BackupJobEndpointInfo targetDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_info")

    private BackupInfo backupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private BackupRestoreOptionInfo options;

    public CreateOfflineTaskReq withBaseInfo(BackupJobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public CreateOfflineTaskReq withBaseInfo(Consumer<BackupJobBaseInfo> baseInfoSetter) {
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

    public CreateOfflineTaskReq withTargetDbInfo(BackupJobEndpointInfo targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
        return this;
    }

    public CreateOfflineTaskReq withTargetDbInfo(Consumer<BackupJobEndpointInfo> targetDbInfoSetter) {
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

    public CreateOfflineTaskReq withBackupInfo(BackupInfo backupInfo) {
        this.backupInfo = backupInfo;
        return this;
    }

    public CreateOfflineTaskReq withBackupInfo(Consumer<BackupInfo> backupInfoSetter) {
        if (this.backupInfo == null) {
            this.backupInfo = new BackupInfo();
            backupInfoSetter.accept(this.backupInfo);
        }

        return this;
    }

    /**
     * Get backupInfo
     * @return backupInfo
     */
    public BackupInfo getBackupInfo() {
        return backupInfo;
    }

    public void setBackupInfo(BackupInfo backupInfo) {
        this.backupInfo = backupInfo;
    }

    public CreateOfflineTaskReq withOptions(BackupRestoreOptionInfo options) {
        this.options = options;
        return this;
    }

    public CreateOfflineTaskReq withOptions(Consumer<BackupRestoreOptionInfo> optionsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOfflineTaskReq that = (CreateOfflineTaskReq) obj;
        return Objects.equals(this.baseInfo, that.baseInfo) && Objects.equals(this.targetDbInfo, that.targetDbInfo)
            && Objects.equals(this.backupInfo, that.backupInfo) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseInfo, targetDbInfo, backupInfo, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOfflineTaskReq {\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    targetDbInfo: ").append(toIndentedString(targetDbInfo)).append("\n");
        sb.append("    backupInfo: ").append(toIndentedString(backupInfo)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
