package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetTransactionListRespTransactionInfoList
 */
public class GetTransactionListRespTransactionInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_sec")

    private Integer lastSec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_locks")

    private Integer waitLocks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hold_locks")

    private Integer holdLocks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occurrence_time")

    private Long occurrenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    public GetTransactionListRespTransactionInfoList withLastSec(Integer lastSec) {
        this.lastSec = lastSec;
        return this;
    }

    /**
     * 事务持续时间
     * @return lastSec
     */
    public Integer getLastSec() {
        return lastSec;
    }

    public void setLastSec(Integer lastSec) {
        this.lastSec = lastSec;
    }

    public GetTransactionListRespTransactionInfoList withWaitLocks(Integer waitLocks) {
        this.waitLocks = waitLocks;
        return this;
    }

    /**
     * 等待锁数量
     * @return waitLocks
     */
    public Integer getWaitLocks() {
        return waitLocks;
    }

    public void setWaitLocks(Integer waitLocks) {
        this.waitLocks = waitLocks;
    }

    public GetTransactionListRespTransactionInfoList withHoldLocks(Integer holdLocks) {
        this.holdLocks = holdLocks;
        return this;
    }

    /**
     * 持有锁数量
     * @return holdLocks
     */
    public Integer getHoldLocks() {
        return holdLocks;
    }

    public void setHoldLocks(Integer holdLocks) {
        this.holdLocks = holdLocks;
    }

    public GetTransactionListRespTransactionInfoList withOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }

    /**
     * 发生时间
     * @return occurrenceTime
     */
    public Long getOccurrenceTime() {
        return occurrenceTime;
    }

    public void setOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }

    public GetTransactionListRespTransactionInfoList withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 事务内容
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public GetTransactionListRespTransactionInfoList withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 收集时间
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetTransactionListRespTransactionInfoList that = (GetTransactionListRespTransactionInfoList) obj;
        return Objects.equals(this.lastSec, that.lastSec) && Objects.equals(this.waitLocks, that.waitLocks)
            && Objects.equals(this.holdLocks, that.holdLocks)
            && Objects.equals(this.occurrenceTime, that.occurrenceTime) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.collectTime, that.collectTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastSec, waitLocks, holdLocks, occurrenceTime, detail, collectTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTransactionListRespTransactionInfoList {\n");
        sb.append("    lastSec: ").append(toIndentedString(lastSec)).append("\n");
        sb.append("    waitLocks: ").append(toIndentedString(waitLocks)).append("\n");
        sb.append("    holdLocks: ").append(toIndentedString(holdLocks)).append("\n");
        sb.append("    occurrenceTime: ").append(toIndentedString(occurrenceTime)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
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
