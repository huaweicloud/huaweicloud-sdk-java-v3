package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IndexAdviceInfo
 */
public class IndexAdviceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<String> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique")

    private Boolean unique;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "track_id")

    private String trackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality")

    private Object quality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_add_index")

    private String ddlAddIndex;

    public IndexAdviceInfo withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public IndexAdviceInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public IndexAdviceInfo withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 索引名
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public IndexAdviceInfo withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public IndexAdviceInfo addColumnsItem(String columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public IndexAdviceInfo withColumns(Consumer<List<String>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 列
     * @return columns
     */
    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public IndexAdviceInfo withUnique(Boolean unique) {
        this.unique = unique;
        return this;
    }

    /**
     * 是否唯一
     * @return unique
     */
    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public IndexAdviceInfo withTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }

    /**
     * 追踪id
     * @return trackId
     */
    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public IndexAdviceInfo withQuality(Object quality) {
        this.quality = quality;
        return this;
    }

    /**
     * 质量
     * @return quality
     */
    public Object getQuality() {
        return quality;
    }

    public void setQuality(Object quality) {
        this.quality = quality;
    }

    public IndexAdviceInfo withDdlAddIndex(String ddlAddIndex) {
        this.ddlAddIndex = ddlAddIndex;
        return this;
    }

    /**
     * ddl需要添加的索引
     * @return ddlAddIndex
     */
    public String getDdlAddIndex() {
        return ddlAddIndex;
    }

    public void setDdlAddIndex(String ddlAddIndex) {
        this.ddlAddIndex = ddlAddIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexAdviceInfo that = (IndexAdviceInfo) obj;
        return Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.indexName, that.indexName) && Objects.equals(this.columns, that.columns)
            && Objects.equals(this.unique, that.unique) && Objects.equals(this.trackId, that.trackId)
            && Objects.equals(this.quality, that.quality) && Objects.equals(this.ddlAddIndex, that.ddlAddIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName, tableName, indexName, columns, unique, trackId, quality, ddlAddIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexAdviceInfo {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
        sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    ddlAddIndex: ").append(toIndentedString(ddlAddIndex)).append("\n");
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
