package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Flink SQL 作业参数。
 */
public class FlinkSqlParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private String dependencyJars;

    public FlinkSqlParameter withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * Flink SQL 语句。长度限制：1048576个字符。
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public FlinkSqlParameter withDependencyJars(String dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    /**
     * Flink SQL 作业依赖的 Jar 包所在的 OBS 路径。
     * @return dependencyJars
     */
    public String getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(String dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkSqlParameter that = (FlinkSqlParameter) obj;
        return Objects.equals(this.sqlBody, that.sqlBody) && Objects.equals(this.dependencyJars, that.dependencyJars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlBody, dependencyJars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkSqlParameter {\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
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
