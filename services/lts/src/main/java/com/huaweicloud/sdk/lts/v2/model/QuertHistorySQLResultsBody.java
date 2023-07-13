package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuertHistorySQLResultsBody
 */
public class QuertHistorySQLResultsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_use_time")

    private Long lastUseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    public QuertHistorySQLResultsBody withLastUseTime(Long lastUseTime) {
        this.lastUseTime = lastUseTime;
        return this;
    }

    /**
     * 上次修改时间，时间戳，毫秒数
     * @return lastUseTime
     */
    public Long getLastUseTime() {
        return lastUseTime;
    }

    public void setLastUseTime(Long lastUseTime) {
        this.lastUseTime = lastUseTime;
    }

    public QuertHistorySQLResultsBody withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * 历史sql语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuertHistorySQLResultsBody that = (QuertHistorySQLResultsBody) obj;
        return Objects.equals(this.lastUseTime, that.lastUseTime)
            && Objects.equals(this.sqlStatement, that.sqlStatement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUseTime, sqlStatement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuertHistorySQLResultsBody {\n");
        sb.append("    lastUseTime: ").append(toIndentedString(lastUseTime)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
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
