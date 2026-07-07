package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowAnalysisSessionResultResp
 */
public class ShowAnalysisSessionResultResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_state_duration")

    private List<ShowAnalysisSessionResultRespTopStateDuration> topStateDuration = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_transaction_duration")

    private List<ShowAnalysisSessionResultRespTopTransactionDuration> topTransactionDuration = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_templates")

    private List<ShowAnalysisSessionResultRespSqlTemplates> sqlTemplates = null;

    public ShowAnalysisSessionResultResp withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 分析的会话总数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowAnalysisSessionResultResp withTopStateDuration(
        List<ShowAnalysisSessionResultRespTopStateDuration> topStateDuration) {
        this.topStateDuration = topStateDuration;
        return this;
    }

    public ShowAnalysisSessionResultResp addTopStateDurationItem(
        ShowAnalysisSessionResultRespTopStateDuration topStateDurationItem) {
        if (this.topStateDuration == null) {
            this.topStateDuration = new ArrayList<>();
        }
        this.topStateDuration.add(topStateDurationItem);
        return this;
    }

    public ShowAnalysisSessionResultResp withTopStateDuration(
        Consumer<List<ShowAnalysisSessionResultRespTopStateDuration>> topStateDurationSetter) {
        if (this.topStateDuration == null) {
            this.topStateDuration = new ArrayList<>();
        }
        topStateDurationSetter.accept(this.topStateDuration);
        return this;
    }

    /**
     * 状态持续时间长TOP会话列表
     * @return topStateDuration
     */
    public List<ShowAnalysisSessionResultRespTopStateDuration> getTopStateDuration() {
        return topStateDuration;
    }

    public void setTopStateDuration(List<ShowAnalysisSessionResultRespTopStateDuration> topStateDuration) {
        this.topStateDuration = topStateDuration;
    }

    public ShowAnalysisSessionResultResp withTopTransactionDuration(
        List<ShowAnalysisSessionResultRespTopTransactionDuration> topTransactionDuration) {
        this.topTransactionDuration = topTransactionDuration;
        return this;
    }

    public ShowAnalysisSessionResultResp addTopTransactionDurationItem(
        ShowAnalysisSessionResultRespTopTransactionDuration topTransactionDurationItem) {
        if (this.topTransactionDuration == null) {
            this.topTransactionDuration = new ArrayList<>();
        }
        this.topTransactionDuration.add(topTransactionDurationItem);
        return this;
    }

    public ShowAnalysisSessionResultResp withTopTransactionDuration(
        Consumer<List<ShowAnalysisSessionResultRespTopTransactionDuration>> topTransactionDurationSetter) {
        if (this.topTransactionDuration == null) {
            this.topTransactionDuration = new ArrayList<>();
        }
        topTransactionDurationSetter.accept(this.topTransactionDuration);
        return this;
    }

    /**
     * 事务持续时间长TOP会话列表
     * @return topTransactionDuration
     */
    public List<ShowAnalysisSessionResultRespTopTransactionDuration> getTopTransactionDuration() {
        return topTransactionDuration;
    }

    public void setTopTransactionDuration(
        List<ShowAnalysisSessionResultRespTopTransactionDuration> topTransactionDuration) {
        this.topTransactionDuration = topTransactionDuration;
    }

    public ShowAnalysisSessionResultResp withSqlTemplates(
        List<ShowAnalysisSessionResultRespSqlTemplates> sqlTemplates) {
        this.sqlTemplates = sqlTemplates;
        return this;
    }

    public ShowAnalysisSessionResultResp addSqlTemplatesItem(
        ShowAnalysisSessionResultRespSqlTemplates sqlTemplatesItem) {
        if (this.sqlTemplates == null) {
            this.sqlTemplates = new ArrayList<>();
        }
        this.sqlTemplates.add(sqlTemplatesItem);
        return this;
    }

    public ShowAnalysisSessionResultResp withSqlTemplates(
        Consumer<List<ShowAnalysisSessionResultRespSqlTemplates>> sqlTemplatesSetter) {
        if (this.sqlTemplates == null) {
            this.sqlTemplates = new ArrayList<>();
        }
        sqlTemplatesSetter.accept(this.sqlTemplates);
        return this;
    }

    /**
     * SQL模板列表
     * @return sqlTemplates
     */
    public List<ShowAnalysisSessionResultRespSqlTemplates> getSqlTemplates() {
        return sqlTemplates;
    }

    public void setSqlTemplates(List<ShowAnalysisSessionResultRespSqlTemplates> sqlTemplates) {
        this.sqlTemplates = sqlTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAnalysisSessionResultResp that = (ShowAnalysisSessionResultResp) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.topStateDuration, that.topStateDuration)
            && Objects.equals(this.topTransactionDuration, that.topTransactionDuration)
            && Objects.equals(this.sqlTemplates, that.sqlTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, topStateDuration, topTransactionDuration, sqlTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAnalysisSessionResultResp {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    topStateDuration: ").append(toIndentedString(topStateDuration)).append("\n");
        sb.append("    topTransactionDuration: ").append(toIndentedString(topTransactionDuration)).append("\n");
        sb.append("    sqlTemplates: ").append(toIndentedString(sqlTemplates)).append("\n");
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
