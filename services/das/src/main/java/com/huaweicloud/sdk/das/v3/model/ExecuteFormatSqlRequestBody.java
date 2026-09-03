package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 格式化SQL请求体
 */
public class ExecuteFormatSqlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_script")

    private String sqlScript;

    public ExecuteFormatSqlRequestBody withSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
        return this;
    }

    /**
     * SQL语句
     * @return sqlScript
     */
    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteFormatSqlRequestBody that = (ExecuteFormatSqlRequestBody) obj;
        return Objects.equals(this.sqlScript, that.sqlScript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlScript);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteFormatSqlRequestBody {\n");
        sb.append("    sqlScript: ").append(toIndentedString(sqlScript)).append("\n");
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
