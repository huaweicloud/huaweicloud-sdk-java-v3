package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 显示设置
 */
public class IsapResourceDisplaySetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<IsapResourceDisplaySettingColumns> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    public IsapResourceDisplaySetting withColumns(List<IsapResourceDisplaySettingColumns> columns) {
        this.columns = columns;
        return this;
    }

    public IsapResourceDisplaySetting addColumnsItem(IsapResourceDisplaySettingColumns columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public IsapResourceDisplaySetting withColumns(Consumer<List<IsapResourceDisplaySettingColumns>> columnsSetter) {
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
    public List<IsapResourceDisplaySettingColumns> getColumns() {
        return columns;
    }

    public void setColumns(List<IsapResourceDisplaySettingColumns> columns) {
        this.columns = columns;
    }

    public IsapResourceDisplaySetting withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 显示格式，例如 TABLE
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapResourceDisplaySetting that = (IsapResourceDisplaySetting) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapResourceDisplaySetting {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
