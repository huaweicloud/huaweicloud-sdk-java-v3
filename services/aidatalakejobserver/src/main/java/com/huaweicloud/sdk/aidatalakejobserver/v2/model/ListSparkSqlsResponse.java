package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
public class ListSparkSqlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private SparkMarkerPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statements")

    private List<ListSparkSqlResItem> statements = null;

    public ListSparkSqlsResponse withPageInfo(SparkMarkerPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSparkSqlsResponse withPageInfo(Consumer<SparkMarkerPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new SparkMarkerPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public SparkMarkerPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(SparkMarkerPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListSparkSqlsResponse withStatements(List<ListSparkSqlResItem> statements) {
        this.statements = statements;
        return this;
    }

    public ListSparkSqlsResponse addStatementsItem(ListSparkSqlResItem statementsItem) {
        if (this.statements == null) {
            this.statements = new ArrayList<>();
        }
        this.statements.add(statementsItem);
        return this;
    }

    public ListSparkSqlsResponse withStatements(Consumer<List<ListSparkSqlResItem>> statementsSetter) {
        if (this.statements == null) {
            this.statements = new ArrayList<>();
        }
        statementsSetter.accept(this.statements);
        return this;
    }

    /**
     * **参数解释**：详细的SparkSql作业列表，包含作业ID、状态、SQL内容等信息。
     * @return statements
     */
    public List<ListSparkSqlResItem> getStatements() {
        return statements;
    }

    public void setStatements(List<ListSparkSqlResItem> statements) {
        this.statements = statements;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSparkSqlsResponse that = (ListSparkSqlsResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.statements, that.statements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, statements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkSqlsResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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
