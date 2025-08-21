package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessDetailVO
 */
public class AccessDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip_count")

    private Long dstIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port_count")

    private Long dstPortCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_count")

    private Long hitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_count")

    private Long protocolCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_end_time")

    private Long recentEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_start_time")

    private Long recentStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_total")

    private Long recordTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AccessLogInfo> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_hit_count")

    private Long ruleHitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip_count")

    private Long srcIpCount;

    public AccessDetailVO withDstIpCount(Long dstIpCount) {
        this.dstIpCount = dstIpCount;
        return this;
    }

    /**
     * **参数解释**： 目的IP数量 **取值范围**： 不涉及
     * @return dstIpCount
     */
    public Long getDstIpCount() {
        return dstIpCount;
    }

    public void setDstIpCount(Long dstIpCount) {
        this.dstIpCount = dstIpCount;
    }

    public AccessDetailVO withDstPortCount(Long dstPortCount) {
        this.dstPortCount = dstPortCount;
        return this;
    }

    /**
     * **参数解释**： 目的端口数量 **取值范围**： 不涉及
     * @return dstPortCount
     */
    public Long getDstPortCount() {
        return dstPortCount;
    }

    public void setDstPortCount(Long dstPortCount) {
        this.dstPortCount = dstPortCount;
    }

    public AccessDetailVO withHitCount(Long hitCount) {
        this.hitCount = hitCount;
        return this;
    }

    /**
     * **参数解释**： 命中次数 **取值范围**： 不涉及
     * @return hitCount
     */
    public Long getHitCount() {
        return hitCount;
    }

    public void setHitCount(Long hitCount) {
        this.hitCount = hitCount;
    }

    public AccessDetailVO withProtocolCount(Long protocolCount) {
        this.protocolCount = protocolCount;
        return this;
    }

    /**
     * **参数解释**： 协议数量 **取值范围**： 不涉及
     * @return protocolCount
     */
    public Long getProtocolCount() {
        return protocolCount;
    }

    public void setProtocolCount(Long protocolCount) {
        this.protocolCount = protocolCount;
    }

    public AccessDetailVO withRecentEndTime(Long recentEndTime) {
        this.recentEndTime = recentEndTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间 **取值范围**： 不涉及
     * @return recentEndTime
     */
    public Long getRecentEndTime() {
        return recentEndTime;
    }

    public void setRecentEndTime(Long recentEndTime) {
        this.recentEndTime = recentEndTime;
    }

    public AccessDetailVO withRecentStartTime(Long recentStartTime) {
        this.recentStartTime = recentStartTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间 **取值范围**： 不涉及
     * @return recentStartTime
     */
    public Long getRecentStartTime() {
        return recentStartTime;
    }

    public void setRecentStartTime(Long recentStartTime) {
        this.recentStartTime = recentStartTime;
    }

    public AccessDetailVO withRecordTotal(Long recordTotal) {
        this.recordTotal = recordTotal;
        return this;
    }

    /**
     * **参数解释**： 记录数量 **取值范围**： 不涉及
     * @return recordTotal
     */
    public Long getRecordTotal() {
        return recordTotal;
    }

    public void setRecordTotal(Long recordTotal) {
        this.recordTotal = recordTotal;
    }

    public AccessDetailVO withRecords(List<AccessLogInfo> records) {
        this.records = records;
        return this;
    }

    public AccessDetailVO addRecordsItem(AccessLogInfo recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public AccessDetailVO withRecords(Consumer<List<AccessLogInfo>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： 命中详情 **取值范围**： 不涉及
     * @return records
     */
    public List<AccessLogInfo> getRecords() {
        return records;
    }

    public void setRecords(List<AccessLogInfo> records) {
        this.records = records;
    }

    public AccessDetailVO withRuleHitCount(Long ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
        return this;
    }

    /**
     * **参数解释**： 命中规则数 **取值范围**： 不涉及
     * @return ruleHitCount
     */
    public Long getRuleHitCount() {
        return ruleHitCount;
    }

    public void setRuleHitCount(Long ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
    }

    public AccessDetailVO withSrcIpCount(Long srcIpCount) {
        this.srcIpCount = srcIpCount;
        return this;
    }

    /**
     * **参数解释**： 源IP数量 **取值范围**： 不涉及
     * @return srcIpCount
     */
    public Long getSrcIpCount() {
        return srcIpCount;
    }

    public void setSrcIpCount(Long srcIpCount) {
        this.srcIpCount = srcIpCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessDetailVO that = (AccessDetailVO) obj;
        return Objects.equals(this.dstIpCount, that.dstIpCount) && Objects.equals(this.dstPortCount, that.dstPortCount)
            && Objects.equals(this.hitCount, that.hitCount) && Objects.equals(this.protocolCount, that.protocolCount)
            && Objects.equals(this.recentEndTime, that.recentEndTime)
            && Objects.equals(this.recentStartTime, that.recentStartTime)
            && Objects.equals(this.recordTotal, that.recordTotal) && Objects.equals(this.records, that.records)
            && Objects.equals(this.ruleHitCount, that.ruleHitCount) && Objects.equals(this.srcIpCount, that.srcIpCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dstIpCount,
            dstPortCount,
            hitCount,
            protocolCount,
            recentEndTime,
            recentStartTime,
            recordTotal,
            records,
            ruleHitCount,
            srcIpCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessDetailVO {\n");
        sb.append("    dstIpCount: ").append(toIndentedString(dstIpCount)).append("\n");
        sb.append("    dstPortCount: ").append(toIndentedString(dstPortCount)).append("\n");
        sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
        sb.append("    protocolCount: ").append(toIndentedString(protocolCount)).append("\n");
        sb.append("    recentEndTime: ").append(toIndentedString(recentEndTime)).append("\n");
        sb.append("    recentStartTime: ").append(toIndentedString(recentStartTime)).append("\n");
        sb.append("    recordTotal: ").append(toIndentedString(recordTotal)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    ruleHitCount: ").append(toIndentedString(ruleHitCount)).append("\n");
        sb.append("    srcIpCount: ").append(toIndentedString(srcIpCount)).append("\n");
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
