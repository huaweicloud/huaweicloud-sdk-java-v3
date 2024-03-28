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
public class PreviewSqlJobResultResponse extends SdkResponse {

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
     * 作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT。  目前仅支持查看“QUERY”类型作业的执行结果。
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

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("DDL", DDL);
            map.put("DCL", DCL);
            map.put("IMPORT", IMPORT);
            map.put("EXPORT", EXPORT);
            map.put("QUERY", QUERY);
            map.put("INSERT", INSERT);
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
    @JsonProperty(value = "row_count")

    private Integer rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_size")

    private Long inputSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<Map<String, String>> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<List<Object>> rows = null;

    public PreviewSqlJobResultResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public PreviewSqlJobResultResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PreviewSqlJobResultResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public PreviewSqlJobResultResponse withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型，包含DDL、DCL、IMPORT、EXPORT、QUERY、INSERT。  目前仅支持查看“QUERY”类型作业的执行结果。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public PreviewSqlJobResultResponse withRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * 作业结果总条数。
     * @return rowCount
     */
    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public PreviewSqlJobResultResponse withInputSize(Long inputSize) {
        this.inputSize = inputSize;
        return this;
    }

    /**
     * 作业执行过程中扫描的数据量。
     * @return inputSize
     */
    public Long getInputSize() {
        return inputSize;
    }

    public void setInputSize(Long inputSize) {
        this.inputSize = inputSize;
    }

    public PreviewSqlJobResultResponse withSchema(List<Map<String, String>> schema) {
        this.schema = schema;
        return this;
    }

    public PreviewSqlJobResultResponse addSchemaItem(Map<String, String> schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public PreviewSqlJobResultResponse withSchema(Consumer<List<Map<String, String>>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 作业结果列名称和类型。
     * @return schema
     */
    public List<Map<String, String>> getSchema() {
        return schema;
    }

    public void setSchema(List<Map<String, String>> schema) {
        this.schema = schema;
    }

    public PreviewSqlJobResultResponse withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    public PreviewSqlJobResultResponse addRowsItem(List<Object> rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public PreviewSqlJobResultResponse withRows(Consumer<List<List<Object>>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 作业结果集。
     * @return rows
     */
    public List<List<Object>> getRows() {
        return rows;
    }

    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewSqlJobResultResponse that = (PreviewSqlJobResultResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.rowCount, that.rowCount) && Objects.equals(this.inputSize, that.inputSize)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.rows, that.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, jobId, jobType, rowCount, inputSize, schema, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewSqlJobResultResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
        sb.append("    inputSize: ").append(toIndentedString(inputSize)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
