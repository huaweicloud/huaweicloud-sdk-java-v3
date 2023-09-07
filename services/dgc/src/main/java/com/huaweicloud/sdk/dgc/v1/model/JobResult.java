package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobResult
 */
public class JobResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobType")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    /**
     * Gets or Sets status
     */
    public static final class StatusEnum {

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StatusEnum STARTING = new StatusEnum("STARTING");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final StatusEnum NORMAL = new StatusEnum("NORMAL");

        /**
         * Enum EXCEPTION for value: "EXCEPTION"
         */
        public static final StatusEnum EXCEPTION = new StatusEnum("EXCEPTION");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StatusEnum STOPPING = new StatusEnum("STOPPING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        /**
         * Enum SCHEDULING for value: "SCHEDULING"
         */
        public static final StatusEnum SCHEDULING = new StatusEnum("SCHEDULING");

        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final StatusEnum PAUSED = new StatusEnum("PAUSED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("STARTING", STARTING);
            map.put("NORMAL", NORMAL);
            map.put("EXCEPTION", EXCEPTION);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
            map.put("SCHEDULING", SCHEDULING);
            map.put("PAUSED", PAUSED);
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
    @JsonProperty(value = "createUser")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastInstanceStatus")

    private String lastInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastInstanceEndTime")

    private Long lastInstanceEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateUser")

    private String lastUpdateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "singleNodeJobFlag")

    private Boolean singleNodeJobFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flinkJobInfo")

    private String flinkJobInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarms")

    private List<JobAlarm> alarms = null;

    public JobResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobResult withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobResult withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 作业责任人，长度不能超过128个字符
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public JobResult withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业优先级，取值范围[0, 2]，默认值是0。0代表高优先级，1代表中优先级，2代表低优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public JobResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public JobResult withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 作业的创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public JobResult withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业的创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public JobResult withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业的启动时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public JobResult withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业配置的结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public JobResult withLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
        return this;
    }

    /**
     * 作业最近一次运行实例状态，当jobType为BATCH时才有本字段
     * @return lastInstanceStatus
     */
    public String getLastInstanceStatus() {
        return lastInstanceStatus;
    }

    public void setLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
    }

    public JobResult withLastInstanceEndTime(Long lastInstanceEndTime) {
        this.lastInstanceEndTime = lastInstanceEndTime;
        return this;
    }

    /**
     * 作业最近一次运行实例运行结束时间，当jobType为BATCH时才有本字段
     * @return lastInstanceEndTime
     */
    public Long getLastInstanceEndTime() {
        return lastInstanceEndTime;
    }

    public void setLastInstanceEndTime(Long lastInstanceEndTime) {
        this.lastInstanceEndTime = lastInstanceEndTime;
    }

    public JobResult withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 作业最后一次更新时间
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public JobResult withLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
        return this;
    }

    /**
     * 作业最后一次更新用户
     * @return lastUpdateUser
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public JobResult withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 作业的路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JobResult withSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
        return this;
    }

    /**
     * 作业是否为单任务作业
     * @return singleNodeJobFlag
     */
    public Boolean getSingleNodeJobFlag() {
        return singleNodeJobFlag;
    }

    public void setSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
    }

    public JobResult withFlinkJobInfo(String flinkJobInfo) {
        this.flinkJobInfo = flinkJobInfo;
        return this;
    }

    /**
     * flink作业信息
     * @return flinkJobInfo
     */
    public String getFlinkJobInfo() {
        return flinkJobInfo;
    }

    public void setFlinkJobInfo(String flinkJobInfo) {
        this.flinkJobInfo = flinkJobInfo;
    }

    public JobResult withAlarms(List<JobAlarm> alarms) {
        this.alarms = alarms;
        return this;
    }

    public JobResult addAlarmsItem(JobAlarm alarmsItem) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        this.alarms.add(alarmsItem);
        return this;
    }

    public JobResult withAlarms(Consumer<List<JobAlarm>> alarmsSetter) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        alarmsSetter.accept(this.alarms);
        return this;
    }

    /**
     * 作业监控告警信息
     * @return alarms
     */
    public List<JobAlarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<JobAlarm> alarms) {
        this.alarms = alarms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobResult that = (JobResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.lastInstanceStatus, that.lastInstanceStatus)
            && Objects.equals(this.lastInstanceEndTime, that.lastInstanceEndTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.lastUpdateUser, that.lastUpdateUser) && Objects.equals(this.path, that.path)
            && Objects.equals(this.singleNodeJobFlag, that.singleNodeJobFlag)
            && Objects.equals(this.flinkJobInfo, that.flinkJobInfo) && Objects.equals(this.alarms, that.alarms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            jobType,
            owner,
            priority,
            status,
            createUser,
            createTime,
            startTime,
            endTime,
            lastInstanceStatus,
            lastInstanceEndTime,
            lastUpdateTime,
            lastUpdateUser,
            path,
            singleNodeJobFlag,
            flinkJobInfo,
            alarms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastInstanceStatus: ").append(toIndentedString(lastInstanceStatus)).append("\n");
        sb.append("    lastInstanceEndTime: ").append(toIndentedString(lastInstanceEndTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    singleNodeJobFlag: ").append(toIndentedString(singleNodeJobFlag)).append("\n");
        sb.append("    flinkJobInfo: ").append(toIndentedString(flinkJobInfo)).append("\n");
        sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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
