package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowLockBlockingTrendRespTrendList
 */
public class ShowLockBlockingTrendRespTrendList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_lock_blocking_count")

    private Long totalLockBlockingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async_io_completion_count")

    private Long asyncIoCompletionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async_network_io_count")

    private Long asyncNetworkIoCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cxconsumer_count")

    private Long cxconsumerCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cxpacket_count")

    private Long cxpacketCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dtc_count")

    private Long dtcCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lck_m_bu_count")

    private Long lckMBuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lck_m_is_count")

    private Long lckMIsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lck_m_iu_count")

    private Long lckMIuCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lck_m_ix_count")

    private Long lckMIxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_count")

    private Long otherCount;

    public ShowLockBlockingTrendRespTrendList withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间
     * minimum: 0
     * maximum: 253370736001000
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public ShowLockBlockingTrendRespTrendList withTotalLockBlockingCount(Long totalLockBlockingCount) {
        this.totalLockBlockingCount = totalLockBlockingCount;
        return this;
    }

    /**
     * 锁阻塞总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalLockBlockingCount
     */
    public Long getTotalLockBlockingCount() {
        return totalLockBlockingCount;
    }

    public void setTotalLockBlockingCount(Long totalLockBlockingCount) {
        this.totalLockBlockingCount = totalLockBlockingCount;
    }

    public ShowLockBlockingTrendRespTrendList withAsyncIoCompletionCount(Long asyncIoCompletionCount) {
        this.asyncIoCompletionCount = asyncIoCompletionCount;
        return this;
    }

    /**
     * ASYNC_IO_COMPLETION数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return asyncIoCompletionCount
     */
    public Long getAsyncIoCompletionCount() {
        return asyncIoCompletionCount;
    }

    public void setAsyncIoCompletionCount(Long asyncIoCompletionCount) {
        this.asyncIoCompletionCount = asyncIoCompletionCount;
    }

    public ShowLockBlockingTrendRespTrendList withAsyncNetworkIoCount(Long asyncNetworkIoCount) {
        this.asyncNetworkIoCount = asyncNetworkIoCount;
        return this;
    }

    /**
     * ASYNC_NETWORK_IO数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return asyncNetworkIoCount
     */
    public Long getAsyncNetworkIoCount() {
        return asyncNetworkIoCount;
    }

    public void setAsyncNetworkIoCount(Long asyncNetworkIoCount) {
        this.asyncNetworkIoCount = asyncNetworkIoCount;
    }

    public ShowLockBlockingTrendRespTrendList withCxconsumerCount(Long cxconsumerCount) {
        this.cxconsumerCount = cxconsumerCount;
        return this;
    }

    /**
     * CXCONSUMER数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return cxconsumerCount
     */
    public Long getCxconsumerCount() {
        return cxconsumerCount;
    }

    public void setCxconsumerCount(Long cxconsumerCount) {
        this.cxconsumerCount = cxconsumerCount;
    }

    public ShowLockBlockingTrendRespTrendList withCxpacketCount(Long cxpacketCount) {
        this.cxpacketCount = cxpacketCount;
        return this;
    }

    /**
     * CXPACKET数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return cxpacketCount
     */
    public Long getCxpacketCount() {
        return cxpacketCount;
    }

    public void setCxpacketCount(Long cxpacketCount) {
        this.cxpacketCount = cxpacketCount;
    }

    public ShowLockBlockingTrendRespTrendList withDtcCount(Long dtcCount) {
        this.dtcCount = dtcCount;
        return this;
    }

    /**
     * DTC数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return dtcCount
     */
    public Long getDtcCount() {
        return dtcCount;
    }

    public void setDtcCount(Long dtcCount) {
        this.dtcCount = dtcCount;
    }

    public ShowLockBlockingTrendRespTrendList withLckMBuCount(Long lckMBuCount) {
        this.lckMBuCount = lckMBuCount;
        return this;
    }

    /**
     * LCK_M_BU数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lckMBuCount
     */
    public Long getLckMBuCount() {
        return lckMBuCount;
    }

    public void setLckMBuCount(Long lckMBuCount) {
        this.lckMBuCount = lckMBuCount;
    }

    public ShowLockBlockingTrendRespTrendList withLckMIsCount(Long lckMIsCount) {
        this.lckMIsCount = lckMIsCount;
        return this;
    }

    /**
     * LCK_M_IS数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lckMIsCount
     */
    public Long getLckMIsCount() {
        return lckMIsCount;
    }

    public void setLckMIsCount(Long lckMIsCount) {
        this.lckMIsCount = lckMIsCount;
    }

    public ShowLockBlockingTrendRespTrendList withLckMIuCount(Long lckMIuCount) {
        this.lckMIuCount = lckMIuCount;
        return this;
    }

    /**
     * LCK_M_IU数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lckMIuCount
     */
    public Long getLckMIuCount() {
        return lckMIuCount;
    }

    public void setLckMIuCount(Long lckMIuCount) {
        this.lckMIuCount = lckMIuCount;
    }

    public ShowLockBlockingTrendRespTrendList withLckMIxCount(Long lckMIxCount) {
        this.lckMIxCount = lckMIxCount;
        return this;
    }

    /**
     * LCK_M_IX数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lckMIxCount
     */
    public Long getLckMIxCount() {
        return lckMIxCount;
    }

    public void setLckMIxCount(Long lckMIxCount) {
        this.lckMIxCount = lckMIxCount;
    }

    public ShowLockBlockingTrendRespTrendList withOtherCount(Long otherCount) {
        this.otherCount = otherCount;
        return this;
    }

    /**
     * 其他锁阻塞数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return otherCount
     */
    public Long getOtherCount() {
        return otherCount;
    }

    public void setOtherCount(Long otherCount) {
        this.otherCount = otherCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLockBlockingTrendRespTrendList that = (ShowLockBlockingTrendRespTrendList) obj;
        return Objects.equals(this.collectTime, that.collectTime)
            && Objects.equals(this.totalLockBlockingCount, that.totalLockBlockingCount)
            && Objects.equals(this.asyncIoCompletionCount, that.asyncIoCompletionCount)
            && Objects.equals(this.asyncNetworkIoCount, that.asyncNetworkIoCount)
            && Objects.equals(this.cxconsumerCount, that.cxconsumerCount)
            && Objects.equals(this.cxpacketCount, that.cxpacketCount) && Objects.equals(this.dtcCount, that.dtcCount)
            && Objects.equals(this.lckMBuCount, that.lckMBuCount) && Objects.equals(this.lckMIsCount, that.lckMIsCount)
            && Objects.equals(this.lckMIuCount, that.lckMIuCount) && Objects.equals(this.lckMIxCount, that.lckMIxCount)
            && Objects.equals(this.otherCount, that.otherCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectTime,
            totalLockBlockingCount,
            asyncIoCompletionCount,
            asyncNetworkIoCount,
            cxconsumerCount,
            cxpacketCount,
            dtcCount,
            lckMBuCount,
            lckMIsCount,
            lckMIuCount,
            lckMIxCount,
            otherCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLockBlockingTrendRespTrendList {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    totalLockBlockingCount: ").append(toIndentedString(totalLockBlockingCount)).append("\n");
        sb.append("    asyncIoCompletionCount: ").append(toIndentedString(asyncIoCompletionCount)).append("\n");
        sb.append("    asyncNetworkIoCount: ").append(toIndentedString(asyncNetworkIoCount)).append("\n");
        sb.append("    cxconsumerCount: ").append(toIndentedString(cxconsumerCount)).append("\n");
        sb.append("    cxpacketCount: ").append(toIndentedString(cxpacketCount)).append("\n");
        sb.append("    dtcCount: ").append(toIndentedString(dtcCount)).append("\n");
        sb.append("    lckMBuCount: ").append(toIndentedString(lckMBuCount)).append("\n");
        sb.append("    lckMIsCount: ").append(toIndentedString(lckMIsCount)).append("\n");
        sb.append("    lckMIuCount: ").append(toIndentedString(lckMIuCount)).append("\n");
        sb.append("    lckMIxCount: ").append(toIndentedString(lckMIxCount)).append("\n");
        sb.append("    otherCount: ").append(toIndentedString(otherCount)).append("\n");
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
