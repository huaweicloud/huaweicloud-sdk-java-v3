package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteFormatSqlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_sql")

    private String formatSql;

    public ExecuteFormatSqlResponse withFormatSql(String formatSql) {
        this.formatSql = formatSql;
        return this;
    }

    /**
     * 格式化后的SQL语句
     * @return formatSql
     */
    public String getFormatSql() {
        return formatSql;
    }

    public void setFormatSql(String formatSql) {
        this.formatSql = formatSql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteFormatSqlResponse that = (ExecuteFormatSqlResponse) obj;
        return Objects.equals(this.formatSql, that.formatSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formatSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteFormatSqlResponse {\n");
        sb.append("    formatSql: ").append(toIndentedString(formatSql)).append("\n");
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
