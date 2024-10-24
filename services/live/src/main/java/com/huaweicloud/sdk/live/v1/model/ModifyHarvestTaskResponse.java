package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ModifyHarvestTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

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
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_desc")

    private String taskDesc;

    /**
     * 任务状态，取值为 [ UNSTART、IN_PROGRESS、SUCCEEDED、FAILED ]
     */
    public static final class StatusEnum {

        /**
         * Enum UNSTART for value: "UNSTART"
         */
        public static final StatusEnum UNSTART = new StatusEnum("UNSTART");

        /**
         * Enum IN_PROGRESS for value: "IN_PROGRESS"
         */
        public static final StatusEnum IN_PROGRESS = new StatusEnum("IN_PROGRESS");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("UNSTART", UNSTART);
            map.put("IN_PROGRESS", IN_PROGRESS);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry_cnt")

    private Integer maxRetryCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_info")

    private VodPackageInfo packageInfo;

    public ModifyHarvestTaskResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ModifyHarvestTaskResponse withDomain(String domain) {
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

    public ModifyHarvestTaskResponse withAppName(String appName) {
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

    public ModifyHarvestTaskResponse withId(String id) {
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

    public ModifyHarvestTaskResponse withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。Unix时间错，单位为秒
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public ModifyHarvestTaskResponse withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。Unix时间错，单位为秒
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public ModifyHarvestTaskResponse withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。Unix时间错，单位为秒
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public ModifyHarvestTaskResponse withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ModifyHarvestTaskResponse withTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }

    /**
     * 任务描述
     * @return taskDesc
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public ModifyHarvestTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态，取值为 [ UNSTART、IN_PROGRESS、SUCCEEDED、FAILED ]
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ModifyHarvestTaskResponse withMaxRetryCnt(Integer maxRetryCnt) {
        this.maxRetryCnt = maxRetryCnt;
        return this;
    }

    /**
     * 任务状态为FAILED时，最大允许重试的次数
     * @return maxRetryCnt
     */
    public Integer getMaxRetryCnt() {
        return maxRetryCnt;
    }

    public void setMaxRetryCnt(Integer maxRetryCnt) {
        this.maxRetryCnt = maxRetryCnt;
    }

    public ModifyHarvestTaskResponse withPackageInfo(VodPackageInfo packageInfo) {
        this.packageInfo = packageInfo;
        return this;
    }

    public ModifyHarvestTaskResponse withPackageInfo(Consumer<VodPackageInfo> packageInfoSetter) {
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
        ModifyHarvestTaskResponse that = (ModifyHarvestTaskResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.taskDesc, that.taskDesc) && Objects.equals(this.status, that.status)
            && Objects.equals(this.maxRetryCnt, that.maxRetryCnt) && Objects.equals(this.packageInfo, that.packageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            domain,
            appName,
            id,
            startTime,
            endTime,
            createTime,
            eventName,
            taskDesc,
            status,
            maxRetryCnt,
            packageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHarvestTaskResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    taskDesc: ").append(toIndentedString(taskDesc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    maxRetryCnt: ").append(toIndentedString(maxRetryCnt)).append("\n");
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
