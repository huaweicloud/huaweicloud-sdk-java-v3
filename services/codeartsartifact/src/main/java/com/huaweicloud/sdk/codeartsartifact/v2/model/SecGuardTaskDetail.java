package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecGuardTaskDetail
 */
public class SecGuardTaskDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_path")

    private String scanPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opensource")

    private OpensourceCount opensource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virus")

    private Integer virus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware")

    private MalwareCount malware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public SecGuardTaskDetail withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**: 任务id。 **取值范围**: 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SecGuardTaskDetail withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**: 任务名。 **取值范围**: 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public SecGuardTaskDetail withScanPath(String scanPath) {
        this.scanPath = scanPath;
        return this;
    }

    /**
     * **参数解释**: 文件扫描路径。 **取值范围**: 不涉及。
     * @return scanPath
     */
    public String getScanPath() {
        return scanPath;
    }

    public void setScanPath(String scanPath) {
        this.scanPath = scanPath;
    }

    public SecGuardTaskDetail withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: 文件名。 **取值范围**: 不涉及。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public SecGuardTaskDetail withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**: 展示名称。 **取值范围**: 不涉及。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public SecGuardTaskDetail withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 路径。 **取值范围**: 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SecGuardTaskDetail withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 **取值范围**: 不涉及。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public SecGuardTaskDetail withOpensource(OpensourceCount opensource) {
        this.opensource = opensource;
        return this;
    }

    public SecGuardTaskDetail withOpensource(Consumer<OpensourceCount> opensourceSetter) {
        if (this.opensource == null) {
            this.opensource = new OpensourceCount();
            opensourceSetter.accept(this.opensource);
        }

        return this;
    }

    /**
     * Get opensource
     * @return opensource
     */
    public OpensourceCount getOpensource() {
        return opensource;
    }

    public void setOpensource(OpensourceCount opensource) {
        this.opensource = opensource;
    }

    public SecGuardTaskDetail withVirus(Integer virus) {
        this.virus = virus;
        return this;
    }

    /**
     * **参数解释**: 病毒文件数。 **取值范围**: 不涉及。
     * @return virus
     */
    public Integer getVirus() {
        return virus;
    }

    public void setVirus(Integer virus) {
        this.virus = virus;
    }

    public SecGuardTaskDetail withMalware(MalwareCount malware) {
        this.malware = malware;
        return this;
    }

    public SecGuardTaskDetail withMalware(Consumer<MalwareCount> malwareSetter) {
        if (this.malware == null) {
            this.malware = new MalwareCount();
            malwareSetter.accept(this.malware);
        }

        return this;
    }

    /**
     * Get malware
     * @return malware
     */
    public MalwareCount getMalware() {
        return malware;
    }

    public void setMalware(MalwareCount malware) {
        this.malware = malware;
    }

    public SecGuardTaskDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 状态。 **取值范围**: 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
        SecGuardTaskDetail that = (SecGuardTaskDetail) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.scanPath, that.scanPath) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.path, that.path)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.opensource, that.opensource)
            && Objects.equals(this.virus, that.virus) && Objects.equals(this.malware, that.malware)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            scanPath,
            fileName,
            displayName,
            path,
            createdTime,
            opensource,
            virus,
            malware,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecGuardTaskDetail {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    scanPath: ").append(toIndentedString(scanPath)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    opensource: ").append(toIndentedString(opensource)).append("\n");
        sb.append("    virus: ").append(toIndentedString(virus)).append("\n");
        sb.append("    malware: ").append(toIndentedString(malware)).append("\n");
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
