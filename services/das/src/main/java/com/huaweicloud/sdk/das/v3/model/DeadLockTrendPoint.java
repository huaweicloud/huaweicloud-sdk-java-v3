package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 死锁趋势点
 */
public class DeadLockTrendPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occurrence_time")

    private Long occurrenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_deadlock_count")

    private Long totalDeadlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_deadlock_count")

    private Long keyDeadlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_deadlock_count")

    private Long objectDeadlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rid_deadlock_count")

    private Long ridDeadlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_deadlock_count")

    private Long pageDeadlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compile_deadlock_count")

    private Long compileDeadlockCount;

    public DeadLockTrendPoint withOccurrenceTime(Long occurrenceTime) {
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

    public DeadLockTrendPoint withTotalDeadlockCount(Long totalDeadlockCount) {
        this.totalDeadlockCount = totalDeadlockCount;
        return this;
    }

    /**
     * 死锁总数
     * @return totalDeadlockCount
     */
    public Long getTotalDeadlockCount() {
        return totalDeadlockCount;
    }

    public void setTotalDeadlockCount(Long totalDeadlockCount) {
        this.totalDeadlockCount = totalDeadlockCount;
    }

    public DeadLockTrendPoint withKeyDeadlockCount(Long keyDeadlockCount) {
        this.keyDeadlockCount = keyDeadlockCount;
        return this;
    }

    /**
     * keylock数量
     * @return keyDeadlockCount
     */
    public Long getKeyDeadlockCount() {
        return keyDeadlockCount;
    }

    public void setKeyDeadlockCount(Long keyDeadlockCount) {
        this.keyDeadlockCount = keyDeadlockCount;
    }

    public DeadLockTrendPoint withObjectDeadlockCount(Long objectDeadlockCount) {
        this.objectDeadlockCount = objectDeadlockCount;
        return this;
    }

    /**
     * objectlock数量
     * @return objectDeadlockCount
     */
    public Long getObjectDeadlockCount() {
        return objectDeadlockCount;
    }

    public void setObjectDeadlockCount(Long objectDeadlockCount) {
        this.objectDeadlockCount = objectDeadlockCount;
    }

    public DeadLockTrendPoint withRidDeadlockCount(Long ridDeadlockCount) {
        this.ridDeadlockCount = ridDeadlockCount;
        return this;
    }

    /**
     * ridlock数量
     * @return ridDeadlockCount
     */
    public Long getRidDeadlockCount() {
        return ridDeadlockCount;
    }

    public void setRidDeadlockCount(Long ridDeadlockCount) {
        this.ridDeadlockCount = ridDeadlockCount;
    }

    public DeadLockTrendPoint withPageDeadlockCount(Long pageDeadlockCount) {
        this.pageDeadlockCount = pageDeadlockCount;
        return this;
    }

    /**
     * pagelock数量
     * @return pageDeadlockCount
     */
    public Long getPageDeadlockCount() {
        return pageDeadlockCount;
    }

    public void setPageDeadlockCount(Long pageDeadlockCount) {
        this.pageDeadlockCount = pageDeadlockCount;
    }

    public DeadLockTrendPoint withCompileDeadlockCount(Long compileDeadlockCount) {
        this.compileDeadlockCount = compileDeadlockCount;
        return this;
    }

    /**
     * compilelock数量
     * @return compileDeadlockCount
     */
    public Long getCompileDeadlockCount() {
        return compileDeadlockCount;
    }

    public void setCompileDeadlockCount(Long compileDeadlockCount) {
        this.compileDeadlockCount = compileDeadlockCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeadLockTrendPoint that = (DeadLockTrendPoint) obj;
        return Objects.equals(this.occurrenceTime, that.occurrenceTime)
            && Objects.equals(this.totalDeadlockCount, that.totalDeadlockCount)
            && Objects.equals(this.keyDeadlockCount, that.keyDeadlockCount)
            && Objects.equals(this.objectDeadlockCount, that.objectDeadlockCount)
            && Objects.equals(this.ridDeadlockCount, that.ridDeadlockCount)
            && Objects.equals(this.pageDeadlockCount, that.pageDeadlockCount)
            && Objects.equals(this.compileDeadlockCount, that.compileDeadlockCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occurrenceTime,
            totalDeadlockCount,
            keyDeadlockCount,
            objectDeadlockCount,
            ridDeadlockCount,
            pageDeadlockCount,
            compileDeadlockCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadLockTrendPoint {\n");
        sb.append("    occurrenceTime: ").append(toIndentedString(occurrenceTime)).append("\n");
        sb.append("    totalDeadlockCount: ").append(toIndentedString(totalDeadlockCount)).append("\n");
        sb.append("    keyDeadlockCount: ").append(toIndentedString(keyDeadlockCount)).append("\n");
        sb.append("    objectDeadlockCount: ").append(toIndentedString(objectDeadlockCount)).append("\n");
        sb.append("    ridDeadlockCount: ").append(toIndentedString(ridDeadlockCount)).append("\n");
        sb.append("    pageDeadlockCount: ").append(toIndentedString(pageDeadlockCount)).append("\n");
        sb.append("    compileDeadlockCount: ").append(toIndentedString(compileDeadlockCount)).append("\n");
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
