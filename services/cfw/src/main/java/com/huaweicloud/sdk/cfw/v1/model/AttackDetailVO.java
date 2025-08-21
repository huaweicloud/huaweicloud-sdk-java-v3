package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttackDetailVO
 */
public class AttackDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_count")

    private Long appCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule_count")

    private Long attackRuleCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type_count")

    private Long attackTypeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip_count")

    private Long dstIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port_count")

    private Long dstPortCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AttackLog> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip_count")

    private Long srcIpCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public AttackDetailVO withAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }

    /**
     * **参数解释**： 应用数量 **取值范围**： 不涉及
     * @return appCount
     */
    public Long getAppCount() {
        return appCount;
    }

    public void setAppCount(Long appCount) {
        this.appCount = appCount;
    }

    public AttackDetailVO withAttackRuleCount(Long attackRuleCount) {
        this.attackRuleCount = attackRuleCount;
        return this;
    }

    /**
     * **参数解释**： 攻击规则数量 **取值范围**： 不涉及
     * @return attackRuleCount
     */
    public Long getAttackRuleCount() {
        return attackRuleCount;
    }

    public void setAttackRuleCount(Long attackRuleCount) {
        this.attackRuleCount = attackRuleCount;
    }

    public AttackDetailVO withAttackTypeCount(Long attackTypeCount) {
        this.attackTypeCount = attackTypeCount;
        return this;
    }

    /**
     * **参数解释**： 攻击类型数量 **取值范围**： 不涉及
     * @return attackTypeCount
     */
    public Long getAttackTypeCount() {
        return attackTypeCount;
    }

    public void setAttackTypeCount(Long attackTypeCount) {
        this.attackTypeCount = attackTypeCount;
    }

    public AttackDetailVO withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 攻击次数 **取值范围**： 不涉及
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public AttackDetailVO withDstIpCount(Long dstIpCount) {
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

    public AttackDetailVO withDstPortCount(Long dstPortCount) {
        this.dstPortCount = dstPortCount;
        return this;
    }

    /**
     * **参数解释**： 攻击端口数量 **取值范围**： 不涉及
     * @return dstPortCount
     */
    public Long getDstPortCount() {
        return dstPortCount;
    }

    public void setDstPortCount(Long dstPortCount) {
        this.dstPortCount = dstPortCount;
    }

    public AttackDetailVO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间 **取值范围**： 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public AttackDetailVO withRecords(List<AttackLog> records) {
        this.records = records;
        return this;
    }

    public AttackDetailVO addRecordsItem(AttackLog recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public AttackDetailVO withRecords(Consumer<List<AttackLog>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： 攻击事件明细 **取值范围**： 不涉及
     * @return records
     */
    public List<AttackLog> getRecords() {
        return records;
    }

    public void setRecords(List<AttackLog> records) {
        this.records = records;
    }

    public AttackDetailVO withSrcIpCount(Long srcIpCount) {
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

    public AttackDetailVO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间 **取值范围**： 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public AttackDetailVO withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总数 **取值范围**： 不涉及
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackDetailVO that = (AttackDetailVO) obj;
        return Objects.equals(this.appCount, that.appCount)
            && Objects.equals(this.attackRuleCount, that.attackRuleCount)
            && Objects.equals(this.attackTypeCount, that.attackTypeCount) && Objects.equals(this.count, that.count)
            && Objects.equals(this.dstIpCount, that.dstIpCount) && Objects.equals(this.dstPortCount, that.dstPortCount)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.records, that.records)
            && Objects.equals(this.srcIpCount, that.srcIpCount) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appCount,
            attackRuleCount,
            attackTypeCount,
            count,
            dstIpCount,
            dstPortCount,
            endTime,
            records,
            srcIpCount,
            startTime,
            total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackDetailVO {\n");
        sb.append("    appCount: ").append(toIndentedString(appCount)).append("\n");
        sb.append("    attackRuleCount: ").append(toIndentedString(attackRuleCount)).append("\n");
        sb.append("    attackTypeCount: ").append(toIndentedString(attackTypeCount)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dstIpCount: ").append(toIndentedString(dstIpCount)).append("\n");
        sb.append("    dstPortCount: ").append(toIndentedString(dstPortCount)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    srcIpCount: ").append(toIndentedString(srcIpCount)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
