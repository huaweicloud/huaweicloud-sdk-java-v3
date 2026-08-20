package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkSql作业错误详情，包含错误描述、错误码等信息。 
 */
public class SparkSqlErrorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_state")

    private String sqlState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_class")

    private String errorClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private Integer line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_position")

    private Integer startPosition;

    public SparkSqlErrorDto withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：SparkSql错误描述，用于说明错误的具体原因。 **取值范围**：长度为1~1024个字符，例如：表不存在。 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SparkSqlErrorDto withSqlState(String sqlState) {
        this.sqlState = sqlState;
        return this;
    }

    /**
     * **参数解释**：SparkSql错误码，用于标识错误的类型。 **取值范围**：采用标准SQL错误码格式，例如：42P01。 
     * @return sqlState
     */
    public String getSqlState() {
        return sqlState;
    }

    public void setSqlState(String sqlState) {
        this.sqlState = sqlState;
    }

    public SparkSqlErrorDto withErrorClass(String errorClass) {
        this.errorClass = errorClass;
        return this;
    }

    /**
     * **参数解释**：SparkSql错误类型，用于标识错误的分类。 **取值范围**：长度为1~128个字符，例如：SCHEMA_ALREADY_EXISTS。 
     * @return errorClass
     */
    public String getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    public SparkSqlErrorDto withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释**：报错行号，用于定位SQL语句中的错误位置。 **取值范围**：大于0的整数，例如：2。 
     * @return line
     */
    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public SparkSqlErrorDto withStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    /**
     * **参数解释**：报错起始位置，用于定位SQL语句中错误的起始字符位置。 **取值范围**：大于0的整数，例如：2。 
     * @return startPosition
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlErrorDto that = (SparkSqlErrorDto) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.sqlState, that.sqlState)
            && Objects.equals(this.errorClass, that.errorClass) && Objects.equals(this.line, that.line)
            && Objects.equals(this.startPosition, that.startPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, sqlState, errorClass, line, startPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlErrorDto {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    sqlState: ").append(toIndentedString(sqlState)).append("\n");
        sb.append("    errorClass: ").append(toIndentedString(errorClass)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
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
