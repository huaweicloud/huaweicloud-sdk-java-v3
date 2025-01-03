package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改Live2Vod任务
 */
public class ModifyHarvestTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_desc")

    private String taskDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_info")

    private VodPackageInfo packageInfo;

    public ModifyHarvestTaskRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 频道推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ModifyHarvestTaskRequestBody withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组名或应用名
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ModifyHarvestTaskRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 频道ID。频道唯一标识，为必填项。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModifyHarvestTaskRequestBody withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。Unix时间戳，单位为秒
     * minimum: 978177600
     * maximum: 32535086400
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public ModifyHarvestTaskRequestBody withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。Unix时间戳，单位为秒
     * minimum: 978177600
     * maximum: 32535086400
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public ModifyHarvestTaskRequestBody withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称。必选配置
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ModifyHarvestTaskRequestBody withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务Id。必选配置
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ModifyHarvestTaskRequestBody withTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }

    /**
     * 任务描述，可选配置
     * @return taskDesc
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public ModifyHarvestTaskRequestBody withPackageInfo(VodPackageInfo packageInfo) {
        this.packageInfo = packageInfo;
        return this;
    }

    public ModifyHarvestTaskRequestBody withPackageInfo(Consumer<VodPackageInfo> packageInfoSetter) {
        if (this.packageInfo == null) {
            this.packageInfo = new VodPackageInfo();
            packageInfoSetter.accept(this.packageInfo);
        }

        return this;
    }

    /**
     * Get packageInfo
     * @return packageInfo
     */
    public VodPackageInfo getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(VodPackageInfo packageInfo) {
        this.packageInfo = packageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyHarvestTaskRequestBody that = (ModifyHarvestTaskRequestBody) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.taskDesc, that.taskDesc)
            && Objects.equals(this.packageInfo, that.packageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, id, startTime, endTime, eventName, jobId, taskDesc, packageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHarvestTaskRequestBody {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    taskDesc: ").append(toIndentedString(taskDesc)).append("\n");
        sb.append("    packageInfo: ").append(toIndentedString(packageInfo)).append("\n");
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
