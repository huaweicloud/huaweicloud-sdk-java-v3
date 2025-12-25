package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TableColumnDisplaySetting
 */
public class TableColumnDisplaySetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_alias")

    private String columnAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_by_default")

    private Boolean displayByDefault;

    public TableColumnDisplaySetting withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 表格列名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public TableColumnDisplaySetting withColumnAlias(String columnAlias) {
        this.columnAlias = columnAlias;
        return this;
    }

    /**
     * 表格列别名
     * @return columnAlias
     */
    public String getColumnAlias() {
        return columnAlias;
    }

    public void setColumnAlias(String columnAlias) {
        this.columnAlias = columnAlias;
    }

    public TableColumnDisplaySetting withDisplayByDefault(Boolean displayByDefault) {
        this.displayByDefault = displayByDefault;
        return this;
    }

    /**
     * 是否默认展示
     * @return displayByDefault
     */
    public Boolean getDisplayByDefault() {
        return displayByDefault;
    }

    public void setDisplayByDefault(Boolean displayByDefault) {
        this.displayByDefault = displayByDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableColumnDisplaySetting that = (TableColumnDisplaySetting) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnAlias, that.columnAlias)
            && Objects.equals(this.displayByDefault, that.displayByDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnAlias, displayByDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableColumnDisplaySetting {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnAlias: ").append(toIndentedString(columnAlias)).append("\n");
        sb.append("    displayByDefault: ").append(toIndentedString(displayByDefault)).append("\n");
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
