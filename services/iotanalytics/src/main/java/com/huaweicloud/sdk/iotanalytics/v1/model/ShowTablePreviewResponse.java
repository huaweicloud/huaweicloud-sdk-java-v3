package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTablePreviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    @JacksonXmlProperty(localName = "schema")

    private List<Object> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    @JacksonXmlProperty(localName = "rows")

    private List<Object> rows = null;

    public ShowTablePreviewResponse withSchema(List<Object> schema) {
        this.schema = schema;
        return this;
    }

    public ShowTablePreviewResponse addSchemaItem(Object schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public ShowTablePreviewResponse withSchema(Consumer<List<Object>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 表的列名称和类型。
     * @return schema
     */
    public List<Object> getSchema() {
        return schema;
    }

    public void setSchema(List<Object> schema) {
        this.schema = schema;
    }

    public ShowTablePreviewResponse withRows(List<Object> rows) {
        this.rows = rows;
        return this;
    }

    public ShowTablePreviewResponse addRowsItem(Object rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public ShowTablePreviewResponse withRows(Consumer<List<Object>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 预览的表内容。
     * @return rows
     */
    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTablePreviewResponse showTablePreviewResponse = (ShowTablePreviewResponse) o;
        return Objects.equals(this.schema, showTablePreviewResponse.schema)
            && Objects.equals(this.rows, showTablePreviewResponse.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTablePreviewResponse {\n");
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
