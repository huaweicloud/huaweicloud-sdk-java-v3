package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 运行日志单个条目
 */
public class RunlogItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_ip")

    private String replicationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupId")

    private String backupId;

    public RunlogItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 日志的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RunlogItem withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 运行日志文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RunlogItem withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分片名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public RunlogItem withReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
        return this;
    }

    /**
     * 采集运行日志所在副本的IP
     * @return replicationIp
     */
    public String getReplicationIp() {
        return replicationIp;
    }

    public void setReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
    }

    public RunlogItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 获取运行日志状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RunlogItem withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 运行日志采集的日期，格式为\"yyyy-MM-dd\"
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public RunlogItem withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 日志文件的ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunlogItem runlogItem = (RunlogItem) o;
        return Objects.equals(this.id, runlogItem.id) && Objects.equals(this.fileName, runlogItem.fileName)
            && Objects.equals(this.groupName, runlogItem.groupName)
            && Objects.equals(this.replicationIp, runlogItem.replicationIp)
            && Objects.equals(this.status, runlogItem.status) && Objects.equals(this.time, runlogItem.time)
            && Objects.equals(this.backupId, runlogItem.backupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, groupName, replicationIp, status, time, backupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunlogItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    replicationIp: ").append(toIndentedString(replicationIp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
