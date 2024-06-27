package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckClickHouseTableConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_name")

    private String sourceDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_config_check_results")

    private List<ChDatabaseTableConfigCheckResult> tableConfigCheckResults = null;

    public CheckClickHouseTableConfigResponse withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * 源数据库名。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public CheckClickHouseTableConfigResponse withTableConfigCheckResults(
        List<ChDatabaseTableConfigCheckResult> tableConfigCheckResults) {
        this.tableConfigCheckResults = tableConfigCheckResults;
        return this;
    }

    public CheckClickHouseTableConfigResponse addTableConfigCheckResultsItem(
        ChDatabaseTableConfigCheckResult tableConfigCheckResultsItem) {
        if (this.tableConfigCheckResults == null) {
            this.tableConfigCheckResults = new ArrayList<>();
        }
        this.tableConfigCheckResults.add(tableConfigCheckResultsItem);
        return this;
    }

    public CheckClickHouseTableConfigResponse withTableConfigCheckResults(
        Consumer<List<ChDatabaseTableConfigCheckResult>> tableConfigCheckResultsSetter) {
        if (this.tableConfigCheckResults == null) {
            this.tableConfigCheckResults = new ArrayList<>();
        }
        tableConfigCheckResultsSetter.accept(this.tableConfigCheckResults);
        return this;
    }

    /**
     * 表配置检查结果。
     * @return tableConfigCheckResults
     */
    public List<ChDatabaseTableConfigCheckResult> getTableConfigCheckResults() {
        return tableConfigCheckResults;
    }

    public void setTableConfigCheckResults(List<ChDatabaseTableConfigCheckResult> tableConfigCheckResults) {
        this.tableConfigCheckResults = tableConfigCheckResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckClickHouseTableConfigResponse that = (CheckClickHouseTableConfigResponse) obj;
        return Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.tableConfigCheckResults, that.tableConfigCheckResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDatabaseName, tableConfigCheckResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckClickHouseTableConfigResponse {\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    tableConfigCheckResults: ").append(toIndentedString(tableConfigCheckResults)).append("\n");
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
