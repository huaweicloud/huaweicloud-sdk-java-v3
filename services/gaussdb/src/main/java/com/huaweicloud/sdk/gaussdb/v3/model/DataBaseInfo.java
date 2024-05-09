package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库校验信息。
 */
public class DataBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_config_check_results")

    private List<DbConfigCheckResult> dbConfigCheckResults = null;

    public DataBaseInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DataBaseInfo withDbConfigCheckResults(List<DbConfigCheckResult> dbConfigCheckResults) {
        this.dbConfigCheckResults = dbConfigCheckResults;
        return this;
    }

    public DataBaseInfo addDbConfigCheckResultsItem(DbConfigCheckResult dbConfigCheckResultsItem) {
        if (this.dbConfigCheckResults == null) {
            this.dbConfigCheckResults = new ArrayList<>();
        }
        this.dbConfigCheckResults.add(dbConfigCheckResultsItem);
        return this;
    }

    public DataBaseInfo withDbConfigCheckResults(Consumer<List<DbConfigCheckResult>> dbConfigCheckResultsSetter) {
        if (this.dbConfigCheckResults == null) {
            this.dbConfigCheckResults = new ArrayList<>();
        }
        dbConfigCheckResultsSetter.accept(this.dbConfigCheckResults);
        return this;
    }

    /**
     * 数据库配置检查结果。
     * @return dbConfigCheckResults
     */
    public List<DbConfigCheckResult> getDbConfigCheckResults() {
        return dbConfigCheckResults;
    }

    public void setDbConfigCheckResults(List<DbConfigCheckResult> dbConfigCheckResults) {
        this.dbConfigCheckResults = dbConfigCheckResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataBaseInfo that = (DataBaseInfo) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.dbConfigCheckResults, that.dbConfigCheckResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, dbConfigCheckResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBaseInfo {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    dbConfigCheckResults: ").append(toIndentedString(dbConfigCheckResults)).append("\n");
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
