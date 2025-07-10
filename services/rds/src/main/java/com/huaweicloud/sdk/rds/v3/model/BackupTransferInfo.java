package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转储任务信息
 */
public class BackupTransferInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Double size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_begin_time")

    private Long backupBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_end_time")

    private Long backupEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_type")

    private String transferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    public BackupTransferInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 备份id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackupTransferInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupTransferInfo withBeginTime(Long beginTime) {
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

    public BackupTransferInfo withEndTime(Long endTime) {
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

    public BackupTransferInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BackupTransferInfo withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * 对象大小,单位为KByte
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public BackupTransferInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BackupTransferInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 目标对象名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BackupTransferInfo withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 目标桶名
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BackupTransferInfo withBackupBeginTime(Long backupBeginTime) {
        this.backupBeginTime = backupBeginTime;
        return this;
    }

    /**
     * 转储备份起始时间
     * @return backupBeginTime
     */
    public Long getBackupBeginTime() {
        return backupBeginTime;
    }

    public void setBackupBeginTime(Long backupBeginTime) {
        this.backupBeginTime = backupBeginTime;
    }

    public BackupTransferInfo withBackupEndTime(Long backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }

    /**
     * 转储备份结束时间
     * @return backupEndTime
     */
    public Long getBackupEndTime() {
        return backupEndTime;
    }

    public void setBackupEndTime(Long backupEndTime) {
        this.backupEndTime = backupEndTime;
    }

    public BackupTransferInfo withTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * 转储任务类型
     * @return transferType
     */
    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public BackupTransferInfo withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 转储目标前缀
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupTransferInfo that = (BackupTransferInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.size, that.size)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.backupBeginTime, that.backupBeginTime)
            && Objects.equals(this.backupEndTime, that.backupEndTime)
            && Objects.equals(this.transferType, that.transferType) && Objects.equals(this.prefix, that.prefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            beginTime,
            endTime,
            status,
            size,
            instanceId,
            fileName,
            destination,
            backupBeginTime,
            backupEndTime,
            transferType,
            prefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupTransferInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    backupBeginTime: ").append(toIndentedString(backupBeginTime)).append("\n");
        sb.append("    backupEndTime: ").append(toIndentedString(backupEndTime)).append("\n");
        sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
