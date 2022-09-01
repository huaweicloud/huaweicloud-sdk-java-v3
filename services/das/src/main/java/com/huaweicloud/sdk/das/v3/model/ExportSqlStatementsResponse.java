package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExportSqlStatementsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statements")

    @JacksonXmlProperty(localName = "statements")

    private List<FullSql> statements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    @JacksonXmlProperty(localName = "next_marker")

    private String nextMarker;

    public ExportSqlStatementsResponse withStatements(List<FullSql> statements) {
        this.statements = statements;
        return this;
    }

    public ExportSqlStatementsResponse addStatementsItem(FullSql statementsItem) {
        if (this.statements == null) {
            this.statements = new ArrayList<>();
        }
        this.statements.add(statementsItem);
        return this;
    }

    public ExportSqlStatementsResponse withStatements(Consumer<List<FullSql>> statementsSetter) {
        if (this.statements == null) {
            this.statements = new ArrayList<>();
        }
        statementsSetter.accept(this.statements);
        return this;
    }

    /**
     * 全量SQL集合。当集合为空时，说明SQL已全部导出。
     * @return statements
     */
    public List<FullSql> getStatements() {
        return statements;
    }

    public void setStatements(List<FullSql> statements) {
        this.statements = statements;
    }

    public ExportSqlStatementsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 获取下一页所需的标识符。marker仅在3分钟内有效。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportSqlStatementsResponse exportSqlStatementsResponse = (ExportSqlStatementsResponse) o;
        return Objects.equals(this.statements, exportSqlStatementsResponse.statements)
            && Objects.equals(this.nextMarker, exportSqlStatementsResponse.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statements, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSqlStatementsResponse {\n");
        sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
