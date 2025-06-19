package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSqlJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

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
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<Object> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<List<Object>> rows = null;

    /**
     * 参数解释:  表示作业执行方式，是同步还是异步的 示例: async 约束限制:  无 取值范围: async（异步） sync（同步） 默认取值: 无
     */
    public static final class JobModeEnum {

        /**
         * Enum ASYNC for value: "async"
         */
        public static final JobModeEnum ASYNC = new JobModeEnum("async");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final JobModeEnum SYNC = new JobModeEnum("sync");

        private static final Map<String, JobModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobModeEnum> createStaticFields() {
            Map<String, JobModeEnum> map = new HashMap<>();
            map.put("async", ASYNC);
            map.put("sync", SYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobModeEnum(String value) {
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
        public static JobModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobModeEnum(value));
        }

        public static JobModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobModeEnum) {
                return this.value.equals(((JobModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    private JobModeEnum jobMode;

    public CreateSqlJobResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 参数解释: 当“job_type”为“DCL”时，为请求执行是否成功。“true”表示请求执行成功 示例: true 约束限制:  无 取值范围: true,false 默认取值: 无
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public CreateSqlJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 参数解释: 系统提示信息，执行成功时，信息可能为空 示例: success 约束限制:  无 取值范围: 无 默认取值: 无
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateSqlJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释: 此SQL语句将生成并提交一个新作业，返回此作业的ID，可用于获取作业状态和作业结果 示例: 8ecb0777-9c70-4529-9935-29ea0946039c 约束限制:  无 取值范围: 无 默认取值: 无
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateSqlJobResponse withJobType(JobTypeEnum jobType) {
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

    public CreateSqlJobResponse withSchema(List<Object> schema) {
        this.schema = schema;
        return this;
    }

    public CreateSqlJobResponse addSchemaItem(Object schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public CreateSqlJobResponse withSchema(Consumer<List<Object>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 参数解释:  当语句类型为DDL时，返回其结果的列名称及类型 示例: [{\"col_name\": \"string\"},{\"data_type\": \"string\"},{\"comment\": \"string\"}] 约束限制:  无 取值范围: 无 默认取值: 无
     * @return schema
     */
    public List<Object> getSchema() {
        return schema;
    }

    public void setSchema(List<Object> schema) {
        this.schema = schema;
    }

    public CreateSqlJobResponse withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    public CreateSqlJobResponse addRowsItem(List<Object> rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public CreateSqlJobResponse withRows(Consumer<List<List<Object>>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 参数解释:  当语句类型为DDL时，直接返回其执行结果 示例: [[\"c1\",\"int\",null],[\"c2\",\"string\",null]] 约束限制:  无 取值范围: 无 默认取值: 无
     * @return rows
     */
    public List<List<Object>> getRows() {
        return rows;
    }

    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }

    public CreateSqlJobResponse withJobMode(JobModeEnum jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * 参数解释:  表示作业执行方式，是同步还是异步的 示例: async 约束限制:  无 取值范围: async（异步） sync（同步） 默认取值: 无
     * @return jobMode
     */
    public JobModeEnum getJobMode() {
        return jobMode;
    }

    public void setJobMode(JobModeEnum jobMode) {
        this.jobMode = jobMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlJobResponse that = (CreateSqlJobResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.rows, that.rows)
            && Objects.equals(this.jobMode, that.jobMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobId, jobType, schema, rows, jobMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlJobResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
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
