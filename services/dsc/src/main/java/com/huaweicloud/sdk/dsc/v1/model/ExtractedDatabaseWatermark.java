package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtractedDatabaseWatermark
 */
public class ExtractedDatabaseWatermark {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_key")

    private String watermarkKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<Columns> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<Map<String, Object>> data = null;

    public ExtractedDatabaseWatermark withWatermarkKey(String watermarkKey) {
        this.watermarkKey = watermarkKey;
        return this;
    }

    /**
     * 水印密钥
     * @return watermarkKey
     */
    public String getWatermarkKey() {
        return watermarkKey;
    }

    public void setWatermarkKey(String watermarkKey) {
        this.watermarkKey = watermarkKey;
    }

    public ExtractedDatabaseWatermark withColumns(List<Columns> columns) {
        this.columns = columns;
        return this;
    }

    public ExtractedDatabaseWatermark addColumnsItem(Columns columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public ExtractedDatabaseWatermark withColumns(Consumer<List<Columns>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 字段类型列表，最大长度100。使用时，要包含嵌入时所有“primary_key”为true的字段，和至少一个为false的字段用来提取水印
     * @return columns
     */
    public List<Columns> getColumns() {
        return columns;
    }

    public void setColumns(List<Columns> columns) {
        this.columns = columns;
    }

    public ExtractedDatabaseWatermark withData(List<Map<String, Object>> data) {
        this.data = data;
        return this;
    }

    public ExtractedDatabaseWatermark addDataItem(Map<String, Object> dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ExtractedDatabaseWatermark withData(Consumer<List<Map<String, Object>>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 水印数据，数据条数不超过30,000条
     * @return data
     */
    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtractedDatabaseWatermark extractedDatabaseWatermark = (ExtractedDatabaseWatermark) o;
        return Objects.equals(this.watermarkKey, extractedDatabaseWatermark.watermarkKey)
            && Objects.equals(this.columns, extractedDatabaseWatermark.columns)
            && Objects.equals(this.data, extractedDatabaseWatermark.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watermarkKey, columns, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtractedDatabaseWatermark {\n");
        sb.append("    watermarkKey: ").append(toIndentedString(watermarkKey)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
