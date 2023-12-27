package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 作业对象
 */
public class JobResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    /**
     * 作业类型:  - REAL_TIME: 实时处理  - BATCH: 批处理
     */
    public static final class JobTypeEnum {

        /**
         * Enum REAL_TIME for value: "REAL_TIME"
         */
        public static final JobTypeEnum REAL_TIME = new JobTypeEnum("REAL_TIME");

        /**
         * Enum BATCH for value: "BATCH"
         */
        public static final JobTypeEnum BATCH = new JobTypeEnum("BATCH");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("REAL_TIME", REAL_TIME);
            map.put("BATCH", BATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_instance_end_time")

    private Long lastInstanceEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_instance_status")

    private String lastInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_user")

    private String lastUpdateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_node_job_flag")

    private Boolean singleNodeJobFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public JobResp withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public JobResp withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建用户
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public JobResp withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型:  - REAL_TIME: 实时处理  - BATCH: 批处理
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public JobResp withLastInstanceEndTime(Long lastInstanceEndTime) {
        this.lastInstanceEndTime = lastInstanceEndTime;
        return this;
    }

    /**
     * 最近实例的运行结束时间
     * @return lastInstanceEndTime
     */
    public Long getLastInstanceEndTime() {
        return lastInstanceEndTime;
    }

    public void setLastInstanceEndTime(Long lastInstanceEndTime) {
        this.lastInstanceEndTime = lastInstanceEndTime;
    }

    public JobResp withLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
        return this;
    }

    /**
     * 最近实例的运行状态
     * @return lastInstanceStatus
     */
    public String getLastInstanceStatus() {
        return lastInstanceStatus;
    }

    public void setLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
    }

    public JobResp withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public JobResp withLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
        return this;
    }

    /**
     * 最后修改人
     * @return lastUpdateUser
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public JobResp withName(String name) {
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

    public JobResp withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public JobResp withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 作业目录路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JobResp withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public JobResp withSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
        return this;
    }

    /**
     * 单算子作业标识
     * @return singleNodeJobFlag
     */
    public Boolean getSingleNodeJobFlag() {
        return singleNodeJobFlag;
    }

    public void setSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
    }

    public JobResp withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业启动时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public JobResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态
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
        JobResp that = (JobResp) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.lastInstanceEndTime, that.lastInstanceEndTime)
            && Objects.equals(this.lastInstanceStatus, that.lastInstanceStatus)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.lastUpdateUser, that.lastUpdateUser) && Objects.equals(this.name, that.name)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.path, that.path)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.singleNodeJobFlag, that.singleNodeJobFlag)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            createUser,
            jobType,
            lastInstanceEndTime,
            lastInstanceStatus,
            lastUpdateTime,
            lastUpdateUser,
            name,
            owner,
            path,
            priority,
            singleNodeJobFlag,
            startTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResp {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    lastInstanceEndTime: ").append(toIndentedString(lastInstanceEndTime)).append("\n");
        sb.append("    lastInstanceStatus: ").append(toIndentedString(lastInstanceStatus)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    singleNodeJobFlag: ").append(toIndentedString(singleNodeJobFlag)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
