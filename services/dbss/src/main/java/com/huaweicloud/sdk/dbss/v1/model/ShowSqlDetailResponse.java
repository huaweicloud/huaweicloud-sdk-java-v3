package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSqlDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private SqlDetailBean sql;

    public ShowSqlDetailResponse withSql(SqlDetailBean sql) {
        this.sql = sql;
        return this;
    }

    public ShowSqlDetailResponse withSql(Consumer<SqlDetailBean> sqlSetter) {
        if (this.sql == null) {
            this.sql = new SqlDetailBean();
            sqlSetter.accept(this.sql);
        }

        return this;
    }

    /**
     * Get sql
     * @return sql
     */
    public SqlDetailBean getSql() {
        return sql;
    }

    public void setSql(SqlDetailBean sql) {
        this.sql = sql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSqlDetailResponse that = (ShowSqlDetailResponse) obj;
        return Objects.equals(this.sql, that.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlDetailResponse {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
