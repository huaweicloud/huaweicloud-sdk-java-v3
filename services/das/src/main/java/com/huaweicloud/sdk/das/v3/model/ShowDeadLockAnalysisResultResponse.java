package com.huaweicloud.sdk.das.v3.model;

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
public class ShowDeadLockAnalysisResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_id")

    private String deadLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_insight_job_id")

    private Long sqlInsightJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_list")

    private List<ShowDeadLockAnalysisResultRespSqlList> sqlList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_ids")

    private List<String> transactionIds = null;

    public ShowDeadLockAnalysisResultResponse withDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
        return this;
    }

    /**
     * 死锁唯一标识
     * @return deadLockId
     */
    public String getDeadLockId() {
        return deadLockId;
    }

    public void setDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
    }

    public ShowDeadLockAnalysisResultResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 分析任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowDeadLockAnalysisResultResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 分析任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDeadLockAnalysisResultResponse withSqlInsightJobId(Long sqlInsightJobId) {
        this.sqlInsightJobId = sqlInsightJobId;
        return this;
    }

    /**
     * SQL洞察任务ID
     * @return sqlInsightJobId
     */
    public Long getSqlInsightJobId() {
        return sqlInsightJobId;
    }

    public void setSqlInsightJobId(Long sqlInsightJobId) {
        this.sqlInsightJobId = sqlInsightJobId;
    }

    public ShowDeadLockAnalysisResultResponse withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 查询的事务ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ShowDeadLockAnalysisResultResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 该事务下SQL记录总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ShowDeadLockAnalysisResultResponse withSqlList(List<ShowDeadLockAnalysisResultRespSqlList> sqlList) {
        this.sqlList = sqlList;
        return this;
    }

    public ShowDeadLockAnalysisResultResponse addSqlListItem(ShowDeadLockAnalysisResultRespSqlList sqlListItem) {
        if (this.sqlList == null) {
            this.sqlList = new ArrayList<>();
        }
        this.sqlList.add(sqlListItem);
        return this;
    }

    public ShowDeadLockAnalysisResultResponse withSqlList(
        Consumer<List<ShowDeadLockAnalysisResultRespSqlList>> sqlListSetter) {
        if (this.sqlList == null) {
            this.sqlList = new ArrayList<>();
        }
        sqlListSetter.accept(this.sqlList);
        return this;
    }

    /**
     * SQL详情列表
     * @return sqlList
     */
    public List<ShowDeadLockAnalysisResultRespSqlList> getSqlList() {
        return sqlList;
    }

    public void setSqlList(List<ShowDeadLockAnalysisResultRespSqlList> sqlList) {
        this.sqlList = sqlList;
    }

    public ShowDeadLockAnalysisResultResponse withTransactionIds(List<String> transactionIds) {
        this.transactionIds = transactionIds;
        return this;
    }

    public ShowDeadLockAnalysisResultResponse addTransactionIdsItem(String transactionIdsItem) {
        if (this.transactionIds == null) {
            this.transactionIds = new ArrayList<>();
        }
        this.transactionIds.add(transactionIdsItem);
        return this;
    }

    public ShowDeadLockAnalysisResultResponse withTransactionIds(Consumer<List<String>> transactionIdsSetter) {
        if (this.transactionIds == null) {
            this.transactionIds = new ArrayList<>();
        }
        transactionIdsSetter.accept(this.transactionIds);
        return this;
    }

    /**
     * 从死锁事件解析的事务ID列表
     * @return transactionIds
     */
    public List<String> getTransactionIds() {
        return transactionIds;
    }

    public void setTransactionIds(List<String> transactionIds) {
        this.transactionIds = transactionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockAnalysisResultResponse that = (ShowDeadLockAnalysisResultResponse) obj;
        return Objects.equals(this.deadLockId, that.deadLockId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.sqlInsightJobId, that.sqlInsightJobId)
            && Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.total, that.total)
            && Objects.equals(this.sqlList, that.sqlList) && Objects.equals(this.transactionIds, that.transactionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deadLockId, jobId, status, sqlInsightJobId, transactionId, total, sqlList, transactionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockAnalysisResultResponse {\n");
        sb.append("    deadLockId: ").append(toIndentedString(deadLockId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sqlInsightJobId: ").append(toIndentedString(sqlInsightJobId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    sqlList: ").append(toIndentedString(sqlList)).append("\n");
        sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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
