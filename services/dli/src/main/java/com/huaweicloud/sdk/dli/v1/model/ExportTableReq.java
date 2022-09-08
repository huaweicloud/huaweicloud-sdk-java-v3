package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导出数据
 */
public class ExportTableReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_path")

    private String dataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress")

    private String compress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_mode")

    private String exportMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    private Boolean withColumnHeader;

    public ExportTableReq withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * 导出数据的储存路径（当前仅支持将数据存储在OBS上，且OBS路径须以s3a开头）。另外，“export_mode”配置为“errorifexists”时，该路径下的文件夹须不存在，如请求样例中的“test”文件夹。
     * @return dataPath
     */
    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public ExportTableReq withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 导出数据的类型（当前仅支持csv格式数据）。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ExportTableReq withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 被导出数据的表所在的数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ExportTableReq withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 被导出数据的表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ExportTableReq withCompress(String compress) {
        this.compress = compress;
        return this;
    }

    /**
     * 导出数据的压缩方法。目前支持gzip、bzip2、deflate压缩方式；若不希望压缩，则输入none。
     * @return compress
     */
    public String getCompress() {
        return compress;
    }

    public void setCompress(String compress) {
        this.compress = compress;
    }

    public ExportTableReq withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 指定执行该任务的队列。若不指定队列，将采用default队列执行操作。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ExportTableReq withExportMode(String exportMode) {
        this.exportMode = exportMode;
        return this;
    }

    /**
     * 导出模式，目前支持“ErrorIfExists”，“Overwrite”，不指定“export_mode”则默认为“ErrorIfExists”。  “ErrorIfExists”：存在即报错。指定的导出目录必须不存在，如果指定目录已经存在，系统将返回错误信息，无法执行导出操作。 “Overwrite”：覆盖。在指定目录下新建文件，会删除已有文件。
     * @return exportMode
     */
    public String getExportMode() {
        return exportMode;
    }

    public void setExportMode(String exportMode) {
        this.exportMode = exportMode;
    }

    public ExportTableReq withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * 导出csv格式数据时，是否导出列名。  设置为“true”，表示导出列名。 设置为“false”，表示不导出列名。 若为空，默认为“false”。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportTableReq exportTableReq = (ExportTableReq) o;
        return Objects.equals(this.dataPath, exportTableReq.dataPath)
            && Objects.equals(this.dataType, exportTableReq.dataType)
            && Objects.equals(this.databaseName, exportTableReq.databaseName)
            && Objects.equals(this.tableName, exportTableReq.tableName)
            && Objects.equals(this.compress, exportTableReq.compress)
            && Objects.equals(this.queueName, exportTableReq.queueName)
            && Objects.equals(this.exportMode, exportTableReq.exportMode)
            && Objects.equals(this.withColumnHeader, exportTableReq.withColumnHeader);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dataPath, dataType, databaseName, tableName, compress, queueName, exportMode, withColumnHeader);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTableReq {\n");
        sb.append("    dataPath: ").append(toIndentedString(dataPath)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    exportMode: ").append(toIndentedString(exportMode)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
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
