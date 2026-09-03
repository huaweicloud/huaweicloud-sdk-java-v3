package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变更数据详情
 */
public class RowPairDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_row")

    private Object beforeRow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_row")

    private Object afterRow;

    public RowPairDto withBeforeRow(Object beforeRow) {
        this.beforeRow = beforeRow;
        return this;
    }

    /**
     * 变更前的行数据
     * @return beforeRow
     */
    public Object getBeforeRow() {
        return beforeRow;
    }

    public void setBeforeRow(Object beforeRow) {
        this.beforeRow = beforeRow;
    }

    public RowPairDto withAfterRow(Object afterRow) {
        this.afterRow = afterRow;
        return this;
    }

    /**
     * 变更后的行数据
     * @return afterRow
     */
    public Object getAfterRow() {
        return afterRow;
    }

    public void setAfterRow(Object afterRow) {
        this.afterRow = afterRow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RowPairDto that = (RowPairDto) obj;
        return Objects.equals(this.beforeRow, that.beforeRow) && Objects.equals(this.afterRow, that.afterRow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beforeRow, afterRow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RowPairDto {\n");
        sb.append("    beforeRow: ").append(toIndentedString(beforeRow)).append("\n");
        sb.append("    afterRow: ").append(toIndentedString(afterRow)).append("\n");
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
