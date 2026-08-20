package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkSql作业结果信息，包含查询结果的格式和路径等。
 */
public class SparkSqlResultResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_format")

    private String resultFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_path")

    private String resultPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_records")

    private Long resultRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_bytes")

    private Long resultBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_profile_path")

    private String executionProfilePath;

    public SparkSqlResultResponse withResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }

    /**
     * **参数解释**：查询类SQL结果格式，用于指定结果的存储格式。 **取值范围**：csv、arrow。
     * @return resultFormat
     */
    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    public SparkSqlResultResponse withResultPath(String resultPath) {
        this.resultPath = resultPath;
        return this;
    }

    /**
     * **参数解释**：查询类SQL结果的OBS路径，用于存储SQL查询的结果数据。 **取值范围**：采用OBS路径格式，例如：obs://bucket/aidatalake/workspace_xxx/spark/endpoint_xxx/jobs/sql_result/{statement_id}/result.csv。
     * @return resultPath
     */
    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }

    public SparkSqlResultResponse withResultRecords(Long resultRecords) {
        this.resultRecords = resultRecords;
        return this;
    }

    /**
     * **参数解释**：查询结果行数，表示SQL查询返回的数据行数。
     * @return resultRecords
     */
    public Long getResultRecords() {
        return resultRecords;
    }

    public void setResultRecords(Long resultRecords) {
        this.resultRecords = resultRecords;
    }

    public SparkSqlResultResponse withResultBytes(Long resultBytes) {
        this.resultBytes = resultBytes;
        return this;
    }

    /**
     * **参数解释**：查询结果字节数，表示SQL查询返回的数据大小。
     * @return resultBytes
     */
    public Long getResultBytes() {
        return resultBytes;
    }

    public void setResultBytes(Long resultBytes) {
        this.resultBytes = resultBytes;
    }

    public SparkSqlResultResponse withExecutionProfilePath(String executionProfilePath) {
        this.executionProfilePath = executionProfilePath;
        return this;
    }

    /**
     * **参数解释**：作业执行计划的存储路径，用于存储作业的执行计划信息。 **取值范围**：采用OBS路径格式，例如：obs://bucket/aidatalake/workspace_xxx/spark/endpoint_xxx/jobs/sql_profile/{statement_id}/。
     * @return executionProfilePath
     */
    public String getExecutionProfilePath() {
        return executionProfilePath;
    }

    public void setExecutionProfilePath(String executionProfilePath) {
        this.executionProfilePath = executionProfilePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlResultResponse that = (SparkSqlResultResponse) obj;
        return Objects.equals(this.resultFormat, that.resultFormat) && Objects.equals(this.resultPath, that.resultPath)
            && Objects.equals(this.resultRecords, that.resultRecords)
            && Objects.equals(this.resultBytes, that.resultBytes)
            && Objects.equals(this.executionProfilePath, that.executionProfilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultFormat, resultPath, resultRecords, resultBytes, executionProfilePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlResultResponse {\n");
        sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
        sb.append("    resultPath: ").append(toIndentedString(resultPath)).append("\n");
        sb.append("    resultRecords: ").append(toIndentedString(resultRecords)).append("\n");
        sb.append("    resultBytes: ").append(toIndentedString(resultBytes)).append("\n");
        sb.append("    executionProfilePath: ").append(toIndentedString(executionProfilePath)).append("\n");
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
