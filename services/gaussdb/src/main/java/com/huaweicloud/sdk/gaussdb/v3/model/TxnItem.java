package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 单个事务的进度信息。 
 */
public class TxnItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id")

    private String trxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_remaining_time")

    private Long estimatedRemainingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_mysql_thread_id")

    private Long trxMysqlThreadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_query")

    private String trxQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_started")

    private String trxStarted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_rows_modified")

    private Long trxRowsModified;

    public TxnItem withTrxId(String trxId) {
        this.trxId = trxId;
        return this;
    }

    /**
     * **参数解释**： 事务的唯一标识。 **取值范围**： 不涉及。
     * @return trxId
     */
    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public TxnItem withEstimatedRemainingTime(Long estimatedRemainingTime) {
        this.estimatedRemainingTime = estimatedRemainingTime;
        return this;
    }

    /**
     * **参数解释**： 预计剩余完成时间（秒）。 **取值范围**： ＞0。 
     * @return estimatedRemainingTime
     */
    public Long getEstimatedRemainingTime() {
        return estimatedRemainingTime;
    }

    public void setEstimatedRemainingTime(Long estimatedRemainingTime) {
        this.estimatedRemainingTime = estimatedRemainingTime;
    }

    public TxnItem withTrxMysqlThreadId(Long trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
        return this;
    }

    /**
     * **参数解释**： 用户会话线程ID。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return trxMysqlThreadId
     */
    public Long getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    public void setTrxMysqlThreadId(Long trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    public TxnItem withTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
        return this;
    }

    /**
     * **参数解释**： 额外信息，通常是正在执行的语句。 **取值范围**： 不涉及。 
     * @return trxQuery
     */
    public String getTrxQuery() {
        return trxQuery;
    }

    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    public TxnItem withTrxStarted(String trxStarted) {
        this.trxStarted = trxStarted;
        return this;
    }

    /**
     * **参数解释**： 事务开始时间。 **取值范围**： 不涉及。 
     * @return trxStarted
     */
    public String getTrxStarted() {
        return trxStarted;
    }

    public void setTrxStarted(String trxStarted) {
        this.trxStarted = trxStarted;
    }

    public TxnItem withTrxRowsModified(Long trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
        return this;
    }

    /**
     * **参数解释**： 事务修改的行数。 **取值范围**： ≥0。 
     * @return trxRowsModified
     */
    public Long getTrxRowsModified() {
        return trxRowsModified;
    }

    public void setTrxRowsModified(Long trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TxnItem that = (TxnItem) obj;
        return Objects.equals(this.trxId, that.trxId)
            && Objects.equals(this.estimatedRemainingTime, that.estimatedRemainingTime)
            && Objects.equals(this.trxMysqlThreadId, that.trxMysqlThreadId)
            && Objects.equals(this.trxQuery, that.trxQuery) && Objects.equals(this.trxStarted, that.trxStarted)
            && Objects.equals(this.trxRowsModified, that.trxRowsModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trxId, estimatedRemainingTime, trxMysqlThreadId, trxQuery, trxStarted, trxRowsModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TxnItem {\n");
        sb.append("    trxId: ").append(toIndentedString(trxId)).append("\n");
        sb.append("    estimatedRemainingTime: ").append(toIndentedString(estimatedRemainingTime)).append("\n");
        sb.append("    trxMysqlThreadId: ").append(toIndentedString(trxMysqlThreadId)).append("\n");
        sb.append("    trxQuery: ").append(toIndentedString(trxQuery)).append("\n");
        sb.append("    trxStarted: ").append(toIndentedString(trxStarted)).append("\n");
        sb.append("    trxRowsModified: ").append(toIndentedString(trxRowsModified)).append("\n");
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
