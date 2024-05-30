package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UrlObject
 */
public class UrlObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_classify")

    private String failClassify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_desc")

    private String failDesc;

    public UrlObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * url的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UrlObject withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url的地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * url的状态 processing 处理中，succeed 完成，failed 失败，waiting 等待，refreshing 刷新中，preheating 预热中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UrlObject withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * url创建时间，相对于UTC 1970-01-01到当前时间相隔的毫秒数。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UrlObject withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public UrlObject withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务的类型， 其值可以为REFRESH：刷新任务、PREHEATING：预热任务、REFRESH_AFTER_PREHEATING：预热后刷新
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public UrlObject withFailClassify(String failClassify) {
        this.failClassify = failClassify;
        return this;
    }

    /**
     * 失败原因，url状态为failed时返回。   - ORIGIN_ERROR：源站错误。   - INNER_ERROR：内部错误。   - UNKNOWN_ERROR：未知错误。
     * @return failClassify
     */
    public String getFailClassify() {
        return failClassify;
    }

    public void setFailClassify(String failClassify) {
        this.failClassify = failClassify;
    }

    public UrlObject withFailDesc(String failDesc) {
        this.failDesc = failDesc;
        return this;
    }

    /**
     * 刷新预热失败描述。
     * @return failDesc
     */
    public String getFailDesc() {
        return failDesc;
    }

    public void setFailDesc(String failDesc) {
        this.failDesc = failDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlObject that = (UrlObject) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.url, that.url)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.failClassify, that.failClassify) && Objects.equals(this.failDesc, that.failDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, status, createTime, taskId, taskType, failClassify, failDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    failClassify: ").append(toIndentedString(failClassify)).append("\n");
        sb.append("    failDesc: ").append(toIndentedString(failDesc)).append("\n");
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
