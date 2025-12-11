package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建付费扫描任务
 */
public class CreateAntiVirusPaidTaskRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_types")

    private List<Integer> fileTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_dir")

    private String scanDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_dir")

    private String ignoreDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public CreateAntiVirusPaidTaskRequestInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**: 任务名称 **取值范围**: 最大长度255个unicode字符。 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateAntiVirusPaidTaskRequestInfo withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**： 任务类型 **取值范围**： 包含如下:   - quick ：快速扫描   - full : 全盘扫描   - custom : 自定义扫描 
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public CreateAntiVirusPaidTaskRequestInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**: 处置动作 **取值范围**: - auto：自动处置 - manual：人工处置 
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateAntiVirusPaidTaskRequestInfo withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public CreateAntiVirusPaidTaskRequestInfo addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public CreateAntiVirusPaidTaskRequestInfo withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * 病毒查杀主机列表
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public CreateAntiVirusPaidTaskRequestInfo withFileTypes(List<Integer> fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }

    public CreateAntiVirusPaidTaskRequestInfo addFileTypesItem(Integer fileTypesItem) {
        if (this.fileTypes == null) {
            this.fileTypes = new ArrayList<>();
        }
        this.fileTypes.add(fileTypesItem);
        return this;
    }

    public CreateAntiVirusPaidTaskRequestInfo withFileTypes(Consumer<List<Integer>> fileTypesSetter) {
        if (this.fileTypes == null) {
            this.fileTypes = new ArrayList<>();
        }
        fileTypesSetter.accept(this.fileTypes);
        return this;
    }

    /**
     * 文件类型集合型，包含如下:   - 0 ：全部   - 1 : 可执行   - 2 : 压缩   - 3 : 脚本   - 4 : 文档   - 5 : 图片   - 6 : 音视频
     * @return fileTypes
     */
    public List<Integer> getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(List<Integer> fileTypes) {
        this.fileTypes = fileTypes;
    }

    public CreateAntiVirusPaidTaskRequestInfo withScanDir(String scanDir) {
        this.scanDir = scanDir;
        return this;
    }

    /**
     * 扫描目录，多个用;分隔
     * @return scanDir
     */
    public String getScanDir() {
        return scanDir;
    }

    public void setScanDir(String scanDir) {
        this.scanDir = scanDir;
    }

    public CreateAntiVirusPaidTaskRequestInfo withIgnoreDir(String ignoreDir) {
        this.ignoreDir = ignoreDir;
        return this;
    }

    /**
     * 排除目录，多个用;分隔
     * @return ignoreDir
     */
    public String getIgnoreDir() {
        return ignoreDir;
    }

    public void setIgnoreDir(String ignoreDir) {
        this.ignoreDir = ignoreDir;
    }

    public CreateAntiVirusPaidTaskRequestInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID 创建病毒扫描任务时,task_id是null.重新扫描时，task_id不是null,是当前任务的ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAntiVirusPaidTaskRequestInfo that = (CreateAntiVirusPaidTaskRequestInfo) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.scanType, that.scanType)
            && Objects.equals(this.action, that.action) && Objects.equals(this.hostIds, that.hostIds)
            && Objects.equals(this.fileTypes, that.fileTypes) && Objects.equals(this.scanDir, that.scanDir)
            && Objects.equals(this.ignoreDir, that.ignoreDir) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, scanType, action, hostIds, fileTypes, scanDir, ignoreDir, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAntiVirusPaidTaskRequestInfo {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    fileTypes: ").append(toIndentedString(fileTypes)).append("\n");
        sb.append("    scanDir: ").append(toIndentedString(scanDir)).append("\n");
        sb.append("    ignoreDir: ").append(toIndentedString(ignoreDir)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
