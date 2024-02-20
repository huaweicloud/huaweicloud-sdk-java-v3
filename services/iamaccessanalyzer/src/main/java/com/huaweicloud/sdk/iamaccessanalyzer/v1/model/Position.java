package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略中的位置。
 */
public class Position {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private Integer line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column")

    private Integer column;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public Position withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * 位置的行号，从1开始。
     * @return line
     */
    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Position withColumn(Integer column) {
        this.column = column;
        return this;
    }

    /**
     * 位置的列号，从0开开始。
     * @return column
     */
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Position withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 策略中与位置对应的偏移量，从0开始。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Position that = (Position) obj;
        return Objects.equals(this.line, that.line) && Objects.equals(this.column, that.column)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, column, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Position {\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
