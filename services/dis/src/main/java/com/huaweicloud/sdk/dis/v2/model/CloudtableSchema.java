package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转储HBase时必选，与“opentsdb_schema”二选一，表示CloudTable集群HBase数据的Schema配置。用于将通道内的JSON数据进行格式转换并导入Cloudtable的HBase表中。
 */
public class CloudtableSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_key")

    private List<RowKey> rowKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<Column> columns = null;

    public CloudtableSchema withRowKey(List<RowKey> rowKey) {
        this.rowKey = rowKey;
        return this;
    }

    public CloudtableSchema addRowKeyItem(RowKey rowKeyItem) {
        if (this.rowKey == null) {
            this.rowKey = new ArrayList<>();
        }
        this.rowKey.add(rowKeyItem);
        return this;
    }

    public CloudtableSchema withRowKey(Consumer<List<RowKey>> rowKeySetter) {
        if (this.rowKey == null) {
            this.rowKey = new ArrayList<>();
        }
        rowKeySetter.accept(this.rowKey);
        return this;
    }

    /**
     * CloudTable集群HBase数据rowkey的Schema配置，用于将通道内的JSON数据生成HBase数据的rowkey。  取值范围：1～64。
     * @return rowKey
     */
    public List<RowKey> getRowKey() {
        return rowKey;
    }

    public void setRowKey(List<RowKey> rowKey) {
        this.rowKey = rowKey;
    }

    public CloudtableSchema withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    public CloudtableSchema addColumnsItem(Column columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public CloudtableSchema withColumns(Consumer<List<Column>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * CloudTable集群HBase数据列的Schema配置，用于将通道内的JSON数据生成HBase数据的列。  取值范围：1～4096。
     * @return columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudtableSchema that = (CloudtableSchema) obj;
        return Objects.equals(this.rowKey, that.rowKey) && Objects.equals(this.columns, that.columns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowKey, columns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudtableSchema {\n");
        sb.append("    rowKey: ").append(toIndentedString(rowKey)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
