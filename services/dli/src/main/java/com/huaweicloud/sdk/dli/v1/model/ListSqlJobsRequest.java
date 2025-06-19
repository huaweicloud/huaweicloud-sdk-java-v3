package com.huaweicloud.sdk.dli.v1.model;

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
 * Request Object
 */
public class ListSqlJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-page")

    private Integer currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Long end;

    /**
     * 参数解释:  引擎类型。支持配置spark引擎或hetuEngine引擎 示例: spark 约束限制:  无 取值范围: spark、hetuEngine 默认取值: 无
     */
    public static final class EngineTypeEnum {

        /**
         * Enum SPARK for value: "spark"
         */
        public static final EngineTypeEnum SPARK = new EngineTypeEnum("spark");

        /**
         * Enum HETUENGINE for value: "hetuEngine"
         */
        public static final EngineTypeEnum HETUENGINE = new EngineTypeEnum("hetuEngine");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("spark", SPARK);
            map.put("hetuEngine", HETUENGINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine-type")

    private EngineTypeEnum engineType;

    /**
     * 参数解释:  指定查询的作业状态 示例: FINISHED 约束限制:  长度小于等于16 取值范围: LAUNCHING RUNNING FAILED CANCELLED COMPUTED SUSPENDED ACTIVE DELETED CREATING FINISHED SCALING 默认取值: 无
     */
    public static final class JobStatusEnum {

        /**
         * Enum LAUNCHING for value: "LAUNCHING"
         */
        public static final JobStatusEnum LAUNCHING = new JobStatusEnum("LAUNCHING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final JobStatusEnum RUNNING = new JobStatusEnum("RUNNING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final JobStatusEnum FAILED = new JobStatusEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final JobStatusEnum CANCELLED = new JobStatusEnum("CANCELLED");

        /**
         * Enum COMPUTED for value: "COMPUTED"
         */
        public static final JobStatusEnum COMPUTED = new JobStatusEnum("COMPUTED");

        /**
         * Enum SUSPENDED for value: "SUSPENDED"
         */
        public static final JobStatusEnum SUSPENDED = new JobStatusEnum("SUSPENDED");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final JobStatusEnum ACTIVE = new JobStatusEnum("ACTIVE");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final JobStatusEnum DELETED = new JobStatusEnum("DELETED");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final JobStatusEnum CREATING = new JobStatusEnum("CREATING");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final JobStatusEnum FINISHED = new JobStatusEnum("FINISHED");

        /**
         * Enum SCALING for value: "SCALING"
         */
        public static final JobStatusEnum SCALING = new JobStatusEnum("SCALING");

        private static final Map<String, JobStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobStatusEnum> createStaticFields() {
            Map<String, JobStatusEnum> map = new HashMap<>();
            map.put("LAUNCHING", LAUNCHING);
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            map.put("COMPUTED", COMPUTED);
            map.put("SUSPENDED", SUSPENDED);
            map.put("ACTIVE", ACTIVE);
            map.put("DELETED", DELETED);
            map.put("CREATING", CREATING);
            map.put("FINISHED", FINISHED);
            map.put("SCALING", SCALING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobStatusEnum(String value) {
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
        public static JobStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStatusEnum(value));
        }

        public static JobStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobStatusEnum) {
                return this.value.equals(((JobStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job-status")

    private JobStatusEnum jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job-id")

    private String jobId;

    /**
     * 参数解释:  指定查询的作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE，若要查询所有类型的作业，则传入ALL。 示例: QUERY 约束限制:  无 取值范围: DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE、ALL 默认取值: 无
     */
    public static final class JobTypeEnum {

        /**
         * Enum DDL for value: "DDL"
         */
        public static final JobTypeEnum DDL = new JobTypeEnum("DDL");

        /**
         * Enum DCL for value: "DCL"
         */
        public static final JobTypeEnum DCL = new JobTypeEnum("DCL");

        /**
         * Enum IMPORT for value: "IMPORT"
         */
        public static final JobTypeEnum IMPORT = new JobTypeEnum("IMPORT");

        /**
         * Enum EXPORT for value: "EXPORT"
         */
        public static final JobTypeEnum EXPORT = new JobTypeEnum("EXPORT");

        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final JobTypeEnum QUERY = new JobTypeEnum("QUERY");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final JobTypeEnum INSERT = new JobTypeEnum("INSERT");

        /**
         * Enum DATA_MIGRATION for value: "DATA_MIGRATION"
         */
        public static final JobTypeEnum DATA_MIGRATION = new JobTypeEnum("DATA_MIGRATION");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final JobTypeEnum UPDATE = new JobTypeEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final JobTypeEnum DELETE = new JobTypeEnum("DELETE");

        /**
         * Enum RESTART_QUEUE for value: "RESTART_QUEUE"
         */
        public static final JobTypeEnum RESTART_QUEUE = new JobTypeEnum("RESTART_QUEUE");

        /**
         * Enum SCALE_QUEUE for value: "SCALE_QUEUE"
         */
        public static final JobTypeEnum SCALE_QUEUE = new JobTypeEnum("SCALE_QUEUE");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final JobTypeEnum ALL = new JobTypeEnum("ALL");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("DDL", DDL);
            map.put("DCL", DCL);
            map.put("IMPORT", IMPORT);
            map.put("EXPORT", EXPORT);
            map.put("QUERY", QUERY);
            map.put("INSERT", INSERT);
            map.put("DATA_MIGRATION", DATA_MIGRATION);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("RESTART_QUEUE", RESTART_QUEUE);
            map.put("SCALE_QUEUE", SCALE_QUEUE);
            map.put("ALL", ALL);
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
    @JsonProperty(value = "job-type")

    private JobTypeEnum jobType;

    /**
     * 参数解释:  指定作业排序方式 示例: duration_desc 约束限制:  无 取值范围: start_time_desc（作业提交时间降序） start_time_asc（作业提交时间升序） duration_desc（作业运行时长降序） duration_asc（作业运行时长升序） 默认取值: start_time_desc
     */
    public static final class OrderEnum {

        /**
         * Enum DURATION_DESC for value: "duration_desc"
         */
        public static final OrderEnum DURATION_DESC = new OrderEnum("duration_desc");

        /**
         * Enum DURATION_ASC for value: "duration_asc"
         */
        public static final OrderEnum DURATION_ASC = new OrderEnum("duration_asc");

        /**
         * Enum START_TIME_DESC for value: "start_time_desc"
         */
        public static final OrderEnum START_TIME_DESC = new OrderEnum("start_time_desc");

        /**
         * Enum START_TIME_ASC for value: "start_time_asc"
         */
        public static final OrderEnum START_TIME_ASC = new OrderEnum("start_time_asc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("duration_desc", DURATION_DESC);
            map.put("duration_asc", DURATION_ASC);
            map.put("start_time_desc", START_TIME_DESC);
            map.put("start_time_asc", START_TIME_ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page-size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_pattern")

    private String sqlPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    /**
     * Gets or Sets jobTypes
     */
    public static final class JobTypesEnum {

        /**
         * Enum DDL for value: "DDL"
         */
        public static final JobTypesEnum DDL = new JobTypesEnum("DDL");

        /**
         * Enum DCL for value: "DCL"
         */
        public static final JobTypesEnum DCL = new JobTypesEnum("DCL");

        /**
         * Enum IMPORT for value: "IMPORT"
         */
        public static final JobTypesEnum IMPORT = new JobTypesEnum("IMPORT");

        /**
         * Enum EXPORT for value: "EXPORT"
         */
        public static final JobTypesEnum EXPORT = new JobTypesEnum("EXPORT");

        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final JobTypesEnum QUERY = new JobTypesEnum("QUERY");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final JobTypesEnum INSERT = new JobTypesEnum("INSERT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final JobTypesEnum UPDATE = new JobTypesEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final JobTypesEnum DELETE = new JobTypesEnum("DELETE");

        private static final Map<String, JobTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypesEnum> createStaticFields() {
            Map<String, JobTypesEnum> map = new HashMap<>();
            map.put("DDL", DDL);
            map.put("DCL", DCL);
            map.put("IMPORT", IMPORT);
            map.put("EXPORT", EXPORT);
            map.put("QUERY", QUERY);
            map.put("INSERT", INSERT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypesEnum(String value) {
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
        public static JobTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypesEnum(value));
        }

        public static JobTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypesEnum) {
                return this.value.equals(((JobTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_types")

    private List<JobTypesEnum> jobTypes = null;

    public ListSqlJobsRequest withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 参数解释:  当前页码，默认为第一页 示例: 55 约束限制:  无 取值范围: 大于1的整数 默认取值: 1
     * minimum: 1
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public ListSqlJobsRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 参数解释:  数据库名称 示例: UQuery 约束限制:  长度小于等于16 取值范围: 无 默认取值: 无
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListSqlJobsRequest withEnd(Long end) {
        this.end = end;
        return this;
    }

    /**
     * 参数解释:  用于查询开始时间在该时间点之前的作业。时间格式为unix时间戳，单位：毫秒 示例: 156789546456 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return end
     */
    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public ListSqlJobsRequest withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 参数解释:  引擎类型。支持配置spark引擎或hetuEngine引擎 示例: spark 约束限制:  无 取值范围: spark、hetuEngine 默认取值: 无
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public ListSqlJobsRequest withJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * 参数解释:  指定查询的作业状态 示例: FINISHED 约束限制:  长度小于等于16 取值范围: LAUNCHING RUNNING FAILED CANCELLED COMPUTED SUSPENDED ACTIVE DELETED CREATING FINISHED SCALING 默认取值: 无
     * @return jobStatus
     */
    public JobStatusEnum getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatusEnum jobStatus) {
        this.jobStatus = jobStatus;
    }

    public ListSqlJobsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释:  作业id 示例: bac76d9b-2891-4c50-a920-b98d8634fd0f 约束限制:  无 取值范围: 无 默认取值: 无
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListSqlJobsRequest withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 参数解释:  指定查询的作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE，若要查询所有类型的作业，则传入ALL。 示例: QUERY 约束限制:  无 取值范围: DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE、ALL 默认取值: 无
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ListSqlJobsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 参数解释:  指定作业排序方式 示例: duration_desc 约束限制:  无 取值范围: start_time_desc（作业提交时间降序） start_time_asc（作业提交时间升序） duration_desc（作业运行时长降序） duration_asc（作业运行时长升序） 默认取值: start_time_desc
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListSqlJobsRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 参数解释:  提交作业的用户名称 示例: ei_dlics_d00352431 约束限制:  无 取值范围: 无 默认取值: 无
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListSqlJobsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 参数解释:  每页显示的最大作业个数 示例: 5 约束限制:  无 取值范围: [1, 100] 默认取值: 50
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListSqlJobsRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 参数解释:  指定queue_name作为作业过滤条件，查询在指定queue上运行的作业 示例: q1 约束限制:  匹配正则表达式^(?!_)(?![0-9]+$)[A-Za-z0-9_]*$且长度在[1, 128]范围内的字符串 取值范围: 无 默认取值: 无
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListSqlJobsRequest withSqlPattern(String sqlPattern) {
        this.sqlPattern = sqlPattern;
        return this;
    }

    /**
     * 参数解释:  指定sql片段作为作业过滤条件，不区分大小写 示例: .*? 约束限制:  长度在[0, 1024]范围内的字符串 取值范围: 无 默认取值: 无
     * @return sqlPattern
     */
    public String getSqlPattern() {
        return sqlPattern;
    }

    public void setSqlPattern(String sqlPattern) {
        this.sqlPattern = sqlPattern;
    }

    public ListSqlJobsRequest withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 参数解释:  用于查询开始时间在该时间点之后的作业。时间格式为unix时间戳，单位：毫秒 示例: 156456784655 约束限制:  无 取值范围: 大于等于1的整数 默认取值: 无
     * minimum: 1
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public ListSqlJobsRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 参数解释:  记录其操作的表名称。类型为Import和Export作业才有“table_name”属性 示例: CS_JOB 约束限制:  无 取值范围: 无 默认取值: 无
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListSqlJobsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 参数解释:  指定作业标签作为过滤条件，支持多标签过滤。格式为“key=value”，如：GET /v1.0/{project_id}/jobs?tags=k1%3Dv1，“=”需要转义为“%3D”，“k1”为标签键，“v1”为标签值 示例: key=value 约束限制:  格式为“key=value”的字符串 取值范围: 无 默认取值: 无
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListSqlJobsRequest withJobTypes(List<JobTypesEnum> jobTypes) {
        this.jobTypes = jobTypes;
        return this;
    }

    public ListSqlJobsRequest addJobTypesItem(JobTypesEnum jobTypesItem) {
        if (this.jobTypes == null) {
            this.jobTypes = new ArrayList<>();
        }
        this.jobTypes.add(jobTypesItem);
        return this;
    }

    public ListSqlJobsRequest withJobTypes(Consumer<List<JobTypesEnum>> jobTypesSetter) {
        if (this.jobTypes == null) {
            this.jobTypes = new ArrayList<>();
        }
        jobTypesSetter.accept(this.jobTypes);
        return this;
    }

    /**
     * 参数解释:  指定查询的作业类型列表，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE，若要查询所有类型的作业，则传入ALL。 示例: QUERY 约束限制:  无 取值范围: DDL、DCL、IMPORT、EXPORT、QUERY、INSERT、DATA_MIGRATION、UPDATE、DELETE、RESTART_QUEUE、SCALE_QUEUE、ALL 默认取值: 无
     * @return jobTypes
     */
    public List<JobTypesEnum> getJobTypes() {
        return jobTypes;
    }

    public void setJobTypes(List<JobTypesEnum> jobTypes) {
        this.jobTypes = jobTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlJobsRequest that = (ListSqlJobsRequest) obj;
        return Objects.equals(this.currentPage, that.currentPage) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.end, that.end) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.jobStatus, that.jobStatus) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.order, that.order)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.queueName, that.queueName) && Objects.equals(this.sqlPattern, that.sqlPattern)
            && Objects.equals(this.start, that.start) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.jobTypes, that.jobTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage,
            dbName,
            end,
            engineType,
            jobStatus,
            jobId,
            jobType,
            order,
            owner,
            pageSize,
            queueName,
            sqlPattern,
            start,
            tableName,
            tags,
            jobTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlJobsRequest {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    sqlPattern: ").append(toIndentedString(sqlPattern)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    jobTypes: ").append(toIndentedString(jobTypes)).append("\n");
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
