package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowAnalysisSessionResultRespSqlTemplates
 */
public class ShowAnalysisSessionResultRespSqlTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template")

    private String sqlTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_state_duration_list")

    private List<ShowAnalysisSessionResultRespTopStateDuration> topStateDurationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_transaction_duration_list")

    private List<ShowAnalysisSessionResultRespTopStateDuration> topTransactionDurationList = null;

    public ShowAnalysisSessionResultRespSqlTemplates withSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
        return this;
    }

    /**
     * SQL模板
     * @return sqlTemplate
     */
    public String getSqlTemplate() {
        return sqlTemplate;
    }

    public void setSqlTemplate(String sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }

    public ShowAnalysisSessionResultRespSqlTemplates withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ShowAnalysisSessionResultRespSqlTemplates withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总执行次数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowAnalysisSessionResultRespSqlTemplates withTopStateDurationList(
        List<ShowAnalysisSessionResultRespTopStateDuration> topStateDurationList) {
        this.topStateDurationList = topStateDurationList;
        return this;
    }

    public ShowAnalysisSessionResultRespSqlTemplates addTopStateDurationListItem(
        ShowAnalysisSessionResultRespTopStateDuration topStateDurationListItem) {
        if (this.topStateDurationList == null) {
            this.topStateDurationList = new ArrayList<>();
        }
        this.topStateDurationList.add(topStateDurationListItem);
        return this;
    }

    public ShowAnalysisSessionResultRespSqlTemplates withTopStateDurationList(
        Consumer<List<ShowAnalysisSessionResultRespTopStateDuration>> topStateDurationListSetter) {
        if (this.topStateDurationList == null) {
            this.topStateDurationList = new ArrayList<>();
        }
        topStateDurationListSetter.accept(this.topStateDurationList);
        return this;
    }

    /**
     * 当前模板下状态持续时间长TOP会话列表
     * @return topStateDurationList
     */
    public List<ShowAnalysisSessionResultRespTopStateDuration> getTopStateDurationList() {
        return topStateDurationList;
    }

    public void setTopStateDurationList(List<ShowAnalysisSessionResultRespTopStateDuration> topStateDurationList) {
        this.topStateDurationList = topStateDurationList;
    }

    public ShowAnalysisSessionResultRespSqlTemplates withTopTransactionDurationList(
        List<ShowAnalysisSessionResultRespTopStateDuration> topTransactionDurationList) {
        this.topTransactionDurationList = topTransactionDurationList;
        return this;
    }

    public ShowAnalysisSessionResultRespSqlTemplates addTopTransactionDurationListItem(
        ShowAnalysisSessionResultRespTopStateDuration topTransactionDurationListItem) {
        if (this.topTransactionDurationList == null) {
            this.topTransactionDurationList = new ArrayList<>();
        }
        this.topTransactionDurationList.add(topTransactionDurationListItem);
        return this;
    }

    public ShowAnalysisSessionResultRespSqlTemplates withTopTransactionDurationList(
        Consumer<List<ShowAnalysisSessionResultRespTopStateDuration>> topTransactionDurationListSetter) {
        if (this.topTransactionDurationList == null) {
            this.topTransactionDurationList = new ArrayList<>();
        }
        topTransactionDurationListSetter.accept(this.topTransactionDurationList);
        return this;
    }

    /**
     * 当前模板下事务持续时间长TOP会话列表
     * @return topTransactionDurationList
     */
    public List<ShowAnalysisSessionResultRespTopStateDuration> getTopTransactionDurationList() {
        return topTransactionDurationList;
    }

    public void setTopTransactionDurationList(
        List<ShowAnalysisSessionResultRespTopStateDuration> topTransactionDurationList) {
        this.topTransactionDurationList = topTransactionDurationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAnalysisSessionResultRespSqlTemplates that = (ShowAnalysisSessionResultRespSqlTemplates) obj;
        return Objects.equals(this.sqlTemplate, that.sqlTemplate)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.topStateDurationList, that.topStateDurationList)
            && Objects.equals(this.topTransactionDurationList, that.topTransactionDurationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTemplate, databaseName, totalCount, topStateDurationList, topTransactionDurationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAnalysisSessionResultRespSqlTemplates {\n");
        sb.append("    sqlTemplate: ").append(toIndentedString(sqlTemplate)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    topStateDurationList: ").append(toIndentedString(topStateDurationList)).append("\n");
        sb.append("    topTransactionDurationList: ").append(toIndentedString(topTransactionDurationList)).append("\n");
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
