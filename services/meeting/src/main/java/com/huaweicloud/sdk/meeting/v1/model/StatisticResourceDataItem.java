package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 会议已购资源使用数据的单个时间点数据。 */
public class StatisticResourceDataItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrParties")

    private String vmrParties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxConcurrencyVmrCount")

    private String maxConcurrencyVmrCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "livePortUsedCount")

    private String livePortUsedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordUsedSize")

    private String recordUsedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pstnUsedDuration")

    private String pstnUsedDuration;

    public StatisticResourceDataItem withTime(String time) {
        this.time = time;
        return this;
    }

    /** 日期/月份。
     * 
     * @return time */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StatisticResourceDataItem withVmrParties(String vmrParties) {
        this.vmrParties = vmrParties;
        return this;
    }

    /** VMR方数。 category = used_vmr_info时有效。
     * 
     * @return vmrParties */
    public String getVmrParties() {
        return vmrParties;
    }

    public void setVmrParties(String vmrParties) {
        this.vmrParties = vmrParties;
    }

    public StatisticResourceDataItem withMaxConcurrencyVmrCount(String maxConcurrencyVmrCount) {
        this.maxConcurrencyVmrCount = maxConcurrencyVmrCount;
        return this;
    }

    /** VMR并发使用数。 category = used_vmr_info时有效。
     * 
     * @return maxConcurrencyVmrCount */
    public String getMaxConcurrencyVmrCount() {
        return maxConcurrencyVmrCount;
    }

    public void setMaxConcurrencyVmrCount(String maxConcurrencyVmrCount) {
        this.maxConcurrencyVmrCount = maxConcurrencyVmrCount;
    }

    public StatisticResourceDataItem withLivePortUsedCount(String livePortUsedCount) {
        this.livePortUsedCount = livePortUsedCount;
        return this;
    }

    /** 直播端口并发使用数。 category = used_live_info时有效。
     * 
     * @return livePortUsedCount */
    public String getLivePortUsedCount() {
        return livePortUsedCount;
    }

    public void setLivePortUsedCount(String livePortUsedCount) {
        this.livePortUsedCount = livePortUsedCount;
    }

    public StatisticResourceDataItem withRecordUsedSize(String recordUsedSize) {
        this.recordUsedSize = recordUsedSize;
        return this;
    }

    /** 录播使用空间(G)。 category = used_record_info时有效。
     * 
     * @return recordUsedSize */
    public String getRecordUsedSize() {
        return recordUsedSize;
    }

    public void setRecordUsedSize(String recordUsedSize) {
        this.recordUsedSize = recordUsedSize;
    }

    public StatisticResourceDataItem withPstnUsedDuration(String pstnUsedDuration) {
        this.pstnUsedDuration = pstnUsedDuration;
        return this;
    }

    /** PSTN外呼时长(分钟)。 category = used_pstn_info时有效。
     * 
     * @return pstnUsedDuration */
    public String getPstnUsedDuration() {
        return pstnUsedDuration;
    }

    public void setPstnUsedDuration(String pstnUsedDuration) {
        this.pstnUsedDuration = pstnUsedDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticResourceDataItem statisticResourceDataItem = (StatisticResourceDataItem) o;
        return Objects.equals(this.time, statisticResourceDataItem.time)
            && Objects.equals(this.vmrParties, statisticResourceDataItem.vmrParties)
            && Objects.equals(this.maxConcurrencyVmrCount, statisticResourceDataItem.maxConcurrencyVmrCount)
            && Objects.equals(this.livePortUsedCount, statisticResourceDataItem.livePortUsedCount)
            && Objects.equals(this.recordUsedSize, statisticResourceDataItem.recordUsedSize)
            && Objects.equals(this.pstnUsedDuration, statisticResourceDataItem.pstnUsedDuration);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(time, vmrParties, maxConcurrencyVmrCount, livePortUsedCount, recordUsedSize, pstnUsedDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticResourceDataItem {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    vmrParties: ").append(toIndentedString(vmrParties)).append("\n");
        sb.append("    maxConcurrencyVmrCount: ").append(toIndentedString(maxConcurrencyVmrCount)).append("\n");
        sb.append("    livePortUsedCount: ").append(toIndentedString(livePortUsedCount)).append("\n");
        sb.append("    recordUsedSize: ").append(toIndentedString(recordUsedSize)).append("\n");
        sb.append("    pstnUsedDuration: ").append(toIndentedString(pstnUsedDuration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
