package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListImageScanTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_image_type")

    private String globalImageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_scope")

    private Integer scanScope;

    public ListImageScanTaskRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListImageScanTaskRequest withGlobalImageType(String globalImageType) {
        this.globalImageType = globalImageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型 **约束限制**: 不涉及 **取值范围**: - local：本地镜像。 - registry：仓库镜像。  **默认取值**: 不涉及 
     * @return globalImageType
     */
    public String getGlobalImageType() {
        return globalImageType;
    }

    public void setGlobalImageType(String globalImageType) {
        this.globalImageType = globalImageType;
    }

    public ListImageScanTaskRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListImageScanTaskRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListImageScanTaskRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 任务总类型 **约束限制**: 不涉及 **取值范围**: - image_sync：镜像同步。 - image_scan：镜像扫描。  **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListImageScanTaskRequest withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * **参数解释**: 任务细分类型 **约束限制**: 不涉及 **取值范围**: - cycle：定时扫描。 - manual：手动扫描。 - autoSync：定时同步。 - manualSync：手动同步。  **默认取值**: 不涉及 
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ListImageScanTaskRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**： 模糊匹配任务名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListImageScanTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 任务id **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListImageScanTaskRequest withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 任务创建时间，时间单位毫秒（ms） **约束限制**： 不涉及 **取值范围**： 最小值0，最大值4070880000000 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 4070880000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListImageScanTaskRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 任务结束时间，时间单位毫秒（ms） **约束限制**： 不涉及 **取值范围**： 最小值0，最大值4070880000000 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 4070880000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListImageScanTaskRequest withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * **参数解释**: 任务情况 **约束限制**: 不涉及 **取值范围**: - scanning：扫描中。 - finished：完成。  **默认取值**: 不涉及 
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ListImageScanTaskRequest withScanScope(Integer scanScope) {
        this.scanScope = scanScope;
        return this;
    }

    /**
     * **参数解释**: 扫描风险类型 **约束限制**: 不涉及 **取值范围**: - 0：none。 - 0x7fffffff：全部。 - 0x000f0000：漏洞。 - 0x0000f000：基线检查。 - 0x00000f00：恶意文件。 - 0x000000f0：敏感信息。 - 0x0000000f：软件合规。  **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2147483547
     * @return scanScope
     */
    public Integer getScanScope() {
        return scanScope;
    }

    public void setScanScope(Integer scanScope) {
        this.scanScope = scanScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageScanTaskRequest that = (ListImageScanTaskRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.globalImageType, that.globalImageType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.type, that.type)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.scanScope, that.scanScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            globalImageType,
            offset,
            limit,
            type,
            taskType,
            taskName,
            taskId,
            createTime,
            endTime,
            taskStatus,
            scanScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageScanTaskRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    globalImageType: ").append(toIndentedString(globalImageType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    scanScope: ").append(toIndentedString(scanScope)).append("\n");
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
