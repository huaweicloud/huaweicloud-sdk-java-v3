package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowDataPreviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<List<Object>> rows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<Object> schema = null;

    public ShowDataPreviewResponse withRows(List<List<Object>> rows) {
        this.rows = rows;
        return this;
    }

    public ShowDataPreviewResponse addRowsItem(List<Object> rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public ShowDataPreviewResponse withRows(Consumer<List<List<Object>>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 表中数据信息列表
     * @return rows
     */
    public List<List<Object>> getRows() {
        return rows;
    }

    public void setRows(List<List<Object>> rows) {
        this.rows = rows;
    }

    public ShowDataPreviewResponse withSchema(List<Object> schema) {
        this.schema = schema;
        return this;
    }

    public ShowDataPreviewResponse addSchemaItem(Object schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public ShowDataPreviewResponse withSchema(Consumer<List<Object>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 字段信息列表
     * @return schema
     */
    public List<Object> getSchema() {
        return schema;
    }

    public void setSchema(List<Object> schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataPreviewResponse that = (ShowDataPreviewResponse) obj;
        return Objects.equals(this.rows, that.rows) && Objects.equals(this.schema, that.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataPreviewResponse {\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
