package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PreviewSparkSqlResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_format")

    private String resultFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_path")

    private String resultPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<SparkSqlSchemaItem> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<List<String>> rows = null;

    public PreviewSparkSqlResultResponse withResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
        return this;
    }

    /**
     * **参数解释**：查询类SQL结果格式，用于指定结果的存储格式。 **取值范围**：csv，arrow。
     * @return resultFormat
     */
    public String getResultFormat() {
        return resultFormat;
    }

    public void setResultFormat(String resultFormat) {
        this.resultFormat = resultFormat;
    }

    public PreviewSparkSqlResultResponse withResultPath(String resultPath) {
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

    public PreviewSparkSqlResultResponse withSchema(List<SparkSqlSchemaItem> schema) {
        this.schema = schema;
        return this;
    }

    public PreviewSparkSqlResultResponse addSchemaItem(SparkSqlSchemaItem schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public PreviewSparkSqlResultResponse withSchema(Consumer<List<SparkSqlSchemaItem>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * **参数解释**：结果数据的列结构定义，包含列名和列类型信息。数组中的每个元素为SparkSqlSchemaItem对象。
     * @return schema
     */
    public List<SparkSqlSchemaItem> getSchema() {
        return schema;
    }

    public void setSchema(List<SparkSqlSchemaItem> schema) {
        this.schema = schema;
    }

    public PreviewSparkSqlResultResponse withRows(List<List<String>> rows) {
        this.rows = rows;
        return this;
    }

    public PreviewSparkSqlResultResponse addRowsItem(List<String> rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public PreviewSparkSqlResultResponse withRows(Consumer<List<List<String>>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * **参数解释**：作业结果集，包含查询返回的实际数据行。每行为一个数组，对应schema中定义的列顺序。
     * @return rows
     */
    public List<List<String>> getRows() {
        return rows;
    }

    public void setRows(List<List<String>> rows) {
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
        PreviewSparkSqlResultResponse that = (PreviewSparkSqlResultResponse) obj;
        return Objects.equals(this.resultFormat, that.resultFormat) && Objects.equals(this.resultPath, that.resultPath)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.rows, that.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultFormat, resultPath, schema, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewSparkSqlResultResponse {\n");
        sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
        sb.append("    resultPath: ").append(toIndentedString(resultPath)).append("\n");
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
