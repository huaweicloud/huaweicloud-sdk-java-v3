package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateExportTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_task_id")

    private String exportTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_condition")

    private Object resourceCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_format")

    private String exportFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_count")

    private Long exportCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public CreateExportTaskResponse withExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }

    /**
     * 导出任务唯一id。
     * @return exportTaskId
     */
    public String getExportTaskId() {
        return exportTaskId;
    }

    public void setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
    }

    public CreateExportTaskResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 导出源资源类型，支持批量任务导出类型BatchTask。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public CreateExportTaskResponse withResourceCondition(Object resourceCondition) {
        this.resourceCondition = resourceCondition;
        return this;
    }

    /**
     * 资源过滤条件，Json格式，里面是(K,V)键值对，当resource_type为BatchTask时填写填写key为task_id，value为BatchTask的task_id(task_id从批量任务接口获得)。
     * @return resourceCondition
     */
    public Object getResourceCondition() {
        return resourceCondition;
    }

    public void setResourceCondition(Object resourceCondition) {
        this.resourceCondition = resourceCondition;
    }

    public CreateExportTaskResponse withExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
        return this;
    }

    /**
     * 导出格式，目前xls格式。
     * @return exportFormat
     */
    public String getExportFormat() {
        return exportFormat;
    }

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    public CreateExportTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态，状态分别有：Processing：执行中，Success：成功，Failed：失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateExportTaskResponse withExportCount(Long exportCount) {
        this.exportCount = exportCount;
        return this;
    }

    /**
     * 已导出的资源数量。
     * @return exportCount
     */
    public Long getExportCount() {
        return exportCount;
    }

    public void setExportCount(Long exportCount) {
        this.exportCount = exportCount;
    }

    public CreateExportTaskResponse withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 导出任务的执行进度，取值范围为1-100，当100表示进度为100%，任务完成。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public CreateExportTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 在物联网平台创建产品的时间，格式：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'，如2020-08-12T12:12:12.333Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateExportTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 导出任务的执行结束时间，格式：yyyy-MM-dd'T'HH:mm:ss.SSS'Z'，如2020-08-12T12:12:12.333Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateExportTaskResponse withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 租户规则的生效范围，默认GLOBAL，取值如下： - GLOBAL：生效范围为租户级 - APP：生效范围为应用级，如果类型为APP，需要携带app_id，如果不带，生效范围为defaultApp。 
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public CreateExportTaskResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID。此参数为非必选参数，用于兼容平台老用户存在多应用的场景。存在多应用的用户需要使用该接口时，必须携带该参数指定创建的规则归属到哪个应用下，否则接口会提示错误。如果用户存在多应用，同时又不想携带该参数，可以联系华为技术支持对用户数据做应用合并。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExportTaskResponse that = (CreateExportTaskResponse) obj;
        return Objects.equals(this.exportTaskId, that.exportTaskId)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceCondition, that.resourceCondition)
            && Objects.equals(this.exportFormat, that.exportFormat) && Objects.equals(this.status, that.status)
            && Objects.equals(this.exportCount, that.exportCount) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportTaskId,
            resourceType,
            resourceCondition,
            exportFormat,
            status,
            exportCount,
            progress,
            createTime,
            endTime,
            appType,
            appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExportTaskResponse {\n");
        sb.append("    exportTaskId: ").append(toIndentedString(exportTaskId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceCondition: ").append(toIndentedString(resourceCondition)).append("\n");
        sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    exportCount: ").append(toIndentedString(exportCount)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
