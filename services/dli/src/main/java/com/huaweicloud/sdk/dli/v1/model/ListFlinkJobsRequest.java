package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListFlinkJobsRequest {

    /**
     * 参数解释:  作业类型 示例: flink_jar_job 约束限制:  无 取值范围: flink_sql_job（flink sql作业） flink_opensource_sql_job（flink opensource sql作业） flink_sql_edge_job（flink sql边缘作业） flink_jar_job（flink自定义作业） 默认取值: 无
     */
    public static final class JobTypeEnum {

        /**
         * Enum FLINK_SQL_JOB for value: "flink_sql_job"
         */
        public static final JobTypeEnum FLINK_SQL_JOB = new JobTypeEnum("flink_sql_job");

        /**
         * Enum FLINK_OPENSOURCE_SQL_JOB for value: "flink_opensource_sql_job"
         */
        public static final JobTypeEnum FLINK_OPENSOURCE_SQL_JOB = new JobTypeEnum("flink_opensource_sql_job");

        /**
         * Enum FLINK_SQL_EDGE_JOB for value: "flink_sql_edge_job"
         */
        public static final JobTypeEnum FLINK_SQL_EDGE_JOB = new JobTypeEnum("flink_sql_edge_job");

        /**
         * Enum FLINK_JAR_JOB for value: "flink_jar_job"
         */
        public static final JobTypeEnum FLINK_JAR_JOB = new JobTypeEnum("flink_jar_job");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("flink_sql_job", FLINK_SQL_JOB);
            map.put("flink_opensource_sql_job", FLINK_OPENSOURCE_SQL_JOB);
            map.put("flink_sql_edge_job", FLINK_SQL_EDGE_JOB);
            map.put("flink_jar_job", FLINK_JAR_JOB);
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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_job_id")

    private Long rootJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_detail")

    private Boolean showDetail;

    /**
     * 参数解释:  作业状态 示例: job_submitting 约束限制:  无 取值范围: job_init（草稿） job_submitting（提交中） job_submit_fail（提交失败） job_running（运行中） job_running_exception（运行异常） job_downloading（下载中） job_idle（空闲） job_canceling（停止中） job_cancel_success（已停止） job_cancel_fail（停止失败） job_savepointing（保存点创建中） job_arrearage_stopped（因欠费被停止） job_arrearage_recovering（欠费作业恢复中） job_finish（已完成） 默认取值: 无
     */
    public static final class StatusEnum {

        /**
         * Enum JOB_INIT for value: "job_init"
         */
        public static final StatusEnum JOB_INIT = new StatusEnum("job_init");

        /**
         * Enum JOB_SUBMITTING for value: "job_submitting"
         */
        public static final StatusEnum JOB_SUBMITTING = new StatusEnum("job_submitting");

        /**
         * Enum JOB_SUBMIT_FAIL for value: "job_submit_fail"
         */
        public static final StatusEnum JOB_SUBMIT_FAIL = new StatusEnum("job_submit_fail");

        /**
         * Enum JOB_RUNNING for value: "job_running"
         */
        public static final StatusEnum JOB_RUNNING = new StatusEnum("job_running");

        /**
         * Enum JOB_RUNNING_EXCEPTION for value: "job_running_exception"
         */
        public static final StatusEnum JOB_RUNNING_EXCEPTION = new StatusEnum("job_running_exception");

        /**
         * Enum JOB_DOWNLOADING for value: "job_downloading"
         */
        public static final StatusEnum JOB_DOWNLOADING = new StatusEnum("job_downloading");

        /**
         * Enum JOB_IDLE for value: "job_idle"
         */
        public static final StatusEnum JOB_IDLE = new StatusEnum("job_idle");

        /**
         * Enum JOB_CANCELING for value: "job_canceling"
         */
        public static final StatusEnum JOB_CANCELING = new StatusEnum("job_canceling");

        /**
         * Enum JOB_CANCEL_SUCCESS for value: "job_cancel_success"
         */
        public static final StatusEnum JOB_CANCEL_SUCCESS = new StatusEnum("job_cancel_success");

        /**
         * Enum JOB_CANCEL_FAIL for value: "job_cancel_fail"
         */
        public static final StatusEnum JOB_CANCEL_FAIL = new StatusEnum("job_cancel_fail");

        /**
         * Enum JOB_SAVEPOINTING for value: "job_savepointing"
         */
        public static final StatusEnum JOB_SAVEPOINTING = new StatusEnum("job_savepointing");

        /**
         * Enum JOB_ARREARAGE_STOPPED for value: "job_arrearage_stopped"
         */
        public static final StatusEnum JOB_ARREARAGE_STOPPED = new StatusEnum("job_arrearage_stopped");

        /**
         * Enum JOB_ARREARAGE_RECOVERING for value: "job_arrearage_recovering"
         */
        public static final StatusEnum JOB_ARREARAGE_RECOVERING = new StatusEnum("job_arrearage_recovering");

        /**
         * Enum JOB_FINISH for value: "job_finish"
         */
        public static final StatusEnum JOB_FINISH = new StatusEnum("job_finish");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("job_init", JOB_INIT);
            map.put("job_submitting", JOB_SUBMITTING);
            map.put("job_submit_fail", JOB_SUBMIT_FAIL);
            map.put("job_running", JOB_RUNNING);
            map.put("job_running_exception", JOB_RUNNING_EXCEPTION);
            map.put("job_downloading", JOB_DOWNLOADING);
            map.put("job_idle", JOB_IDLE);
            map.put("job_canceling", JOB_CANCELING);
            map.put("job_cancel_success", JOB_CANCEL_SUCCESS);
            map.put("job_cancel_fail", JOB_CANCEL_FAIL);
            map.put("job_savepointing", JOB_SAVEPOINTING);
            map.put("job_arrearage_stopped", JOB_ARREARAGE_STOPPED);
            map.put("job_arrearage_recovering", JOB_ARREARAGE_RECOVERING);
            map.put("job_finish", JOB_FINISH);
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
    @JsonProperty(value = "sys_enterprise_project_name")

    private String sysEnterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public ListFlinkJobsRequest withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 参数解释:  作业类型 示例: flink_jar_job 约束限制:  无 取值范围: flink_sql_job（flink sql作业） flink_opensource_sql_job（flink opensource sql作业） flink_sql_edge_job（flink sql边缘作业） flink_jar_job（flink自定义作业） 默认取值: 无
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ListFlinkJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 参数解释:  返回的数据条数。默认为10 示例: 100 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFlinkJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释:  作业名称 示例: myjob 约束限制:  长度在[0,57]的字符串 取值范围: 无 默认取值: 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListFlinkJobsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 参数解释:  作业偏移量 示例: 10000 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListFlinkJobsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 参数解释:  查询结果排序 示例: asc 约束限制:  无 取值范围: asc desc 默认取值: desc
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListFlinkJobsRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 参数解释:  队列名称 示例: queue1 约束限制:  无 取值范围: 无 默认取值: 无
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListFlinkJobsRequest withRootJobId(Long rootJobId) {
        this.rootJobId = rootJobId;
        return this;
    }

    /**
     * 参数解释:  边缘父作业ID, 用于查询指定边缘作业的子作业。不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业 示例: 548483 约束限制:  无 取值范围: 无 默认取值: 无
     * @return rootJobId
     */
    public Long getRootJobId() {
        return rootJobId;
    }

    public void setRootJobId(Long rootJobId) {
        this.rootJobId = rootJobId;
    }

    public ListFlinkJobsRequest withShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }

    /**
     * 参数解释:  是否返回作业详情信息 示例: false 约束限制:  无 取值范围: true,false 默认取值: false
     * @return showDetail
     */
    public Boolean getShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    public ListFlinkJobsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 参数解释:  作业状态 示例: job_submitting 约束限制:  无 取值范围: job_init（草稿） job_submitting（提交中） job_submit_fail（提交失败） job_running（运行中） job_running_exception（运行异常） job_downloading（下载中） job_idle（空闲） job_canceling（停止中） job_cancel_success（已停止） job_cancel_fail（停止失败） job_savepointing（保存点创建中） job_arrearage_stopped（因欠费被停止） job_arrearage_recovering（欠费作业恢复中） job_finish（已完成） 默认取值: 无
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListFlinkJobsRequest withSysEnterpriseProjectName(String sysEnterpriseProjectName) {
        this.sysEnterpriseProjectName = sysEnterpriseProjectName;
        return this;
    }

    /**
     * 参数解释:  企业项目名称 示例: DLI 约束限制:  无 取值范围: 无 默认取值: 无
     * @return sysEnterpriseProjectName
     */
    public String getSysEnterpriseProjectName() {
        return sysEnterpriseProjectName;
    }

    public void setSysEnterpriseProjectName(String sysEnterpriseProjectName) {
        this.sysEnterpriseProjectName = sysEnterpriseProjectName;
    }

    public ListFlinkJobsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 参数解释:  标签列表 示例: key_zy1=zy01,AA=aa 约束限制:  符合键值对格式(如“key=value”)的字符串 取值范围: 无 默认取值: 无
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListFlinkJobsRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 参数解释:  用户名，可作为筛选条件 示例: ei_dlics_d00352431 约束限制:  无 取值范围: 无 默认取值: 无
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkJobsRequest that = (ListFlinkJobsRequest) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.order, that.order) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.rootJobId, that.rootJobId) && Objects.equals(this.showDetail, that.showDetail)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.sysEnterpriseProjectName, that.sysEnterpriseProjectName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            limit,
            name,
            offset,
            order,
            queueName,
            rootJobId,
            showDetail,
            status,
            sysEnterpriseProjectName,
            tags,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobsRequest {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    rootJobId: ").append(toIndentedString(rootJobId)).append("\n");
        sb.append("    showDetail: ").append(toIndentedString(showDetail)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sysEnterpriseProjectName: ").append(toIndentedString(sysEnterpriseProjectName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
